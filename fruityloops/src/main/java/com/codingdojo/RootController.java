package com.codingdojo;

import java.util.ArrayList;

@Controller
public class RootController {

	@GetMapping("/")
	public String index(Model model) {
		
		ArrayList<Item> items=new ArrayList<Item>();
		items.add(new Item("watermelon",3.99));
		items.add(new Item("bananas",2.00));
		items.add(new Item("apple",4.99));
		items.add(new Item("broccoli",1.00));
		items.add(new Item("carrot",1.50));
		
		model.addAttribute("cart",items);
		
		
		//model.addAttribute("",);
		return "index";
		
	
		
	}
}
