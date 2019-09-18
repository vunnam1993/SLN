package com.cts.bean.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import com.cts.bean.beans.Student;
import com.cts.bean.beans.StudentReplay;

@RestController
public class SampleController {
	
	@RequestMapping("/welcome")
	public String welcomeController() {
		return "Welcome to Spring Boot";
	}
	
	@RequestMapping(method=RequestMethod.POST ,value="/home")
	public StudentReplay getDetails(@RequestBody Student student) {
		
		StudentReplay studentReplay= new StudentReplay();
		studentReplay.setIds(student.getId());
		studentReplay.setName(student.getStudentName());
		studentReplay.setReplayAdress(student.getAddress());
		studentReplay.setStatus("conformation Status");
		
		return studentReplay;
		
		
	}
	
	
	

}
