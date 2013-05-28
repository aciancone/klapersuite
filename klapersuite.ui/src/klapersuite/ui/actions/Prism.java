package klapersuite.ui.actions;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import klaper.core.KlaperModel;
import klapersuite.RmcAnalysis.Klaper2DtmcTransformation;
import klapersuite.backbone.utility.ResourceHelper;
import klapersuite.prismanalysis.linux.Dtmc2PrismTransformation;
import klapersuite.prismanalysis.linux.PrismAnalysis;
import klapersuite.prismanalysis.linux.PrismAnalysisResult;
import klapersuite.ui.Activator;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class Prism implements IObjectActionDelegate {
	ResourceHelper resources = new ResourceHelper();
	private IWorkbenchPart targetPart;	
	
	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.targetPart = targetPart;
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		Activator.getDefault().notifyLaunchingAnalysis("Prism");
		IResource selectedFile = (IResource) ((IStructuredSelection) targetPart.getSite().getSelectionProvider().getSelection()).getFirstElement();
		KlaperModel klaperModel=null;
		try {
			klaperModel = kalperModelFromSelectedFile(selectedFile);
		} catch (IOException e) {
			openInformationDialog("Analysis with Prism failed due to invalid klaper model.");
			return;
		}
		
		List<EObject> dtmcModel=null;
		try {
			dtmcModel = new Klaper2DtmcTransformation().run(klaperModel);
		} catch (IOException e) {
			openInformationDialog("Analysis with Prism failed due to invalid klaper model.");
			return;
		}
		IFolder resultFolder = selectedFile.getParent().getFolder(new Path(klaperfileName(selectedFile)));

		if(!resultFolder.exists()) {
			try {
				resultFolder.create(true, true, new NullProgressMonitor());
			} catch (CoreException e1) {
				openInformationDialog("Analysis with Prism failed due to result directory creation failed.");
				return;
			}
		}
		try {
			new Dtmc2PrismTransformation((dtmc.Dtmc) dtmcModel.get(0)).run(resultFolder.getRawLocationURI().getRawPath());
		} catch (Exception e2) {
			openInformationDialog("Analysis with Prism failed due to prism model generation failed.");
			return;
		}

		long starttime = System.currentTimeMillis();
		PrismAnalysisResult result = new PrismAnalysis(
				new File(resultFolder.getFile("output.pm").getRawLocationURI().getRawPath()),
				new File(resultFolder.getFile("properties.pctl").getRawLocationURI().getRawPath()),
			12).execute();
		try {
			resources.toFile(dtmcModel, URI.createURI(resultFolder.getFile(klaperfileName(selectedFile)+".dtmc").getFullPath().toPortableString()));
		} catch (IOException e1) {
			openErrorDialog("Analysis with Prism failed due to dtmc model saving failed.");
			return;
		}
		copyFileFromSystemToWorkspace(selectedFile, "output.pm", ".prism.model", "dtmc model saving", resultFolder);
		copyFileFromSystemToWorkspace(selectedFile, "properties.pctl", ".prism.pctl", "dtmc property saving", resultFolder);

		if(result.exitValue!=0) {
			openErrorDialog("Analysis with Prism failed. Please, check the Prism's executable path.\n"+
							"1. Download Prism from the project site http://www.prismmodelchecker.org/\n"+
							"2. Install and set up the custom installation. Launch some example in order to check that it works correctly.\n"+
							"3. Set the prism executable location into Eclipse Preferences in order to configure the KlaperSuite to use your custom installation.\n");
			return;
		}
		ByteArrayInputStream fileContent = new ByteArrayInputStream((
				"Klaper Model Reliability:"+ result.getReliability() +"\n"+
				"Execution time: "+(System.currentTimeMillis()-starttime) +"\n"
			).getBytes());
		createFileFromInputStream(selectedFile, resultFolder, ".prism.result.txt", "result file", fileContent);
		
		ByteArrayInputStream prismLogContent = new ByteArrayInputStream((
				result.getExecutionOutput()
			).getBytes());
		createFileFromInputStream(selectedFile, resultFolder, ".prism.log.txt", "log result file", prismLogContent);
		
		openInformationDialog("Analysis with Prism is finished.");
	}

	private void createFileFromInputStream(IResource selectedFile,
			IFolder resultFolder,
			String extensionFileName,
			String description,
			ByteArrayInputStream fileContent) {
		if(resultFolder.getFile(klaperfileName(selectedFile)+extensionFileName).exists()) {
			try {
				resultFolder.getFile(klaperfileName(selectedFile)+extensionFileName).delete(true, new NullProgressMonitor());
			} catch (CoreException e) {
				openErrorDialog("Analysis with Prism failed due to old "+ description +" deletion failed.");
				return;
			}
		}
		try {
			resultFolder.getFile(klaperfileName(selectedFile)+extensionFileName).create(fileContent, true, new NullProgressMonitor());
		} catch (CoreException e) {
			openErrorDialog("Analysis with Prism failed due to "+ description +" creation failed.");
			return;
		}
	}

	private void copyFileFromSystemToWorkspace(IResource selectedFile, String oldFileName, String newExtension, String errorMsg, IFolder resultFolder) {
		if(resultFolder.getFile(klaperfileName(selectedFile)+newExtension).exists()) {
			try {
				resultFolder.getFile(klaperfileName(selectedFile)+newExtension).delete(true, new NullProgressMonitor());
			} catch (CoreException e) {
				openErrorDialog("Analysis with Prism failed due to old "+errorMsg+" deleting failed.");
				return;
			}
		}
		try {
			resultFolder.getFile(klaperfileName(selectedFile)+newExtension).create(
						new BufferedInputStream(new FileInputStream(resultFolder.getFile(oldFileName).getRawLocationURI().getRawPath())),
						true, new NullProgressMonitor());
		} catch (FileNotFoundException e1) {
			openErrorDialog("Analysis with Prism failed due to "+errorMsg+" creation failed.");
			return;
		} catch (CoreException e1) {
			openErrorDialog("Analysis with Prism failed due to "+errorMsg+" saving failed.");
			return;
		}
	}
	private KlaperModel kalperModelFromSelectedFile(IResource resource) throws IOException {
		List<EObject> klaperModel;
		klaperModel = resources.fromFile(org.eclipse.emf.common.util.URI.createURI(resource.getLocationURI().toString()));
		
		return (KlaperModel) klaperModel.get(0);
	}

	private String klaperfileName(IResource resource) {
		return resource.getName().replace(".klaper", "");
	}

	private void openInformationDialog(String message) {
		MessageDialog.openInformation(
			targetPart.getSite().getShell(),
			"KlaperSuite information message",
			message);
	}
	private void openErrorDialog(String message) {
		MessageDialog.openError(
			targetPart.getSite().getShell(),
			"KlaperSuite error message",
			message);
	}
	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

}
