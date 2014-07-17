package com.tcs.dews.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/dewsLanding.htm")
public class LandingController {
	@RequestMapping(method=RequestMethod.GET)
	public String onLoad(HttpServletRequest request, HttpServletResponse response){
		return "personalInformation";
	}
	
	

}
