package com.alline.cursojavaOO;

public class Calculadora {

	
	public static int somar (int num1, int num2){
		int resul = num1 + num2;
		
		return resul;
	}
	
	public static int diminuir (int num1, int num2){
		int resul = num1 - num2;
		
		return resul;
	}
	
	public static int multiplicar (int num1, int num2){
		int resul = num1 * num2;
		
		return resul;
	}
	
	public static int dividir (int num1, int num2){
		int resul = num1 / num2;
		
		return resul;
	}
	
	public static double potencia (double num1, double num2){
		double resul = Math.pow(num1, num2);
		
		return resul;
	}
	
}
