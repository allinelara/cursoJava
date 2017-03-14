package PilhaListaFila;

import java.util.LinkedList;
import java.util.Queue;

public class UtilizarFila {

	public static void main(String[] args) throws Exception {

		Fila<Integer> fila = new Fila<>();
		
		System.out.println(fila.estaVazio());
		System.out.println(fila.tamanho());
		
		fila.adicona(1);
		fila.adicona(2);
		fila.adicona(3);
		fila.adicona(4);
		
		System.out.println(fila.estaVazio());
		System.out.println(fila.tamanho());
		System.out.println(fila.toString());
		System.out.println(fila.espiar());
		System.out.println(fila.desenfileira());
		System.out.println(fila.toString());

		//fila utilizando Queue
		
		Queue<Integer> filaQ = new LinkedList<>();
		
		//adiciona coisas na fila 
		filaQ.add(1);
		filaQ.add(2);
		
		System.out.println(filaQ);
		
		//espia o primeiro elemento da fila
		System.out.println(filaQ.peek());
		
		//remove elemento da fila
		System.out.println(filaQ.remove());
		
		System.out.println(filaQ);

		
	}

}
