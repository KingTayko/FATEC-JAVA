import java.util.Scanner;
public class TerceiraQuestao {
    public static void main (String[] arg){
        String nomes[] = new String[5];
        int i, j ;
        String nomep, nome;
        Scanner ler = new Scanner(System.in);

        for(i=0; i<5; i++)
        {   
           System.out.print("Digite o " + (i+1) + " nome: ");
           nome = ler.nextLine();
           nomes[i] = nome;  
        }
            System.out.print("Insira o nome que esta procurado: ");
            nomep = ler.nextLine();

                boolean encontrado = false;

                for(j=0; j<5; j++)
                {   
                    //nao sei pq a partir do 2 nome, nao esta funcionando\\
                    //Vi que devo usar booleano
                    
                    if(nomep.equals(nomes[j]))
                    {
                        encontrado = true;
                        break;                        
                    }                     
                                   
                }
                
                if(encontrado)
                {
                    System.out.print("O nome ja se encontra no Banco de Dados");
                }
                else
                {
                    System.out.print("O nome não se encontra no Banco de Dados");
                }
                
    }
}
