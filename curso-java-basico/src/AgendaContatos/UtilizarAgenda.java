package AgendaContatos;

import java.util.Scanner;



public class UtilizarAgenda {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		boolean opcaoValida = false; 
		
		Contato con = new Contato();
		con.setId(1);
		con.setNome("Gustavo");
		con.setTelefone("9999999");
		
		Contato con2 = new Contato();
		con2.setId(2);
		con2.setNome("Ana");
		con2.setTelefone("9999999");
		
		Contato [] conL = new Contato[3];
		conL[0] = con;
		conL[1] = con2;
		
		
		
		while(opcaoValida == false){
			System.out.println("Digite 1 para consultar um contato e 2 para adicionar um novo contato.");
			int opcao = scan.nextInt();
			if(opcao==1){
				System.out.println("Digite o nome que deseja procurar.");
				String nome = scan.next();
				Contato conB = Agenda.bucaContato(conL, nome);
				try {
					if(conB==null){
						throw new ContatoNaoExisteException(nome);
					}
					System.out.println(conB.getNome()+", "+conB.getTelefone());

				} catch (ContatoNaoExisteException e) {
						e.printStackTrace();					
				}
				opcaoValida=true;
			}else if(opcao==2){
				try {
					if(conL.length>=2){
						throw new AgendaCheiaExeption();
					}
					System.out.println("Digite o nome");
					Contato nCon = new Contato();
					nCon.setNome(scan.next());
					System.out.println("Digite o telefone");
					nCon.setTelefone(scan.next());
					nCon.setId(conL.length+1);
					Agenda.novoContato(conL, nCon);
				} catch (AgendaCheiaExeption e) {
					e.printStackTrace();					
			}
			opcaoValida=true;			
				
			}else{
				System.out.println("Opção invalida.");
				opcaoValida=false;
			}
		}
	}

}
