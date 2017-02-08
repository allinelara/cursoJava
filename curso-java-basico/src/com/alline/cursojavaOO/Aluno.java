package com.alline.cursojavaOO;

public class Aluno {
	
	private String nome; 
	private String matricula;
	private int[] nota = new int[4];
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int[] getNota() {
		return nota;
	}
	public void setNota(int[] nota) {
		this.nota = nota;
	}
	
	
}
