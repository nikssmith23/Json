package com.data;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Test {
	static Logger log = Logger.getLogger(Test.class.getName());
	   
	   public static void main(String[] args)throws IOException,SQLException{
			PropertyConfigurator.configure("data.properties");

	      log.info("Info");

	      log.info("Info");
	   }

}
