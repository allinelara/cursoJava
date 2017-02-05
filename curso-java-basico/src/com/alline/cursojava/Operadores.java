package com.alline.cursojava;

public class Operadores {

	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);	
		
		resultado = resultado / 5;
		System.out.println(resultado);
		
		resultado = resultado + 3;
		System.out.println(resultado);
		
		resultado = resultado % 2;
		System.out.println(resultado);
		
		resultado = resultado++;
		System.out.println(resultado);
		
		resultado = resultado--;
		System.out.println(resultado);
		
		String primeiroNome = "Esta é";
		String segundoNome = " uma String concatenada";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		int valor1 = 1;
		int valor2 = 2;
		
		boolean resultado1 = (valor1 == 1) && (valor2 == 2);
		System.out.println(resultado1);
		
		boolean resultado2 = (valor1 == 1) || (valor2 == 2);
		System.out.println(resultado2);
		
		boolean verdadeiro = true;
		boolean falso = false;
		System.out.println(verdadeiro && falso);
		System.out.println(verdadeiro || falso);
		System.out.println(verdadeiro ^ falso);
		System.out.println(!verdadeiro || falso);


	}

}
