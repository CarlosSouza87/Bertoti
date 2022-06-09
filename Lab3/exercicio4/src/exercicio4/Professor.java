package exercicio4;

public class Professor {
	String professor;
	String codigo;
	String area;
	
	
	@Override
	public String toString() {
		return professor + ", codigo=" + codigo + ", Área=" + area;
	}


	public String getProfessor() {
		return professor;
	}


	public void setProfessor(String professor) {
		this.professor = professor;
	}


	public String getcodigo() {
		return codigo;
	}


	public void setcodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public Professor(String professor, String codigo, String area) {
		super();
		this.professor = professor;
		this.codigo = codigo;
		this.area = area;
	}

}
