package br.com.motelFatec;

import java.util.ArrayList;
import java.util.List;

import br.com.motelFatec.model.Cliente;

public class Conta {
	Cliente cliente;
	List<Cardapio> itens = new ArrayList();
	
	public void adcionar(Cardapio cardapio){
		itens.add(cardapio);
	}
	
	public List<Cardapio> getLista(){
		return this.itens;
	}
		

}
