package br.com.narutonft.narutonft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@GetMapping
	@RequestMapping("/login")
	public String home() {
		return "login";
	}
}