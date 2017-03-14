package PilhaListaFila;

public class ExercicioLista1 {

	public static void main(String[] args) throws Exception {
		
		Fila<Documento> fila = new Fila<Documento>();
		Documento doc1 = new Documento();
		Documento doc2 = new Documento();

		doc1.setNome("doc 1");
		doc1.setQuantidadeFolha(233);
		
		doc2.setNome("doc 2");
		doc2.setQuantidadeFolha(245);
		
		fila.adicona(doc1);
		fila.adicona(doc2);
		
		System.out.println(fila.desenfileira());
		
		System.out.println(fila.desenfileira());

	}

}
