package Polimorfismo;

public class CompraDesconto extends Compra {
	  @Override
	    public double calcularValor() {
	        return super.calcularValor() - (super.calcularValor() * super.getCupom().getDesconto());
	}
}
