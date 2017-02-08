package com.alline.cursojavaOO;

import java.util.Scanner;

public class JogarJogoDaVelha {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		
		JogoDaVelha jogoVelha = new JogoDaVelha();
		
		char[][] tabuleiro = new char[3][3];
				
		while(jogoVelha.getResultado() == null){
				
			//definindo qual é o sinal da jogada
			jogoVelha.setSinal(jogoVelha.definirSinal(jogoVelha.getJogada()));
				
			while(jogoVelha.isJogadaValida()==false){
				while(jogoVelha.isLinhaValida()==false){
				
					System.out.println("Digite a linha que deseja.");
					jogoVelha.setLinha(scan.nextInt());
					
					jogoVelha.setLinhaValida(jogoVelha.verificarLinhaValida(jogoVelha.getLinha()));
						
				}
				while(jogoVelha.isColunaValida()==false){
					System.out.println("Digite a coluna que deseja.");
					jogoVelha.setColuna(scan.nextInt());
					
					jogoVelha.setColunaValida(jogoVelha.verificarColunaValida(jogoVelha.getColuna()));
						
				}
				jogoVelha.getTabuleiro();
				if(tabuleiro[jogoVelha.getLinha()][jogoVelha.getColuna()]!= 'x' && tabuleiro[jogoVelha.getLinha()][jogoVelha.getColuna()]!= 'o'){
					tabuleiro[jogoVelha.getLinha()][jogoVelha.getColuna()] = jogoVelha.getSinal();
					jogoVelha.setJogadaValida(true);
					jogoVelha.setJogada(jogoVelha.getJogada()+1);
				}else{
					System.out.println("Esta posição já esta preenchida, tente novamente");
					jogoVelha.setJogadaValida(false);
					jogoVelha.setLinhaValida(false);
					jogoVelha.setColunaValida(false);
					}
				}
				jogoVelha.setJogadaValida(false);
				jogoVelha.setLinhaValida(false);
				jogoVelha.setColunaValida(false);
				
				//como esta o tabuleiro 
				for(int i=0;i<tabuleiro.length;i++){
					for(int j=0;j<tabuleiro[i].length;j++){
						System.out.print(tabuleiro[i][j]);
					}
					System.out.println();
				}
				
				while(jogoVelha.getJogada()>4){
					jogoVelha.setResultado(jogoVelha.verificarGanhador(tabuleiro));
					break;
				}
				
			}
		}
	}