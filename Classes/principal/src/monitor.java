public class monitor {
    double qtPolegadas;
    String marca;
    String frequencia;
    int qtPortasEntrada;
    boolean ligado = false;

    void ligar(){
        System.out.println("Ligando...");
        ligado = true;
        System.out.println("Ligado");
    }

    void desligar(){
        System.out.println("Desligando...");
        ligado = false;
        System.out.println("Desligado");
    }

    void imagem(){
        System.out.println("Mostrando Imagem...");
    }


}
