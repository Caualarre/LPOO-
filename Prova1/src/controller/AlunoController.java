package controller;

   //prova
import model.Aluno;

import java.util.*;

public class AlunoController {

    public static void main(String[] args) {
        // 1 parte a
        Aluno p1 = new Aluno();
        Aluno p2 = new Aluno();

        Aluno p3 = new Aluno(5, 945802242, "João", "Silva", "contafalsa@exe.com");
        Aluno p4 = new Aluno(6, 992402723, "Maria", "Santos", "marryme@marryyou.com");

        Aluno p5 = new Aluno(1, 123298507);
        Aluno p6 = new Aluno(2, 124871123);

        System.out.println("printando tudo");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);


        p1.setId(4);
        p1.setCpf(349310024);
        p1.setNome("Ana");
        p1.setSobrenome("Lima");
        p1.setEmail("kadita@mail.com");

        p2.setId(3);
        p2.setCpf(249141590);
        p2.setNome("Pedro");
        p2.setSobrenome("Martins");
        p2.setEmail("Martis@look.com");

        //1 parte b,
        System.out.println(p1.getId() + " " + p1.getCpf() + " " + p1.getNome() + " " + p1.getSobrenome() + " " + p1.getEmail());
        System.out.println(p2.getId() + " " + p2.getCpf() + " " + p2.getNome() + " " + p2.getSobrenome() + " " + p2.getEmail());


        // parte 2
        System.out.println("\n lista sendo criada");
        List<Aluno> listaAluno = new ArrayList<>();
        listaAluno.add(p1);
        listaAluno.add(p2);
        listaAluno.add(p3);
        listaAluno.add(p4);
        listaAluno.add(p5);
        listaAluno.add(p6);
        listaAluno.sort(Comparator.comparingInt(Aluno::getId));

        System.out.println("\n Objetos na lista:");
        for (Aluno aluno : listaAluno) {
            System.out.println(aluno);
        }

        System.out.println("\n map sendo criado");
        Map<Integer, Aluno> AlunosMap = new HashMap<>();
        AlunosMap.put(p1.getId(), p1);
        AlunosMap.put(p2.getId(), p2);
        AlunosMap.put(p3.getId(), p3);
        AlunosMap.put(p4.getId(), p4);
        AlunosMap.put(p5.getId(), p5);
        AlunosMap.put(p6.getId(), p6);
        System.out.println(AlunosMap);

        for (Aluno aluno : listaAluno) {
            if (aluno.getId() == 5) {
                System.out.println("\n Objeto de id 5 da lista: " + aluno);
            }
        }

        Aluno alunosmap = AlunosMap.get(5);
        System.out.println("\n objeto de id 5 do map: " + alunosmap);

        System.out.println("ordem decescente de id");
        listaAluno.sort(Comparator.comparingInt(Aluno::getId).reversed());
        System.out.println(listaAluno);
    }
}




