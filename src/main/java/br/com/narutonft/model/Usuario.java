package br.com.narutonft.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String email;
	private String senha;
	private String urlFoto;
	private List<Card> colecao;
	private BigDecimal carteira = new BigDecimal(100);
	
	
	public Usuario() {
		
	}
	
	public Usuario(String nome,String email,String senha,String urlFoto) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.urlFoto = urlFoto;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getUrlFoto() {
		return urlFoto;
	}
	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}
	public List<Card> getColecao() {
		return colecao;
	}
	public void setColecao(List<Card> colecao) {
		this.colecao = colecao;
	}
	public BigDecimal getCarteira() {
		return carteira;
	}
	public void setCarteira(BigDecimal carteira) {
		this.carteira = carteira;
	}
	
	
}
