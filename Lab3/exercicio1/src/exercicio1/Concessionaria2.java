package exercicio1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Concessionaria2 {

	private ArrayList<Carros> concessionaria; 
	public ArrayList<Carros> getConcessionaria() {
		return concessionaria;
	}



	public void setConcessionaria(ArrayList<Carros> concessionaria) {
		this.concessionaria = concessionaria;
	}

public void addCar(Carros a ) {
	concessionaria.add(a);
}
public void addLista(String placa, Double preco) {
	lst_carros.put(placa,preco);
}


	public HashMap<String, Double> getLst_carros() {
		return lst_carros;
	}



	public void setLst_carros(HashMap<String, Double> lst_carros) {
		this.lst_carros = lst_carros;
	}
	private	HashMap<String ,Double> lst_carros;
    public Concessionaria2() {
    	concessionaria = new ArrayList<Carros>();
		lst_carros=new HashMap<String, Double>();
    }
	
	
	
	public void listar_carros() {
		
		Carros car = new Carros();
		
		for (int i=0;i<concessionaria.size();i++) 
		{
		car=(Carros)concessionaria.get(i);
		System.out.println(car.getFabricante() + ", "+ car.getModelo()+" , "+
			car.getCor() +" , " + car.getAno()+ " , "+ "Placa: " + car.getPlaca()+
			", "+ car.getPreco());
		}
	}
	
	public void imprimir_preco() {
		 for(String placa:lst_carros.keySet()) {
		System.out.println("Placa: "+ placa+ "Preco:"+ lst_carros.get(placa));
		
		 }
			 
	}
	public void listar_dadoscarro(String placa) {
		
		for (int i=0;i<concessionaria.size();i++) 
		{
		Carros car=(Carros)concessionaria.get(i);
		if (car.getPlaca().equals(placa)) {
		
		System.out.println(car.getFabricante() + ", "+ car.getModelo()+" , "+
			car.getCor() +" , " + car.getAno()+ " , "+ "Placa: " + car.getPlaca()+
			", "+ car.getPreco());
		}
	}
	}	
}
	
