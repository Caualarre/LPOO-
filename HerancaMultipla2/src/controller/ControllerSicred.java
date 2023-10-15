package controller;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ControllerSicred {
    public static void main(String[] args) {
        //a
        Cliente c1 = new Cliente("EU", "MEU", "MY1", 12000);
        Cliente c2 = new Cliente("TU", "TEU", "SEU2", 1231);
        Cliente c3 = new Cliente("NÓS", "NOSSO", "N0550", 21231);
        Cliente c4 = new Cliente("ELES", "DELES", "D3L35", 8329);
        Cliente c5 = new Cliente("AMOR", "AMADA", "4M4ND0", 3333);
        Cliente c6 = new Cliente("EXTRA", "ARTXE","3XTR4", 6777);
        System.out.println(c1 + "" + c2 + c3 + c4 + c5 + c6);

        Desenvolvedor dev1 = new Desenvolvedor("Elis", 2500.00);
        Desenvolvedor dev2 = new Desenvolvedor("João", 2500.00);
        Desenvolvedor dev3 = new Desenvolvedor("Mario", 2500.00);
        Desenvolvedor dev4 = new Desenvolvedor("José", 2500.00);
        Desenvolvedor dev5 = new Desenvolvedor("Júlia", 2500.00);
        Desenvolvedor dev6 = new Desenvolvedor("Paula", 2500.00);
        System.out.print(dev1 + "" +  dev2 + dev3 + dev4 + dev5 + dev6);


        Gerente ger1 = new Gerente("Ana", 4500.00, "ALUP22", 5050);
        Gerente ger2 = new Gerente("Rafal", 4500.00, "ALUP33", 100);
        Gerente ger3 = new Gerente("Aline", 4500.00, "ALUP44", 100);
        Gerente ger4 = new Gerente("Talita", 4500.00, "ALUP55", 1500);
        Gerente ger5 = new Gerente("Paulo", 6500.00, "ALUP66", 4500);
        Gerente ger6 = new Gerente("Cris", 6000.00, "ALUP77", 400);
        System.out.print("\n" + ger1 + " " +  ger2 + ger3 + ger4 + ger5 + ger6);
//b
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(dev1);
        funcionarios.add(dev2);
        funcionarios.add(dev3);
        funcionarios.add(dev4);
        funcionarios.add(dev5);
        funcionarios.add(dev6);
        funcionarios.add(ger1);
        funcionarios.add(ger2);
        funcionarios.add(ger3);
        funcionarios.add(ger4);
        funcionarios.add(ger5);
        funcionarios.add(ger6);
        System.out.println("trabalhadores" + funcionarios);

        List<Investidor> investidores = new ArrayList<>();
        investidores.add(c1);
        investidores.add(c2);
        investidores.add(c3);
        investidores.add(c4);
        investidores.add(c5);
        investidores.add(c6);
        investidores.add(ger1);
        investidores.add(ger2);
        investidores.add(ger3);
        investidores.add(ger4);
        investidores.add(ger5);
        investidores.add(ger6);
        System.out.print("\n Bora investir que trabalhando não aposenta: " + investidores);

        //c
        funcionarios.sort(Comparator.comparing(Funcionario::getSalario).reversed());
        System.out.print("\n\nLista de funcionários da empresa: " + funcionarios);

        investidores.sort(Comparator.comparing(Investidor::getQuant).reversed());
        investidores.forEach(i -> {
            if(i instanceof Investidor) {
                System.out.print("\n" + i);
            }
    });
        //d
        System.out.println("melhor funcionario e maior investimento");
        Funcionario maiorsal = Collections.max(funcionarios, Comparator.comparing(Funcionario::getSalario));
        funcionarios.forEach(s ->{
            if (s.getSalario() >= maiorsal.getSalario()){
                System.out.println(s);
            }
        });
        Investidor maiorinv = Collections.max(investidores, Comparator.comparing(Investidor::getQuant));
        investidores.forEach(q ->{
            if (q.getQuant() >= maiorinv.getQuant()){
                System.out.println(q);
            }
        });

}
}
