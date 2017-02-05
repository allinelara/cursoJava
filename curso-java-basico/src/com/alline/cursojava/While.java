package com.alline.cursojava;

public class While {

	public static void main(String[] args) {
		int i = 1;
		int max = 11;
		System.out.println("Contando até "+ max);
		while(i < max){
			System.out.println("Valor de i: " + i);
			i++;
		}
		
		do {
			i++;
			System.out.println("Valor de i: " + i);
		}while(i<13);
	}

}
