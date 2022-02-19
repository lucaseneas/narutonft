package br.com.narutonft.dto;

import br.com.narutonft.model.Usuario;

public class RequisicaoNovoUsuario {
	private String name;
	private String email;
	private String password;
	private String picture;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	public Usuario toUsuario() {
		Usuario usuario = new Usuario();
		usuario.setNome(name);
		usuario.setEmail(email);
		usuario.setSenha(password);
		usuario.setUrlFoto(picture);
		return null;
		
	}
}
