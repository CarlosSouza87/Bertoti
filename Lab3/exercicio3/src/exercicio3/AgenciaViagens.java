package exercicio3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AgenciaViagens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			ArrayList<Lugar> destinos = new ArrayList<>();
			ArrayList<Pessoa> pessoas = new ArrayList<>();
			Map <String, Lugar> mapaViagem = new HashMap<>();
			Set <String> CPFClientes = new HashSet<>();
			
			//Adicionar Pessoas
			Pessoa p1 = new Pessoa("798.556.526-49", "Carlos Fernando de Souza");
			Pessoa p2 = new Pessoa("363.725.332-40", "Elaine Cristina Borges");
			Pessoa p3 = new Pessoa("725.133.427-08", "Maria de Fatima Tavares");
			Pessoa p4 = new Pessoa("800.125.331-71", "Luiza Ferreira");
			pessoas.add(p1);
			pessoas.add(p2);
			pessoas.add(p3);
			pessoas.add(p4);
			
			Lugar d1 = new Lugar("Recife", "Boa Viagem", "Praia");
			Lugar d2 = new Lugar("Fortaleza", "Praia do futuro", "Praia");
			Lugar d3 = new Lugar("Ribeirao Preto", "Pinguin", "Choperia");
			Lugar d4 = new Lugar("Rifainda", "Represa Rio Grande", "Rancho");
			
			destinos.add(d1);
			destinos.add(d2);
			destinos.add(d3);		
			destinos.add(d4);		
			for (Pessoa pessoa : pessoas) {
				CPFClientes.add(pessoa.getCpf());
			}
			for (int i = 0; i < pessoas.size(); i++) {
				Pessoa pessoa = pessoas.get(i);
				Lugar lugar  = destinos.get(i);
				mapaViagem.put(pessoa.getCpf(), lugar);
				
			}
			
			System.out.println(CPFClientes);
			
			//Para onde o cliente vai
			String cpf = "798.556.526-49";
			Lugar lugar =(Lugar)mapaViagem.get(cpf);
			System.out.println("CPF: " + cpf + ", " + lugar.toString());
						

		}
	}
