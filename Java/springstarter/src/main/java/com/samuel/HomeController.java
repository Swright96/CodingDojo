package com.samuel;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String hello() { // 3
        return "Hello World!";
	}
	@RequestMapping("/new_route")
	public String yo() {
		return "You smell like bananas, yo!";
	}
}
