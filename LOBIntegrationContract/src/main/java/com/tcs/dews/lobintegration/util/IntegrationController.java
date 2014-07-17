package com.tcs.dews.lobintegration.util;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.tcs.dews.lobintegration.exception.LobIntegrationError;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

public abstract class IntegrationController  extends ResponseEntityExceptionHandler {

	public ResponseEntity<Object> handleDefaultException(Exception ex, WebRequest request){
		return handleExceptionInternal(ex,null,headers(),BAD_REQUEST,request);
	}

	private HttpHeaders headers() {	
		return new HttpHeaders();
	}

	@Override
	protected ResponseEntity<Object> handleExceptionInternal(Exception ex,
			Object body, HttpHeaders headers, HttpStatus status,
			WebRequest request) {
		
		super.handleExceptionInternal(ex, body, headers, status, request);
		
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		LobIntegrationError restError = new LobIntegrationError(status,ex.getMessage());
		
		return new ResponseEntity<Object>(restError,headers,status);
	}
	
	
}
