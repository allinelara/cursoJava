package com.alline.cursojava;

import java.util.Scanner;

public class LeituraDoTeclado {

	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.println("Digite seu nome completo");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo � " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome");
		String nomePrimeiro = scan.next();
		System.out.println("Seu primeiro nome � " + nomePrimeiro);
		
		System.out.println("Digite sua idade");
		int idade = scan.nextInt();
		System.out.println("Sua idade � " + idade);
		
		System.out.println("Digite sua altura");
		double altura = scan.nextDouble();
		System.out.println("Sua altura � " + altura); */
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estima��o.");
		String nome = scan.next();
		int idade1 = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura1 = scan.nextFloat();
		boolean bicho = scan.nextBoolean();
		
		System.out.println("Voc� digitou os seguintes valores:");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade1);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Altura: " + altura1);
		System.out.println("Tem bichinho de estima��o: " + bicho);
	}

}
