package com.example.demo.helloWorld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class helloWorld {

	
	@GetMapping("/hello")
	public String getFournisseurs() {
		
		return "hello world";
	}


	@GetMapping("/hello1")
	public String getHello() {
		
		return "hello world ..";
	}
	

	@GetMapping("/hello2")
	public String getHello2() {
		
		return "hello world .. 2";
	}
	
}
