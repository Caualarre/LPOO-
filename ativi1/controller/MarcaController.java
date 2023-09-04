package controller;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Marca;

public class MarcaController {
    public static void main(String[] args) {

        Marca marca1 = new Marca();
        Marca marca2 = new Marca(2, "Fiat");
        System.out.println(marca1);
        System.out.println(marca2);


        marca1.setId(1);
        marca1.setDescricao("Volkswagen");
        System.out.println(marca1.getId());
        System.out.println(marca1.getDescricao());


        marca2.setDescricao("Renault");
        System.out.println(marca2.getId());
        System.out.println(marca2.getDescricao());

        Marca marca3 = new Marca(3, "Fiat");
        Marca marca4 = new Marca(4, "Citroen");
        Marca marca5 = new Marca(4, "Citroen");

        List<Marca> marcasList = new ArrayList<>();
        marcasList.add(marca1);
        marcasList.add(marca2);
        marcasList.add(marca3);
        marcasList.add(marca4);
        marcasList.add(marca5);
        System.out.println("\nColeção do tipo List\n" + marcasList);


        System.out.println();
        Marca MarcaFind = marcasList.stream().filter(c -> c.getId() == 3).findAny().orElse(null);
        System.out.println(MarcaFind);

        System.out.println();
        marcasList.sort(Comparator.comparing(Marca::getId).reversed());
        System.out.println(marcasList);

        Map<Integer, Marca> marcasMap = new HashMap<>();
        marcasMap.put(marca1.getId(), marca1);
        marcasMap.put(marca2.getId(), marca2);
        marcasMap.put(marca3.getId(), marca3);
        marcasMap.put(marca4.getId(), marca4);
        marcasMap.put(marca5.getId(), marca5);
        System.out.println("\nColeção do tipo Map\n" + marcasMap);


        System.out.println();
        System.out.println(marcasMap.get(3));

    }
}
