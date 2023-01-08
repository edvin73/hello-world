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
	
	@GetMapping(value = "/now")
	public String getDate( ) {
		
		
		
		int year = LocalDateTime.now().getYear();
		int month = LocalDateTime.now().getMonth().getValue();
		int day = LocalDateTime.now().getDayOfMonth();
		
		int hour = LocalDateTime.now().getHour();
		int minute = LocalDateTime.now().getMinute();
		int sec = LocalDateTime.now().getSecond();
		
		String val = day + "/"+ month + "/" + year + " " +  hour + ":" + minute + ":" + sec;
		
		return val;
	}

}
