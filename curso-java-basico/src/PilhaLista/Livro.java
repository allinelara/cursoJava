package PilhaLista;

public class Livro {
	
	private String nome;
	private int isbn;
	private int anoPubl;
	private String autor;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public int getAnoPubl() {
		return anoPubl;
	}
	public void setAnoPubl(int anoPubl) {
		this.anoPubl = anoPubl;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", isbn=" + isbn + ", anoPubl=" + anoPubl + ", autor=" + autor + "]";
	}
	

}
