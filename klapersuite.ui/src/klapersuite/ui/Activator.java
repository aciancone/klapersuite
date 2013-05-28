package klapersuite.ui;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.eclipse.ui.console.*;
/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "klapersuite.ui"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
	public void notifyLaunchingAnalysis(String toolName) {
		initializeLoggingConsole();
		Logger.getLogger(Activator.class).info("=== Analysis with "+ toolName +" ===");
		Logger.getLogger(Activator.class).info("=================="+           "===="+ toolName.replaceAll(".", "="));
	}
	public void initializeLoggingConsole() {
		String klapersuiteConsoleName = "KlaperSuite Analysis Output";
		for(IConsole consoleToCheck: ConsolePlugin.getDefault().getConsoleManager().getConsoles()) {
			if(klapersuiteConsoleName.equals(consoleToCheck.getName())) {
				return;
		    }
		}

		MessageConsole console = new MessageConsole(klapersuiteConsoleName, null);
		ConsolePlugin.getDefault().getConsoleManager().addConsoles(new IConsole[] { console });
		ConsolePlugin.getDefault().getConsoleManager().showConsoleView(console);

		Logger.getRootLogger().setLevel(Level.ALL);             
		Logger.getRootLogger().addAppender(new WriterAppender(new SimpleLayout(), console.newMessageStream()));
	}
}
