package exercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Concessionaria2 carloscar= new Concessionaria2();		
			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
			Carros car;
			
			int qtd_carro;
			System.out.println("Qtde carros para revenda ");
			qtd_carro = s.nextInt();
			
			for (int i=1;i<=qtd_carro;i++)
			{
				car = new Carros();
				System.out.println("Informações sobre os carros: " + i);
				System.out.println("Fabricante: ");
				car.setFabricante(s.next());
				System.out.println("Modelo: ");
				car.setModelo(s.next());
				System.out.println("Cor: ");
				car.setCor(s.next());
				System.out.println("Ano: ");
				car.setAno(s.nextInt());
				System.out.println("Placa: ");
				car.setPlaca(s.next());
				System.out.println("Preço: ");
				car.setPreco(s.nextFloat());
				carloscar.addCar(car);
				carloscar.addLista(car.getPlaca(), car.getPreco());
								
			}
			carloscar.listar_carros();
			carloscar.imprimir_preco();
			
			System.out.println("Consultar Carro...Digite a placa:: ");
			String plc = s.next();
			carloscar.listar_dadoscarro(plc);
				
	}			
	}
