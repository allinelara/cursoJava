package Array;

public class UtilizarVetorObject {

	public static void main(String[] args) {

		VetorObject vetor = new VetorObject(3);
		
		Contato c1 = new Contato("Alline", 233334, "allne@info.com");
		Contato c2 = new Contato("Helen", 32245, "helen@info.com");
		Contato c3 = new Contato("Felipa", 32311, "felipa@info.com");
		Contato c4 = new Contato("Alline", 233334, "allne@info.com");

		try {
			vetor.adicona(c1);
			vetor.adicona(c2);
			vetor.adicona(c3);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(vetor.toString());
		
		// o c4 não foi adicionado ao vetor. 
		//contudo foi adicionado o metodo equals na classe Contato 
		//assim será verificado se existe um objeto igual ao objeto c4 
		//no vetor. 
		int pos = vetor.busca(c4);
		
		System.out.println(pos);
		
		System.out.println(vetor.busca(0));
	}

}
