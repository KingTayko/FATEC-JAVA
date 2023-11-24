package Academica;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		
		Professores p1 = new Professores("Thiago", "M", 1000);
		Alunos a1 = new Alunos("Ana", "F",123,0);
		
	
			System.out.println("Digite a nota do aluno " + a1.getNome() + ": ");
			a1.setNota(ler.nextInt()); 
			System.out.println("A nota da aluna " + a1.getNome() + " é " + a1.getNota());


	}

}
