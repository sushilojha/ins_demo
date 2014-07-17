package com.tcs.dews.lobintegration.util;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.ResponseErrorHandler;

import com.tcs.dews.lobintegration.exception.LobIntegrationError;
import com.tcs.dews.lobintegration.exception.LobIntegrationException;

public class RestErrorHandler implements ResponseErrorHandler {

	private static final ObjectMapper MAPPER = new ObjectMapper();

	private ResponseErrorHandler errorHandler = new DefaultResponseErrorHandler();

	public RestErrorHandler() {
		super();
	}

	protected RestErrorHandler(ResponseErrorHandler errorHandler) {

		this.errorHandler = errorHandler;
	}

	@Override
	public void handleError(ClientHttpResponse response) throws IOException {
		try {
			errorHandler.handleError(response);
		} catch (HttpStatusCodeException e) {
			throw handleStatusCodeException(e);
		}

	}

	protected RuntimeException handleStatusCodeException(
			HttpStatusCodeException e) {
		HttpStatus statusCode = e.getStatusCode();

		if (!hasResponseBody(e)) {
			return new LobIntegrationException(e);
		}

		String message = getErrorMessageFromResponseBody(e
				.getResponseBodyAsByteArray());
		return new LobIntegrationException(message, e);
	}

	private String getErrorMessageFromResponseBody(
			byte[] responseBodyAsByteArray) {

		try {
			LobIntegrationError lobIntegrationError = MAPPER.readValue(
					responseBodyAsByteArray, 0, responseBodyAsByteArray.length , LobIntegrationError.class);
			return lobIntegrationError.getMessage();
		} catch (IOException e) {
			return "Unable to Map returned HTTP Response Body into RestError";
		}

	}

	private boolean hasResponseBody(HttpStatusCodeException e) {
		byte[] response = e.getResponseBodyAsByteArray();
		return response.length > 0;
	}

	@Override
	public boolean hasError(ClientHttpResponse response) throws IOException {
		return errorHandler.hasError(response);
	}

}
