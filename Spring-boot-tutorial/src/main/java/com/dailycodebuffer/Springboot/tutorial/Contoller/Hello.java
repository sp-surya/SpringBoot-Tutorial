package com.dailycodebuffer.Springboot.tutorial.Contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@GetMapping("/")
	public String helloWorld() {
		return "Welcome to Hello Worljjd";
	}

}
