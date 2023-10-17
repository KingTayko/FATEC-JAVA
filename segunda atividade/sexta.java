import java.util.Random;

public class sexta {
    public static void main(String[] args) {
        Random random = new Random();
        int[] num = new int[10];
        int i = 0;

        for (i = 0; i < num.length; i++) {
            num[i] = random.nextInt(100);
        }

        System.out.println("Array em ordem normal:");
        for (int numero : num) {
            System.out.println(numero);
        }

        System.out.println("Array em ordem reversa:");
        for (i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }
    }
}
