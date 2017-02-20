package Array;

import java.util.ArrayList;

public class VetorArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> vetor = new ArrayList<String>();
		
		//adiciona no arrayList
		vetor.add("A");
		vetor.add("E");
		vetor.add("E");
		vetor.add("D");

		
		System.out.println(vetor);
		
		//adiciona em uma posição especifica
		vetor.add(1, "B");
		
		System.out.println(vetor);
		
		//busca pelo elemento true/false
		System.out.println(vetor.contains("A"));
		
		System.out.println(vetor.contains("a"));
		
		//busca o indice do elemento
		System.out.println(vetor.indexOf("a"));
		
		System.out.println(vetor.indexOf("A"));
		
		//busca o elemento atraves do indice
		System.out.println(vetor.get(0));
		
		//remove elemento através do indice
		vetor.remove(0);
		
		//remove elemento através do elemento
		vetor.remove("B");
		
		System.out.println(vetor);
		
		//exibe o tamanho do vetor
		System.out.println(vetor.size());

		System.out.println(vetor.lastIndexOf("E"));
		
		vetor.clear();
		System.out.println(vetor);

	}

}
