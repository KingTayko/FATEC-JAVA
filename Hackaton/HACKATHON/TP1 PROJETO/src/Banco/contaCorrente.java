package Banco;

public class contaCorrente extends Conta {
	double chequeLimite;
	
	public contaCorrente(int numConta, String titular, Double saldo, double chequeLimite) {
		super(numConta, titular, saldo);
		this.chequeLimite = chequeLimite;
	}

	@Override
	double Transferir(Conta destino, double valor) {
		if (saldo < valor || valor > chequeLimite) {
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
	@Override
	double Saque(double valor) {
		if (saldo < valor) {
			System.out.println("Valor solicitado é maior que o saldo \n Não foi possível fazer o saque.");
			return this.saldo;
		}
		else {
			System.out.println("Saldo: "+ saldo +"\n Valor a ser sacado: "+ valor);
			saldo = saldo - valor;
			System.out.println("Saldo após o Saque: "+ saldo);
			return this.saldo;
		}
	}
	
}

