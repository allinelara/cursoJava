package PilhaListaFila;

import java.util.Stack;

public class Exercicio8 {

	public static void main(String[] args) {

		Stack<Integer>  pilha = new Stack<Integer>();
		Stack<Integer>  dest = new Stack<Integer>();
		Stack<Integer>  aux = new Stack<Integer>();

		pilha.push(3);
		pilha.push(2);
		pilha.push(1);
		
		torreDeHanoi(pilha.size(), pilha, dest, aux);

	}
	
	public static void torreDeHanoi(int n, Stack<Integer> pilha, Stack<Integer> dest, Stack<Integer> aux){
		
		if(n >0){
			torreDeHanoi(n-1, pilha, aux, dest);
			dest.push(pilha.pop());
			System.out.println("---");
			System.out.println("Original" + pilha);
			System.out.println("Destino" + dest);
			System.out.println("Auxiliar" + aux);
			torreDeHanoi(n-1, aux, dest, pilha);
			
			
		}
	}

}
