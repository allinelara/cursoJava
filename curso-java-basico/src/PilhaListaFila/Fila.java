package PilhaListaFila;

public class Fila<T> extends EstruturaEstatica<T> {
	
	public Fila(){
		super();
	}
	public Fila(int capacidade){
		super(capacidade);
	}
	
	public void enfileira(T elemento) throws Exception{
		//aumentaCapacidade();
		//this.elementos[this.tamanho++] = elemento;
		this.adicona(elemento);
	}
	
	public T espiar (){
		if(this.estaVazio()){
			return null;
		}
		return this.elementos[0];
	}
	
	public T desenfileira(){
		if(this.estaVazio()){
			return null;
		}
		T elementoASerRemovido = this.elementos[0];
		
		this.remove(0);
		return elementoASerRemovido;
	}
}
