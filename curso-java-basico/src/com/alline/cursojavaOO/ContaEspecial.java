package com.alline.cursojavaOO;

public class ContaEspecial extends ContaBancaria {

	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public boolean sacar(double valor){
		if(valor > super.getSaldo()){
			if(valor > (this.getSaldo()+this.limite)){
				System.out.println("Saldo insuficiente. O seu saldo é de "+ this.getSaldo());
				return false;
			}else{
				valor = valor - this.getSaldo();
				this.limite = this.limite - valor;
				this.setSaldo(0);
				System.out.println("Saque realizado com sucesso.");
				return true;
			}
			
		}else{
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Saque realizado com sucesso.");
			return true;
		}
	}
}
