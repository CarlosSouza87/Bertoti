package exercicio1;

public class Carros {
	
	private String fabricante;
	private String modelo;
	private String cor;
	private String placa;
	private double preco;
	private int ano;
	
	// Construtor
	
	public Carros(String Fabricante,String Modelo, String Cor, String Placa, double Preco,double Ano) 
	{
		Fabricante = fabricante;
		Ano	= ano;
		Modelo = modelo;
		Cor	  = cor;
		Placa = placa;
		Preco = preco;
	}

	public Carros() {
		// TODO Auto-generated constructor stub
	}

		public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

		public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}