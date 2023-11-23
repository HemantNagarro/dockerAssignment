package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Starter {
	
	@GetMapping("/home")
	public String Demo() {
		return "Hello Docker";
	}

}
