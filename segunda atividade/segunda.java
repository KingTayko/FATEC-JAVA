import java.util.Scanner;
import java.util.Random;
public class segunda
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random random = new Random();
		int num;
		int n = random.nextInt(100);
		
	
		do {
		    System.out.println(" ");
		System.out.print ("Adivinhe um numero de 0 a 100: ");
	     num = ler.nextInt();
	        
		    if (num == n){
		        System.out.println("Você digitou o numero correto");
		    }
		    
		    else if (num < n){
		        System.out.println("Você digitou um numero menor");
		    }
		    
		    else{
		        System.out.println("Você digitou um numero maior");
		    }
		}while(num != n);
	
	
    }
}
