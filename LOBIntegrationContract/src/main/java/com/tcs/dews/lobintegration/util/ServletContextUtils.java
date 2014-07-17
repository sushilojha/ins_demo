package com.tcs.dews.lobintegration.util;

import java.util.Enumeration;

import javax.servlet.ServletContext;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public abstract class ServletContextUtils {

	private static final String DISPATCHER_SERVLET_CONTEXT_PREFIX = "org.springframework.web.servlet.FrameworkServlet.Context";

	public static WebApplicationContext getWebApplicationContext(
			ServletContext servletContext) {
		WebApplicationContext webApplicationContext = null;

		Enumeration<String> attributeNames = servletContext.getAttributeNames();

		while (attributeNames.hasMoreElements()) {
			String attributeName = attributeNames.nextElement();
			if (attributeName.startsWith(DISPATCHER_SERVLET_CONTEXT_PREFIX)) {
				webApplicationContext = (WebApplicationContext) servletContext
						.getAttribute(attributeName);
				break;
			}

		}

		if (webApplicationContext == null) {
			webApplicationContext = WebApplicationContextUtils
					.getWebApplicationContext(servletContext);
		}

		return webApplicationContext;
	}
}