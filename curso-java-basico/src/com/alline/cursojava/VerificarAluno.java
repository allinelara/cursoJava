package com.alline.cursojava;

import java.util.Scanner;

public class VerificarAluno {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Aluno[] alunos = new Aluno[2];
		
		alunos[0] = new Aluno();
		alunos[1] = new Aluno();
		
		
		Aluno aluno = new Aluno();
		
		alunos[0].nome = "Joao";
		alunos[0].matricula = "123";
		alunos[0].curso = "Informática";
		alunos[0].materias[0][0] = 1;
		alunos[0].materias[0][1] = 8;
		alunos[0].materias[1][0] = 2;
		alunos[0].materias[1][1] = 4;
		alunos[0].materias[2][0] = 3;
		alunos[0].materias[2][1] = 9;
		
		alunos[1].nome = "Miguel";
		alunos[1].matricula = "132";
		alunos[1].curso = "Informática";
		alunos[1].materias[0][0] = 1;
		alunos[1].materias[0][1] = 2;
		alunos[1].materias[1][0] = 2;
		alunos[1].materias[1][1] = 5;
		alunos[1].materias[2][0] = 3;
		alunos[1].materias[2][1] = 7;
		
		System.out.println("Digite o nome do aluno.");
		String nome = scan.next();
		
		String[] situacao = new String[3];
		for(int i=0;i<alunos.length;i++){
			if(nome.equalsIgnoreCase(alunos[i].nome)){
				situacao = aluno.verificaSituacao(alunos[i]);
				aluno = alunos[i];
			}
		}
		System.out.println("O aluno "+aluno.nome+ " esta " +situacao[0] + " em Algoritmos, " +situacao[1]+ " em IA e "+situacao[2]+" em Compiladores.");
		

	}

}
