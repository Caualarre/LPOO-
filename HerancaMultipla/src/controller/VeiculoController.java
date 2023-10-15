package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class VeiculoController {
    public static void main(String[] args) {
        // parte 1 do a ao c, criando as instâncias.
        // Bicicletas
        Bicicleta b1 = new Bicicleta(1, "a", "b", "c", 12, 3, "L");
        Bicicleta b2 = new Bicicleta(2, "x", "y", "z", 13, 4, "M");
        Bicicleta b3 = new Bicicleta(3, "p", "q", "r", 14, 5, "N");
        Bicicleta b4 = new Bicicleta(4, "d", "e", "f", 15, 6, "O");
        Bicicleta b5 = new Bicicleta(5, "g", "h", "i", 16, 7, "P");

// Carros
        Carro c1 = new Carro(12, "sa", "ax", "baka", 2023, 24, "duu", "damit","waifu");
        Carro c2 = new Carro(13, "sb", "bx", "senpai", 2023, 23, "daa", "ah","Ikki");
        Carro c3 = new Carro(14, "sc", "cx", "sensei", 2022, 22, "dii", "tite", "kohai");
        Carro c4 = new Carro(15, "sd", "dx", "onii-chan", 2021, 21, "dee", "idi", "imouto");
        Carro c5 = new Carro(16, "se", "ex", "onee-chan", 2020, 20, "dsd", "ede", "otouto");

// Caminhões
        Caminhao a1 = new Caminhao(100, "as", "da", "sa", 22, 313, "sda", "das", "Isa");
        Caminhao a2 = new Caminhao(110, "bs", "db", "sb", 23, 314, "sdb", "dbs", "isb");
        Caminhao a3 = new Caminhao(120, "cs", "dc", "sc", 24, 315, "sdc", "dcs", "isc");
        Caminhao a4 = new Caminhao(130, "ds", "dd", "ss", 25, 316, "sdd", "dds", "dss");
        Caminhao a5 = new Caminhao(140, "es", "de", "se", 26, 317, "sde", "des", "dse");

// Imprimir as instâncias
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);

//parte 2
        //a
        List<Veiculo> Listaveiculo = new ArrayList<>();
        // Adicionar veículos à lista
        Listaveiculo.add(b1);
        Listaveiculo.add(b2);
        Listaveiculo.add(b3);
        Listaveiculo.add(b4);
        Listaveiculo.add(b5);
        Listaveiculo.add(c1);
        Listaveiculo.add(c2);
        Listaveiculo.add(c3);
        Listaveiculo.add(c4);
        Listaveiculo.add(c5);
        Listaveiculo.add(a1);
        Listaveiculo.add(a2);
        Listaveiculo.add(a3);
        Listaveiculo.add(a4);
        Listaveiculo.add(a5);
        System.out.println("todos");
        Listaveiculo.sort(Comparator.comparingInt(Veiculo::getDataFab).reversed());
        for (Veiculo veiculo : Listaveiculo){
            System.out.println(veiculo);
        }
        //b
        List<Veiculo> IPVA = new ArrayList<>();
        //AUTOMOVEIS
        IPVA.add(c1);
        IPVA.add(c2);
        IPVA.add(c3);
        IPVA.add(c4);
        IPVA.add(c5);
        IPVA.add(a1);
        IPVA.add(a2);
        IPVA.add(a3);
        IPVA.add(a4);
        IPVA.add(a5);
        System.out.println("só quem paga IPVA");
        IPVA.sort(Comparator.comparingInt(Veiculo::getDataFab).reversed());
        for (Veiculo auto : IPVA) {
            System.out.println(auto);
        }
        //c

        List<Bicicleta> livre = new ArrayList<>();
        livre.add(b1);
        livre.add(b2);
        livre.add(b3);
        livre.add(b4);
        livre.add(b5);
        System.out.println("livre de pagamento");
        livre.sort(Comparator.comparingInt(Veiculo::getDataFab).reversed());
        for (Veiculo auto : livre) {
            System.out.println(auto);
        }
        System.out.println("só aceitamos veiculos com placas i ou I");
        Listaveiculo.forEach(iI -> {
            if (iI instanceof Automovel) {
                if( ((Automovel) iI).getPlaca().startsWith("I") || ((Automovel) iI).getPlaca().startsWith("i") ) {
                    System.out.print(iI);
                }
            }
        });

    }

}