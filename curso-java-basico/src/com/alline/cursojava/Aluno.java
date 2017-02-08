package com.alline.cursojava;

public class Aluno {
	String nome;
	String matricula;
	String curso;
	int[][] materias = new int[3][2];
	
	String[] verificaSituacao (Aluno aluno){
		String[] sit = new String[3];
		for(int i=0;i<aluno.materias.length;i++){
			for(int j=0;j<aluno.materias[i].length;j++){
				if(aluno.materias[i][j]>=7){
					sit[i] = "Aprovado";
				}else{
					sit[i] = "Reprovado";
				}
			}
			
		}
		return sit;
		
	}
}
