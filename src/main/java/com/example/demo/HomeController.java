package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping(value="/")
	public String home(Model model) {
		System.out.println("Home");
		model.addAttribute("user","krishan");
		return "home";
	}
	@GetMapping(value="/test")
	public String test(Model model) {
		model.addAttribute("user","krishan");
		return "test";
	}
}
