package klapersuite.ui.actions;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import klapersuite.RmcAnalysis.Klaper2DtmcTransformation;
import klapersuite.RmcAnalysis.ReliabilityAnalysis;
import klapersuite.RmcAnalysis.ReliabilityAnalysisResult;
import klapersuite.backbone.dtmc.DtmcModel;
import klapersuite.backbone.utility.ResourceHelper;
import klapersuite.ui.Activator;
import klaper.core.KlaperModel;
import dtmc.*;

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

public class RMCNewton implements IObjectActionDelegate {
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
		Activator.getDefault().notifyLaunchingAnalysis("RMCNewton");
		IResource selectedFile = (IResource) ((IStructuredSelection) targetPart.getSite().getSelectionProvider().getSelection()).getFirstElement();
		KlaperModel klaperModel=null;
		try {
			klaperModel = kalperModelFromSelectedFile(selectedFile);
		} catch (IOException e) {
			openInformation("Analysis with RMCNewton failed due to invalid klaper model.");
			return;
		}
		
		List<EObject> dtmcModel=null;
		try {
			dtmcModel = new Klaper2DtmcTransformation().run(klaperModel);
		} catch (IOException e) {
			openInformation("Analysis with RMCNewton failed due to invalid klaper model.");
			return;
		}
		IFolder resultFolder = selectedFile.getParent().getFolder(new Path(klaperfileName(selectedFile)));
		if(!resultFolder.exists()) {
			try {
				resultFolder.create(true, true, new NullProgressMonitor());
			} catch (CoreException e1) {
				openInformation("Analysis with RMCNewton failed due to result directory creation failed.");
				return;
			}
		}
		try {
			resources.toFile(dtmcModel, URI.createURI(resultFolder.getFile(klaperfileName(selectedFile)+".dtmc").getFullPath().toPortableString()));
		} catch (IOException e1) {
			openInformation("Analysis with RMCNewton failed due to dtmc model saving failed.");
			return;
		}

		long starttime = System.currentTimeMillis();
		ReliabilityAnalysis reliabilityAnalysis = new ReliabilityAnalysis(new DtmcModel((Dtmc)dtmcModel.get(0)), 12); 
		ByteArrayInputStream logContent = new ByteArrayInputStream((
				reliabilityAnalysis.getEquations()
			).getBytes());					
		createFileFromInputStream(selectedFile, resultFolder, ".rmcnewton.log.txt", "log result file", logContent);

		ReliabilityAnalysisResult result = reliabilityAnalysis.executeRMCNewtonSolver();

		ByteArrayInputStream fileContent = new ByteArrayInputStream((
				"Klaper Model Reliability:"+ result.getReliability() +"\n"+
				"Execution time: "+(System.currentTimeMillis()-starttime) +"\n"+
				"Number of iterations: "+ result.getIterations() +"\n"+
				"Max Value Error: "+ result.getMSV() +"\n"
			).getBytes());					
		createFileFromInputStream(selectedFile, resultFolder, ".rmcnewton.result.txt", "result file", fileContent);

		ByteArrayInputStream logPostContent = new ByteArrayInputStream((
				result.getRmcModelDetails()
			).getBytes());					
		createFileFromInputStream(selectedFile, resultFolder, ".rmcnewton.log.txt", "log result file", logPostContent);

		openInformation("Analysis with RMCNewton is finished.");
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
				openInformation("Analysis with RMCNewton failed due to old "+ description +" deletion failed.");
				return;
			}
		}
		try {
			resultFolder.getFile(klaperfileName(selectedFile)+extensionFileName).create(fileContent, true, new NullProgressMonitor());
		} catch (CoreException e) {
			openInformation("Analysis with RMCNewton failed due to "+ description +" creation failed.");
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
}
