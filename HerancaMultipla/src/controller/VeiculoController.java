package controller;

import model.Bicicleta;
import model.Caminhao;
import model.Carro;
import model.Veiculo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class VeiculoController {
    public static void main(String[] args) {
        // Bicicletas
        Bicicleta b1 = new Bicicleta(1, "a", "b", "c", 12, 3, "L");
        Bicicleta b2 = new Bicicleta(2, "x", "y", "z", 13, 4, "M");
        Bicicleta b3 = new Bicicleta(3, "p", "q", "r", 14, 5, "N");
        Bicicleta b4 = new Bicicleta(4, "d", "e", "f", 15, 6, "O");
        Bicicleta b5 = new Bicicleta(5, "g", "h", "i", 16, 7, "P");

// Carros
        Carro c1 = new Carro(12, 6, "ax", "baka", "waifu", 2024);
        Carro c2 = new Carro(13, 7, "bx", "senpai", "sakura", 2023);
        Carro c3 = new Carro(14, 8, "cx", "sensei", "kohai", 2022);
        Carro c4 = new Carro(15, 9, "dx", "onii-chan", "imouto", 2021);
        Carro c5 = new Carro(16, 10, "ex", "onee-chan", "otouto", 2020);

// Caminhões
        Caminhao a1 = new Caminhao(100, "as", "da", "sa", 22, 313, "sda", "das", "dsa");
        Caminhao a2 = new Caminhao(110, "bs", "db", "sb", 23, 314, "sdb", "dbs", "dsb");
        Caminhao a3 = new Caminhao(120, "cs", "dc", "sc", 24, 315, "sdc", "dcs", "dsc");
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
        Listaveiculo.sort(Comparator.comparingInt(Veiculo::getDataFab).reversed());
        for (Veiculo veiculo : Listaveiculo){
            System.out.println(veiculo);
        }
    }

}