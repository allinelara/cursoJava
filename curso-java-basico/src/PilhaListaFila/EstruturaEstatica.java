package PilhaListaFila;

public class EstruturaEstatica<T> {

	protected T[] elementos;
	protected int tamanho;

	public EstruturaEstatica(int capacidade){
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	public EstruturaEstatica(){
		this(10);
	}

	//adiciona um elemento not vetor na proxima posição vazia
	protected void adicona(T elemento) throws Exception{
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		}else{
			throw new Exception("Vetor já esta cheio. Não ´possível adincionar mais elementos.");
		}

	}
	//adicionar um elemento no vetor em qualquer posição
	protected boolean adiciona(T elemento, int posicao){
		if(!(posicao>=0)){
			throw new IllegalArgumentException("Posicão inválida");
		}else if(!(posicao <tamanho)){
			try {
				this.adicona(elemento);
				return true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(int i=this.tamanho; i>posicao;i--){
			this.elementos[i] = this.elementos[i-1];
		}
		this.elementos[posicao]=elemento;
		this.tamanho++;
		return true;
	}
	//aumenta o tamanho do vetor
	protected void aumentaCapacidade(){
		if(this.tamanho == this.elementos.length){
			T[] elementosNovos = (T[])new Object[this.elementos.length*2];
			for(int i =0; i<this.elementos.length;i++){
				elementosNovos[i]=this.elementos[i];
			}
			this.elementos=elementosNovos;
		}
	}
	public int tamanho(){
		return this.tamanho;
	}
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i=0; i<this.tamanho-1;i++){
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if(this.tamanho>0){
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		return s.toString();
	}
	public boolean estaVazio(){
		return this.tamanho == 0;
	}
	
	public void remove(int posicao){
		if(!(posicao>=0 && posicao <tamanho)){
			throw new IllegalArgumentException("Posicão inválida");
		}
		for(int i =posicao; i<(this.tamanho-1); i++){
			this.elementos[i] = this.elementos[i+1];
		}
		tamanho--;
	}
}
