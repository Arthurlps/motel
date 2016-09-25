package br.com.motelFatec.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import br.com.motelFatec.Cardapio;

@Entity
public class Cliente {
	
	public Cardapio cardapio;
	
	private String nome;
	private String rg;
	@Id
	private String cpf;
	

	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
