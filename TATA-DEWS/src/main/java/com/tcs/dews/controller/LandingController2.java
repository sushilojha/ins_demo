package com.tcs.dews.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tcs.dews.lobintegration.LobIntegration;
import com.tcs.dews.lobintegration.spring.DelegateRegistry;
import com.tcs.dews.lobintegration.to.BundleItemData;
import com.tcs.dews.lobintegration.to.ProductDetailsRequestTO;

@Controller
@RequestMapping(value="/dewsLanding_shop.htm")
public class LandingController2 {
	
	@Autowired
	private DelegateRegistry  lobDelegates;
	
	@RequestMapping(method=RequestMethod.GET)
	public String onLoad(@RequestParam String lob, @RequestParam String quoteId, Model model){
		
		LobIntegration  lobIntegration = lobDelegates.get(lob);
		BundleItemData bundleItemData = lobIntegration.retrieveProductDetails(buildProductDetailsRequestTo(lob,quoteId));
		
		model.addAttribute("bundleItemData", bundleItemData);
		return "bundleSummary";
	}

	private ProductDetailsRequestTO buildProductDetailsRequestTo(String lob, String quoteId) {
		ProductDetailsRequestTO productDetailsRequestTO = new ProductDetailsRequestTO();
		productDetailsRequestTO.setQuoteId(quoteId);
		return productDetailsRequestTO;
	}

	public DelegateRegistry getlobDelegates() {
		return lobDelegates;
	}

	public void setlobDelegates(DelegateRegistry lobDelegates) {
		this.lobDelegates = lobDelegates;
	}
	
	
	
	
	

}
