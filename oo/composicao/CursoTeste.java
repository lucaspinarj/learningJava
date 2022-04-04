package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("João");
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("Pedro");

		Curso c1 = new Curso("Java Completo");
		Curso c2 = new Curso("WEB 2023");
		Curso c3 = new Curso("React Native");

		c1.adicionarAluno(a1);
		c1.adicionarAluno(a2);

		c2.adicionarAluno(a1);
		c2.adicionarAluno(a3);

		a1.adicionarCurso(c3);
		a2.adicionarCurso(c3);
		a3.adicionarCurso(c3);

		for (Aluno aluno : c3.alunos) {
			System.out.println("Sou " + aluno.nome + " estou matriculado em: " +  c3.nome);
		}
	
//		System.out.println(a1.nome + " está matriculado em:\n" + a1.cursos);
//		System.out.println(a2.nome + " está matriculado em:\n" + a2.cursos);
//		System.out.println(a3.nome + " está matriculado em:\n" + a3.cursos);
		
		System.out.println(a1.cursos.get(0).alunos);

	}
}
