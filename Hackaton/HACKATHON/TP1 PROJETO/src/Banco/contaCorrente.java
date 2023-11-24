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
			System.out.println("Valor solicitado � maior que o saldo ou Limite\n N�o foi poss�vel fazer o saque.");
		}
		else {
			System.out.println("Saldo da conta: "+saldo+"\n Saldo da Conta Destino: "+destino.getSaldo()+"\n Valor a ser transferido"+valor);
			saldo = saldo - valor;
			System.out.println("Saldo da conta ap�s transfer�ncia: "+saldo);
			destino.Depositar(valor);
			System.out.println("Saldo da conta destino ap�s transfer�ncia: "+ destino.getSaldo());
		};
		return this.saldo;
	}
	@Override
	double Saque(double valor) {
		if (saldo < valor) {
			System.out.println("Valor solicitado � maior que o saldo \n N�o foi poss�vel fazer o saque.");
			return this.saldo;
		}
		else {
			System.out.println("Saldo: "+ saldo +"\n Valor a ser sacado: "+ valor);
			saldo = saldo - valor;
			System.out.println("Saldo ap�s o Saque: "+ saldo);
			return this.saldo;
		}
	}
	
}

