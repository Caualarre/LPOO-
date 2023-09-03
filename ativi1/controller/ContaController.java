package controller;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Conta;

public class ContaController {
    public static void main(String[] args) {

        Conta conta1 = new Conta();
        Conta conta2 = new Conta(2, 2000.00);

        System.out.println(conta1);
        System.out.println(conta2);

        conta1.setId(1);
        conta1.deposita(2000.00);
        System.out.println(conta1.getId());
        System.out.println(conta1.getSaldo());

        conta2.deposita(3400.00);
        System.out.println(conta2.getId());
        System.out.println(conta2.getSaldo());

        conta2.saca(1000.00);
        conta2.atualiza(10);
        conta2.saca(6000.00);


        Conta conta3 = new Conta(3, 1000.00);
        Conta conta4 = new Conta(4, 54300.00);
        Conta conta5 = new Conta(4, 54300.00);

        List<Conta> contasList = new ArrayList<>();
        contasList.add(conta1);
        contasList.add(conta2);
        contasList.add(conta3);
        contasList.add(conta4);
        contasList.add(conta5);
        System.out.println("List" + contasList);

        System.out.println();
        Conta ContaFind = contasList.stream().filter(c -> c.getId() == 3).findAny().orElse(null);
        System.out.println(ContaFind);

        System.out.println();
        contasList.sort(Comparator.comparing(Conta::getId).reversed());
        System.out.println(contasList);

        Map<Integer, Conta> contasMap = new HashMap<>();
        contasMap.put(conta1.getId(), conta1);
        contasMap.put(conta2.getId(), conta2);
        contasMap.put(conta3.getId(), conta3);
        contasMap.put(conta4.getId(), conta4);
        contasMap.put(conta5.getId(), conta5);
        System.out.println(" Map" + contasMap);

        System.out.println();
        System.out.println(contasMap.get(3));

    }

}
