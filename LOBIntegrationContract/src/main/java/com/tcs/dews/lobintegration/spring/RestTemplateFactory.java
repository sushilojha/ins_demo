package com.tcs.dews.lobintegration.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

public class RestTemplateFactory implements FactoryBean<RestTemplate>, ApplicationContextAware {
	
	private List<HttpMessageConverter<?>> messageConverters ;	
	private ResponseErrorHandler errorHandler ;	
	private ClientHttpRequestFactory requestFactory;	
	private List<ClientHttpRequestInterceptor> interceptors = new ArrayList<ClientHttpRequestInterceptor>();	
	private ApplicationContext applicationContext;
	private String resource;
	

	public RestTemplate getObject() throws Exception{
		RestTemplate template = null;
		
		if (requestFactory != null){
			template = new RestTemplate(new MetricsAwareClientHttpRequestFactory(requestFactory));
		}else{
			template = new RestTemplate(new MetricsAwareClientHttpRequestFactory());
		}
		
		if (messageConverters != null){
			template.setMessageConverters(messageConverters);
		}
		
		if (errorHandler != null){
			template.setErrorHandler(errorHandler);
		}
		return template;
	}
	
	
	public Class<?> getObjectType(){
		return RestTemplate.class;
	}
	
	
	public boolean isSingleton(){
		 return true;
	}

	public List<HttpMessageConverter<?>> getMessageConverters() {
		return messageConverters;
	}

	public void setMessageConverters(List<HttpMessageConverter<?>> messageConverters) {
		this.messageConverters = messageConverters;
	}

	public ResponseErrorHandler getErrorHandler() {
		return errorHandler;
	}

	public void setErrorHandler(ResponseErrorHandler errorHandler) {
		this.errorHandler = errorHandler;
	}

	public ClientHttpRequestFactory getRequestFactory() {
		return requestFactory;
	}

	public void setRequestFactory(ClientHttpRequestFactory requestFactory) {
		this.requestFactory = requestFactory;
	}

	public List<ClientHttpRequestInterceptor> getInterceptors() {
		return interceptors;
	}

	public void setInterceptors(List<ClientHttpRequestInterceptor> interceptors) {
		this.interceptors = interceptors;
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	
	public void setApplicationContext(ApplicationContext applicationContext)
				throws BeansException{
		this.applicationContext = applicationContext;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}
	
}
