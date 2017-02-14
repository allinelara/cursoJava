package Enum;

public class Teste {

	public static void main(String[] args) {

		DiaSemana dia = DiaSemana.SABADO;
		
		System.out.println(dia.toString() + " - " + dia.getValor());
	
		Data data = new Data(1, 3, 2014, DiaSemana.DOMINGO);
	
		//values() pega os valores do DiaSemana e joga dentro do array
		DiaSemana[] dias = DiaSemana.values();
		
		for(int i=0;i<dias.length;i++){
			System.out.println(dias[i]);
		}
		
		for(DiaSemana dia2 : DiaSemana.values()){
			System.out.println(dia2);

		}
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
	}

}
