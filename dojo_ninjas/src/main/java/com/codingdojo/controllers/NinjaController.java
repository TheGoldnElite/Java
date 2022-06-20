package com.codingdojo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ninjas")
public class NinjaController {

	@GetMapping("/new")
	public String renderNinja(Model model) {
		return "ninja";
	}
}
