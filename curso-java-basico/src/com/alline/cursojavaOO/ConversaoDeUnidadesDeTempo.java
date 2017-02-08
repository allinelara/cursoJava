package com.alline.cursojavaOO;

public class ConversaoDeUnidadesDeTempo {
	
	public static int converterMinSeg(int min){
		int segu = 60 * min;
		
		return segu;
	}
	
	public static int converterHoraMin(int hora){
		int min = 60 * hora;
		
		return min;
	}

	public static int converterDiaHora(int dia){
		int hora = 24 * dia;
		
		return hora;
	}
	
	public static int converterSemanaDias(int semana){
		int dias = 7 * semana;
		
		return dias;
	}
	
	public static int converterMesDias(int mes){
		int dias = 31 * mes;
		
		return dias;
	}
	
	public static double converterAnoDias(int ano){
		double dias = 365.25 * ano;
		
		return dias;
	}
}
