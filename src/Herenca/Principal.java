package Herenca;

public class Principal {
	public static void main(String[] arg) {
	Funcionario f1 = new Funcionario();
	
	f1.setNome("Gustavo");
	f1.setIdade(19);
	f1.setSexo("M");
	System.out.println("Funcionario " + f1.toString()+ "\n");
	
	Gerente g1 = new Gerente();
	g1.setNome("Thiago");
	g1.setIdade(18);
	g1.setSexo("M");
	System.out.println("Gerente " + g1.toString() + "\n");
	
	Vendedor v1 = new Vendedor();
	v1.setNome("Fernanda");
	v1.setIdade(18);
	v1.setSexo("F");
	System.out.println("Vendedor(a) " + v1.toString() + "\n");
	
	Faxineiro f2 = new Faxineiro();
	f2.setNome("Marcos");
	f2.setIdade(32);
	f2.setSexo("M");
	System.out.println("Faxineiro " + f2.toString() + "\n");
			
	
			
	}
}
