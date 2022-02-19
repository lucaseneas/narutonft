package br.com.narutonft.narutonft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cadastroUsuario")
public class CadastroUsuarioController {

	@GetMapping
	public String cadastroUsuario(Model model) {
		return "cadastroUsuario";
	}
}
