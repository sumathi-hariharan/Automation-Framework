package com.wbl.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.logging.Log;

public class ConfigUtils {
	
	private Log logger = null;
	
	Properties prop;
	
	 public final String BROWSER;
	 public final String URL;
	
	public ConfigUtils(String fileName) {
		
		prop = new Properties (); 
		try {
			prop.load(new FileInputStream (System.getProperty("user.dir") + "\\ resources \\" + fileName));
		} catch (FileNotFoundException e) {
			
			logger.error("File not found-Please give the correct file details");
					
					
		} catch (IOException e) {
			
			logger.error("Issues reading the given config properties file");
		}
		BROWSER = prop.getProperty("browser");
		URL = prop.getProperty("url");
	}

}
