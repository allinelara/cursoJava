package AgendaContatos;

public class Agenda {

	public static Contato bucaContato (Contato[] contatoL, String nome){
		Contato con = new Contato();
		
		for(int i =0; i<contatoL.length;i++){
			if(contatoL[i]!=null && contatoL[i].getNome().equalsIgnoreCase(nome)){
				con = contatoL[i];
			}else{
				con =null;
			}
		}
		
		return con;
	}
	
	public static void novoContato(Contato[] contatoL, Contato con){
		contatoL[contatoL.length - 1] = con;
		System.out.println("Salvo com sucesso");
	}
	
}
