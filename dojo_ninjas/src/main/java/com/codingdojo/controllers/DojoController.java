package com.codingdojo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/dojos")
@Controller
public class DojoController {
public DojoController() {
	
	@GetMapping("/new")
	public String createDojo() {
		return "dojo";
	}
	
	@GetMapping("/{id}")
	public String findDojo() {
		return "";
	}
	
	@GetMapping("/{id}")
	public String findDojo(@PathVariable("id"))
	
}	
}

