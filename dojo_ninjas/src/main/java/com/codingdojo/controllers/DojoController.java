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

import com.codingdojo.models.Dojo;
import com.codingdojo.services.DojoService;
import com.codingdojo.services.NinjaService;

@RequestMapping("/dojos")
@Controller
public class DojoController {
	
	@Autowired
	private DojoService dojoService;
	
	@Autowired
	private NinjaService ninjaService;
	
	

	@GetMapping("/new")
	public String createDojo(Model model) {
		model.addAttribute("dojo",new Dojo());
		model.addAttribute("ninja",ninjaService.findAll());
		return "dojo";
	}
	
	@PostMapping("/new")
	public String insertDojo(@Valid @ModelAttribute("dojo") Dojo dojo,BindingResult res) {
		if(res.hasErrors()) {
			return "dojo";
		}
		dojoService.create(dojo);
		return "redirect:/";
	}
	
	
	@GetMapping("/{id}")
	public String findDojo(@PathVariable("id")Long id, Model model) {
		// select * from dojo join ninja on dojo.id=ninja.dojo_id;
		model.addAttribute("dojo", dojoService.findById(id));
		model.addAttribute("ninja", ninjaService.findById(id));
		return "dojo_show";
	}
	
	
	
	
	

};


