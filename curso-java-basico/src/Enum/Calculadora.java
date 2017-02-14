package Enum;

public enum Calculadora {

	SOMAR("+") {
		@Override
		public double executarOperacao(double x, double y) {
			
			return x + y;
		}
	}, DIVIDIR("/") {
		@Override
		public double executarOperacao(double x, double y) {
			// TODO Auto-generated method stub
			return x/y;
		}
	}, SUBTRAIR("-") {
		@Override
		public double executarOperacao(double x, double y) {
			// TODO Auto-generated method stub
			return x - y;
		}
	}, MULTIPLICAR("*") {
		@Override
		public double executarOperacao(double x, double y) {
			// TODO Auto-generated method stub
			return x*y;
		}
	};
	
	private String valor;

	public String getValor() {
		return valor;
	}

	Calculadora(String valor){
		this.valor = valor;
	}
	
	public abstract double executarOperacao(double x, double y);
	
	public String toString(){
		return this.valor;
	}
}
