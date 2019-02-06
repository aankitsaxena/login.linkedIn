package com.byju.coding.login.linkedIn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.byju.coding.login.linkedIn.model.UserBean;
import com.byju.coding.login.linkedIn.providers.LinkedInProvider;

@Controller
public class LoginController {
	 @Autowired 
	 LinkedInProvider linkedInProvider;
	 
	 @RequestMapping(value = "/connect/linkedin", method = RequestMethod.GET)
	 public String loginToLinkedIn(Model model) {
		 return linkedInProvider.getLinkedInUserData(model, new UserBean());
	 }
	 
	 @RequestMapping(value = { "/","/login" })
	 public String login() {
	 return "login";
	 }
}
