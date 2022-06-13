package com.codingdojo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	
	@RequestMapping("")
	public String home() {
		return "Welcome";
	}
	
	@RequestMapping("")
	public String today() {
		return "Today you will find
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Today
	}

}
