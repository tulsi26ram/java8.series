package com.youtube.ownerapi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

public class PropertyUtils {

	private final String filePath = System.getProperty("user.dir")+"/src/test/resources/props/config.properties";
	Properties properties;
	FileInputStream fileInputStream;
	
	public PropertyUtils() {
		properties = new Properties();
		try {
			fileInputStream = new FileInputStream(filePath);
			properties.load(fileInputStream);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("File path is incorrect");
		}catch(IOException e) {
			e.printStackTrace();
		}		
		finally {
			try {
				fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}
	
	
	public String getProperty(String propertyName) {
		if(null!=properties.get(propertyName)) {
			return properties.getProperty(propertyName);
		}else {
			throw new RuntimeException("No Such property available in properties file");
		}
	}
	
	
}
