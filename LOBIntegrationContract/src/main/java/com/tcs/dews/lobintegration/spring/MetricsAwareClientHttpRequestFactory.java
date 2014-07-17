package com.tcs.dews.lobintegration.spring;

import java.io.IOException;
import java.net.URI;

import org.springframework.http.HttpMethod;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;

public class MetricsAwareClientHttpRequestFactory implements
		ClientHttpRequestFactory{
	
	private ClientHttpRequestFactory clientHttpRequestFactory;

	public MetricsAwareClientHttpRequestFactory(ClientHttpRequestFactory clientHttpRequestFactory){
		super();
		this.clientHttpRequestFactory = clientHttpRequestFactory;
	}
	
	public MetricsAwareClientHttpRequestFactory(){
		this(new BufferingClientHttpRequestFactory(new HttpComponentsClientHttpRequestFactory()));
	}
	
	@Override
	public ClientHttpRequest createRequest(URI uri, HttpMethod httpMethod)
			throws IOException{
		
		ClientHttpRequest request = clientHttpRequestFactory.createRequest(uri, httpMethod);
		
		return new MetricsAwareClientHttpRequest(request);
		
	}
	
	public ClientHttpRequestFactory getClientHttpRequestFactory() {
		return clientHttpRequestFactory;
	}

	public void setClientHttpRequestFactory(
			ClientHttpRequestFactory clientHttpRequestFactory) {
		this.clientHttpRequestFactory = clientHttpRequestFactory;
	}
	
	

}
