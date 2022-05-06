package com.empresa.controle.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping(path = {"/", "/home"})
	public String home() {
		return "index";
	}

}
