package com.alline.cursojava;

public class ExercicioArrays {

	public static void main(String[] args) {
		int[] a = new int[3];
		int[] b = new int[3];
		
		a[0]= 3;
		a[1]=4;
		a[2]=6;
		
		for(int i =0; i<3; i++){
			b[i]= a[i] *2;		
			System.out.println(a[i] + ", " + b[i]);
	}}

}
