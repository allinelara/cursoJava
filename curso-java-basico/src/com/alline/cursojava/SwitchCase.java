package com.alline.cursojava;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int diaSemana = scan.nextInt();
		
		/*if(diaSemana == 1){
			System.out.println("Domingo");
		}else if(diaSemana == 2){
			System.out.println("Segunda");
		}else if(diaSemana == 3){
			System.out.println("ter�a");
		}else if(diaSemana == 4){
			System.out.println("quarta");
		}else if(diaSemana == 5){
			System.out.println("quinta");
		}else if(diaSemana == 6){
			System.out.println("sexta");
		}else if(diaSemana == 7){
			System.out.println("sabadp");
		}else{
			System.out.println("Digitou erro");
		}*/
		switch(diaSemana){
		case 1: System.out.println("Domingo");break;
		case 2: System.out.println("Segunda");break;
		case 3: System.out.println("Ter�a");break;
		case 4: System.out.println("Quarta");break;
		case 5: System.out.println("Quinta");break;
		case 6: System.out.println("Sexta");break;
		case 7: System.out.println("Sabado");break;
		default:System.out.println("N�o � dia"); 
		}
	}
	
}
