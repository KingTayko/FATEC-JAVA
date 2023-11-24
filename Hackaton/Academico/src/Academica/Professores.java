package Academica;

public class Professores extends Pessoa{

	private double salario;
	
	public Professores(String nome, String sexo,double salario) {
		super(nome, sexo);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	

	
	
}
