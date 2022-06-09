package Application;

import java.util.Scanner;

import geometricos.Quadrado;
import geometricos.Retangulo;
import geometricos.Triangulo;

public class Teste {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
				
		Triangulo x,y; //Declarando a classe triangulo
		Quadrado u,v; //Declarando a clasee quadrado
		Retangulo j,k; //Declarando a clasee retangulo
		
		x = new Triangulo();  //Instanciando a classe
		y = new Triangulo(); // Instanciando a classe
		
		u = new Quadrado(); //  Instanciando a classe
		v = new Quadrado(); //  Instanciando a classe
		
		j = new Retangulo(); //  Instanciando a classe
		k = new Retangulo(); //  Instanciando a classe
		
		System.out.println("Entre com a medida do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com a medida do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		System.out.println("Entre com a medida do quadrado  U: ");
		u.l =sc.nextDouble();
		System.out.println("Entre com a medida do quadrado  V: ");
		v.l =sc.nextDouble();
		
		System.out.println("Entre com a medida do retangulo J: ");
		j.d = sc.nextDouble();
		j.e = sc.nextDouble();
		
		System.out.println("Entre com a medida do retangulo J: ");
		k.d = sc.nextDouble();
		k.e = sc.nextDouble();
		
		
		double areaX = x.area();
		double areaY = y.area();
		
		double areaU = u.area();
		double areaV = v.area();
		
		double areaJ =j.area();
		double areaK = k.area();
		
	
		System.out.printf("Triangulo X area: %.4f%n", areaX);
		System.out.printf("Triangulo Y area: %.4f%n", areaY);
		if (areaX > areaY) {
			System.out.println("Maior area triangulo: X");
		} else {
			System.out.println("Maior area triangulo: Y");
		}
		
		System.out.printf("Quadrado U area: %.4f%n", areaU);
		System.out.printf("Quadrado V area: %.4f%n", areaV);
		if (areaU > areaV) {
			System.out.println("Maior area Quadrado: U");
		} else {
			System.out.println("Maior area Quadrado: V");
		}
		
		
		System.out.printf("Retangulo J area: %.4f%n", areaJ);
		System.out.printf("Retangulo k area: %.4f%n", areaK);
		if (areaJ > areaK) {
			System.out.println("Maior area Quadrado: J");
		} else {
			System.out.println("Maior area Quadrado: K");
		}
				
		sc.close();
	}
}