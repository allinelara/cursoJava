package SemaforoThread;

public class MinhaThreadSemaforo implements Runnable{

	private SemaforCor  cor;
	Thread t;
	private boolean parar;
	private boolean corMudou;
		
	public MinhaThreadSemaforo (){
		this.cor= SemaforCor.VERMELHO;
		this.parar = false;
		this.corMudou = false;
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		
		while(!parar){
			try {
				switch(this.cor){
					case VERMELHO:
						t.sleep(200);
						break;
					case AMARELO:
						t.sleep(200);
						break;
					case VERDE:
						t.sleep(200);
						break;
					default:
						break;
				}
				this.mudarCor();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}
		
	}
	
	private synchronized void mudarCor(){
		switch (this.cor){
		case VERMELHO:
			this.cor = SemaforCor.AMARELO;
			break;
		case AMARELO:
			this.cor = SemaforCor.VERDE;
			break;
		case VERDE:
			this.cor = SemaforCor.VERMELHO;
			break;
		default:
			break;
		}
		this.corMudou = true;
		notify();
	}

	public synchronized void esperaCorMudar(){
		while(!this.corMudou){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.corMudou  =false;
	}
	public synchronized void desligarSemaforo(){
		this.parar =true;
	}
	public SemaforCor getCor() {
		return cor;
	}

}


