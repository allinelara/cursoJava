package com.alline.cursojava;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a sua idade");
		
		int idade = scan.nextInt();
		
		if(idade >= 18 && idade <=60){
			System.out.println("É maior de idade.");
		}else if(idade < 18){
			System.out.println("É menor de idade.");
		}else{
			System.out.println("É idoso.");
		}
	}

}
