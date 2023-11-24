public class Carro {
    private String modelo;
    private String cor;
    private int capacidadeTanque;
    private int nivelGasolina;
    private boolean ligado;
    private int velocidade;

    public Carro(String modelo, String cor, int capacidadeTanque) {
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeTanque = capacidadeTanque;
        this.nivelGasolina = 0;
        this.ligado = false;
        this.velocidade = 0;
    }

    // Métodos de acesso (getters e setters)
    public int getNivelGasolina() {
        return nivelGasolina;
    }

    public void setNivelGasolina(int nivel) {
        if (nivel >= 0 && nivel <= capacidadeTanque) {
            this.nivelGasolina = nivel;
        } else {
            System.out.println("Nível de gasolina inválido!");
        }
    }

    public void ligar() {
        if (!ligado) {
            System.out.println(modelo + " ligado.");
            ligado = true;
        } else {
            System.out.println(modelo + " já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            System.out.println(modelo + " desligado.");
            ligado = false;
        } else {
            System.out.println(modelo + " já está desligado.");
        }
    }

    public void acelerar(int velocidade) {
        if (ligado) {
            if (this.velocidade + velocidade >= 0 && this.velocidade + velocidade <= 180) {
                this.velocidade += velocidade;
                System.out.println("Acelerando para " + this.velocidade + " km/h.");
            } else {
                System.out.println("Velocidade máxima atingida.");
            }
        } else {
            System.out.println("O carro precisa estar ligado para acelerar.");
        }
    }

    public void frear(int velocidade) {
        if (ligado) {
            if (this.velocidade - velocidade >= 0 && this.velocidade - velocidade <= 180) {
                this.velocidade -= velocidade;
                System.out.println("Freando para " + this.velocidade + " km/h.");
            } else {
                System.out.println("O carro está parado.");
            }
        } else {
            System.out.println("O carro precisa estar ligado para frear.");
        }
    }

    public void encherTanque(int valorGasolina) {
        if (ligado) {
            System.out.println("Por favor, desligue o carro antes de abastecer.");
        } else {
            int novoNivel = nivelGasolina + valorGasolina;
            if (novoNivel <= capacidadeTanque) {
                nivelGasolina = novoNivel;
                System.out.println("Tanque abastecido. Novo nível: " + nivelGasolina + " litros.");
            } else {
                System.out.println("Capacidade máxima do tanque atingida.");
            }
        }
    }
}