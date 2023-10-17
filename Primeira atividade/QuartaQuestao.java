import java.util.Scanner;
public class QuartaQuestao{
    public static void main (String[] arg){
        String senha=" ", passe;
        Scanner ler = new Scanner(System.in);

            passe = "python123";
            while(senha != passe)
            {
                System.out.println("Digite a senha: ");
                senha = ler.nextLine();

                    if(senha.equals(passe))
                    {
                        System.out.print("Senha correta, Seja bem vindo!");
                        break;
                    }
                   else
                    {
                       System.out.println("Senha incorreta, tente novamente!");     
                    }
    
            }

        }
}