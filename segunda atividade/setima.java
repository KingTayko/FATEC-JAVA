import java.util.Random;

public class setima {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[50];
        int[] contagem = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10);
        }

        for (int numero : numeros) {
            contagem[numero]++;
        }

        System.out.println("Contagem de cada número:");
        for (int i = 0; i < contagem.length; i++) {
            System.out.println((i + 1) + " aparece " + contagem[i] + " vezes");
        }
    }
}
