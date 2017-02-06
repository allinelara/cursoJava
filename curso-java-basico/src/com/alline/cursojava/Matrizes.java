package com.alline.cursojava;

public class Matrizes {

	public static void main(String[] args) {
		
		double[][] notasAlunos = new double[3][5];
		
		notasAlunos[0][0] = 6;
		notasAlunos[0][1] = 3;
		notasAlunos[0][2] = 6;
		notasAlunos[0][3] = 5;
		
		notasAlunos[1][0] = 7;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 8;
		notasAlunos[1][3] = 9;
		
		notasAlunos[2][0] = 9;
		notasAlunos[2][1] = 8;
		notasAlunos[2][2] = 6;
		notasAlunos[2][3] = 4;
		
		for (int i = 0; i<notasAlunos.length; i++){
			for (int j = 0; j<notasAlunos[i].length; j++){
				System.out.print(notasAlunos[i][j] + "");
			}
			//isto faz uma quebra de linha
			System.out.println();
		}
		
		System.out.println("Calulando a média de cada aluno");
		
		double soma;
		for (int i = 0; i<notasAlunos.length; i++){
			soma = 0;
			for (int j = 0; j<notasAlunos[i].length; j++){
				soma += notasAlunos[i][j];
				
				notasAlunos[i][4] = soma/4;
			}
			//isto faz uma quebra de linha
			System.out.println();
		}
		
		for (int i = 0; i<notasAlunos.length; i++){
			System.out.println("A media do aluno " + i + "é "+ notasAlunos[i][4]);
			//isto faz uma quebra de linha
			System.out.println();
		}
		
	}

}
