package AgendaContatos;

public class ContatoNaoExisteException  extends Exception{

	private String nome;

	public ContatoNaoExisteException(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "O contato "+nome+" n�o existe na agenda.";
	}
	
	
}
