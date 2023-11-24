public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fusca", "Azul", 50);
        carro1.ligar();
        carro1.acelerar(30);
        carro1.frear(10);
        carro1.encherTanque(20);
        carro1.desligar();
    }
}
