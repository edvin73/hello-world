package com.springdemo;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
	
	@GetMapping(value = "/hello/{name}")
	public String hello(@PathVariable(name = "name") String name) {
		return "Welcome : " + name;
	}
	
	@GetMapping(value = "/date")
	public String getDate( ) {
		
		String val = LocalDateTime.now().toString();
		
		return val;
	}

}
