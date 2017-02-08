package com.alline.cursojavaOO;

public class SomatoriaNum {
	
	public static int somatorioNum (int num){
		if (num==0){
			return 0;
		}
		return num + somatorioNum(num-1);
	}

}
