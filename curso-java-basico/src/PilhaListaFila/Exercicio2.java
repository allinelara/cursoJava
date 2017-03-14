package PilhaLista;

import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) throws Exception {
		
		Pilha<Integer> pilhaP = new Pilha<Integer>();

		Pilha<Integer> pilhaI = new Pilha<Integer>();

		Random gerador = new Random();
		
		int num = 0;
		for(int i =0; i<10; i++){
			
			num = gerador.nextInt(40);
			if(num == 0){
				if(pilhaP.estaVazio() || pilhaI.estaVazio()){
					System.out.println("Não da para desimpilhar, pilha vazia");
				}
				pilhaP.desempilha();
				pilhaI.desempilha();
			}else if((num % 2)==0){
				pilhaP.adicona(num);
			}else{
				pilhaI.adicona(num);;
			}
			
		}
		
		if(!pilhaP.estaVazio()){
			System.out.println(pilhaP);
		}		
 
		if(!pilhaI.estaVazio()){
			System.out.println(pilhaI);
		}	
	}

}
