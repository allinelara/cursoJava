package TicaTacThread;

public class TicTac {

	boolean tic;
	
	synchronized void tic(boolean estaExcutando){
		if(!estaExcutando){
			tic= true;
			notify();
			return;
		}
		System.out.println("Tic");
		
		tic = true;
		
		notify();
		
		while(tic){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

	synchronized void tac(boolean estaExcutando){
		if(!estaExcutando){
			tic= false;
			notify();
			return;
		}
		System.out.println("Tac");
		
		tic = false;
		
		notify();
		
		while(!tic){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
