package SemaforoThread;

public class UtilizarThreadSemaforo {

	public static void main(String[] args) {

		MinhaThreadSemaforo semaforo = new MinhaThreadSemaforo();
		
		for(int i=0;i<3;i++){
			System.out.println(semaforo.getCor());;
			semaforo.esperaCorMudar();
			
		}
		semaforo.desligarSemaforo();
	}

}
