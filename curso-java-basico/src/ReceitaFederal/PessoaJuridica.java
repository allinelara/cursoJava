package ReceitaFederal;

public class PessoaJuridica extends Pessoa{
	
	private final double imposto = 0.1;

	public double getImposto() {
		return imposto;
	}
	
	public void calculaImposto (double renda, String nome){
		double impostoV = renda * imposto;
		System.out.println("O valor do imposto a ser pago por "+nome+" é de " + impostoV);
	
		
	}

}
