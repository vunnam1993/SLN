package com.cts.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeControllers {

	@RequestMapping("/welcome")
	@ResponseBody
	public String welcome() {
		return "Hello Spring boot";
	}
	
	@RequestMapping("/home")
	@ResponseBody
	public ModelAndView welcomeHome() {
		ModelAndView mvc=new ModelAndView();
		mvc.setViewName("homes");
		return mvc;
	}
	@RequestMapping("/welcomes")
	public String successPage(Map<String,Object> model,@RequestParam String firstName,@RequestParam String lastName,@RequestParam String password,@RequestParam String conformPassword ) {
		/*ModelAndView mvc1 =new ModelAndView();
		mvc1.setViewName("welcome");*/
		
		model.put("firstName", firstName);
		model.put("lastName", lastName);
		model.put("password", password);
		model.put("conformPassword", conformPassword);
		return "welcome";
	}
	
	
}
