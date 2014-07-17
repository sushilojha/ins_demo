package com.tcs.dews.lobintegration.util;

import java.net.URI;

public class LobIntegrationEndPoints {

	public static final String RETRIEVE_PRODUCT_DETAILS = "/product/details";
	
	public static final QueryStringBuilder QUERY_BUILDER = new QueryStringBuilder();
	
	protected LobIntegrationEndPoints(){
		super();
	}
	
	public static URI buildURI(String endpoint, Object requestTO){
		return QUERY_BUILDER.buildURI(endpoint, requestTO);
	}
}
