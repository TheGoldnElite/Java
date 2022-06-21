package com.codingdojo.controllers;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.models.Ninja;
import com.codingdojo.services.DojoService;
import com.codingdojo.services.NinjaService;

@Controller
@RequestMapping("/ninjas")
public class NinjaController {

	@Autowired
	private NinjaService ninjaService;
	@Autowired
	private DojoService dojoService;
	
	@GetMapping("/new")
	public String renderNinja(Model model) {
		model.addAttribute("ninja",new Ninja());
		model.addAttribute("dojo",dojoService.findAll());
		return "ninja";
	}
	
	
	@PostMapping("/new")
	public String insertNinja(@Valid @ModelAttribute("ninja") Ninja ninja,BindingResult res) {
		if(res.hasErrors()) {
			return "ninja";
			
		} 
		ninjaService.create(ninja);
		return "redirect:/ninjas/new";
	}
	
	
	
	
};
