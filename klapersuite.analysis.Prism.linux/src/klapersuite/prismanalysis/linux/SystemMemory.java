/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */

	String freeRegex = "[0-9]+";
	String spacesRegex = "\\s+";
	final Pattern memoryPattern = Pattern.compile(spacesRegex+"("+freeRegex+")"+spacesRegex+sharedRegex+spacesRegex+bufferRegex+spacesRegex+"("+cacheRegex+")$");
	public Long availableRam(Long defaultValue) {
		Process free;
		try {
			free = Runtime.getRuntime().exec("free");
		} catch (IOException e1) {
			return defaultValue;
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(free.getInputStream()));
		String line = null;
		try {
			while((line = br.readLine())!=null) {
				if(line.startsWith("Mem:")) break;
			}
			if(line == null) {
				return defaultValue;
			}
			Matcher matcher = memoryPattern.matcher(line);
			matcher.find();
			String freeMem = matcher.group(1);
			String cacheMem = matcher.group(2);
			return Long.valueOf(freeMem) + Long.valueOf(cacheMem);	
		} catch (IOException e) {
			e.printStackTrace();
		}
		return defaultValue;
	}
}
