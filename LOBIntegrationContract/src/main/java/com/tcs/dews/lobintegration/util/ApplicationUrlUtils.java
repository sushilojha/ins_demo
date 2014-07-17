package com.tcs.dews.lobintegration.util;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class ApplicationUrlUtils {

	public ApplicationUrlUtils(){
		super();
	}
	
	public String getApplicationUrlPath(String path, String defaultHost){
		HttpServletRequest request =  ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		return buildApplicationUrlPath(path,request,defaultHost);
	}

	private String buildApplicationUrlPath(String path,
			HttpServletRequest request, String defaultHost) {
		List<KeyValue> parameters = new ArrayList<KeyValue>();
		String prefix = "http://";
		return addParameters(prefix + getApplicationUrlHostName(defaultHost,request)
				+ "/" + path, parameters);
	}

	private String addParameters(String url, List<KeyValue> parameters) {
		
		StringBuffer endPointURL = new StringBuffer();
		
		endPointURL.append(url);
		
		for (KeyValue parameter : parameters){
			if(endPointURL.toString().indexOf('?') < 0){
				endPointURL.append('?');
			}else{
				endPointURL.append('&');
			}
			
			endPointURL.append(parameter.getKey());
			endPointURL.append("=");
			endPointURL.append(parameter.getValue());
		}
		
		return endPointURL.toString();
	}

	private String getApplicationUrlHostName(String defaultHost, HttpServletRequest request) {
		WebApplicationContext ctx = getWebApplicationContext(request);
		if (EnvironmentHelper.isWorkStation(ctx.getEnvironment())){
			return defaultHost;
		}
		else {
			return EnvironmentHelper.getAppHostName(ctx.getEnvironment());
		}
	}

	private WebApplicationContext getWebApplicationContext(HttpServletRequest request) {
		
		  WebApplicationContext ctx = ServletContextUtils.getWebApplicationContext(request.getSession().getServletContext());
		  return ctx ;
	}
}
