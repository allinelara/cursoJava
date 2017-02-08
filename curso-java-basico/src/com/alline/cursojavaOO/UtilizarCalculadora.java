package com.alline.cursojavaOO;

public class UtilizarCalculadora {

	public static void main(String[] args) {

		int result = 0;
		
		result = Calculadora.somar(3, 2);
		System.out.println(result);
		
		result = Calculadora.diminuir(3, 2);
		System.out.println(result);
		
		result = Calculadora.multiplicar(3, 2);
		System.out.println(result);
		
		result = Calculadora.dividir(3, 2);
		System.out.println(result);
		
		double result2 = Calculadora.potencia(3, 2);
		System.out.println(result2);
	}

}
