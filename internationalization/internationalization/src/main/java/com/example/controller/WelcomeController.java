package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class WelcomeController {
	@RequestMapping("/")
	public String hello() {
		return "Welcome";
	}

}
