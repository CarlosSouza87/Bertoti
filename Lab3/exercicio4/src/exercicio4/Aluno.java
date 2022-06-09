package exercicio4;

public class Aluno {
			
		String aluno;
		String CPF;
		
		
		public String getAluno() {
			return aluno;
		}


		public void setNome(String aluno) {
			this.aluno = aluno;
		}


		public String getCPF() {
			return CPF;
		}


		public void setCPF(String cpf) {
			CPF = cpf;
		}


		public Aluno(String aluno, String cpf) {
			super();
			this.aluno = aluno;
			CPF = cpf;
		}


		@Override
		public String toString() {
			return aluno + ", CPF=" + CPF;
		}
		
		

	}
