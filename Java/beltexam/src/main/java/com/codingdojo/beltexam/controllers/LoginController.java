package com.codingdojo.beltexam.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.beltexam.models.Login;
import com.codingdojo.beltexam.models.User;
import com.codingdojo.beltexam.services.LoginService;
import com.codingdojo.beltexam.services.UserService;

@Controller
public class LoginController {
	@Autowired
	UserService userService;
	@Autowired
	LoginService loginService;


	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.setAttribute("userId", null);
	     
	    return "redirect:/";
	}
	
	
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("newLogin") Login newLogin, BindingResult result, Model model, HttpSession session) {
	     
		User user = loginService.login(newLogin, result);
	 
	    if(result.hasErrors() || user == null) {
	        model.addAttribute("newUser", new User());
	        return "index.jsp";
	    }
	     
	    session.setAttribute("userId", user.getId());
	    return "redirect:/dashboard";
	}
}
