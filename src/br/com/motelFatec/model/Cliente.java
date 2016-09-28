package br.com.motelFatec.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

import br.com.motelFatec.Cardapio;

@Entity
public class Cliente {
	
	@Id
	private long cpf;
	
	private String nome;
	private String rg;
	
	@ElementCollection
	public List <Cardapio> cardapio;

	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
