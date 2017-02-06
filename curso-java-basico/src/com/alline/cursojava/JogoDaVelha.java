package com.alline.cursojava;

import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char[][] tabuleiro = new char[3][3];
				
		String resultado = null;
		
		int linha = 0;
		int coluna = 0;
		int jogada = 1;//contar o número de jogadas, apartir da 5 pode der um ganhador
		
		boolean linhaValida = false;
		boolean colunaValida = false;
		boolean jogadaValida=false;
		
		char sinal;
		
		while(resultado == null){
			if(jogada % 2 == 0){
				sinal = 'o';
			}
			else{
				sinal = 'x';
			}
			while(jogadaValida==false){
				while(linhaValida==false){
					System.out.println("Digite a linha que deseja.");
					linha = Integer.parseInt(scan.next());
					if(linha>3 || linha <1){
						System.out.println("Número de linha ou coluna invalido, tente novamente");
						linhaValida = false;
					}else{
						linha = linha-1;
						linhaValida = true;
					}
				}
				while(colunaValida==false){
					System.out.println("Digite a coluna que deseja.");
					coluna = scan.nextInt();
					if(coluna>3 || coluna <1){
						System.out.println("Número de linha ou coluna invalido, tente novamente");
						colunaValida = false;
					}else{
						coluna --;
						colunaValida = true;
					}
				}
				if(tabuleiro[linha][coluna]!= 'x' && tabuleiro[linha][coluna]!= 'o'){
					tabuleiro[linha][coluna] = sinal;
					jogadaValida = true;
					jogada++;
				}else{
					System.out.println("Esta posição já esta preenchida, tente novamente");
					jogadaValida = false;
					linhaValida = false;
					colunaValida = false;
				}
			}
			jogadaValida = false;
			linhaValida = false;
			colunaValida = false;
			
			//como esta o tabuleiro 
			for(int i=0;i<tabuleiro.length;i++){
				for(int j=0;j<tabuleiro[i].length;j++){
					System.out.print(tabuleiro[i][j]);
				}
				System.out.println();
			}
			
			while(jogada>4){
				if(tabuleiro[0][0] == 'x' && tabuleiro[0][1] == 'x' && tabuleiro[0][2] == 'x'){
					System.out.print("O jogador 1 ganhou");
					resultado="c";
				}else if(tabuleiro[0][0] == 'o' && tabuleiro[0][1] == 'o' && tabuleiro[0][2] == 'o'){
					System.out.print("O jogador 2 ganhou");
					resultado="c";
				} else if(tabuleiro[1][0] == 'x' && tabuleiro[1][1] == 'x' && tabuleiro[1][2] == 'x'){
					System.out.print("O jogador 1 ganhou");
					resultado="c";
				}else if(tabuleiro[1][0] == 'o' && tabuleiro[1][1] == 'o' && tabuleiro[1][2] == 'o'){
					System.out.print("O jogador 2 ganhou");
					resultado="c";
				}else if(tabuleiro[2][0] == 'x' && tabuleiro[2][1] == 'x' && tabuleiro[2][2] == 'x'){
					System.out.print("O jogador 1 ganhou");
					resultado="c";
				}else if(tabuleiro[2][0] == 'o' && tabuleiro[2][1] == 'o' && tabuleiro[2][2] == 'o'){
					System.out.print("O jogador 2 ganhou");
					resultado="c";
				}else if(tabuleiro[0][0] == 'x' && tabuleiro[1][0] == 'x' && tabuleiro[2][0] == 'x'){
					System.out.print("O jogador 1 ganhou");
					resultado="c";
				}else if(tabuleiro[0][0] == '0' && tabuleiro[1][0] == '0' && tabuleiro[2][0] == '0'){
					System.out.print("O jogador 2 ganhou");
					resultado="c";
				}else if(tabuleiro[0][1] == 'o' && tabuleiro[1][1] == 'o' && tabuleiro[2][1] == 'o'){
					System.out.print("O jogador 2 ganhou");
					resultado="c";
				}else if(tabuleiro[0][1] == 'x' && tabuleiro[1][1] == 'x' && tabuleiro[2][1] == 'x'){
					System.out.print("O jogador 1 ganhou");
					resultado="c";
				}else if(tabuleiro[0][2] == 'o' && tabuleiro[1][2] == 'o' && tabuleiro[2][2] == 'o'){
					System.out.print("O jogador 2 ganhou");
					resultado="c";
				}else if(tabuleiro[0][2] == 'x' && tabuleiro[1][2] == 'x' && tabuleiro[2][2] == 'x'){
					System.out.print("O jogador 1 ganhou");
					resultado="c";
				}else if(tabuleiro[0][0] == 'o' && tabuleiro[1][1] == 'o' && tabuleiro[2][2] == 'o'){
					System.out.print("O jogador 2 ganhou");
					resultado="c";
				}else if(tabuleiro[0][0] == 'x' && tabuleiro[1][1] == 'x' && tabuleiro[2][2] == 'x'){
					System.out.print("O jogador 1 ganhou");
					resultado="c";
				}else if(tabuleiro[0][2] == 'x' && tabuleiro[1][1] == 'x' && tabuleiro[2][0] == 'x'){
					System.out.print("O jogador 1 ganhou");
					resultado="c";
				}else if(tabuleiro[0][2] == 'o' && tabuleiro[1][1] == 'o' && tabuleiro[2][0] == 'o'){
					System.out.print("O jogador 2 ganhou");
					resultado="c";
				}else if(jogada==10){
					resultado = "e";
					System.out.print("Empatou.");
				}
				break;
			}
			
		}
	}
}