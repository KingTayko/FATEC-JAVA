package Polimorfismo;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Escolha uma opção:");
    System.out.println("1. Pessoa - Endereço ");
    System.out.println("2. Aluno - Disciplina ");
    System.out.println("3. Compra - Cupom ");
    int escolha = ler.nextInt();

    /*Consumir a nova linha pendente*/
    ler.nextLine();

    switch (escolha) {
        case 1:
            Pessoa p = new Pessoa();
            
            System.out.println("Digite seu nome: ");
            p.setNome(ler.nextLine());
            System.out.println("Digite seu cpf: ");
            p.setCpf(ler.nextInt());
            
            Endereco e = new Endereco();
            ler.nextLine();/*Consumir a nova linha pendente*/
            System.out.println("Digite sua cidade: ");
            e.setCidade(ler.nextLine());
            System.out.println("Digite seu bairro: ");
            e.setBairro(ler.nextLine());
            System.out.println("Digite o numero da sua casa: ");
            e.setNumero(ler.nextInt());
            ler.nextLine();/*Consumir a nova linha pendente*/
            System.out.println("Complemento: ");
            e.setComplemento(ler.nextLine());
            
            
            p.dados();
            e.dados();
            break;
    	 
     case 2:	 
		Aluno al = new Aluno();
		Disciplina d = new Disciplina();
		System.out.println("Digite seu nome: ");
		al.setNome(ler.nextLine());
		System.out.println("Digite sua matricula: ");
		d.setMatricula(ler.nextInt());
		
		ler.nextLine();/*Consumir a nova linha pendente*/
		System.out.println("Nome da discilina: ");
		d.setNome(ler.nextLine());
		
		
		System.out.println("O aluno(a) " + al.getNome() + " tem como numero de matricula " + d.getMatricula());
		
		d.dados();
	
		break;
     
     case 3:
    	 Cupom cupom = new Cupom();
         cupom.setCodigo("CUPOM10");
         cupom.setDesconto(0.1);

         CompraDesconto compra = new CompraDesconto();
         compra.setValor(100.0); 
         compra.setCupom(cupom);

         System.out.println("Valor da compra: " + compra.calcularValor());
         break;
     default:
         System.out.println("Opção inválida!");
    
    }
	}
}

