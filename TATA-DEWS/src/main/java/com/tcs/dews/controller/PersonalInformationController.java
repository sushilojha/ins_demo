package com.tcs.dews.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tcs.dews.bean.PersonalInfoBean;

@Controller
@SessionAttributes
public class PersonalInformationController {
	
	@RequestMapping(value="/autoQuote.htm",method=RequestMethod.GET)
	public String onNext(@ModelAttribute PersonalInfoBean personalInfoBean,Model model){
		model.addAttribute("perosnalInfoBean",personalInfoBean);
		return "autoquote";
	}

}
