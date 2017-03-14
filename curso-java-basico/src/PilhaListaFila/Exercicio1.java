package PilhaLista;

import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) throws Exception {
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		Random gerador = new Random();
		
		int num = 0;
		for(int i =0; i<10; i++){
			
			num = gerador.nextInt(40);
			
			if((num % 2)==0){
				pilha.adicona(num);
			}else{
				if(pilha.estaVazio()){
					System.out.println("Não da para desimpilhar, pilha vazia");
				}
				pilha.desempilha();
			}
			
		}
		
		if(!pilha.estaVazio()){
			System.out.println(pilha);
		}		
 
	}

}
