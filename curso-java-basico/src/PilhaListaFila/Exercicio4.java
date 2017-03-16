package PilhaListaFila;

import java.util.Stack;

public class Exercicio4 {

	public static void main(String[] args) {

		Stack<Livro> pilha = new Stack<Livro>();

		Livro l1 = new Livro();
		l1.setNome("Livro 01");
		l1.setAnoPubl(1999);
		l1.setAutor("autor 1");
		l1.setIsbn(1);
		pilha.push(l1);
		
		Livro l2 = new Livro();
		l2.setNome("Livro 02");
		l2.setAnoPubl(1989);
		l2.setAutor("autor 2");
		l2.setIsbn(2);
		pilha.push(l2);
		
		Livro l3 = new Livro();
		l3.setNome("Livro 03");
		l3.setAnoPubl(1989);
		l3.setAutor("autor 3");
		l3.setIsbn(3);
		pilha.push(l3);

		System.out.println(pilha);
		
		pilha.pop();
		System.out.println(pilha);

		
		System.out.println(pilha.size());
		
	}

}
