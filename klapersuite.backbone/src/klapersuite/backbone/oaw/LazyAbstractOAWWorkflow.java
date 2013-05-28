package klapersuite.backbone.oaw;

import java.util.HashMap;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitorAdapter;
import org.eclipse.xpand2.Generator;
import org.eclipse.xtend.expression.AbstractExpressionsUsingWorkflowComponent;

/**
 * This class allows the use of jobs of the openArchitectureWare workflow engine as part of the SDQ workflow engine.
 * It is a lazy implementation since it loads input models just before running the taks by using the MDSD blackboard.
 * 
 * @author Steffen Becker
 * @author Mauro Luigi Drago
 *
 * @param <T> The class of the oAW job bridged by an specific instance of this class
 */
public abstract class LazyAbstractOAWWorkflow {

	private Logger logger = Logger.getLogger(LazyAbstractOAWWorkflow.class);
	
	protected Generator oawJob = null;
	
	private HashMap<String, EObject> slotContents;
	
	/**
	 * Constructor of the oAW bridge
	 * @param job The oAW job to wrap for execution in the SDQ workflow engine
	 */
	public LazyAbstractOAWWorkflow(Generator job) {
		this(job,new HashMap<String, EObject>());
	}
	
	/** Constructor of the oAW bridge
	 * @param job The oAW job to wrap for execution in the SDQ workflow engine
	 * @param slotContents Contains models of the oAW workflow engine's blackboard, i.e., models to be transformed
	 * by the encapsulated oAW job
	 */
	public LazyAbstractOAWWorkflow(Generator job,
			HashMap<String, EObject> slotContents) {
		super();
		
		this.oawJob = job;
		this.slotContents = slotContents;
	}

	public void execute(IProgressMonitor monitor) throws Exception {
		Issues issues = new IssuesImpl();
		WorkflowContext ctx = new WorkflowContextDefaultImpl();
		setupContext(ctx);
		
		try {
			setupOAWJob(oawJob);
			
			logger.info("Validating oAW configuration settings...");
			oawJob.checkConfiguration(issues);
			if (issues.hasErrors()) {
				String message = issues.toString();
				throw new Exception("oAW Job configuration is invalid: "+message);
			}
			
			logger.info("Running oAW task....");
			oawJob.invoke(ctx, new ProgressMonitorAdapter(monitor), issues);
			if (issues.hasErrors())
				throw new Exception("oAW Job failed");	
		} catch(Exception e) {
			throw new Exception("oAW Failed",e);
		}
	}

	/**
	 * Creates the oAW job's {@link WorkflowContext}
	 * @param ctx The context to configure. Add all the models needed by the oAW job
	 */
	protected void setupContext(WorkflowContext ctx) {
		for (String slot : slotContents.keySet()) {
			EObject eobj = slotContents.get(slot);
			ctx.set(slot, eobj);
		}
	}

	/** 
	 * Template method in which hiers can add logic to configure their specific oAW jobs 
	 * @param oawJob2 The job to be set up
	 */
	protected abstract void setupOAWJob(Generator oawJob2);

	public String getName() {
		return oawJob.getId() == null ? "oAW Job" : oawJob.getId();
	}

}
