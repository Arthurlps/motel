package br.com.motelFatec;

import java.util.ArrayList;
import java.util.List;

public class ListaENUM {
	List<Cardapio> listaCardapio = new ArrayList<>();
	List<Quartos> listaQuarto = new ArrayList<>();


	public List listarCardapio(){
		for(Cardapio itens : Cardapio.values()){
			listaCardapio.add(itens);
		}
		return listaCardapio;
	}
	

	public List listarQuarto(){
		for(Quartos itens : Quartos.values()){
			listaQuarto.add(itens);
		}
		return listaQuarto;
	}

}