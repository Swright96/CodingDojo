package com.codingdojo.projectmanager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {
	
	@GetMapping("/")
	public String index() {
		return "redirect:/login";
	}
}
