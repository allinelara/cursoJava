package com.alline.cursojava;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {

		int[] notas = new int[10];
		Random random = new Random();
		for (int i=0; i <notas.length;i++){
			//estou populando com número aleatórios de 0 a 10.
			notas[i] = random.nextInt(10);
		}
		
		for(int nota : notas){
			System.out.println(nota);
		}
		
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
	
		for(double[] notaAluno: notasAlunos){
			for(double nota : notaAluno){
				System.out.println(nota);
			}
			System.out.println();
		}
	}

}
