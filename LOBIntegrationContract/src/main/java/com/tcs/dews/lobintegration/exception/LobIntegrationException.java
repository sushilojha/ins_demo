package com.tcs.dews.lobintegration.exception;

public class LobIntegrationException extends RuntimeException{

	private static final long serialVersionUID = -30769282717181326L;

	public LobIntegrationException(String msg, Throwable e){
		super(msg,e);
	}
	
	public LobIntegrationException(Throwable e){
		super(e);
	}
	
	public LobIntegrationException(String msg){
		super(msg);
	}
}
