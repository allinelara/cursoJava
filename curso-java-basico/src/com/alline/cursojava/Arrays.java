package com.alline.cursojava;

public class Arrays {

	public static void main(String[] args) {
		double tempDia001 = 32.3;
		double tempDia002 = 34;
		double tempDia003 = 33;
		double tempDia004 = 22.3;
		
		double[] temperatura = new double[365];
		temperatura[0] = 33.9;
		temperatura[1] = 39;
		temperatura[3] = 34;
		temperatura[4] = 29;
		
		System.out.println(temperatura[0]);
		System.out.println(temperatura.length);
		
		for(int i =0; i<temperatura.length; i++){
			System.out.println(temperatura[i]);
		}
		//for melhorado
		for(double temp : temperatura){
			System.out.println(temp);
		}
	}

}
