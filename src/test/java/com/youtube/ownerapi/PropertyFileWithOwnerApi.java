package com.youtube.ownerapi;

import org.aeonbits.owner.ConfigFactory;

public class PropertyFileWithOwnerApi {

	
	public static void main(String[] args) {
		
		ConfigDetails config = ConfigFactory.create(ConfigDetails.class);
		
		System.out.println("browser Name is "+config.browserName());
		System.out.println("loves coffee ? "+ config.isScreenshotEnabled());
		System.out.println("Time out without being in Config properties "+config.timeOut());
	}
}
