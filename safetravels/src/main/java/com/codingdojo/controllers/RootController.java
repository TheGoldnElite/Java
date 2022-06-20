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


import com.codingdojo.models.SafeTravels;
import com.codingdojo.services.SafeTravelsService;


@Controller
@RequestMapping("/expense")
public class RootController {
	
	@Autowired
	private SafeTravelsService safetravelsService;
	
	
	//or
//	public RootController(SafeTravelsService safetravelsService) {
//			this.safetravelsService=safetravels;
//		}
	
	
	@GetMapping("")
	public String index(Model model) {
		System.out.println("create movie form");
		
		model.addAttribute("safetravel", new SafeTravels());
		model.addAttribute("safetravels", safetravelsService.findAll());
		return "index";
	}
	
	@PostMapping("")
		public String createtravels(@Valid  @ModelAttribute("safetravels") SafeTravels safetravels, BindingResult res) {
		
			if(res.hasErrors()) {
				return "index";
			}
			safetravelsService.create(safetravels);
			return "redirect:/";
		
	}
	
	@GetMapping("/show/{id}")
		public String show(@PathVariable("id") Long safetravelsId, Model model) {
		model.addAttribute("safetravel",safetravelsService.findOne(safetravelsId)); //query
			return "show";
		}
	
	@GetMapping("/edit/{id}")
		public String edit(@PathVariable("id") Long safetravelsId, Model model) {
			model.addAttribute("safetravel",safetravelsService.findOne(safetravelsId)); //query
			return "edit";
	}
	
	@PostMapping("/delete/{id}")
	public String delete(@PathVariable("id")Long safetravelsId) {
		safetravelsService.deleteOne(safetravelsId); //query
		return "redirect/expense";
		
	}
	
	@PostMapping("/edit/{id}")
	public String update(@Valid  @ModelAttribute("safetravels") SafeTravels safetravels, BindingResult res) {
		if(res.hasErrors()) {
			return "edit";
		}
		safetravelsService.update(safetravels);
		return "redirect:/safetravels";
		
	}
	
	
	
};
