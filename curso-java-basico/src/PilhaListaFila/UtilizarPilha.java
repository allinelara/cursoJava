package PilhaListaFila;

import java.util.Stack;

public class UtilizarPilha {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
		System.out.println(pilha.estaVazio());

		pilha.empilha(1);
		pilha.empilha(2);
		pilha.empilha(3);

		System.out.println(pilha);
		System.out.println(pilha.tamanho());
		
		System.out.println(pilha.estaVazio());
		//olha qual é o elemento que esta no topo da pilha
		System.out.println(pilha.topo());
		
		//retira o elemento que esta no topo da pilha
		System.out.println(pilha.desempilha());
		System.out.println(pilha);

		//Pilha do Java

		Stack<Integer> stack = new Stack<Integer>();
		
		//esta vazia?
		System.out.println(stack.isEmpty());
		
		//empilha elementos na pilha 
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.isEmpty());
		
		//o tamanho da pilha
		System.out.println(stack.size());
		
		System.out.println(stack);
		
		//verifica qual é o elemento do topo da pilha
		System.out.println(stack.peek());
		
		//remove o elemento do topo da pilha (desempilha)
		System.out.println(stack.pop());
		
		System.out.println(stack);



	}

}
