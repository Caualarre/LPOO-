package controller;
import java.util.*;

import model.Carro;
public class CarroController {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro(2, "Fiat", "Uno", 2000);

        System.out.println(carro1);
        System.out.println(carro2);

        carro1.setId(1);
        carro1.setMarca("Volkswagen");
        carro1.setModelo("Fox");
        carro1.setAnoFabricacao(2032);
        System.out.println(carro1.getId());
        System.out.println(carro1.getMarca());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getAnoFabricacao());


        carro2.setMarca("Renault");
        carro2.setModelo("Duster");
        carro2.setAnoFabricacao(2013);
        System.out.println(carro2.getId());
        System.out.println(carro2.getMarca());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getAnoFabricacao());

        Carro carro3 = new Carro(3, "ford", "fusca", 1985);
        Carro carro4 = new Carro(3, "ford", "fusca", 1985);
        Carro carro5 = new Carro(4, "fiat", "uno", 2100);

        List<Carro> carrosList = new ArrayList<>();
        carrosList.add(carro1);
        carrosList.add(carro2);
        carrosList.add(carro3);
        carrosList.add(carro4);
        carrosList.add(carro5);
        System.out.println(" List" + carrosList);

        System.out.println();
        Carro carroFind = carrosList.stream().filter(c -> c.getId() == 3).findAny().orElse(null);
        System.out.println(carroFind);

        System.out.println();
        carrosList.sort(Comparator.comparing(Carro::getId).reversed());
        System.out.println(carrosList);

        Map<Integer, Carro> carrosMap = new HashMap<>();
        carrosMap.put(carro1.getId(), carro1);
        carrosMap.put(carro2.getId(), carro2);
        carrosMap.put(carro3.getId(), carro3);
        carrosMap.put(carro4.getId(), carro4);
        carrosMap.put(carro5.getId(), carro5);
        System.out.println(" Map" + carrosMap);

        System.out.println();
        System.out.println(carrosMap.get(carro3.getId()));
    }
    }
