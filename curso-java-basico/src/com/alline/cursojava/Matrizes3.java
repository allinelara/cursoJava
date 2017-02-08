package com.alline.cursojava;

public class Matrizes3 {

	public static void main(String[] args) {
		
		int [][] matriz = new int[4][4];
		
		matriz[0][0] = 14;
		matriz[0][1] = 8;
		matriz[0][2] = 7;
		matriz[0][3] = 6;
		matriz[1][0] = 24;
		matriz[1][1] = 2;
		matriz[1][2] = 22;
		matriz[1][3] = 5;
		matriz[2][0] = 34;
		matriz[2][1] = 40;
		matriz[2][2] = 3;
		matriz[2][3] = 23;
		matriz[3][0] = 3;
		matriz[3][1] = 1;
		matriz[3][2] = 6;
		matriz[3][3] = 99;
		
		for (int i = 0;i<matriz.length;i++){
			for(int j = 0;j<matriz[i].length;j++){
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();	
		}
		
		
		//Encontrar o maior número da matriz e qual é a sua posição. 
    	int aux = 0;
    	int[] posicao = new int[2];
		for (int i = 0;i<matriz.length;i++){
			for(int j = 0;j<matriz[i].length;j++){
				if(aux<matriz[i][j]){
					aux = matriz[i][j];
					posicao[0] = i + 1;
					posicao[1] = j + 1;
				}
			}
		}
		System.out.println("O mairo número da matriz é " + aux + " e a posição deste número na matriz é " + posicao[0] + ", " + posicao[1]);
	
		//Qual é o maior valor da linha 3 (linha 2)
		int aux1 = 0;
    	int coluna = 0;
		for(int j = 0;j<matriz[2].length;j++){
			if(aux1<matriz[2][j]){
				aux1 = matriz[2][j];
				coluna = j + 1;
				}
		}
		System.out.println("O mairo número da linha 3 é " + aux1 + " e fica na coluna " + coluna);

		//Qual é o maior valor da coluna 1 (coluna 0)
		int aux2 = 0;
		int linha = 0;
		for(int i = 0;i<matriz.length;i++){
			if(aux2<matriz[i][0]){
				aux2 = matriz[2][0];
				linha = i + 1;
			}
		}
		System.out.println("O mairo número da coluna 1 é " + aux2 + " e fica na linha " + linha);

	}

}
