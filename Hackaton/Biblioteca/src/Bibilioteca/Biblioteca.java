package Bibilioteca;

public class Biblioteca {
	private String autor;
	private String titulo;
	private int numcopias;

	
	
	public void emprestimo(Aluno aluno) {
		if (aluno.getEmp()<=2) {
		System.out.println("Emprestimo feito com sucesso!");
		aluno.setEmp(aluno.getEmp()+1);
		}
		else {
			System.out.println("Voce atingiu o limite maximo de emprestimo");
		}
	}
		
	public void emprestimoProfessor(Professor professor) {
			if (professor.getEmp2()<=10) {
			System.out.println("Emprestimo feito com sucesso!");
			professor.setEmp2(professor.getEmp2()+1);
			}
			else {
				System.out.println("Voce atingiu o limite maximo de emprestimo");
			}
		}
	
		
	public void rLivro() {
			System.out.println("Renovando livro...");
		}
		
	public void devolucao(Aluno aluno) {
			if (aluno.getDia()>7) {
				System.out.println("Voce recebeu uma multa de 100 reais");
			}else {
				System.out.println("Voce AINDA nao tem multa!");
			}
				
		}
	}

