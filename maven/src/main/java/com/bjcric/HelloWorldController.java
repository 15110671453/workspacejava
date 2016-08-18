package com.bjcric;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springboot")
public class HelloWorldController {
	
	@RequestMapping(value = "/{name}",method = RequestMethod.GET)
	@ResponseBody
	public String sayWorld(@PathVariable("name") String name){
		
		return "hello"+name+"restcontroller";
	}
	
}
