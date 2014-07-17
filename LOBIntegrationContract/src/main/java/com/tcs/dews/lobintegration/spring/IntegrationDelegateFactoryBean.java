package com.tcs.dews.lobintegration.spring;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;

import com.google.common.collect.Lists;
import com.tcs.dews.lobintegration.spring.RestTemplateFactory;
import com.tcs.dews.lobintegration.util.RestErrorHandler;

public class IntegrationDelegateFactoryBean implements ApplicationContextAware, BeanDefinitionRegistryPostProcessor {

	private String resource = "lob";
	protected ApplicationContext applicationContext;
	
	protected final RestTemplate restTemplate() throws Exception{
		
		RestTemplateFactory factory = new RestTemplateFactory();
		factory.setErrorHandler(new RestErrorHandler());
		factory.setResource(getResource());
		factory.setApplicationContext(applicationContext);
		factory.setInterceptors(buildRequestInterceptors());
		
		return factory.getObject();
	}

	private List<ClientHttpRequestInterceptor> buildRequestInterceptors() {
		List<ClientHttpRequestInterceptor> interceptors = Lists.newArrayList();
		
		interceptors.add(new CustomClientHttpRequestInterceptor());
		return null;
	}

	public String getResource() {		
		return resource ;
	}

	public void setResource(String resource) {		
		this.resource = resource;
	}
	
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0)
			throws BeansException {
		// No Implementation
		
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry arg0)
			throws BeansException {
		// No Implementation
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
		
	}
	
	
}
