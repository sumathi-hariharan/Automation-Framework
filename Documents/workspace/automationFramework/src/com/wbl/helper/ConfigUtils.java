package com.wbl.helper;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;

public class ConfigUtils {
	
	private Logger logger = Logger.getLogger(ConfigUtils.class);
	
	Properties prop;
	
	 public final String BROWSER;
	 public final String URL;
	
	public ConfigUtils(String fileName) {
		
		logger.info("READING THE CONFIG FILE..");
		
		prop = new Properties(); 
		try {
			
			prop.load(new FileInputStream (System.getProperty("user.dir") + "/resources/" + fileName));
		

		} catch (FileNotFoundException e) {
			
							logger.error("File not found-Please give the correct file details");
	        e.printStackTrace();
					
		} catch (IOException e) {
			e.printStackTrace();
			logger.error("Issues reading the given config properties file");
		}

		BROWSER = (String)prop.get("browser");
		URL = prop.getProperty("url");
	}

}

