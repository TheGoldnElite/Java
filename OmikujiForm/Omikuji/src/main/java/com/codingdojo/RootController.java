package com.codingdojo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

	@GetMapping("/omikuji")
	
	public String home() {
		return "index";
	}
	
	@GetMapping("/show")
	public class show(Model model,HttpSession session) {
		
		int number=(int)session.getAttribute("number");
		String city=(String)session.getAttribute("city");
		String person=(String)session.getAttribute("person");
		String hobby=(String)session.getAttribute("hobby");
		String thing=(String)session.getAttribute("thing");
		String nice=(String)session.getAttribute("nice");
		
		String omikuji="In" + number + "years, you will live in " + city + "with" + person +"as your roommate,"+hobby + "for a living. "
				+ "The next time you see a " + thing + ",you will have good luck. Also, " + nice;
		
		model.addAttribute("omikuji",omikuji);
		return "show";
	}
	@PostMapping("/submit")
		public String process(
				@RequestParam("number") int number,
				@RequestParam("city") String city,
				@RequestParam("person") String person,
				@RequestParam("hobby") String hobby,
				@RequestParam("thing") String thing,
				@RequestParam("nice") String nice,
				HttpSession session
			
			) {
				
				session.addAttributes("number",number);
				session.addAttributes("city",city);
				session.addAttributes("person",person);
				session.addAttributes("hobby",hobby);
				session.addAttributes("thing",thing);
				session.addAttributes("nice",nice);
				
				
				return "redirect:/show";
		
	}
};
