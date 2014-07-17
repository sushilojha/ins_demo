package com.tcs.dews.lobintegration.util;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.web.util.UriComponentsBuilder;

import com.google.common.collect.ImmutableSet;
import com.tcs.dews.lobintegration.exception.LobIntegrationException;

public class QueryStringBuilder {

	public URI buildURI(String endpoint, Object requestTO) {
		
		UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromUriString(endpoint);
		PropertyDescriptor[]   propertyDescriptors = BeanUtils.getPropertyDescriptors(requestTO.getClass());
		
		Set<Method> declaredMethods = ImmutableSet.copyOf(requestTO.getClass().getDeclaredMethods());
		
		for (PropertyDescriptor propertyDescriptor : propertyDescriptors){
			Method readMethod = propertyDescriptor.getReadMethod();
			
			if (declaredMethods.contains(readMethod)){				
				try {
					Object value = invoke(readMethod,requestTO);
					
					if (value != null){
						uriComponentsBuilder.queryParam(propertyDescriptor.getName(), value);
					}
				} catch (IllegalAccessException e) {
					throw handleException(endpoint,e);
				} catch (InvocationTargetException e) {
					throw handleException(endpoint,e);
				}
			}
		}
		
		return uriComponentsBuilder.build().encode().toUri();

	}

	protected RuntimeException handleException(String endpoint, Throwable t) {		
		return new LobIntegrationException("Unexpected error while building query parameters for endpoint" + endpoint + ".", t);
	}

	protected  Object invoke(Method readMethod, Object requestTO) throws  IllegalAccessException, InvocationTargetException {		
		return readMethod.invoke(requestTO);
	}
}
