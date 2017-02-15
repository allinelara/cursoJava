package TicaTacThread;

public class ThreadTicTac implements Runnable{

	TicTac tt;
	Thread t;
	
	final int NUM =5;
	
	public ThreadTicTac (String nome, TicTac tt){
		this.tt = tt;
		t = new Thread(this, nome);
		t.start();
	}

	@Override
	public void run() {
		
		if(t.getName().equalsIgnoreCase("Tic")){
			for(int i=0; i<NUM;i++){
				tt.tic(true);
			}
		tt.tic(true);
		}else{
			for(int i=0; i<NUM;i++){
				tt.tac(true);
			}
			tt.tic(false);
		}
		
	}
}
