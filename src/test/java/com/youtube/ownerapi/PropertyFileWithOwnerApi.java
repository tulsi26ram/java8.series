package com.youtube.ownerapi;

import org.aeonbits.owner.ConfigFactory;

public class PropertyFileWithOwnerApi {

	
	public static void main(String[] args) {
		
		ConfigDetails config = ConfigFactory.create(ConfigDetails.class);
		
		System.out.println("browser Name is "+config.browserName());
		System.out.println("Screenshot enabled ? "+ config.isScreenshotEnabled());
		System.out.println("Time out without being in Config properties "+config.timeOut());
		System.out.println("Is subscribed ? "+config.subscribed());
		System.out.println("Tool name with Enum is "+config.toolName());
		
	}
}
