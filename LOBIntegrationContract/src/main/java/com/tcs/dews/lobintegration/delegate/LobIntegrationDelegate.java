package com.tcs.dews.lobintegration.delegate;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.ResourceHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.http.converter.xml.SourceHttpMessageConverter;
import org.springframework.http.converter.xml.XmlAwareFormHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.tcs.dews.lobintegration.LobIntegration;
import com.tcs.dews.lobintegration.to.BundleItemData;
import com.tcs.dews.lobintegration.to.ProductDetailsRequestTO;
import com.tcs.dews.lobintegration.util.ApplicationUrlUtils;

import static com.tcs.dews.lobintegration.util.LobIntegrationEndPoints.buildURI;
import static com.tcs.dews.lobintegration.util.LobIntegrationEndPoints.RETRIEVE_PRODUCT_DETAILS;

public class LobIntegrationDelegate implements LobIntegration {

	private String contextRoot ;
	private String defaultHost = "localhost:8080";
	private ApplicationUrlUtils applicationUrlUtils ;
	private RestTemplate restTemplate ;
	
	public LobIntegrationDelegate(String contextRoot, String defaultHost){
		Preconditions.checkArgument(!Strings.isNullOrEmpty(contextRoot), "Context Root must be provided");
		
		this.contextRoot = contextRoot;
		this.defaultHost = defaultHost;
	}
	
	@Override
	public BundleItemData retrieveProductDetails(ProductDetailsRequestTO productDetailsRequestTO) {
		URI uri = buildURI(operationPath(RETRIEVE_PRODUCT_DETAILS),productDetailsRequestTO);
		
		System.err.println("URL::::::::::::::::" + restTemplate.getMessageConverters().size());
		
		restTemplate.getMessageConverters().add(new MappingJacksonHttpMessageConverter());
		
		return restTemplate.getForObject(uri, BundleItemData.class);
	}
	
	private List<HttpMessageConverter> buildHttpMessageConverter() {
		List<HttpMessageConverter> messageConverters  = new ArrayList<HttpMessageConverter>();
		messageConverters.add(new MappingJacksonHttpMessageConverter());
		messageConverters.add(new ByteArrayHttpMessageConverter());
		messageConverters.add(new StringHttpMessageConverter());
		messageConverters.add(new ResourceHttpMessageConverter());
		messageConverters.add(new SourceHttpMessageConverter());
		messageConverters.add(new XmlAwareFormHttpMessageConverter());
		
		return messageConverters;
	}

	private String operationPath(String relativePath) {		
		return applicationUrlUtils.getApplicationUrlPath(contextRoot + "/lob-services/" + relativePath,defaultHost);
	}

	public String getContextRoot() {
		return contextRoot;
	}

	public void setContextRoot(String contextRoot) {
		this.contextRoot = contextRoot;
	}

	public String getDefaultHost() {
		return defaultHost;
	}

	public void setDefaultHost(String defaultHost) {
		this.defaultHost = defaultHost;
	}

	public ApplicationUrlUtils getApplicationUrlUtils() {
		return applicationUrlUtils;
	}

	public void setApplicationUrlUtils(ApplicationUrlUtils applicationUrlUtils) {
		this.applicationUrlUtils = applicationUrlUtils;
	}

	public RestTemplate getRestTemplate() {
		return restTemplate;
	}

	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	
	

}
