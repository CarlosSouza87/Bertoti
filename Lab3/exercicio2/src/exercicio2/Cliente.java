package exercicio2;

public class Cliente {
	String cpf;
	String correntista;
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCorrentista() {
		return correntista;
	}
	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}
	public Cliente(String cpf, String correntista) {
		super();
		this.cpf = cpf;
		this.correntista = correntista;
	}

}

