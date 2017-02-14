package AgendaContatos;

public class AgendaCheiaExeption extends Exception{

	public AgendaCheiaExeption() {
		super();
	}

	@Override
	public String toString() {
		return "Agenda cheia";
	}
	
	
}
