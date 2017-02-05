package com.alline.cursojava;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número");
		int num = scan.nextInt();
		
		System.out.println("Entre com um limite");
		int max = scan.nextInt();
		
		for(int i = num; i <=max; i++){
			if(i%7==0){
				System.out.println(i);
				break;
			}
		}
		for (int i=0; i<=4; i++){
			rotulo1:{
				rotulo2:{
					rotulo3:{
			if(i==2){
				break rotulo1;
			}
			if(i==2){
				break rotulo2;
			}
			if(i==3){
				break rotulo3;
			}
			System.out.println("rotulo");
		}
		}
		}
		}
	}

}
