package br.com.motelFatec;

import java.text.DecimalFormat;

public enum Cardapio {
	CERVEJA(6.00),
	REFRIGERANTE(5.00),
	AGUA(4.00),
	VODKA(10.00),
	VINHO(20.00),
	PIZZA(15.00),
	SANDUICHE(8.00);
	
	Cardapio(double preco){
		this.preco = preco;
	}
	
	private double preco;
	private int quantidade;
	
	public double getPreco(){	
		return this.preco;
	}
	
	public String getName(){
		return this.name();
	}
	
}
