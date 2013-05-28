/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */

package klapersuite.backbone.utility;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.m2m.internal.qvt.oml.emf.util.ModelContent;

/**
 * collection of utilities for eobjects
 * @author Andrea Ciancone
 *
 */
@SuppressWarnings("restriction")
public class ResourceHelper {
	ResourceSet resourceSet;
	public ResourceHelper () {
		
		resourceSet = new ResourceSetImpl();
	}
	/**
	 * Save the EMF model into a file
	 * @param objs model to save
	 * @param tofile filename where the model would be saved
	 * @throws IOException raised in case an error occurs and the model is not saved.
	 */
	public void toFile(List<EObject> objs, URI tofile) throws IOException {
  
        Map<String, Object> options = new HashMap<String, Object>();
        options.put(XMLResource.OPTION_ENCODING, "UTF-8");
        
        for(EObject obj: objs) {
        	if(obj instanceof EStructuralFeature.Internal.DynamicValueHolder) {
        		options.put("SCHEMA_LOCATION", Boolean.TRUE);
        	}
        }
		Resource r = resourceSet.createResource(tofile);

		try {
			/* Why is r null? */
			r.getContents().addAll(objs);
		} catch (NullPointerException e) {
			e.printStackTrace();
			throw new IOException("Resource saving failed "+ tofile.toString());
		}
		r.save(options);
	}
	public ModelContent loadModel(URI uri) throws IOException {
        if(uri == null) {
            return null;
        }
		if (uri.fragment() != null && uri.fragment().length() > 0) {
            EObject eObject = resourceSet.getEObject(uri, true);
            if (eObject == null) {
            	return null;
            }
            return new ModelContent(Collections.singletonList(eObject));
        }
		Resource resource = resourceSet.createResource(uri);
		resource.load(null);
        if (resource == null || resource.getContents().isEmpty()) {
        	return null;
        }
       	return new ModelContent(resource.getContents()); 
		
	}

	public List<EObject> fromFile(URI uri) throws IOException {
		IOException e1 = null;
		ModelContent m = null;
		String fileSynchronized = null;
		String fileToSync = null;
		do {
			fileSynchronized = fileToSync;
			try {
				m = loadModel(uri);
			} catch (IOException e) {
				String msg = e.getMessage(); 
				if(!msg.startsWith("Resource is out of sync") && !msg.startsWith("The model is not reachable")) {
					throw e;
				}
				e1 = e;
				fileToSync = msg.replaceAll("^.*'(.+)'.*$", "$1");
			}
			if(null != m)
				return m.getContent();
			if(null == fileToSync)
				throw new IOException("The model is empty or doesn't exist ("+ uri.toString()+")");
			// means that the precedent synchronization failed
			if(fileSynchronized == fileToSync)
				throw e1;
			System.out.println("The file is out of sync ("+fileToSync+")");
			synchronizeResource(fileToSync);
		} while(true);	
	}
	public boolean existsFile(URI uri) {
		try {
			fromFile(uri);
		} catch (IOException e) {
			return false;
		}
		return true;
	}
	private boolean synchronizeResource(String uri) {
		IPath path = Path.fromPortableString(uri);
		SynchMonitor synchMonitor = new SynchMonitor();
		try {
			ResourcesPlugin.getWorkspace().getRoot().getFile(path) .refreshLocal(IFile.DEPTH_INFINITE, synchMonitor);
		} catch (CoreException e) {
			e.printStackTrace();
			return false;
		}
		synchMonitor.waitEnd();
		return true;
	}
	public boolean synchronizeProject(String name) {
		SynchMonitor synchMonitor = new SynchMonitor();
		try {
			ResourcesPlugin.getWorkspace().getRoot().getProject(name).refreshLocal(IProject.DEPTH_INFINITE, synchMonitor);
			
			synchMonitor = new SynchMonitor();
			IPath path = Path.fromPortableString("platform:/resource/"+name+"/");
			ResourcesPlugin.getWorkspace().getRoot().getFolder(path).refreshLocal(IFolder.DEPTH_INFINITE, synchMonitor);
		} catch (CoreException e) {
			e.printStackTrace();
			return false;
		}
		synchMonitor.waitEnd();
		return true;
	}
	class SynchMonitor implements IProgressMonitor {
		boolean notified = false;
		public void beginTask(String name, int totalWork) {
		}
		public synchronized void done() {
			notified = true;
			notifyAll();
		}
		public void internalWorked(double work) {
		}
		public boolean isCanceled() {
			return false;
		}
		public synchronized void setCanceled(boolean value) {
			notified = true;
			notifyAll();
		}
		public void setTaskName(String name) {
		}
		public void subTask(String name) {
		}
		public void worked(int work) {
		}
		public synchronized void waitEnd() {
			while(false == notified) {
				try {
					wait();
				} catch (InterruptedException e) {
				}
			}
		}
	}
}