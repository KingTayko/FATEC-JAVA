import java.util.Scanner;
public class PrimeiraQuestao{

    public static void main (String[] arg){
        int idade;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();
        
        
        if(idade<18){
            System.out.println("Você é menor de idade");
        }

        else if(idade>=60){
            System.out.println("Você é idoso(a)");
        }

        else{
            System.out.println("Você é adulto(a)");
        }
    }

}