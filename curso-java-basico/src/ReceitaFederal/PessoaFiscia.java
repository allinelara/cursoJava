package ReceitaFederal;

public class PessoaFiscia extends Pessoa{
	
	private final double imposto1 = 0.1;
	private final double imposto2 = 0.15;
	private final double imposto3 = 0.25;
	private final double imposto4 = 0.30;
	public double getImposto1() {
		return imposto1;
	}
	public double getImposto2() {
		return imposto2;
	}
	public double getImposto3() {
		return imposto3;
	}
	public double getImposto4() {
		return imposto4;
	}
	
	public void calculaImposto (double renda, String nome){
		double imposto = 0;
		if(renda>0 && renda <=1400){
			System.out.println(nome+ " não precia pagar imposto.");
		}else if(renda>1400 && renda <=2100){
			imposto = renda * imposto1;
			System.out.println("O valor do imposto a ser pago por "+ nome+" é de " + imposto);
		}else if(renda>2100 && renda <=2800){
			imposto = renda * imposto2;
			System.out.println("O valor do imposto a ser pago por "+ nome+" é de " + imposto);
		}else if(renda>2800 && renda <=2600){
			imposto = renda * imposto3;
			System.out.println("O valor do imposto a ser pago por "+ nome+" é de " + imposto);
		}else{
			imposto = renda * imposto4;
			System.out.println("O valor do imposto a ser pago por "+ nome+" é de " + imposto);
		}
		

	}

}
