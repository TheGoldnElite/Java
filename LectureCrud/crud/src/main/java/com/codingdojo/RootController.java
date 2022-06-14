package com.codingdojo;

@Controller
public class RootController {

	@GetMapping("/")
		public String index() {
			return "index";
		}
		
	@GetMapping("/show/{id}")
		public String show() {
			return "show";
	}
	
	@GetMapping("/edot/{id}")
		public String edit() {
			return "edit";
	}
	
	
}
