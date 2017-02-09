package ReceitaFederal;

public class VerificarImposto {

	public static void main(String[] args) {
		
		PessoaJuridica pJ = new PessoaJuridica();
		PessoaJuridica pJ2 = new PessoaJuridica();
		PessoaJuridica pJ3 = new PessoaJuridica();

		pJ.setNome("Antonio");
		pJ.setRenda(88000);
		
		pJ2.setNome("Daniela");
		pJ2.setRenda(93000);
		
		pJ3.setNome("Marcela");
		pJ3.setRenda(3000);
		
		pJ.calculaImposto(pJ.getRenda(), pJ.getNome());
		pJ2.calculaImposto(pJ2.getRenda(), pJ2.getNome());
		pJ3.calculaImposto(pJ3.getRenda(), pJ3.getNome());

		
		PessoaFiscia pF = new PessoaFiscia();
		PessoaFiscia pF2 = new PessoaFiscia();
		PessoaFiscia pF3 = new PessoaFiscia();
		
		pF.setNome("Fred");
		pF.setRenda(1400);
		
		pF2.setNome("Luiz");
		pF2.setRenda(3400);
		
		pF3.setNome("Hannah");
		pF3.setRenda(2300);
		
		pF.calculaImposto(pF.getRenda(), pF.getNome());
		pF2.calculaImposto(pF2.getRenda(), pF2.getNome());
		pF3.calculaImposto(pF3.getRenda(), pF3.getNome());

	}

}
