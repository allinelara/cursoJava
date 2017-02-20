package Array;

public class UtilizarVetor {
	public static void main(String[] args) {

		Vetor vetor = new Vetor(4);
		
		try {
			vetor.adicona("elemento 01");
			vetor.adicona("elemento 02");
			vetor.adicona("elemento 03");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(vetor.toString());
		
		System.out.println(vetor.busca(1));
		
		System.out.println(vetor.busca("elemento 01"));
		
		vetor.adiciona("elemento 00", 0);
		
		System.out.println(vetor.toString());
		
		vetor.adiciona("elemento 04", 4);
		
		System.out.println(vetor.toString());
		
		vetor.adiciona("elemento 05", 5);
		
		System.out.println(vetor.toString());
		
		vetor.remove(0);
		
		System.out.println(vetor.toString());
		
		vetor.remove("elemento 02");
		
		System.out.println(vetor.toString());
	}
	
}
