package com.alline.cursojava;

public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPasseigeiros = 14;
		van.capCombustivel = 45;
		van.consCombustivel = 20;
		
		System.out.println(van.marca);
		
		van.exibirAutonomia();
		
		System.out.println("O resultado é " + van.obterAutonomia());
		
		double qtdCombustivel = van.calcularCombustivel(10);
		System.out.println("O resultado do combustivel é " + qtdCombustivel);
	}

}
