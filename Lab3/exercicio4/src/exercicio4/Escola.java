package exercicio4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Escola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
			ArrayList<Aluno> alunos = new ArrayList<>();
			ArrayList<Professor> professores = new ArrayList<>();
			ArrayList<Curso> cursos = new ArrayList<>();
			Map <Aluno, Curso> mapaCursoAluno = new HashMap<Aluno, Curso>();
			Map <Professor, Curso> mapaCursoProfessor = new HashMap<Professor, Curso>();
	
			
			
			// alunos
			Aluno a1 = new Aluno("CARLOS FERNANDO DE SOUZA", "798.556.52649");
			Aluno a2 = new Aluno("LUIZ FELIPE BORGES DE SOUZA", "798.556.526-");
			Aluno a3 = new Aluno("MARIA CRISTINA DA SILVA", "320.330.340-22");
			Aluno a4 = new Aluno("LUZIA JUSTINO DA SILVA", "610.350.255-13");
			
			alunos.add(a1);
			alunos.add(a2);
			alunos.add(a3);
			alunos.add(a4);
			
			//professor
			Professor p1 = new Professor("LUIZ PAULO DA SILVA", "A320", "HISTORIA");
			Professor p2 = new Professor("ROBERTO ANTONELI", "B321", "PORTUGUES");
			
			professores.add(p1);
			professores.add(p2);
			
			//Materia
			Curso c1 = new Curso("HISTORIA", "SJC", "HISTORIA");
			Curso c2 = new Curso("PORTUGUES", "JACAREI", "PORTUGUES");
			
			cursos.add(c1);
			cursos.add(c2);
			
			mapaCursoAluno.put(a1, c1);
			mapaCursoAluno.put(a2, c1);
			mapaCursoAluno.put(a3, c2);
			mapaCursoAluno.put(a4, c2);
			
			mapaCursoProfessor.put(p1, c2);
			mapaCursoProfessor.put(p2, c1);
			
			System.out.println(mapaCursoProfessor);
			System.out.println(mapaCursoAluno);
			
			Aluno alu = a1;
			Curso curso =(Curso)mapaCursoAluno.get(alu);
			System.out.println(alu.toString()+ ", " + curso.toString());
			
			Professor prof = p1;
			Curso cur =(Curso)mapaCursoProfessor.get(prof);
			System.out.println(prof.toString()+ ", " + cur.toString());
			}

	}
