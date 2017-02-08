package com.alline.cursojava;

import java.util.Scanner;

public class VerificarContaCorrente {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		ContaCorrente contaCorrente = new ContaCorrente();
		
		contaCorrente.numConta = 123;
		contaCorrente.saldo = 29;
		contaCorrente.especial = false;
		contaCorrente.limiteConta = 200;
		contaCorrente.limiteContaAtual = 171;
		
		boolean opcaoValida = false;
		int atividade = 0;
		
		while(opcaoValida==false){
			
			System.out.println("Digite 1 para consultar o saldo; 2 para sacar dinheiro; 3 para depositar dinheiro.");
			atividade = scan.nextInt();
			
			if(atividade == 1){
				contaCorrente.exibirSaldo();
				opcaoValida = true;
			}else if(atividade == 2){
				System.out.println("Digite a quantidade que deseja sacar.");
				double valorSaque = scan.nextDouble(); 
				
				boolean saldoDisponivel = contaCorrente.verificaSaldo(valorSaque);
				
				if(saldoDisponivel){
					contaCorrente.saldo = contaCorrente.realizarSaque(valorSaque);
					if(contaCorrente.saldo<0){
						contaCorrente.limiteContaAtual = contaCorrente.limiteContaAtual - valorSaque;
						System.out.println("Saque realizado com sucesso. Seu novo saldo com limie щ " + (contaCorrente.limiteContaAtual)+". Seu saldo щ" +contaCorrente.saldo+ ", seu limite restante щ "+contaCorrente.limiteContaAtual + " e o seu limite da conta щ de "+contaCorrente.limiteConta);

					}else{
						System.out.println("Saque realizado com sucesso. Seu novo saldo com limie щ " + (contaCorrente.limiteContaAtual + contaCorrente.saldo)+". Seu saldo щ" +contaCorrente.saldo+ ", seu limite restante щ "+contaCorrente.limiteContaAtual + " e o seu limite da conta щ de "+contaCorrente.limiteConta);

					}
					opcaoValida = true;
				}else{
					System.out.println("Saldo insuficiente.");
					opcaoValida = true;

				}
			}else if (atividade == 3){
				System.out.println("Digite a quantidade que deseja depositar.");
				double valorDeposito = scan.nextDouble();
				contaCorrente.atualizarSaldo(valorDeposito);
				System.out.println("Deposito realizado com sucesso. Seu novo saldo com limie щ " + (contaCorrente.limiteContaAtual + contaCorrente.saldo)+". Seu saldo щ" +contaCorrente.saldo+ ", seu limite restante щ "+contaCorrente.limiteContaAtual + " e o seu limite da conta щ de "+contaCorrente.limiteConta);
				opcaoValida = true;
				
			}else {
				opcaoValida = false;
				System.out.println("Opчуo invalida, tente novamente");
			}
		}
		

	}

}
