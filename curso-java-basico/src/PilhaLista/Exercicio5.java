package PilhaLista;

public class Exercicio5 {

	public static void main(String[] args) throws Exception {

		Pilha<Character> pilha = new Pilha<Character>();
		
		String palavra = "AABCCBAA";
		
		char[] array = palavra.toCharArray();
		
		for(int i=0; i< array.length;i++){
			pilha.adicona(array[i]);
		}
		System.out.println(pilha);
		
		boolean verifica = true;
		
		String palavraInversa = "";
		
		while(!pilha.estaVazio()){
			palavraInversa += pilha.desempilha();
		}
		if(!palavra.equalsIgnoreCase(palavraInversa)){
			System.out.println("Não é palindromo");		}
		else{
			System.out.println("É palindromo");
		}
		
	}

}
