package PilhaListaFila;

public class Documento {

	private String nome; 
	private int quantidadeFolha;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidadeFolha() {
		return quantidadeFolha;
	}
	public void setQuantidadeFolha(int quantidadeFolha) {
		this.quantidadeFolha = quantidadeFolha;
	}
	@Override
	public String toString() {
		return "Documento [nome=" + nome + ", quantidadeFolha=" + quantidadeFolha + "]";
	}
	
	
}
