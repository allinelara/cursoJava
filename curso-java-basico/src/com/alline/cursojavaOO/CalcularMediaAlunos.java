package com.alline.cursojavaOO;

import java.util.Scanner;

public class CalcularMediaAlunos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		Curso curso = new Curso();
		
		curso.setNome("Algebra");
		curso.setHorario("19:00");
		
		Professor prof = new Professor();
		
		prof.setNome("Lucas");
		prof.setDepart("Math");
		prof.setEmail("l@teste.com");
		
		curso.setProfessor(prof);
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Miguel");
		aluno.setMatricula("123");
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setNome("Carlos");
		aluno2.setMatricula("113");
		
		Aluno aluno3 = new Aluno();
		
		aluno3.setNome("Felipe");
		aluno3.setMatricula("124");
		
		Aluno[] alunos = new Aluno[3];
		alunos[0] = aluno;
		alunos[1] = aluno2;
		alunos[2] = aluno3;
		
		curso.setAlunos(alunos);

		for(Aluno a : curso.getAlunos()){
			System.out.println("Por favor informe as notas do aluno " +a.getNome());
			int[] notasAux = new int[4];
			for(int i=0; i<a.getNota().length;i++){
				System.out.println("Por favor informe a nota número " + (i+1));
				notasAux[i] = scan.nextInt();
			}
			a.setNota(notasAux);
			
		}
		
		for(Aluno a : curso.getAlunos()){
			System.out.println("O aluno "+a.getNome() + " obteve o seguinte resultado: " + curso.verificaSituacao(a.getNota()));
		}
		
		int mediaGeral = 0;
		for(Aluno a : curso.getAlunos()){
			mediaGeral = curso.calcularMediaTurma(a.getNota()) + mediaGeral;
		}
		System.out.println("A média da turma foi "+ (mediaGeral/curso.getAlunos().length));
		
		
	}

}
