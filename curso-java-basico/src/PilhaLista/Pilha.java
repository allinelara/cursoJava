package PilhaLista;

public class Pilha<T> extends EstruturaEstatica<T>{
	
	public Pilha(){
		super();
	}
	
	public Pilha(int capacidade){
		super(capacidade);
	}

	public void empilha(T elemento){
		try {
			this.adicona(elemento);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public T topo(){
		if(this.estaVazio()){
			return null;
		}
		return this.elementos[tamanho-1];
	}
	
	public T base(){
		if(this.estaVazio()){
			return null;
		}
		return this.elementos[0];
	}
	
	public T desempilha(){
		if(this.estaVazio()){
			return null;
		}
		T elemento  = this.elementos[tamanho-1];
		tamanho--;
		return elemento;
	}
}
