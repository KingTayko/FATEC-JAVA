
import java.util.Scanner;

public class oitava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int[] frequencias = new int[10];

        for (int numero : numeros) {
            frequencias[numero - 1]++;
        }

        int numeroMaisFrequente = -1;
        int frequenciaMaisFrequente = -1;
        for (int i = 0; i < frequencias.length; i++) {
            if (frequencias[i] > frequenciaMaisFrequente) {
                numeroMaisFrequente = i + 1;
                frequenciaMaisFrequente = frequencias[i];
            }
        }

        System.out.println("O número mais frequente é " + numeroMaisFrequente + " com frequência " + frequenciaMaisFrequente);
    }
}
