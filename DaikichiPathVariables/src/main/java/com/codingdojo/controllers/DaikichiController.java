package com.codingdojo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	
	@RequestMapping("")
	public String home() {
		return "Welcome";
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow an opportunity will aris,so be sure to open to new ideas!";
	}
	
	@RequestMapping("/travel/{city}")
		public String showcity(@PathVariable("city") String city) {
			return "You will travel to " + city;
			
		}
	@RequestMapping("/lotto/{number}")
		public String number(@PathVariable("number") int number ) {
			if (number%2 != 0) {
				return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
			}
			else {
				return "You will take a grand journey in the near future, but be weary of tempting offers.";
			}
	
	}
	

};
