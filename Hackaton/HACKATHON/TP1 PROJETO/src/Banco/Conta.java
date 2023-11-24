package Banco;
import java.util.Scanner;

public class Conta {
	
		Scanner scanner = new Scanner(System.in);
		protected int numConta;
		protected String titular;
		protected Double saldo;
		
		public Conta (int numConta, String titular, Double saldo) {
			this.numConta = numConta;
			this.titular = titular;
			this.saldo = saldo;
		}
		
		double Saque(double valor) {
			if (saldo < valor) {
				System.out.println("Valor solicitado é maior que o saldo \n Não foi possível fazer o saque.");
				return this.saldo;
			}
			else {
				saldo = saldo - valor;
				return this.saldo;
			}
		}
		double Transferir(Conta destino, double valor) {
			if (saldo < valor) {
				System.out.println("Valor solicitado é maior que o saldo \n Não foi possível fazer o saque.");
			}
			else {
				saldo = saldo - valor;
				destino.Depositar(valor);
			}
			return this.saldo;
		}
		double Depositar(double valor) {
			if (valor < 0) {
				System.out.println("Valor solicitado é menor ou igual a zero\n Não foi possível fazer o Depositar.");
				return this.saldo;
			}
			else {
				System.out.println("Saldo: "+ saldo +"\n Valor depositado: "+ valor);
				saldo = saldo + valor;
				System.out.println("Saldo após o Depósito: "+ saldo);
				return this.saldo;
			}
		}

		public int getNumConta() {
			return numConta;
		}

		public void setNumConta(int numConta) {
			this.numConta = numConta;
		}

		public String getTitular() {
			return titular;
		}

		public void setTitular(String titular) {
			this.titular = titular;
		}

		public Double getSaldo() {
			return saldo;
		}

		public void setSaldo(Double saldo) {
			this.saldo = saldo;
		}
		
		
		
		
}
