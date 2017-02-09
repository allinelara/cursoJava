package com.alline.cursojavaOO;

public class ContaPoupanca extends ContaBancaria{

	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public void  calcularNovoSaldo (double taxa){
		this.setSaldo(this.getSaldo()+(this.getSaldo()*taxa));
	}
}
