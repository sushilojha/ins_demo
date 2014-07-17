package com.tcs.dews.lobintegration.spring;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.ClientHttpResponse;

public class MetricsAwareClientHttpRequest implements ClientHttpRequest {

	private ClientHttpRequest target;

	public MetricsAwareClientHttpRequest(ClientHttpRequest target) {
		super();
		this.target = target;
	}

	@Override
	public HttpMethod getMethod() {
		return target.getMethod();
	}

	@Override
	public URI getURI() {
		return target.getURI();
	}

	@Override
	public HttpHeaders getHeaders() {
		return target.getHeaders();
	}

	@Override
	public OutputStream getBody() throws IOException {
		return target.getBody();
	}

	@Override
	public ClientHttpResponse execute() throws IOException {
		ClientHttpResponse response = null;
		response = target.execute();
		return response;
	}

}
