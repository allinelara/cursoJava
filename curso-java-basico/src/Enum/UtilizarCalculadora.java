package Enum;

public class UtilizarCalculadora {

	public static void main(String[] args) {
		
		Calculadora[] operadores = Calculadora.values();
		
		for(Calculadora cal: Calculadora.values()){
			System.out.println(cal.executarOperacao(9, 2));
		}
	}
	
}
