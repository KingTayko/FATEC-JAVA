package Bibilioteca;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	Professor p1 = new Professor("Ana",1234,0);
	Aluno a1 = new Aluno("Thiago",5678,0,0);
	Biblioteca b = new Biblioteca();
	
	System.out.println("1-Alugar livro");
	System.out.println("2-Devolucao");
	System.out.println("3-Renovar o Livro");
	int escolha = ler.nextInt();
	
	ler.nextLine();/*limpar cache*/
	
	switch(escolha) {
	case 1:
	System.out.println("Digite a quantidade de livro que deseja alugar: ");
	a1.setEmp(ler.nextInt());
	
	System.out.println("Digite 1 se voce for aluno e 2 se voce for professor");
	int opcao = ler.nextInt();
	
	if(opcao == 1) {
		b.emprestimo(a1);
	}else {
		b.emprestimoProfessor(p1);
	}
	
	break;
	
	
	case 2:
		System.out.println("Digite 1 se voce for aluno e 2 se voce for professor");
		int opcao2 = ler.nextInt();
		
		if(opcao2 == 1) {
			System.out.println("A devolucao esta atrasada em quantos dias ? ");
			a1.setDia(ler.nextInt());
		b.devolucao(a1);}
		else {
			System.out.println("Voce nao esta devendo nada!");
		}
		break;
	
		
		
	case 3:	
		b.rLivro();
		break;
		
		default:
			System.out.println("Opcao nao encontrada!");
			break;
	}
	
	}

}
