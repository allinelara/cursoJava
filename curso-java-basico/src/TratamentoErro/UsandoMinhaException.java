package TratamentoErro;

public class UsandoMinhaException {

	public static void main(String[] args) {
		int[] num = {3,4,5,6,2,4,5,3};
		int[]demon = {2,0,4, 2,0,4};
		
		for(int i=0;i<num.length;i++){
			
			try{
				if(num[i]%2 !=0){
					throw new DivisaoNaoExata(num[i],demon[i]);
					//throw new Exception("Numero impar, divisão não exata");
				}
				System.out.println(num[i]/demon[i]);
		
			}catch(ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e1){
				System.out.println("Erro");
				e1.printStackTrace();
			}
			
			
		}
	}

	

}
