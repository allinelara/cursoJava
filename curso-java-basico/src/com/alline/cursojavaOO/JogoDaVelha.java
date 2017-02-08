package com.alline.cursojavaOO;

public class JogoDaVelha {
	
	private char[][] tabuleiro = new char[3][3];
	private String resultado;
	private int linha;
	private int coluna;
	private int jogada = 1;//contar o número de jogadas, apartir da 5 pode der um ganhador
	private boolean linhaValida = false;
	private boolean colunaValida = false;
	private boolean jogadaValida = false;
	private char sinal;
	public char[][] getTabuleiro() {
		return tabuleiro;
	}
	public void setTabuleiro(char[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public int getColuna() {
		return coluna;
	}
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	public int getJogada() {
		return jogada;
	}
	public void setJogada(int jogada) {
		this.jogada = jogada;
	}
	public boolean isLinhaValida() {
		return linhaValida;
	}
	public void setLinhaValida(boolean linhaValida) {
		this.linhaValida = linhaValida;
	}
	public boolean isColunaValida() {
		return colunaValida;
	}
	public void setColunaValida(boolean colunaValida) {
		this.colunaValida = colunaValida;
	}
	public boolean isJogadaValida() {
		return jogadaValida;
	}
	public void setJogadaValida(boolean jogadaValida) {
		this.jogadaValida = jogadaValida;
	}
	public char getSinal() {
		return sinal;
	}
	public void setSinal(char sinal) {
		this.sinal = sinal;
	}
	public char definirSinal (int jogada){
		if(jogada % 2 == 0){
			return 'o';
		}
		else{
			return 'x';
		}
	}
	
	public boolean verificarLinhaValida(int linha){
		if(linha>3 || linha <1){
			System.out.println("Número de linha ou coluna invalido, tente novamente");
			this.linhaValida = false;
		}else{
			this.linha --;
			this.linhaValida = true; 
		}
		return this.linhaValida;
	}
	
	public boolean verificarColunaValida(int coluna){
		if(coluna>3 || coluna <1){
			System.out.println("Número de linha ou coluna invalido, tente novamente");
			this.colunaValida = false;
		}else{
			this.coluna --;
			this.colunaValida = true;
		}
		return this.colunaValida;
	}
	
	public String verificarGanhador (char[][]tabuleiro){
		String resul = null;
		if(tabuleiro[0][0] == 'x' && tabuleiro[0][1] == 'x' && tabuleiro[0][2] == 'x'){
			System.out.print("O jogador 1 ganhou");
			resul = "c";
		}else if(tabuleiro[0][0] == 'o' && tabuleiro[0][1] == 'o' && tabuleiro[0][2] == 'o'){
			System.out.print("O jogador 2 ganhou");
			resul = "c";
		} else if(tabuleiro[1][0] == 'x' && tabuleiro[1][1] == 'x' && tabuleiro[1][2] == 'x'){
			System.out.print("O jogador 1 ganhou");
			resul = "c";
		}else if(tabuleiro[1][0] == 'o' && tabuleiro[1][1] == 'o' && tabuleiro[1][2] == 'o'){
			System.out.print("O jogador 2 ganhou");
			resul = "c";
		}else if(tabuleiro[2][0] == 'x' && tabuleiro[2][1] == 'x' && tabuleiro[2][2] == 'x'){
			System.out.print("O jogador 1 ganhou");
			resul = "c";
		}else if(tabuleiro[2][0] == 'o' && tabuleiro[2][1] == 'o' && tabuleiro[2][2] == 'o'){
			System.out.print("O jogador 2 ganhou");
			resul = "c";
		}else if(tabuleiro[0][0] == 'x' && tabuleiro[1][0] == 'x' && tabuleiro[2][0] == 'x'){
			System.out.print("O jogador 1 ganhou");
			resul = "c";
		}else if(tabuleiro[0][0] == '0' && tabuleiro[1][0] == '0' && tabuleiro[2][0] == '0'){
			System.out.print("O jogador 2 ganhou");
			resul = "c";
		}else if(tabuleiro[0][1] == 'o' && tabuleiro[1][1] == 'o' && tabuleiro[2][1] == 'o'){
			System.out.print("O jogador 2 ganhou");
			resul = "c";
		}else if(tabuleiro[0][1] == 'x' && tabuleiro[1][1] == 'x' && tabuleiro[2][1] == 'x'){
			System.out.print("O jogador 1 ganhou");
			resul = "c";
		}else if(tabuleiro[0][2] == 'o' && tabuleiro[1][2] == 'o' && tabuleiro[2][2] == 'o'){
			System.out.print("O jogador 2 ganhou");
			resul = "c";
		}else if(tabuleiro[0][2] == 'x' && tabuleiro[1][2] == 'x' && tabuleiro[2][2] == 'x'){
			System.out.print("O jogador 1 ganhou");
			resul = "c";
		}else if(tabuleiro[0][0] == 'o' && tabuleiro[1][1] == 'o' && tabuleiro[2][2] == 'o'){
			System.out.print("O jogador 2 ganhou");
			resul = "c";
		}else if(tabuleiro[0][0] == 'x' && tabuleiro[1][1] == 'x' && tabuleiro[2][2] == 'x'){
			System.out.print("O jogador 1 ganhou");
			resul = "c";
		}else if(tabuleiro[0][2] == 'x' && tabuleiro[1][1] == 'x' && tabuleiro[2][0] == 'x'){
			System.out.print("O jogador 1 ganhou");
			resul = "c";
		}else if(tabuleiro[0][2] == 'o' && tabuleiro[1][1] == 'o' && tabuleiro[2][0] == 'o'){
			System.out.print("O jogador 2 ganhou");
			resul = "c";
		}else if(jogada==10){
			System.out.print("Empatou.");
			resul = "e";
		}
		return resul;
	}
}
