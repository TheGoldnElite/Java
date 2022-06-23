package com.codingdojo.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.codingdojo.models.Project;
import com.codingdojo.models.User;
import com.codingdojo.services.ProjectService;
import com.codingdojo.services.UserService;

@Controller
public class HomeController {

	
	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/dashboard")
	public String dashboard(Model model,HttpSession session) {
		if(session.getAttribute("userId")==null){
			return "redirect:/";
	}
	//get user
	Long userId=(Long) session.getAttribute("userId");
	User user=userService.findOneUser(userId);
	//get the list of project
	List<Project> projects = projectService.allProjects();
	//put the variable into jsp
	model.addAttribute("user",user);
	model.addAttribute("projects",projects);
	
	return "dashboard";
}

	
	
	//create ----render the form,process form
	@GetMapping("/projects/new")
	public String newProject(@ModelAttribute("project")Project project) {
		return "newProject";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
};
