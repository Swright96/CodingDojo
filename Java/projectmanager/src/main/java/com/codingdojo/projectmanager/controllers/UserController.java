package com.codingdojo.projectmanager.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.projectmanager.models.LoginUser;
import com.codingdojo.projectmanager.models.User;
import com.codingdojo.projectmanager.services.UserService;

public class UserController {
		
		@Autowired
		UserService userServ;
		
		@GetMapping("/")
		public String index(Model model) {
		 
		    // Bind empty User and LoginUser objects to the JSP to capture the form input
		    model.addAttribute("newUser", new User());
		    model.addAttribute("newLogin", new LoginUser());
		    return "login.jsp";
		    
		}
		 
		@PostMapping("/register")
		public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model, HttpSession session) {
		     
			User user = userServ.register(newUser, result);
			
		    if(result.hasErrors()) {
		        // Be sure to send in the empty LoginUser before re-rendering the page.
		        model.addAttribute("newLogin", new LoginUser());
		        return "index.jsp";
		    }
		    
		    session.setAttribute("userId", user.getId());
		    System.out.println(session.getAttribute("userId"));
		    return "redirect:/dashboard";
		}
		 
}
