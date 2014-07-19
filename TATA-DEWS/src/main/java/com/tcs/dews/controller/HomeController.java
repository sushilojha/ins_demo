package com.tcs.dews.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tcs.dews.bean.PersonalInfoBean;
import com.tcs.dews.bean.SelectedProducts;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	private SelectedProducts selectedProducts;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String onLoad(HttpServletRequest request,
			HttpServletResponse response, Model model) {

		selectedProducts = new SelectedProducts();

		selectedProducts.setAutoIndicator(true);
		selectedProducts.setAutoHomeIndicator(true);
		selectedProducts.setHomeIndicator(true);
		model.addAttribute("selectedProducts", selectedProducts);
		return "shoppingHome";
	}

	@RequestMapping(value = "/personalInfo", method = RequestMethod.POST)
	public String loadPersonalInfo(Model model) {

		selectedProducts.setAutoIndicator(true);
		model.addAttribute("selectedProducts", selectedProducts);
		return "personalInformation";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public @ResponseBody
	String selectProduct(@RequestBody PersonalInfoBean jsonString, Model model) {

		return "sucess";
	}

	@RequestMapping(value = "/autoQuote", method = RequestMethod.POST)
	public String onNext(@ModelAttribute PersonalInfoBean personalInfoBean,
			Model model) {
		model.addAttribute("perosnalInfoBean", personalInfoBean);
		return "autoquote";
	}
}
