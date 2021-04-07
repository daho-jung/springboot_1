package com.example.demo.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping(value = "/home") 
	public String home(){ 
		return "index.html"; 
	} 
	
	@RequestMapping(value="/testValue", method=RequestMethod.GET)
	public String getTestValue() {
		String testvalue = "test String";
		return testvalue;
	}
}

