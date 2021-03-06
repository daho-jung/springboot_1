package com.example.demo.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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
	
	//jsp
	@RequestMapping("/test")
	public ModelAndView test() throws Exception{
		ModelAndView mav = new ModelAndView("test");
		mav.addObject("name", "haha");
		
		List<String> testList = new ArrayList<String>();
		testList.add("a");
		testList.add("b");
		testList.add("c");
		mav.addObject("list", testList);
		
		return mav;
	}
}

