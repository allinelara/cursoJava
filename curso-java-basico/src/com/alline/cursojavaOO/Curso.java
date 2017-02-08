package com.alline.cursojavaOO;

public class Curso {
	
	private String nome;
	private String horario;
	private Professor professor;
	private Aluno[] alunos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	public String verificaSituacao(int[] nota){
		String resul = null;
		int media = 0;
		int total = 0;
		for(int i =0;i<nota.length;i++){
			total = total + nota[i];
			media = total/4;
		}
		if(media>=7){
			resul = "Aprovado";
		}else{
			resul = "Reprovado";
		}
		
		return resul;
	}
	
	public int calcularMediaTurma(int[] nota){
		int media = 0;
		int total = 0;
		for(int i =0;i<nota.length;i++){
			total = total + nota[i];
			media = total/4;
		}
		
		return media;
	}
}
