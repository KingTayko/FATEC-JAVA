package Polimorfismo;

public class Compra {
	private double valor;
    private Cupom cupom;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Cupom getCupom() {
        return cupom;
    }

    public void setCupom(Cupom cupom) {
        this.cupom = cupom;
    }

    public double calcularValor() {
        return this.valor;
    }
			
}
