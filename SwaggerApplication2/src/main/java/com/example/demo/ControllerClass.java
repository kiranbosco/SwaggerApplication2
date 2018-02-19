package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

	@RequestMapping(value="/getmethdoInfo",method=RequestMethod.GET)
	public String demo() {
		return "success";

	}

	@RequestMapping(value="/postMethod",method=RequestMethod.POST)
	public String postDemo(@RequestBody Demo demo) {
		
		System.out.println("post api success : " + demo.getDemo_id ());
		System.out.println("post api success  :  " + demo.getDemo_name());
		return "post Api Success";
		
	}
	
	//Comment
	
}
