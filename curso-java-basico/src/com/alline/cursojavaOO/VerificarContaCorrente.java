package com.alline.cursojavaOO;

import java.util.Scanner;

import com.alline.cursojavaOO.ContaCorrente;

public class VerificarContaCorrente {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ContaCorrente contaCorrente = new ContaCorrente();
		
		contaCorrente.setNumConta(123);
		contaCorrente.setSaldo(29);
		contaCorrente.setEspecial(false);
		contaCorrente.setLimiteConta(200);
		contaCorrente.setLimiteContaAtual(171);
		
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
					contaCorrente.setSaldo(contaCorrente.realizarSaque(valorSaque));
					if(contaCorrente.getSaldo()<0){
						contaCorrente.setLimiteContaAtual(contaCorrente.getLimiteContaAtual() - valorSaque);
						System.out.println("Saque realizado com sucesso. Seu novo saldo com limie щ " + (contaCorrente.getLimiteContaAtual())+". Seu saldo щ" +contaCorrente.getSaldo()+ ", seu limite restante щ "+contaCorrente.getLimiteContaAtual() + " e o seu limite da conta щ de "+contaCorrente.getLimiteConta());

					}else{
						System.out.println("Saque realizado com sucesso. Seu novo saldo com limie щ " + (contaCorrente.getLimiteContaAtual() + contaCorrente.getSaldo())+". Seu saldo щ" +contaCorrente.getSaldo()+ ", seu limite restante щ "+contaCorrente.getLimiteContaAtual() + " e o seu limite da conta щ de "+contaCorrente.getLimiteConta());

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
				System.out.println("Deposito realizado com sucesso. Seu novo saldo com limie щ " + (contaCorrente.getLimiteContaAtual() + contaCorrente.getSaldo())+". Seu saldo щ" +contaCorrente.getSaldo()+ ", seu limite restante щ "+contaCorrente.getLimiteContaAtual() + " e o seu limite da conta щ de "+contaCorrente.getLimiteConta());
				opcaoValida = true;
				
			}else {
				opcaoValida = false;
				System.out.println("Opчуo invalida, tente novamente");
			}
		}
		

	}
	}


