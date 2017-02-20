package Array;

public class UtilizarLista {

	public static void main(String[] args) {

		Lista<String> vetor = new Lista<String>(3);
		
		try {
			vetor.adicona("Elemento 01");
			vetor.adicona("Elemento 02");
			vetor.adicona("Elemento 03");
			vetor.adicona("Elemento 01");
			vetor.adicona("Elemento 02");
			vetor.adicona("Elemento 03");
			vetor.adicona("Elemento 01");
			vetor.adicona("Elemento 02");
			vetor.adicona("Elemento 03");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(vetor.contem("Elemento 01"));
		System.out.println(vetor.contem("Elemento 04"));
		
		System.out.println(vetor.toString());

		System.out.println(vetor.ultimoIndice("Elemento 01"));
		
		vetor.limpar();
		
		System.out.println(vetor);
	}

}
