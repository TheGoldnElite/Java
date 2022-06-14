package com.codingdojo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RootController
{
	@GetMapping("/")
	public String home(HttpSession session){
		if(session.getAttribute("madlibs")==null) {
			session.setAttributes("madlibs",new ArrayList<Madlib>());
		}
		return "index";
	}
	
	@GetMapping("/show")
	public String show(Model model,HttpSession session) {
		return "show";
	}
	
	@PostMapping("/submit")
	public String process
	(
		@RequestParam("noun") String noun,
		@RequestParam("adjective") String adjective,
		@RequestParam("verb") String verb,
		HttpSession session
	)
	{
		System.out.println("Noun:"+noun);
		System.out.println("Adjective:"+adjective);
		System.out.println("Verb"+verb);
		return "redirect:/home";
	}
};