import java.util.Scanner;

class Disciplina {
    String nome;
    double p1, p2, trabalho;

    Disciplina(String nome) {
        this.nome = nome;
    }

    void lerNotas() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota da P1: ");
        p1 = scanner.nextDouble();
        System.out.print("Digite a nota da P2: ");
        p2 = scanner.nextDouble();
        System.out.print("Digite a nota do trabalho: ");
        trabalho = scanner.nextDouble();
    }

    double calcularMedia() {
        return (p1 + p2 + trabalho) / 3;
    }
}

public class QuintaQuestao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de disciplinas: ");
        int quantidadeDisciplinas = scanner.nextInt();

        System.out.print("Digite a média para aprovação: ");
        double mediaAprovacao = scanner.nextDouble();

        Disciplina[] disciplinas = new Disciplina[quantidadeDisciplinas];

        for (int i = 0; i < quantidadeDisciplinas; i++) {
            System.out.print("Digite o nome da disciplina " + (i + 1) + ": ");
            String nomeDisciplina = scanner.next();
            disciplinas[i] = new Disciplina(nomeDisciplina);
            disciplinas[i].lerNotas();
        }

        System.out.println("\nBoletim do Aluno:\n");

        for (Disciplina disciplina : disciplinas) {
            double media = disciplina.calcularMedia();
            String status = media >= mediaAprovacao ? "Aprovado" : "Reprovado";

            System.out.println("Disciplina: " + disciplina.nome);
            System.out.println("Média: " + media);
            System.out.println("Status: " + status);
            System.out.println();
        }
    }
}
