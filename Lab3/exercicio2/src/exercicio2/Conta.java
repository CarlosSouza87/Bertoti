package exercicio2;

public class Conta {
	int num;
	Double saldo;
	String correntista;
	
	public String getCorrentista() {
		return correntista;
	}
	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public Conta(int num, Double saldo, String correntista) {
		super();
		this.num = num;
		this.saldo = saldo;
		this.correntista = correntista;
	}
	@Override
	public String toString() {
		return "Conta ==> [Nº = " + num + ", Saldo = " + saldo + ", Nome = " + correntista + "]";
	}
}

