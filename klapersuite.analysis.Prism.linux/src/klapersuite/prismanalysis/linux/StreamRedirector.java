/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */

package klapersuite.prismanalysis.linux;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;

/**
 * Redirects an input stream onto a logging stream.
 * @author Mauro Luigi Drago, Andrea Ciancone
 *
 */
public class StreamRedirector extends Thread {
	
	public static enum Type {NORMAL, ERROR};
	
	private InputStream inputStream;
	private Logger logger;
	private IStreamRedirector loggerExecutor;

	public StreamRedirector(InputStream inputStream, Logger logger, Type type) {
		super();
		
		this.inputStream = inputStream;
		this.logger = logger;
		if (type == Type.ERROR)
			loggerExecutor = new ErrorStreamRedirector();
		else
			loggerExecutor = new NormalStreamRedirector();	
	}
	@Override
	public void run() {
		InputStreamReader reader = new InputStreamReader(inputStream);
		BufferedReader br = new BufferedReader(reader);
		try {
			String line = null;
			while ((line = br.readLine()) != null) {
				loggerExecutor.log(line);
				line = null;
			}
		} catch (IOException e) {
			logger.error("Unable to read from stream : " + e.getMessage());
		} finally {
			try {
				br.close();
				reader.close();
			} catch (IOException e) {
				logger.error("Unable to close stream");
			}
		}
	}
	interface IStreamRedirector {
		public void log(String msg);
	}
	class NormalStreamRedirector implements IStreamRedirector {
		public void log(String msg) {
			logger.info(msg);
		}		
	}
	class ErrorStreamRedirector implements IStreamRedirector {
		public void log(String msg) {
			logger.error(msg);
		}
	}
}
