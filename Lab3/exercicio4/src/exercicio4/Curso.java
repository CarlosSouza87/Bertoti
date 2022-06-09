package exercicio4;

public class Curso {
	String curso;
	String campus;
	String tipocurso;
	
	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getCampus() {
		return campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}

	public String getTipocurso() {
		return tipocurso;
	}

	public void setTipocurso(String tipocurso) {
		this.tipocurso = tipocurso;
	}

	public Curso(String curso, String campus, String tipocurso) {
		super();
		this.curso = curso;
		this.campus = campus;
		this.tipocurso = tipocurso;
	}
	
	@Override
	public String toString() {
		return "Curso: " + curso + ", Campus= " + campus + ", Tipocurso=" + tipocurso;
		
	}
	
	

}
