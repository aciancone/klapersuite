package klapersuite.backbone.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.logging.impl.LogFactoryImpl;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.xpand2.Generator;
import org.eclipse.xpand2.output.JavaBeautifier;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.PostProcessor;
import org.eclipse.xpand2.output.XmlBeautifier;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;

/**
 * A job to run oAWs Xpand Generator on models in order to generate code (i.e., perform a model-2-text transformation).
 * It is a lazy implementation since it loads input models just before running the taks by using the MDSD blackboard.
 * 
 * @author Steffen Becker
 * @author Mauro Luigi Drago
 * @author Andrea Ciancone
 */
@SuppressWarnings("deprecation")
public class LazyXpand {
	public static final String ISO_ENCODING  = "ISO-8859-1";
	public static final String UTF8_ENCODING  = "UTF-8";
	
	private final Logger logger = Logger.getLogger(LazyXpand.class);

	private final Generator oawJob;
	private final EPackage[] ePackages;
	private final Outlet[] outlets;
	private final HashMap<String, EObject> slotContents;

	public final List<String> advices;
	public final boolean checkProtectedRegions;
	public final String fileEncoding;
	public final boolean beautifyCode;
	public final String expandExpression;

	public LazyXpand(
			HashMap<String, EObject> slotContents, 
			EPackage[] ePackages,
			Outlet[] outlets,
			String expandExpression,
			String encoding
			) {
		this(slotContents,
				ePackages, 
				outlets,
				expandExpression,
				encoding,
				false, 
				false,
				new ArrayList<String>());
	}
	public LazyXpand(
			HashMap<String, EObject> slotContents, 
			EPackage[] ePackages,
			Outlet[] outlets,
			String expandExpression,
			String encoding,
			boolean checkProtectedRegions,
			boolean beautifyCode,
			List<String> advices
			) {
		
		super();

		oawJob = new Generator();
		this.slotContents = slotContents;
		
		this.ePackages = ePackages;
		this.outlets = outlets;
		this.expandExpression = expandExpression;

		this.checkProtectedRegions = checkProtectedRegions;
		this.fileEncoding = encoding; 
		this.beautifyCode = beautifyCode;
		this.advices = advices;
	}

	protected void setupOAWJob(Generator generatorJob) {
		generatorJob.setExpand(expandExpression);
		generatorJob.setFileEncoding(fileEncoding);
		
		for (EPackage p : ePackages) {
			generatorJob.addMetaModel(new EmfMetaModel(p));
		}
		
		String prResolver = "";
		for (Outlet o : outlets) {
			generatorJob.addOutlet(o);
			prResolver += o.getPath() + ",";
		}
		prResolver = prResolver.substring(0,prResolver.length()-1);
		
		if (this.checkProtectedRegions) {
			generatorJob.setPrSrcPaths(prResolver);
			generatorJob.setPrExcludes(".svn");
		}
		
		for (String advice : this.advices) {
			generatorJob.addAdvice(advice);
		}
		
		if (beautifyCode) {
			ArrayList<PostProcessor> beautifier = new ArrayList<PostProcessor>();
			beautifier.add(new JavaBeautifier());
			beautifier.add(new XmlBeautifier());
			generatorJob.setBeautifier(beautifier);
		}
	}
	public void run() throws Exception {
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
			oawJob.invoke(ctx, new NullProgressMonitor(), issues);
			if (issues.hasErrors())
				throw new Exception("oAW Job failed: "+issues.getErrors());	
		} catch(Exception e) {
			throw new Exception("oAW Failed: "+e.getMessage(), e);
		}
	}
	protected void setupContext(WorkflowContext ctx) {
		for (String slot : slotContents.keySet()) {
			EObject eobj = slotContents.get(slot);
			ctx.set(slot, eobj);
		}
	}

	public String getName() {
		return oawJob.getId() == null ? "oAW Job" : oawJob.getId();
	}
	public static LazyXpand factory(String template, Outlet[] outlets,
			EPackage[] ePackages, HashMap<String, EObject> slots, String encoding) {
		//TODO remove the logging trick to let xpand work
        String value = System.getProperty(LogFactoryImpl.LOG_PROPERTY);
        System.setProperty(LogFactoryImpl.LOG_PROPERTY, "org.apache.commons.logging.impl.NoOpLog");

        LazyXpand job = new LazyXpand(
                        slots, 
                        ePackages, 
                        outlets, 
                        template,
                        encoding);

        //TODO remove the logging trick to let xpand work
        System.setProperty(LogFactoryImpl.LOG_PROPERTY, value);
		return job;
	}
}
