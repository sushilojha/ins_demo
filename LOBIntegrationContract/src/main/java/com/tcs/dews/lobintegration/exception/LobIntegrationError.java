package com.tcs.dews.lobintegration.exception;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.http.HttpStatus;

import com.google.common.base.Objects;


public class LobIntegrationError implements Serializable {

	private static final long serialVersionUID = -2121250103408430948L;

	private final HttpStatus status;
	
	private final String message;

	@JsonCreator
	public LobIntegrationError(@JsonProperty("status")HttpStatus status, @JsonProperty("message") String message){
		this.message = message;
		this.status =  status ;
	}
	public HttpStatus getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}
	
	public String toString() {
		String statusMessage = new StringBuilder()
		.append(getStatus().value())
		.append("(")
		.append( getStatus().getReasonPhrase())
		.append(")")
		.toString();
		
		return Objects.toStringHelper(this)
				.add("status", statusMessage)
				.add("message",getMessage())
				.omitNullValues()
				.toString();
		
	}
}
