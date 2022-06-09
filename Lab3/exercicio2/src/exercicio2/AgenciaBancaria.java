package exercicio2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AgenciaBancaria {
	public static void main(String[] args) {
		
		ArrayList<Conta> contas = new ArrayList<>();
		ArrayList<Cliente> clientes = new ArrayList<>();
		Map <String, Conta> mapaContas = new HashMap<String, Conta>();
		Set <String> CPFClientes = new HashSet<String>();
		
		//Adicionar Cliente
		Cliente cli1 = new Cliente("798.556.526-49", "Carlos Fernando Souza");
		Cliente cli2 = new Cliente("200.125.3325-28", "Eduardo Menezes");
				
		clientes.add(cli1);
		clientes.add(cli2);
		
		//Conta corrente
		Conta conta1 = new Conta(100325, 35000.00, cli1.getCorrentista());
		Conta conta2 = new Conta(100326, 1200.00, cli2.getCorrentista());
		

		contas.add(conta1);
		contas.add(conta2);
		
		
		
		for (Cliente cliente : clientes) {
			CPFClientes.add(cliente.getCpf());
		}
		
		
		//Link cpf à conta
		for (int i = 0; i < clientes.size(); i++) {
			Cliente cliente = clientes.get(i);
			Conta conta = contas.get(i);
			mapaContas.put(cliente.getCpf(), conta);
			
		}
		
		
		System.out.println(CPFClientes);
		
		// Consulta Cliente com  CPF
		
		String cpf = "798.556.526-49";
		Conta conta =(Conta)mapaContas.get(cpf);
		System.out.println("CPF: " + cpf + ", " + conta.toString());
}

}