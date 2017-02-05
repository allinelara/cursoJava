package com.alline.cursojava;

public class For {

	public static void main(String[] args) {
		for(int i = 0; i < 3; i++){
			System.out.println(i);
		}
		for(int i = 3; i > 0; i--){
			System.out.println(i);
		}
		for(int i=0, j=10;i<j;i++, j--){
			System.out.println("i = " + i + "; j = " + j);
		}
		int count = 0;
		for ( ; count < 5;){
			System.out.println(count);
			count+=2;
		}
	}

}
