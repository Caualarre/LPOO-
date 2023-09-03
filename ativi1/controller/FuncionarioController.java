package controller;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Funcionario;


public class FuncionarioController {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario(2, "eu", 8000.01);


        System.out.println(funcionario1);
        System.out.println(funcionario2);

        funcionario1.setId(1);
        funcionario1.setNome("Pedro");
        funcionario1.setSalario(2500.00);
        System.out.println(funcionario1.getId());
        System.out.println(funcionario1.getNome());

        funcionario1.setNome("Peach");
        funcionario1.setSalario(344500.00);
        System.out.println(funcionario1.getId());
        System.out.println(funcionario1.getNome());

        Funcionario funcionario3 = new Funcionario(3, "José", 2000.00);
        Funcionario funcionario4 = new Funcionario(4, "Gabriela", 3243.99);
        Funcionario funcionario5 = new Funcionario(4, "Gabriela", 3243.99);

        List<Funcionario> funcionariosList = new ArrayList<>();
        funcionariosList.add(funcionario1);
        funcionariosList.add(funcionario2);
        funcionariosList.add(funcionario3);
        funcionariosList.add(funcionario4);
        funcionariosList.add(funcionario5);
        System.out.println("List" + funcionariosList);

        System.out.println();
        Funcionario FuncionarioFind = funcionariosList.stream().filter(c -> c.getId() == 3).findAny().orElse(null);
        System.out.println(FuncionarioFind);

        System.out.println();
        funcionariosList.sort(Comparator.comparing(Funcionario::getId).reversed());
        System.out.println(funcionariosList);

        Map<Integer, Funcionario> FuncionariosMap = new HashMap<>();
        FuncionariosMap.put(funcionario1.getId(), funcionario1);
        FuncionariosMap.put(funcionario2.getId(), funcionario2);
        FuncionariosMap.put(funcionario3.getId(), funcionario3);
        FuncionariosMap.put(funcionario4.getId(), funcionario4);
        FuncionariosMap.put(funcionario5.getId(), funcionario5);
        System.out.println(" Map" + FuncionariosMap);

        System.out.println();
        System.out.println(FuncionariosMap.get(3));
    }

}
