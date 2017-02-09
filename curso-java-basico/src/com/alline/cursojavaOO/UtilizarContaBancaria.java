package com.alline.cursojavaOO;

import java.util.Scanner;

public class UtilizarContaBancaria {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		ContaEspecial contaE = new ContaEspecial();
		ContaPoupanca contaP = new ContaPoupanca();
		
		ContaEspecial contaEN = new ContaEspecial();
		ContaPoupanca contaPN = new ContaPoupanca();

		contaE.setNumConta(1234);
		contaE.setLimite(200);
		contaE.setNomeCliente("Jo�o da Silva");
		contaE.setSaldo(40);
		
		contaP.setDiaRendimento(2);
		contaP.setNomeCliente("Claudia Alburquerque");
		contaP.setNumConta(2345);
		contaP.setSaldo(210);
		
		
		boolean opcaoInvalida = false;
		int opcao = 0;

		while(opcaoInvalida == false){
			
			System.out.println("Digite 1 para criar uma conta; 2 para sacar; 3 para depositar; 4 consultar saldo com remedimento; 5 exibir dados conta.");
			opcao = scan.nextInt();
			
			if(opcao == 1){
				int tipoConta = 0;
				boolean tipoContaV = false;
				
				while (tipoContaV == false){
					System.out.println("Digite 1 para criar uma conta poupan�a ou 2 para uma conta especial.");
					tipoConta = scan.nextInt();
					if(tipoConta == 1 ){
						System.out.println("Digite o seu nome.");
						contaPN.setNomeCliente(scan.next());
						System.out.println("Digite o valor que deseja depositar.");
						contaPN.setSaldo(scan.nextDouble());
						contaPN.setDiaRendimento(3);
						contaPN.setNumConta(3234);
						tipoContaV = true;
						opcaoInvalida = true;
						System.out.println("Conta criada com sucesso.");
					
						System.out.println("O n�mero da sua nova conta � "+ contaPN.getNumConta());
					}else if (tipoConta == 2){
						System.out.println("Digite o seu nome.");
						contaEN.setNomeCliente(scan.next());
						System.out.println("Digite o valor que deseja depositar.");
						contaEN.setSaldo(scan.nextDouble());
						contaEN.setLimite(200);
						contaEN.setNumConta(5234);
						tipoContaV = true;
						opcaoInvalida = true;
										
						System.out.println("Conta criada com sucesso.");
						
						//exibir dados conta
						System.out.println("O n�mero da sua nova conta � "+ contaEN.getNumConta());
						
					}else{
						System.out.println("Op��o invalida, tente novamente.");
						tipoContaV = false;
					}
				}
				
				
			}else if(opcao == 2){
				int conta = 0;
				boolean opcaoV = false;
				
				while(opcaoV == false){
					System.out.println("Digite 1 para sacar de uma conta poupan�a ou 2 para sacar de uma conta especial.");
					conta = scan.nextInt();
					if(conta==1){
						System.out.println("Digite o valor que deseja sacar.");
						double valor = scan.nextDouble();
						contaP.sacar(valor);
						opcaoV=true;
						opcaoInvalida = true;
					}else if(conta==2){
						System.out.println("Digite o valor que deseja sacar.");
						double valor = scan.nextDouble();
						contaE.sacar(valor);
						opcaoInvalida = true;
						opcaoV=true;
					}else{
						opcaoV=false;
					}
				}
				
			}else if(opcao == 3){
				int conta = 0;
				boolean opcaoV = false;
				
				while(opcaoV == false){
					System.out.println("Digite 1 para depositar na conta poupan�a ou 2 para depositar na conta especial.");
					conta = scan.nextInt();
					if(conta==1){
						System.out.println("Digite o valor que deseja depositar.");
						double valor = scan.nextDouble();
						contaP.depositar(valor);
						opcaoV=true;
						opcaoInvalida = true;
					}else if(conta==2){
						System.out.println("Digite o valor que deseja depositar.");
						double valor = scan.nextDouble();
						contaE.depositar(valor);
						opcaoInvalida = true;
						opcaoV=true;
					}else{
						opcaoV=false;
					}
				}
				
			}else if(opcao == 4){
				System.out.println("Seu saldo da conta poupan�a era "+contaP.getSaldo());
				contaP.calcularNovoSaldo(0.8);
				opcaoInvalida = true;
				System.out.println("Seu saldo atual � "+ contaP.getSaldo());
				
			}else if(opcao == 5){
				
				System.out.println("Conta Poupan�a:");
				System.out.println("N�mero: "+ contaP.getNumConta());
				System.out.println("Saldo: " + contaP.getSaldo());
				System.out.println("Dia Rendimento: "+ contaP.getDiaRendimento());
				System.out.println();
				
				System.out.println("Conta Especial:");
				System.out.println("N�mero: " + contaE.getNumConta());
				System.out.println("Saldo: "+ contaE.getSaldo());
				System.out.println("Limite: "+ contaE.getLimite());
				opcaoInvalida = true;
			}else{
				opcaoInvalida = false;
				System.out.println("Op��o invalida, tente novamente.");
			}
		}
	
	}

}
