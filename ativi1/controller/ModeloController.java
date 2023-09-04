package controller;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Modelo;

public class ModeloController {
    public static void main(String[] args) {

        Modelo modelo1 = new Modelo();
        Modelo modelo2 = new Modelo(2, "Uno");
        System.out.println(modelo1);
        System.out.println(modelo2);


        modelo1.setId(1);
        modelo1.setDescricao("Fox");
        System.out.println(modelo1.getId());
        System.out.println(modelo1.getDescricao());

        modelo2.setDescricao("Duster");
        System.out.println(modelo2.getId());
        System.out.println(modelo2.getDescricao());

        Modelo modelo3 = new Modelo(3, "Uno");
        Modelo modelo4 = new Modelo(4, "C3");
        Modelo modelo5 = new Modelo(4, "C3");

        List<Modelo> modeloList = new ArrayList<>();
        modeloList.add(modelo1);
        modeloList.add(modelo2);
        modeloList.add(modelo3);
        modeloList.add(modelo4);
        modeloList.add(modelo5);
        System.out.println("\nColeção do tipo List\n" + modeloList);


        System.out.println();
        Modelo ModeloFind = modeloList.stream().filter(c -> c.getId() == 3).findAny().orElse(null);
        System.out.println(ModeloFind);

        System.out.println();
        modeloList.sort(Comparator.comparing(Modelo::getId).reversed());
        System.out.println(modeloList);

        Map<Integer, Modelo> modelosMap = new HashMap<>();
        modelosMap.put(modelo1.getId(), modelo1);
        modelosMap.put(modelo2.getId(), modelo2);
        modelosMap.put(modelo3.getId(), modelo3);
        modelosMap.put(modelo4.getId(), modelo4);
        modelosMap.put(modelo5.getId(), modelo5);
        System.out.println("\nColeção do tipo Map\n" + modelosMap);


        System.out.println();

        System.out.println(modelosMap.get(3));


    }
}
