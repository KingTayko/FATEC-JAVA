import java.util.Random;
public class decima
{
	public static void main(String[] args) {
        Random random = new Random();
        int numero1;
        int numero2;
        int soma;
        int contagem = 0;

        
        for (int i = 0; i < 100; i++) {
            
            numero1 = random.nextInt(6) + 1;

            
            numero2 = random.nextInt(6) + 1;

            
            soma = numero1 + numero2;

           
            if (soma == 7) {
                contagem++;
            }
        }

        
        System.out.println("A soma foi igual a 7, " + contagem + " vezes.");
	}
}