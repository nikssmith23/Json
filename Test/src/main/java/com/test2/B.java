package com.test2;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.test1.A;

public class B {
	static Logger log = Logger.getLogger(B.class);

	public static void main(String[] args) {
		// PropertiesConfigurator is used to configure logger from properties file
		PropertyConfigurator.configure("B.properties");
		log.trace("Trace Message!");
		log.debug("Debug Message!");
		log.info("Info Message!");
		log.warn("Warn Message!");
		log.error("Error Message!");
		log.fatal("Fatal Message!");
System.out.println();
		A.sum();
	}

}
