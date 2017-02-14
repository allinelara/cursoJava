package TratamentoErro;

public class Excecao {

	public static void main(String[] args) {
		
		
		try{
			int[] vetor = new int[4];

			System.out.println("Antes do erro");
			
			vetor [4] = 1;
		}
		catch(ArrayIndexOutOfBoundsException exception){
			System.out.println("Erro!");
		}
		
		int[] num = {3,4,5,6,2,4,5,3};
		int[]demon = {2,5,3,2,0,5};
		
		for(int i=0;i<num.length;i++){
			
			try{
				System.out.println(num[i]/demon[i]);
		
			}catch(ArithmeticException e1){
				System.out.println("Erro ao dividir por zero");
			}
			catch(ArrayIndexOutOfBoundsException e2){
				System.out.println("posição invalida.");
			}
			//super classe de erro geral
			catch (Throwable exc){
				System.out.println("Deu erro.");
			}
			
			System.out.println();
			//caso não uso o try catch o programa para de executar
			try{
				System.out.println(num[i]/demon[i]);
		
				//log do programa
			}catch(Exception e){
				//diz qual foi o erro
				System.out.println(e.getMessage());
				//diz onde foi o erro
				e.printStackTrace();
			}
			
		}
	}

}
