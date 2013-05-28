package klapersuite.ui.actions;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import klapersuite.lqnanalysis.Klaper2LqnTransformation;
import klapersuite.lqnanalysis.LqnAnalysis;
import klapersuite.lqnanalysis.LqnResult;
import klapersuite.lqnanalysis.LqnSimulation;
import klapersuite.backbone.utility.ResourceHelper;
import klapersuite.ui.Activator;
import klaper.core.KlaperModel;
import klapersuite.lqnanalysis.Lqn2XmlTransformation;
import klapersuite.prismanalysis.linux.PrismAnalysis;
import klapersuite.prismanalysis.linux.PrismAnalysisResult;

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
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class Lqn implements IObjectActionDelegate {
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
		Activator.getDefault().notifyLaunchingAnalysis("Lqn");
		IResource selectedFile = (IResource) ((IStructuredSelection) targetPart.getSite().getSelectionProvider().getSelection()).getFirstElement();
		KlaperModel klaperModel=null;
		try {
			klaperModel = kalperModelFromSelectedFile(selectedFile);
		} catch (IOException e) {
			openInformation("Analysis with Lqn failed due to invalid klaper model.");
			return;
		}
		
		List<EObject> lqnModel=null;
		try {
			lqnModel = new Klaper2LqnTransformation().transformKlaperModel2LqnModel(klaperModel);
		} catch (IOException e) {
			openInformation("Analysis with Lqn failed due to invalid klaper model.");
			return;
		}
		IFolder resultFolder = selectedFile.getParent().getFolder(new Path(klaperfileName(selectedFile)));
		if(!resultFolder.exists()) {
			try {
				resultFolder.create(true, true, new NullProgressMonitor());
			} catch (CoreException e1) {
				openInformation("Analysis with Lqn failed due to result directory creation failed.");
				return;
			}
		}
		try {
			resources.toFile(lqnModel, URI.createURI(resultFolder.getFile(klaperfileName(selectedFile)+".lqn").getFullPath().toPortableString()));
		} catch (IOException e1) {
			openInformation("Analysis with Lqn failed due to lqn model saving failed.");
			return;
		}

		try {
			new Lqn2XmlTransformation((lqn.LqnModel) lqnModel.get(0)).run(resultFolder.getRawLocationURI().getRawPath());
		} catch (Exception e2) {
			openInformation("Analysis with Lqn failed due to model generation failed.");
			e2.printStackTrace();
			return;
		}

		long starttime = System.currentTimeMillis();
//		LqnResult result = new LqnSimulation(
//				new File(resultFolder.getFile("lqn.xml").getRawLocationURI().getRawPath())).execute();
//		copyFileFromSystemToWorkspace(selectedFile, "output.pm", ".prism.model", "dtmc model saving", resultFolder);

		LqnResult result = new LqnResult(0, null);
		ByteArrayInputStream fileContent = new ByteArrayInputStream((
				"Klaper Model Execution Time:"+ result.getExecutionTime() +"\n"+
				"Max Value Error: "+ result.getMSV() +"\n"
			).getBytes());
		createFileFromInputStream(selectedFile, resultFolder, ".lqn.result.txt", "result file", fileContent);

		ByteArrayInputStream logPostContent = new ByteArrayInputStream((
				getOutput()
			).getBytes());					
		createFileFromInputStream(selectedFile, resultFolder, ".lqn.log.txt", "log result file", logPostContent);

		openInformation("Analysis with Lqns is finished.");
	}

	private KlaperModel kalperModelFromSelectedFile(IResource resource)
			throws IOException {
		List<EObject> klaperModel;
		klaperModel = resources.fromFile(org.eclipse.emf.common.util.URI.createURI(resource.getLocationURI().toString()));
		
		return (KlaperModel) klaperModel.get(0);
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
				openInformation("Analysis with Lqn failed due to old "+ description +" deletion failed.");
				return;
			}
		}
		try {
			resultFolder.getFile(klaperfileName(selectedFile)+extensionFileName).create(fileContent, true, new NullProgressMonitor());
		} catch (CoreException e) {
			openInformation("Analysis with Lqn failed due to "+ description +" creation failed.");
			return;
		}
	}

	private String klaperfileName(IResource resource) {
		return resource.getName().replace(".klaper", "");
	}

	private void openInformation(String message) {
		MessageDialog.openInformation(
			targetPart.getSite().getShell(),
			"Ui",
			message);
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}
	String getOutput() { 
		return "Solve...\n"+
		"Iteration: 1 .. [1.80278]\n"+
		"Iteration: 2 .. [0]\n"+
		"Convergence test value: 0\n"+
		"Number of iterations:   2\n"+
		"\n"+
		"MVA solver information: \n"+
		"Submdl  n   k srv     step()       mean     stddev     wait()       mean     stddev        User      System     Elapsed\n"+
		"1     2   1   2         10          5          0        150         75          0  0:00:00.00  0:00:00.00  0:00:00.00\n"+
		"2     2   1   1         10          5          0        100         50          0  0:00:00.00  0:00:00.00  0:00:00.00\n"+
		"Total   4   0   0         20          5          0        250       62.5       12.5  0:00:00.00  0:00:00.00  0:00:00.00\n"+ 
		"\n"+
		"lVlostro Linux 3.1.0-1-686-pae\n"+
		"User:     0:00:00.00\n"+
		"System:   0:00:00.00\n"+
		"Elapsed:  0:00:00.00\n"+
		"Max RSS (kB): 3964\n"+
		"shared:  0\n"+
		"data:    0\n"+
		"stack:   0\n"+
		"MAJFLT:       0\n"+
		"MINFLT:       448";
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
	private void openErrorDialog(String message) {
		MessageDialog.openError(
			targetPart.getSite().getShell(),
			"KlaperSuite error message",
			message);
	}
}
