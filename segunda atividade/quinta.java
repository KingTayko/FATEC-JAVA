import java.util.Random;

public class quinta {
    public static void main(String[] args) {
        Random random = new Random();
        int[] num = new int[30];
        int i = 0;

        for (i = 0; i < num.length; i++) {
            num[i] = random.nextInt(101);
        }

        int numerosImpares = 0;
        for (int numero : num) {
            if (numero % 2 != 0) {
                numerosImpares++;
            }

        }
        System.out.println("Existem " + numerosImpares + " numeros impares neste array");
    }
}
