package com.youtube.ownerapi;

public class PropertyFileWithoutTryWithResources {

	
	public static void main(String[] args) {
		
		PropertyUtils utils = new PropertyUtils();
		
		System.out.println(utils.getProperty("browserName"));
		
//		System.out.println("With No Property "+utils.getProperty("lovesCoffee"));
	}
}
