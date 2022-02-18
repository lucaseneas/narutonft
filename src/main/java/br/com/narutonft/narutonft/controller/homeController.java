package br.com.narutonft.narutonft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {
	@GetMapping("/head")
	public String home(Model model) {
		return "head";
	}
}
