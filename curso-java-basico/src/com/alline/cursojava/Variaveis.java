package com.alline.cursojava;


public class Variaveis {

	public static void main(String[] args) {
		int idade = 24;
		String nome = "Alline";
		String nomeDoMeuCachorro = "Hannah";
		
		idade = 23;
		
		System.out.println("Minha idade � " + idade);
		System.out.println("Meu nome � " + nome);
		System.out.println("O nome do meu cachorro � " + nomeDoMeuCachorro);
		
		byte idade01 = 20;
		short idade02 = 21;
		
		//Double � padr�o do java e � com ponto
		double valorPassagens = 2.90;
		
		//Para fazer um float � preciso colcoar um F para dizer que n�o � um double
		float valorTomate = 2.1F;
		
		char o  = 'o';
		char i = 'i';
		
		System.out.println(o+1);
		System.out.println(""+o+i);
		
		char o1  = 111;
		char i1 = 105;
		char interrogacao = 0X00E1; // valor '?'
		
		System.out.println(o1+i1);
		System.out.println(""+o1+i1+interrogacao);
		
		System.out.println("\"Hello\"");
		System.out.println("1\\4");

		
	}

}
