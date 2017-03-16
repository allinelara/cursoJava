package PilhaListaFila;

public class Exercicio6 {

	public static void main(String[] args) {
		
		System.out.println(verificaSimbolosBalanceados("A-E+(D-C)*[I-x)"));

	}
	final static String ABRE = "([{";
	final static String FECHA = ")]}";
	public static boolean verificaSimbolosBalanceados(String expressao){
		boolean balanceado = true;
		
		Pilha<Character> pilha = new Pilha<Character>();
		int index=0;
		char simbolo, topo;
		while(index < expressao.length() && balanceado){
			simbolo = expressao.charAt(index);
			if(ABRE.indexOf(simbolo)>-1){
				pilha.empilha(simbolo);
			}else if (FECHA.indexOf(simbolo)> -1){
				if(pilha.estaVazio()){
					return false;
				}
				topo = pilha.desempilha();
				
				if(ABRE.indexOf(topo)!= FECHA.indexOf(simbolo)){
					return false;
				}
			}
		
			index++;
		}
		
		return true;
	}
}
