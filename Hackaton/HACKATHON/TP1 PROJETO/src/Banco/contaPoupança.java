package Banco;

public class contaPoupança extends Conta{
		
	public contaPoupança(int numConta, String titular, Double saldo) {
		super(numConta, titular, saldo);
	}
	@Override
	double Depositar(double valor) {
		if (valor < 0) {
			System.out.println("Valor solicitado é menor ou igual a zero\n Não foi possível fazer o Depositar.");
			return this.saldo;
		}
		else {
			System.out.println("Saldo: "+ saldo +"\n Valor depositado: "+ valor);
			saldo = saldo + valor;
			System.out.println("Saldo após o Depósito"+ saldo);
			return this.saldo;
		}
	}
	
	@Override
	double Saque(double valor) {
		if (saldo < valor) {
			System.out.println("Valor solicitado é maior que o saldo \n Não foi possível fazer o saque.");
			return this.saldo;
		}
		else {
			System.out.println("Saldo: "+ saldo +"\n Valor a ser sacado: "+ (valor * 1.10));
			saldo = saldo - (valor*1.10);
			System.out.println("Saldo após o Saque: "+ saldo);
			return this.saldo;
		}
	}
	@Override
	double Transferir(Conta destino, double valor) {
		if (saldo < valor) {
			System.out.println("Valor solicitado é maior que o saldo ou Limite\n Não foi possível fazer o saque.");
		}
		else {
			System.out.println("Saldo da conta: "+saldo+"\n Saldo da Conta Destino: "+destino.getSaldo()+"\n Valor a ser transferido"+valor);
			saldo = saldo - valor;
			System.out.println("Saldo da conta após transferência: "+saldo);
			destino.Depositar(valor);
			System.out.println("Saldo da conta destino após transferência: "+ destino.getSaldo());
		};
		return this.saldo;
	}
}
