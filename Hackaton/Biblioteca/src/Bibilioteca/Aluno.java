package Bibilioteca;

public class Aluno extends Pessoa{
	private int emp = 0;
	private int dia;
	public Aluno(String nome, int codigo, int emp, int dia) {
		super(nome, codigo);
		this.emp = emp;
		this.dia = dia;
		
		
	}
	public int getEmp() {
		return emp;
	}
	public void setEmp(int emp) {
		this.emp = emp;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}	
}

	
