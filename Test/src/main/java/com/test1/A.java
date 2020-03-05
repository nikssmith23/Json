package com.test1;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class A {
	static Logger log = Logger.getLogger(A.class);

	public static void sum() {
		{
			PropertyConfigurator.configure("A.properties");
			log.trace("Trace Message!");
			log.debug("Debug Message!");
			log.info("Info Message!");
			log.warn("Warn Message!");
			log.error("Error Message!");
			log.fatal("Fatal Message!");

		}
	}

}
