package com.cts.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/welcome")
public class SampleController {
	
	public static String welcomeController() {
		return "Welcome to Spring Boot";
	}

}
