package Vendas;

public class Carrinho{
double saldo = 0;
	
	void Comprar(Produtos produto) {
		if(saldo >= produto.valorp) {
			System.out.println("voce comprou um produto: " + produto.nomep);	
		}
		else {
			System.out.println("você nao tem dinheiro");
		}
	}
	
	public  Carrinho(Produtos produto){
		this.saldo += produto.valorp;
		
	}
	
}
