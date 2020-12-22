package com.commerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.commerce.models.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@GetMapping("/login")
	public String displayLogin(Model model) {
		
		User user = new User();
		model.addAttribute("user", user);
		return "user_login";
		
	}

	@PostMapping("/login")
	public String proccessLogin(@ModelAttribute("user") User user, Model model, Errors errors) {
		
		if (errors.hasErrors()) {
			return "user_login";
		}
		
		return "home";
		
	}
}
