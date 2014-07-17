package com.tcs.dews.lobintegration.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tcs.dews.lobintegration.server.LobIntegrationServer;
import com.tcs.dews.lobintegration.to.BundleItemData;
import com.tcs.dews.lobintegration.to.ProductDetailsRequestTO;
import com.tcs.dews.lobintegration.util.IntegrationController;

import static com.tcs.dews.lobintegration.util.LobIntegrationEndPoints.RETRIEVE_PRODUCT_DETAILS;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
public class LobIntegrationController extends IntegrationController {

	@Autowired
	private LobIntegrationServer lobIntegrationServer;
	
	@RequestMapping(value=RETRIEVE_PRODUCT_DETAILS, method=GET,
			produces=APPLICATION_JSON_VALUE)	
	@ResponseBody
	public BundleItemData retrieveProductDetails(@RequestBody ProductDetailsRequestTO productDetailsRequestTO){
		return lobIntegrationServer.retrieveProductDetails(productDetailsRequestTO);
	}

	public LobIntegrationServer getLobIntegrationServer() {
		return lobIntegrationServer;
	}

	public void setLobIntegrationServer(LobIntegrationServer lobIntegrationServer) {
		this.lobIntegrationServer = lobIntegrationServer;
	}
	
	
}
