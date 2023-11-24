package Bibilioteca;

public class Professor extends Pessoa {
	private int emp2=0;

	public Professor(String nome, int codigo, int emp2) {
		super(nome, codigo);
		this.emp2 =emp2;
		// TODO Auto-generated constructor stub
	
	
	}

	public int getEmp2() {
		return emp2;
	}

	public void setEmp2(int emp2) {
		this.emp2 = emp2;
	}

}
