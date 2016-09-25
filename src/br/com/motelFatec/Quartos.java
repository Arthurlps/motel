package br.com.motelFatec;

public enum Quartos {
	BASICA(100.00),
	SUITE(150.00),
	HIDRO(200.00);
	
	Quartos(double preco){
		this.preco=preco;
	}
	
	private double preco;
	
	public double getPreco(){
		return this.preco;
	}
	
	public String getName(){
		return this.name();
	}

}
