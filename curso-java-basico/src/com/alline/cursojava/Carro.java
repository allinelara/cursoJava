package com.alline.cursojava;

public class Carro {
	
	String marca;
	String modelo;
	int numPasseigeiros;
	double capCombustivel;
	double consCombustivel;
	
	void exibirAutonomia(){
		System.out.println("O carro consome " + consCombustivel + " por km");
	}

	double obterAutonomia(){
		
		System.out.println("Metodo obterAutonomia foi chamada.");
		return capCombustivel * consCombustivel;
	}
	
	double calcularCombustivel(double km){
		double qtdCombustivel = km/consCombustivel;
		return qtdCombustivel;
	}

}
