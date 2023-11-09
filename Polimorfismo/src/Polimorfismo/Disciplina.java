package Polimorfismo;

public class Disciplina {
	private String nome;
	private int matricula;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void dados(){
		System.out.println("Esta cursando: " + getNome());
		
	}

}
