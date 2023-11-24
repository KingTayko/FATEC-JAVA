package Banco;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double valor;
		
		Conta c1 = new contaCorrente(101, "Pedro Ricardo", (double) 1500.00, 2000.00);
		Conta c2 = new contaCorrente(102, "Thiago Pereira", (double) 3000.00, 500.00);
		Conta c3 = new contaPoupança(103, "Jason Silva", (double) 525.00);
		
		//Saque e Transferencia com Conta corrente
		System.out.println("Utilizando a Conta 1 (Corrente) numero da conta: "+c1.getNumConta()+"; Titular: "+c1.getTitular()+"; Saldo atual: "+c1.getSaldo());
		System.out.println("Digite o valor a ser sacado: \n");
		valor = scanner.nextDouble();
		c1.Saque(valor);
		System.out.println(c1.getSaldo());
		
		//Transferencia
		System.out.println("Digite o valor a ser transferido: \n");
		valor = scanner.nextDouble();
		c1.Transferir(c2, valor);
		
		//Sacar Transferir e Depositar com conta poupança
		//saque
		System.out.println("\n\nUtilizando a Conta 3 (Poupança) numero da conta: "+c3.getNumConta()+"; Titular: "+c3.getTitular()+"; Saldo atual: "+c3.getSaldo());
		System.out.println("Digite o valor a ser sacado: \n");
		valor = scanner.nextDouble();
		c3.Saque(valor);
		
		//transferencia
		System.out.println("Digite o valor a ser transferido: \n");
		valor = scanner.nextDouble();
		c3.Transferir(c1, valor);
		
		//deposito
		System.out.println("Digite o valor a ser Depositado: \n");
		valor = scanner.nextDouble();
		c3.Depositar(valor);
		System.out.println(c3.getSaldo());
		
		}
		
	}

