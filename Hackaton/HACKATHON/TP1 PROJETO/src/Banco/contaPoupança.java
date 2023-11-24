package Banco;

public class contaPoupan�a extends Conta{
		
	public contaPoupan�a(int numConta, String titular, Double saldo) {
		super(numConta, titular, saldo);
	}
	@Override
	double Depositar(double valor) {
		if (valor < 0) {
			System.out.println("Valor solicitado � menor ou igual a zero\n N�o foi poss�vel fazer o Depositar.");
			return this.saldo;
		}
		else {
			System.out.println("Saldo: "+ saldo +"\n Valor depositado: "+ valor);
			saldo = saldo + valor;
			System.out.println("Saldo ap�s o Dep�sito"+ saldo);
			return this.saldo;
		}
	}
	
	@Override
	double Saque(double valor) {
		if (saldo < valor) {
			System.out.println("Valor solicitado � maior que o saldo \n N�o foi poss�vel fazer o saque.");
			return this.saldo;
		}
		else {
			System.out.println("Saldo: "+ saldo +"\n Valor a ser sacado: "+ (valor * 1.10));
			saldo = saldo - (valor*1.10);
			System.out.println("Saldo ap�s o Saque: "+ saldo);
			return this.saldo;
		}
	}
	@Override
	double Transferir(Conta destino, double valor) {
		if (saldo < valor) {
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
}
