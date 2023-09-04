package controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Automovel;

public class AutomovelController {
    public static void main(String[] args) {

        Automovel veiculo1 = new Automovel();
        Automovel veiculo2 = new Automovel("22", "IVV2222", "branco", 4, "álcool/gasolina", 0, "22", 20.00);

        System.out.println(veiculo1);
        System.out.println(veiculo2);


        veiculo1.setRenavan("1111");
        veiculo1.setPlaca("IVV1111");
        veiculo1.setCor("branco");
        veiculo1.setCombustivel("álcool/gasolina");
        veiculo1.setQuilometragem(0);
        veiculo1.setChassi("1111");
        veiculo1.setValor_locacao(110.00);
        System.out.println(veiculo1.getRenavan());
        System.out.println(veiculo1.getPlaca());
        System.out.println(veiculo1.getCor());
        System.out.println(veiculo1.getCombustivel());
        System.out.println(veiculo1.getQuilometragem());
        System.out.println(veiculo1.getChassi());
        System.out.println(veiculo1.getValor_locacao());

        veiculo2.setRenavan("2222");
        veiculo2.setPlaca("IVV2222");
        veiculo2.setCor("branco");
        veiculo2.setCombustivel("álcool/gasolina");
        veiculo2.setQuilometragem(0);
        veiculo2.setChassi("2222");
        veiculo2.setValor_locacao(120.00);
        System.out.println(veiculo2.getRenavan());
        System.out.println(veiculo2.getPlaca());
        System.out.println(veiculo2.getCor());
        System.out.println(veiculo2.getCombustivel());
        System.out.println(veiculo2.getQuilometragem());
        System.out.println(veiculo2.getChassi());
        System.out.println(veiculo2.getValor_locacao());


        Automovel veiculo3 = new Automovel("3333", "IVV3333", "branco", 4, "álcool/gasolina", 0, "3333", 130.00);
        Automovel veiculo4 = new Automovel("4444", "IVV4444", "branco", 4, "álcool/gasolina", 0, "4444", 140.00);
        Automovel veiculo5 = new Automovel("4444", "IVV4444", "branco", 4, "álcool/gasolina", 0, "4444", 140.00);

        List<Automovel> veiculosList = new ArrayList<>();
        veiculosList.add(veiculo1);
        veiculosList.add(veiculo2);
        veiculosList.add(veiculo3);
        veiculosList.add(veiculo4);
        veiculosList.add(veiculo5);
        System.out.println("\nColeção do tipo List\n" + veiculosList);

        System.out.println();
        Automovel ModeloFind = veiculosList.stream().filter(c -> c.getRenavan().equals("3333")).findAny().orElse(null);
        System.out.println(ModeloFind);

        System.out.println();
        veiculosList.sort(Comparator.comparing(Automovel::getRenavan).reversed());
        System.out.println(veiculosList);

        Map<String, Automovel> veiculosMap = new HashMap<>();
        veiculosMap.put(veiculo1.getRenavan(), veiculo1);
        veiculosMap.put(veiculo2.getRenavan(), veiculo2);
        veiculosMap.put(veiculo3.getRenavan(), veiculo3);
        veiculosMap.put(veiculo4.getRenavan(), veiculo4);
        veiculosMap.put(veiculo5.getRenavan(), veiculo5);
        System.out.println("\nColeção do tipo Map\n" + veiculosMap);


        System.out.println();
        System.out.println(veiculosMap.get("3333"));

    }
}
