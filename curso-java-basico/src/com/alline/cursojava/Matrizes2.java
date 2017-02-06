package com.alline.cursojava;

public class Matrizes2 {

	public static void main(String[] args) {
		
		
		int[][][] matrizTridimensional = new int[3][3][3];
		
		for (int i=0; i<matrizTridimensional.length;i++){
			for (int j=0; j<matrizTridimensional[i].length;j++){
				for(int k=0;k<matrizTridimensional[i][j].length;k++){
					 matrizTridimensional[i][j][k] = i + j + k;
				}
			}
		}
		int soma = 0; //soma total
		int somaPares = 0;
		int somaImpares = 0;
		for (int i=0; i<matrizTridimensional.length;i++){
			for (int j=0; j<matrizTridimensional[i].length;j++){
				for(int k=0;k<matrizTridimensional[i][j].length;k++){
					 soma+=matrizTridimensional[i][j][k];
					 if(matrizTridimensional[i][j][k]%2==0){
						 somaPares+=matrizTridimensional[i][j][k];
					 }else{
						 somaImpares+=matrizTridimensional[i][j][k];
					 }
						
				}
			}
		}
		System.out.println("A soma totoal é "+soma);
		System.out.println("A soma dos pares é "+somaPares);
		System.out.println("A soma dos impares é "+somaImpares);

	}

}
