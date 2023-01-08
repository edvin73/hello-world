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
		String sMonth = String.format("%02d" , month);
		
		int day = LocalDateTime.now().getDayOfMonth();
		String sDay = String.format("%02d" , day);
		
		int hour = LocalDateTime.now().getHour();
		String sHour = String.format("%02d" , hour);
		
		int minute = LocalDateTime.now().getMinute();
		String sMin = String.format("%02d" , minute);
		
		int sec = LocalDateTime.now().getSecond();
		String sSec = String.format("%02d" , sec);
		
		String val = "Date: " + sDay + "/"+ sMonth + "/" + year + " " +  sHour + ":" + sMin + ":" + sSec;
		
		return val;
	}

}
