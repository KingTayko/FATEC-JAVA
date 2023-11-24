package Academica;

public class Alunos extends Pessoa {
	private int nmChamada;
	private int nota;
	
	public Alunos(String nome, String sexo,int nmChamada,int nota) {
		super(nome, sexo);
		this.nmChamada = nmChamada;
		this.nota = nota;

	}
	
	public int mens(){
		return 1000;
	}

	public int getNmChamada() {
		return nmChamada;
	}

	public void setNmChamada(int nmChamada) {
		this.nmChamada = nmChamada;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	
	
	
}
