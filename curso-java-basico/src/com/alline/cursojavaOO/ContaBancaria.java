package com.alline.cursojavaOO;

public class ContaBancaria {

	private String nomeCliente;
	private int numConta;
	private double saldo;
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
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
	
	public boolean sacar(double valor){
		if(valor > this.saldo){
			System.out.println("Saldo insuficiente. O seu saldo é de "+ this.saldo);
			return false;
		}else{
			this.saldo = this.saldo - valor;
			System.out.println("Saque realizado com sucesso.");
			return true;
		}
	}
	public void depositar (double valor){
		this.saldo = this.saldo + valor;
		System.out.println("Deposito realizado com sucesso.");
	}
}
