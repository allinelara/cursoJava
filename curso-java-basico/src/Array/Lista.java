package Array;

public class Lista<T> {


	private T[] elementos;
	private int tamanho;
	
	public Lista(int capacidade){
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	//adiciona um elemento not vetor na proxima posição vazia
	public void adicona(T elemento) throws Exception{
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		}else{
			throw new Exception("Vetor já esta cheio. Não ´possível adincionar mais elementos.");
		}
		
	}
	public int tamanho(){
		return this.tamanho;
	}
	//somente exibe na dela as posições que não estão null no vetor
	//para isso ele utiliza o StringBuilder para concatenar uma String
	@Override
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
	//busca o elemento do vetor que esta em uma determinada posição
	public T busca(int posicao){
		if(!(posicao>=0 && posicao <tamanho)){
			throw new IllegalArgumentException("Posicão inválida");
		}
		return this.elementos[posicao];
	}
	//verifica se um elemento esta no vetor e retorna true/false
		public boolean contem(T elemento){
			for(int i =0; i<this.tamanho;i++){
				if(this.elementos[i].equals(elemento)){
					return true;
				}
			}
			return false;
		}
	
	public void limpar(){
		this.elementos = (T[])new Object[1];
		this.tamanho = 0;
	}
	
	//verifica se um elemento esta no vetor e retorna a posição do elemento caso ele exist ano vetor
	public int busca(T elemento){
		for(int i =0; i<this.tamanho;i++){
			if(this.elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;
	}
	//adicionar um elemento no vetor em qualquer posição
	public boolean adiciona(T elemento, int posicao){
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
	private void aumentaCapacidade(){
		if(this.tamanho == this.elementos.length){
			T[] elementosNovos = (T[])new Object[this.elementos.length*2];
			for(int i =0; i<this.elementos.length;i++){
				elementosNovos[i]=this.elementos[i];
			}
			this.elementos=elementosNovos;
		}
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
	
	public void remove(T elemento){
		int posicao = this.busca(elemento);
		if(posicao>=0){
			for(int i =posicao; i<(this.tamanho-1); i++){
				this.elementos[i] = this.elementos[i+1];
			}
			tamanho--;
		}else{
			throw new IllegalArgumentException("Elemento não encontrado.");
		}
	}
	
	public int ultimoIndice (T elemento){
		for(int i = this.tamanho-1;i>=0;i--){
			if(this.elementos[i].equals(elemento)){
				return i;
			}
			
		}
		return -1;
		
	}
	
} 


