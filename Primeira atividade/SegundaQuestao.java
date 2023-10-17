import java.util.Scanner;
class SegundaQuestao {
    public static void main(String[] args) 
    {

        int n, soma=1, resultado=0;

        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        n = ler.nextInt();

        for(int i=0; i < n; i++){
            soma += 2;
            resultado += soma - 2;
            System.out.print((soma - 2) + "\n");
        }

        System.out.println("A soma dos " + n + " primeiros numeros impares e: " + resultado);
    }
}