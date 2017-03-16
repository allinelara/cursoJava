package PilhaListaFila;

import java.util.Random;

public class Exercicio7 {

	public static void main(String[] args) throws Exception {

		Pilha<Integer> pilha = new Pilha<Integer>();
		Pilha<String> pilhaB = new Pilha<String>();
		Pilha<String> pilhaBInverso = new Pilha<String>();


		Random gerador = new Random();
		
		for(int i =0; i<10; i++){
			pilha.adicona(gerador.nextInt(40));		
		}
		System.out.println(pilha);
		
		String[] array;
		while(pilha.tamanho()>0){
			int num = pilha.topo();
			pilhaB.adicona(Integer.toBinaryString(num));
			pilha.desempilha();
		}
		while(pilhaB.tamanho()>0){
			pilhaBInverso.adicona(pilhaB.topo());
			pilhaB.desempilha();
		}
		
		System.out.println(pilhaBInverso);
		
	}

}
