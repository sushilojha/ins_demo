package com.tcs.dews.lobintegration.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.core.env.Environment;

public abstract class EnvironmentHelper {

	private static Map<String, String> environmentMapping = new HashMap<String, String>();
	
	static {
		environmentMapping.put("production", "");
		environmentMapping.put("dev-int", "dvnt");
	}
	
	public static boolean isProduction(Environment env){
		return env.acceptsProfiles("production");
	}
	
	public static boolean isWorkStation(Environment env){
		return env.acceptsProfiles("default");
	}
	
	public static String getAppHostName(Environment env){
		String appHostName = "" ;
		if(isProduction(env)){
			appHostName = "tcs.dewsportal.com";
		}
		return appHostName;
	}
}
