package Vendas;

public class Clientes{
	String nomec;
	int cpfc;
	
	Clientes(String nome, int cpf){
		this.nomec = nome;
		this.cpfc = cpf;
	}
	
	void AdicionarProduto(Produtos produto){
		Carrinho car = new Carrinho(produto);
		System.out.println("Adicionado ao carrinho: " + produto.nomep);
		
	}
}
