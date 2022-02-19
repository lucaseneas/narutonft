package br.com.narutonft.narutonft.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.narutonft.dto.RequisicaoNovoUsuario;
import br.com.narutonft.model.Usuario;
import br.com.narutonft.repository.UsuarioRepository;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	
	public UsuarioRepository usuarioRepository;
	
	@GetMapping("/cadastro")
	public String cadastroUsuario(Model model) {
		return "cadastroUsuario";
	}
	
	@GetMapping("/login")
	public String loginUsuario(Model model) {
		return "login";
	}
	
	@PostMapping("/novo")
	public String novo(RequisicaoNovoUsuario requisicao) {
		
		Usuario usuario = requisicao.toUsuario();
		usuarioRepository.save(usuario);
		return "usuario/login";
	}
}
