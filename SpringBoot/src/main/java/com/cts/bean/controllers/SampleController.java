package com.cts.bean.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@RequestMapping("/welcome")
	public String welcomeController() {
		return "Welcome to Spring Boot";
	}

}
