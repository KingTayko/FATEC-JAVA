import java.util.Random;
import java.util.Scanner;

public class nona {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[25];
        int numeroBusca = 0;
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(101);
        }

        System.out.print("Insira um número: ");
        numeroBusca = ler.nextInt();

        boolean encontrado = false;
        for (int numero : numeros) {
            if (numero == numeroBusca) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O número " + numeroBusca + " está no array.");
        } else {
            System.out.println("O número " + numeroBusca + " não está no array.");
        }
    }
}
