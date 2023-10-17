 import java.util.Scanner;
import java.util.Random;
public class terceira
{
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		Random random = new Random();
    	int[] nums = new int [20];
	    int i= 0;
	    int soma = 0;
	    int media = 0;
	
		while(i<nums.length){
		    nums[i] = random.nextInt(100);
		    i++;
		}
	
		for(int num : nums ){
		    soma += num;
		}
	    
	    media = soma /nums.length;
	    System.out.println("A media é: " + media);
    }
}


