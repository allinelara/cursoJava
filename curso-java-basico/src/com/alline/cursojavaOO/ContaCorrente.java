package com.alline.cursojavaOO;

public class ContaCorrente {
	
	private int numConta;
	private double saldo;
	private boolean especial;
	private double limiteConta;
	private double limiteContaAtual;
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isEspecial() {
		return especial;
	}
	public void setEspecial(boolean especial) {
		this.especial = especial;
	}
	public double getLimiteConta() {
		return limiteConta;
	}
	public void setLimiteConta(double limiteConta) {
		this.limiteConta = limiteConta;
	}
	public double getLimiteContaAtual() {
		return limiteContaAtual;
	}
	public void setLimiteContaAtual(double limiteContaAtual) {
		this.limiteContaAtual = limiteContaAtual;
	}
	
	public void exibirSaldo(){
		double saldoTotal = saldo + limiteContaAtual;
		System.out.println("O saldo com limite é de " +saldoTotal+ ", o saldo é de " +saldo+ ", o limite restante é de " +limiteContaAtual + " e o limite da conta é de " +limiteConta);
	}
	
	public boolean verificaSaldo(double valor){
		double saldoTotal = saldo + limiteContaAtual;
		if(saldoTotal > valor){
			return true;
		}else{
			return false;
		}
	}
	
	public double realizarSaque (double valor){
		double saldoAtual = saldo - valor;
		return saldoAtual;
	}
	
	public  void atualizarSaldo (double valorDeposito ){
		if(saldo<0){
			double valorRest = atualizarLimiteContaAtual (valorDeposito);
			saldo = saldo + valorRest;
			}else{
				saldo = saldo + valorDeposito;
			}
		}
	
	
	public double atualizarLimiteContaAtual (double valorDeposito ) {
		limiteContaAtual = limiteContaAtual + valorDeposito;
		double valorRest = 0;
		if(limiteContaAtual > limiteConta){
			valorRest = limiteContaAtual - limiteConta;
			limiteContaAtual = limiteConta;
		}
		return valorRest;
	}
}
