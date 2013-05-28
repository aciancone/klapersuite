/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


public class PrismRunner {
	private static final long IN_KB_512MB = 512*1024;
	final String prismVersion = "prism-3.3.1-linux";
	final URL prismArchive;
	final File prismDestinationDir;
	final String prismExecutablePath;
	private static final Logger logger = Logger.getLogger(PrismRunner.class);
	
	public PrismRunner() {
		this(null);
	}
	public PrismRunner(String prismExecutablePath) {
		this(new File(System.getProperty("java.io.tmpdir")), prismExecutablePath);
	}
	public PrismRunner(File prismDestinationDir, String prismExecutablePath) {
		this.prismArchive = getClass().getResource("/"+prismVersion+".tar.gz");
		this.prismDestinationDir = prismDestinationDir;
		this.prismExecutablePath = prismExecutablePath;
	}
	public boolean install() throws IOException {
		if(!prismDestinationDir.exists())
			prismDestinationDir.mkdir();
		if(!prismDestinationDir.canWrite())
			throw new IOException("Read-only installation directory");

		extractTar();
		runPrismInstaller();
		return true;
	}
	public boolean uninstall() {
		if(prismInstallationDir().exists())
			try {
				FileUtils.forceDelete(prismInstallationDir());
			} catch (IOException e) {
				return false;
			}
		return true;
	}
	public boolean extractTar() throws IOException {
		logger.info("Extract prism archive: "+prismArchive);
		InputStream gzStream = prismArchive.openStream();
        TarInputStream tarStream = new TarInputStream(new GZIPInputStream(gzStream));
        TarEntry tarEntry;
        while((tarEntry=tarStream.getNextEntry()) != null) {
			File destPath = new File(prismDestinationDir,tarEntry.getName());
			if (tarEntry.isDirectory()) {
				destPath.mkdir();
				continue;
			}
			FileOutputStream fout = new FileOutputStream(destPath);
			tarStream.copyEntryContents(fout);
			fout.close();
			if(tarEntry.getName().endsWith("install.sh"))
				destPath.setExecutable(true);
		}
		tarStream.close();
		gzStream.close();
		return true;		
	}
	public void checkPrismInstallation() throws IOException {
		logger.debug("Prism executable file: "+prismExecutableFile().toString());
		if(!prismInstallationDir().exists())
			throw new IOException("Prism is not installed");

		logger.debug("Check prism installation...");
		Process process = launchPrism(new String[]{});	
		if(process==null)
			throw new IOException("Prism solver doesn't run properly");
		if(exitValueAfterTermination(process)!=0)
			throw new IOException("Prism solver doesn't work properly");
	}
	public Process launch(File pmFile, File pctlFile, int resultDecimalDigitsPrecision) throws IOException {
		if(!pmFile.canRead())
			throw new IOException("pmFile is not accessible ("+pmFile.toString()+")");
		if(!pctlFile.canRead())
			throw new IOException("pctlFile is not accessible ("+pctlFile.toString()+")");
		Process prismProcess = launchPrism(new String[]{"-cuddmaxmem", String.valueOf(Math.max(IN_KB_512MB, new SystemMemory().availableRam(IN_KB_512MB))), "-maxiters", "200000", "-e", "1e-"+resultDecimalDigitsPrecision, pmFile.toString(), pctlFile.toString()});
		if(prismProcess==null)
			throw new IOException("Prism solver doesn't run properly");
		if(exitValueAfterTermination(prismProcess)!=0)
			throw new IOException("Prism solver doesn't work properly");
		return prismProcess;
	}
	private int runPrismInstaller() throws IOException {
		logger.debug("Run prism installer file...");
		return exitValueAfterTermination(
			Runtime.getRuntime().exec(prismInstallerFile().toString(), null, prismInstallationDir()));
	}
	private Process launchPrism(String ... arguments) throws IOException {
		String[] completeCmd = new String[arguments.length+1];
		if(prismExecutablePath!=null && prismExecutablePath.length()>0) {
			completeCmd[0]=prismExecutablePath;
		}else {
			completeCmd[0]=prismExecutableFile().toString();
		}
		for(int i=0; i<arguments.length; i++) {
			completeCmd[i+1] = arguments[i];
		}
		logger.debug("Launch prism: "+cmdLineString(completeCmd));
		Process prismProcess = Runtime.getRuntime().exec(completeCmd);
		//(new StreamRedirector(prismProcess.getInputStream(), logger, StreamRedirector.Type.NORMAL)).run();
		//(new StreamRedirector(prismProcess.getErrorStream(), logger, StreamRedirector.Type.ERROR)).run();
		return prismProcess;
	}
	private String cmdLineString(String[] completeCmd) {
		String cmdLine="";
		for(String str: completeCmd) {
			cmdLine+="["+str+"] ";
		}
		return cmdLine;
	}
	private File prismInstallerFile() {
		return new File(prismInstallationDir(), "install.sh");
	}
	private File prismExecutableFile() {
		return new File(new File(prismInstallationDir(), "bin"), "prism");
	}
	private File prismInstallationDir() {
		return new File(prismDestinationDir, prismVersion);
	}
	private int exitValueAfterTermination(Process process) {
		while(true) {
			try {
				logger.debug("Process exit value: "+process.waitFor());
				return process.exitValue();
			} catch (InterruptedException e) {
				logger.debug("Prism execution wait interrupted");
			}
		}
	}
}