
import java.util.Scanner;
import java.util.Random;

public class quarta {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();
        int[] nums = new int[15];
        int i = 0;

        while (i < nums.length) {
            nums[i] = random.nextInt(100);
            i++;
        }

        int maior = nums[0];
        for (int numero : nums) {
            if (numero > maior) {
                maior = numero;
            }
        }

        int menor = nums[0];
        for (int numero : nums) {
            if (numero < menor) {
                menor = numero;
            }

        }
        System.out.print("O maior numero é: " + maior);
        System.out.println(" ");
        System.out.println("O menor numero é: " + menor);
    }
}
