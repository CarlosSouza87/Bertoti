package exercicio3;

public class Lugar {
		String nome;
		String endereco;
		String descricao;
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public Lugar(String nome, String endereco, String descricao) {
			super();
			this.nome = nome;
			this.endereco = endereco;
			this.descricao = descricao;
		}
		@Override
		public String toString() {
			return "Destino: " + nome + ", endereco= " + endereco + ", descricao= " + descricao;
		}

	}
