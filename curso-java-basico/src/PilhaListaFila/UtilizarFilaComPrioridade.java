package PilhaListaFila;

import java.util.PriorityQueue;
import java.util.Queue;

public class UtilizarFilaComPrioridade {

	public static void main(String[] args) throws Exception {

		FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();
		
		fila.enfileira(1);
		fila.enfileira(3);
		fila.enfileira(2);

		System.out.println(fila.toString());
		
		//utilizando queue
		
		Queue<Integer> filaComP = new PriorityQueue<Integer>();

		filaComP.add(2);
		filaComP.add(1);
		
		System.out.println(filaComP);
	}

}
