package com.alline.cursojava;

import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dia = 0;
		int hora = 0;
		int atividade = 0;
		
		boolean opcaoValida = false;
		boolean diaValido = false;
		boolean horaValido = false;
		
		String[][] agenda = new String[31][24];
		
		while(opcaoValida==false){
			
			System.out.println("Digite 1 para consultar agenda e 2 para agendar um compromisso.");
			atividade = scan.nextInt();
			
			if(atividade == 2){
				//grava compromisso
								
				while (diaValido == false){
					System.out.println("Digite um dia do mês (1 a 31).");
					dia = scan.nextInt();
					if(dia>0 && dia <32){
						diaValido = true;
						while (horaValido == false){
						
							System.out.println("Digite uma hora do dia (1 a 24).");
							hora = scan.nextInt();
							
							if(hora>0 && hora<25){
								horaValido = true;
							}else{
								horaValido = false;
								System.out.println("Hora invalida.");
							}
						}
					}else{
						diaValido = false;
						System.out.println("Dia invalido.");
					}

				}				
								
				System.out.println("Digite o compromisso.");
				
				if(agenda[dia][hora] == null){
					agenda[dia][hora] = scan.next();
					System.out.println("Compromisso Salvo.");
				}else{
					System.out.println("Este horário já esta preenchido com o compromisso: " + agenda[dia][hora]);
				}
				
				opcaoValida = true;
				
			}else if(atividade == 1){
				//consulta agenda
				while (diaValido == false){
					System.out.println("Digite um dia do mês (1 a 31).");
					dia = scan.nextInt();
					if(dia>0 && dia <32){
						diaValido = true;
						while (horaValido == false){
						
							System.out.println("Digite uma hora do dia (1 a 24).");
							hora = scan.nextInt();
							
							if(hora>0 && hora<25){
								horaValido = true;
							}else{
								horaValido = false;
								System.out.println("Hora invalida.");
							}
						}
					}else{
						diaValido = false;
						System.out.println("Dia invalido.");
					}

				}	
				if(agenda[dia][hora] == null){
					System.out.println("Não há compromisso agendado para este horário.");
				}else{
					System.out.println(agenda[dia][hora]);
				}
				
				opcaoValida = true;

			}else{
				System.out.println("Opção inválida, tente novamente.");
				opcaoValida = false;
			}	
		}
		
		
	}

}
