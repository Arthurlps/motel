package br.com.motelFatec;

import br.com.motelFatec.model.Cliente;

public class Testa {
	
	public static void main(String[] args) {
		
		Cliente arthur = new Cliente();
		Conta conta = new Conta();
		
		conta.adcionar(Cardapio.AGUA);
		conta.adcionar(Cardapio.CERVEJA);
		
		
		for(Cardapio item : Cardapio.values()){
			System.out.println(item.getName());
		}
		
		
		
	}

}
