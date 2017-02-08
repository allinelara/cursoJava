package com.alline.cursojava;

public class ContaCorrente {
	
	int numConta;
	double saldo;
	boolean especial;
	double limiteConta;
	double limiteContaAtual;
	
	
	void exibirSaldo(){
		double saldoTotal = saldo + limiteContaAtual;
		System.out.println("O saldo com limite é de " +saldoTotal+ ", o saldo é de " +saldo+ ", o limite restante é de " +limiteContaAtual + " e o limite da conta é de " +limiteConta);
	}
	
	boolean verificaSaldo(double valor){
		double saldoTotal = saldo + limiteContaAtual;
		if(saldoTotal > valor){
			return true;
		}else{
			return false;
		}
	}
	double realizarSaque (double valor){
		double saldoAtual = saldo - valor;
		return saldoAtual;
	}
	void atualizarSaldo (double valorDeposito ){
		if(saldo<0){
			double valorRest = atualizarLimiteContaAtual (valorDeposito);
			saldo = saldo + valorRest;
			}else{
				saldo = saldo + valorDeposito;
			}
		}
	
	
	double atualizarLimiteContaAtual (double valorDeposito ) {
		limiteContaAtual = limiteContaAtual + valorDeposito;
		double valorRest = 0;
		if(limiteContaAtual > limiteConta){
			valorRest = limiteContaAtual - limiteConta;
			limiteContaAtual = limiteConta;
		}
		return valorRest;
	}
	

}
