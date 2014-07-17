package com.tcs.dews.lobintegration.spring;

import java.io.IOException;
import static org.springframework.http.MediaType.APPLICATION_JSON;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import com.google.common.collect.Lists;

public class CustomClientHttpRequestInterceptor implements
		ClientHttpRequestInterceptor {

	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body,
			ClientHttpRequestExecution execution) throws IOException {

		HttpHeaders headers = request.getHeaders(); 
		headers.setAccept(Lists.newArrayList(APPLICATION_JSON));
		headers.setContentType(APPLICATION_JSON);
		
		return execution.execute(request, body);
	}

}
