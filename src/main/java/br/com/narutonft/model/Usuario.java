package br.com.narutonft.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	
		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		private String nome;
		private String email;
		private String senha;
		private String urlFoto;
		private List<Card> colecao;
		private BigDecimal carteira = new BigDecimal(100);
		
}
