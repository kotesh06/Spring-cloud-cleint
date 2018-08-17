package com.example.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeService {
	@RequestMapping("/employee")
	public String getHello() {
		return "Hello Kotesh";
	}
	
	@RequestMapping("/")
	public String index(){
		return "Hello Test Rest Controller";
	}
	

}
