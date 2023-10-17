import java.util.Random;
public class primeira
{
	public static void main(String[] args) {
		Random random = new Random();
		int[] num = new int[10];
		int i = 0;

        while(i<10){
            int n = random.nextInt(100);

            if(n%2 == 0){
                num[i] = n;
                i++;
            }
        }
		
        for(int c = 0; c< num.length; c++){
            System.out.println(num[c]);
        }
		
	}
}