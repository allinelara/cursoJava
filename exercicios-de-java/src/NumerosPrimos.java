
public class NumerosPrimos {

	public static void main(String[] args) {

		//Verifica se o número é primo. Se for imprimi o número 
		for(int i=2; i<100; i++){
			boolean ehPrimo = true;
			if(i>2 && (i%2)==0){
				ehPrimo = false;
			}else{
				for(int j=3; j<i;j+=2){
					if((i%j)==0){
						ehPrimo = false;
					}
				}
			}
			
			if(ehPrimo){
				System.out.println(i);
			}
		}
	}

}
