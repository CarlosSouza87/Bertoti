package org.acme;


import java.util.List;

import java.util.LinkedList;

public class Model {
	
	public Model() {
    	addCarro(new Carro("IOS", new Especificacao("Apple", "iPhone13", "Pink")));
    	addCarro(new Carro("IOS", new Especificacao("Apple", "iPhoneX", "Black")));
    	addCarro(new Carro("Android", new Especificacao("Samsung", "SamsungGX",  "White")));
    	addCarro(new Carro("Android", new Especificacao("Apple", "SamsungA2", "Black")));
    	addCarro(new Carro("Android", new Especificacao("Motorola", "MotoG6", "Blue")));

	}
	
	private List<Carro> carros = new LinkedList<Carro>();

	
	public void addCarro(Carro carro){
		carros.add(carro);
	}
	
	public Carro buscarPlaca(String placa){
		for(Carro carro:carros){
			if(carro.getPlaca().equals(placa)) return carro;
		}
		
		return null;
	}
	
	
	public List<Carro> buscarEspecificacao(Especificacao esp){
		List<Carro> carrosEncontrados = new LinkedList<Carro>();
		
		for(Carro carro:carros){
			 if(esp.comparar(carro.getEspc())) carrosEncontrados.add(carro);
		}
		
		return carrosEncontrados;
		
	}
	
	
	public List<Carro> buscarModelo(String modelo){
		List<Carro> carrosEncontrados = new LinkedList<Carro>();
		for(Carro carro:carros) {
			if(carro.getEspc().getModelo().equals(modelo)) carrosEncontrados.add(carro);
		}
		return carrosEncontrados;
	}
	
	public List<Carro> getCarros(){
		return carros;
	}

}
