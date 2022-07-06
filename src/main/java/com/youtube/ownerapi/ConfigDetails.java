package com.youtube.ownerapi;

import java.util.List;

import org.aeonbits.owner.Config;

@Config.Sources(value="file:${user.dir}/src/test/resources/props/Config.properties")
public interface ConfigDetails extends Config{

	/**
	 * Name of the method names here should be matching with key's in the
	 * config.properties. @DefaultValue is suggested to use to avoid Null Pointer Exception
	 */
	
	@DefaultValue(value="FIREFOX")
	String browserName();
	
	@DefaultValue("false")
	boolean isScreenshotEnabled();
	
	@DefaultValue(value="15")
	Long timeOut();
	
	List<String> cities();
	
	@DefaultValue("true")
	@Key("interested")   //in config.properties the key will be interested
	boolean subscribed();
	
	@DefaultValue("SELENIUM")
	@Key("tool")
	TOOLS toolName();
	
}
