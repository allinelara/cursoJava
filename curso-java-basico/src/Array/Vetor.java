package Array;


public class Vetor {

	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade){
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	//não é eficiente pois tem que varrer o vetor sempre
	/*public void adicona(String elemento){
		for(int i=0;i<this.elementos.length;i++){
			if(this.elementos[i]==null){
				this.elementos[i] = elemento;
				break;
			}
		}
	}*/
	
	//adiciona um elemento no vetor na proxima posição vazia
	public void adicona(String elemento) throws Exception{
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
	public String busca(int posicao){
		if(!(posicao>=0 && posicao <tamanho)){
			throw new IllegalArgumentException("Posicão inválida");
		}
		return this.elementos[posicao];
	}
	
	//verifica se um elemento esta no vetor e retorna a posição do elemento caso ele exist ano vetor
	public int busca(String elemento){
		for(int i =0; i<this.tamanho;i++){
			if(this.elementos[i].equalsIgnoreCase(elemento)){
				return i;
			}
		}
		return -1;
	}
	//adicionar um elemento no vetor em qualquer posição
	public boolean adiciona(String elemento, int posicao){
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
			String[] elementosNovos = new String[this.elementos.length*2];
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
	
	public void remove(String elemento){
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
	
}
