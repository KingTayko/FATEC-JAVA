import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner ler = new Scanner(System.in);
        int escolha = 0;

        System.out.println(" 1-Cadeira\n 2-Piramide do Egito\n 3-Chefe de cozinha\n 4-Galáxia\n 5-Ar-condicionado\n 6-Escultura\n 7-Monitor\n 8-Leão\n 9-Viúva negra\n 10-Pintor\n");
        System.out.print("Selecione uma das opcoes: \n");
        escolha = ler.nextInt();
        ler.nextLine();

        switch(escolha){

            case 1:
            //cadeira:
            cadeira chair = new cadeira();
                chair.marca = "Mobly";
                chair.tamanho = "65 cm";
                chair.cor = "Preto";
                chair.material = "Plastico";
            System.out.println("Atributos do Objeto Cadeira: \n");
                System.out.println("Marca: " + chair.marca);
                System.out.println("Tamanho: " + chair.tamanho);
                System.out.println("Cor: " +  chair.cor);
                System.out.println("Material: " +  chair.material + "\n");

            System.out.println("Funcoes da Cadeira: \n");
            System.out.println("A cadeira esta: ");
                chair.regular();
            System.out.println("\n");
            break;

           
            case 2:
            //Piramide:
            piramideEgito piramide = new piramideEgito();
                piramide.localização = "Mênfis";
                piramide.material = "Calcário, granito, basalto, argamassa e tijolos de barro cozido ";
                piramide.tamanho = "150 m";
                piramide.nomeTumba = "Tutancâmon";
            System.out.println("Atributos do Objeto piramideEgito: \n");
                System.out.println("Localização: " + piramide.localização);
                System.out.println("Material: " + piramide.material);
                System.out.println("Tamanho: " +  piramide.tamanho);
                System.out.println("Nome daTumba: " +  piramide.nomeTumba + "\n");

            System.out.println("Funcoes da piramideEgito: \n");
            System.out.println("A piramideEgito esta: ");
                piramide.sepultar();
            System.out.println("\n");
            break;


            case 3:
            //Chefe:
            chefeCozinha chefe = new chefeCozinha();
                chefe.nome = "Marcos";
                chefe.idade = 30;
                chefe.rg = "5641354-SP";
                chefe.cpf = 552148123;
                chefe.diploma = "DIPLOME DE CUISINE LE CORDON BLEU";
            System.out.println("Atributos do Objeto chefeCozinha: \n");
                System.out.println("Nome: " + chefe.nome);
                System.out.println("Idade: " + chefe.idade);
                System.out.println("RG: " +  chefe.rg);
                System.out.println("CPF: " +  chefe.cpf);
                System.out.println("Diploma: " +  chefe.diploma + "\n");

            System.out.println("Funcoes do chefeCozinha: \n");
            System.out.println("O chefeCozinha esta: ");
                chefe.cozinhar();
                chefe.gerenciarCozinha();
            System.out.println("\n");
            break;

            case 4:
            //Galaxia:
            galaxia gal = new galaxia();
                gal.qtEstrelas = "400 bilhões";
                gal.qPlanetas = "10 trilhões";
                gal.qtSatelitesNat = "214";
            System.out.println("Atributos do Objeto galaxia: \n");
                System.out.println("Quantidade de Estrelas: " + gal.qtEstrelas);
                System.out.println("Quantidade de Planetas: " + gal.qPlanetas);
                System.out.println("Quantidade de Satelites Naturais: " +  gal.qtSatelitesNat + "\n");

            System.out.println("Funcoes da Galáxia: \n");
            System.out.println("A Galáxia esta: ");
                gal.abrigarSistemaSolar();
            System.out.println("\n");
            break;


                case 5:
            //Ar-Condicionado:
            arCondicionado ar = new arCondicionado();
                ar.marca = "LG";
                ar.potencia = "12.000 BTUs";
                ar.tamanho =  "37,5 cm";
            System.out.println("Atributos do Objeto arCondicionado: \n");
                System.out.println("Marca: " + ar.marca);
                System.out.println("Potencia: " + ar.potencia);
                System.out.println("Tamanho: " +  ar.tamanho + "\n");

            System.out.println("Funcoes do Ar-Condicionado: \n");
            System.out.println("O Ar-Condicionado esta: ");
                ar.resfriar();
                ar.aquecer();
            System.out.println("\n");
            break;


                case 6:
            //Escultura:
            escultura esc = new escultura();
                esc.material = "gesso, pedra, madeira, resinas sintéticas, aço, ferro, mármore";
                esc.largura = " 50 centímetros em media";
                esc.altura =  "60 centímetros em media";
            System.out.println("Atributos do Objeto Escultura: \n");
                System.out.println("Material: " + esc.material);
                System.out.println("Largura: " + esc.largura);
                System.out.println("Altura: " +  esc.altura + "\n");

            System.out.println("Funcoes da Escultura: \n");
            System.out.println("A Escultura esta: ");
                esc.expressar();

            System.out.println("\n");
            break;

            case 7:
            //Monitor:
            monitor mon = new monitor();
                mon.marca = "Samsung";
                mon.frequencia = " 480 HZ";
                mon.qtPolegadas =  19.5;
                mon.qtPortasEntrada = 2;
            System.out.println("Atributos do Objeto Monitor: \n");
                System.out.println("Marca: " + mon.marca);
                System.out.println("Frequencia: " + mon.frequencia);
                System.out.println("Quantidade de Polegadas: " + mon.qtPolegadas);
                System.out.println("Quantidade de Portas de entrada: " +  mon.qtPortasEntrada + "\n");

            System.out.println("Funcoes do Monitor: \n");
            System.out.println("O Monitor vai: ");
                
            System.out.println("Ligar: ");
                mon.ligar();
            System.out.println("\nDesligar: ");
                mon.desligar();
            System.out.println("\nImagem: ");
                mon.imagem();
                              
            System.out.println("\n");
            break;

            case 8:
            //Leao:
            leao lion = new leao();
                lion.peso = "190 KG";
                lion.altura = "1.2 m";
                lion.pelagem = "amarela dourada";
            System.out.println("Atributos do Objeto Leao: \n");
                System.out.println("peso: " + lion.peso);
                System.out.println("Altura: " + lion.altura);
                System.out.println("Pelagem: " +  lion.pelagem + "\n");

            System.out.println("Funcoes do Leão: \n");
            System.out.println("O Leão esta: ");

            System.out.println("Rugindo: ");
                lion.rugir();
            System.out.println("\nCaçando: ");    
                lion.cacar();
            System.out.println("\nProcriando: ");
                lion.procriar();
            System.out.println("\n");
            break;


            case 9:
            //Viúva negra
            viuvaNegra viu = new viuvaNegra();
            viu.nacionalidade ="Russa";
            viu.idade = 32;
            viu.altura = 1.60;
            viu.sexo = "Feminino";
            System.out.println("Atributos do Objeto viuvaNegra: \n");

            System.out.println("Nacionalidade: " + viu.nacionalidade);
            System.out.println("Idade: " + viu.idade);
            System.out.println("Altura: " + viu.altura);
            System.out.println("Sexo: " + viu.sexo);


            System.out.println("Funcoes da Viúva Negra: \n");
            System.out.println("A Viúva Negra esta: ");

            System.out.println("Combatendo: ");
                viu.combate();
            System.out.println("Atirando: ");
                viu.atirar();
            System.out.println("Espionando: ");
                viu.espionar();

            System.out.println("\n");        
            break;

            case 10:
            //Pintor
            pintor pin = new pintor();
            pin.altura = 1.77;
            pin.cpf = 458489123;
            pin.idade = 32;
            pin.rg = "5156515-SP";
            pin.nome = "Fernando";
            System.out.println("Atributos do Objeto Pintor: \n");

            System.out.println("Nome: " + pin.nome);
            System.out.println("RG: " + pin.rg);
            System.out.println("CPF: " + pin.cpf);
            System.out.println("Idade: " + pin.idade);
            System.out.println("Altura: " + pin.altura);


            System.out.println("Funcoes do Pintor: \n");
            System.out.println("O Pintor esta: ");

                pin.pintar();

            System.out.println("\n");        
            break;
    }
}

}
