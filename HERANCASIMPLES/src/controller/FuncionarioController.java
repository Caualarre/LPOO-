package controller;
import model.*;
import java.util.ArrayList;
import java.util.List;
public class FuncionarioController {
    public static void main(String[] args) {
        //Esses com barra não dá para executar mais por ser abstrato, para poder fazer a parte 2
        // Gerente p1 = new Gerente();
   //     Gerente p2 = new Gerente("tais", 1320);
     //   Desenvolvedor t1 = new Desenvolvedor();
     //   Desenvolvedor t2 = new Desenvolvedor("jose", 800);
    //    System.out.println(p1);
      //  System.out.println(p2);
     //   System.out.println(t1);
     //   System.out.println(t2);
     //   p1.setNome("rita");
     //   p1.setSalario(1320);
      //  t1.setNome("alan");
      //  t1.setSalario(800);
      //  System.out.println(p1);
      //  System.out.println(p2);
      //  System.out.println(t1);
       // System.out.println(t2);
      //  System.out.println(p1 + " " + p1.getBonus());
      //  System.out.println(p2 + " " + p2.getBonus());
      //  System.out.println(t1 + " " + t1.getBonus());
       // System.out.println(t2 + " " + t2.getBonus());
        //Respostas as questões discursivas
        //1. Não é possível criar instâncias da classe Funcionario porque ela é abastrata.
        //2. Nas classes de modelo é onde se cria as regras do negocio, como cada um se comporta, então nesse caso seria no Gerente e Desenvolvedor.
        // No controller normalmente se usa para manipular/criar as instâncias conforme as regras definidas no model.

        //parte 2
        //cria os gerentes
        Gerente ger1 = new GerenteGeral("Ana Júlia", 6500.00);
        Gerente ger2 = new GerenteDesenvolvimento("Rafael", 4500.00);
        //cria mais 18 Desenvolvedores
        Desenvolvedor dev1 = new DesenvolvedorSenior("Beatriz", 3500.00);
        Desenvolvedor dev2 = new DesenvolvedorSenior("Ana", 3500.00);
        Desenvolvedor dev3 = new DesenvolvedorSenior("Elis", 3500.00);
        Desenvolvedor dev4 = new DesenvolvedorSenior("João", 3500.00);
        Desenvolvedor dev5 = new DesenvolvedorSenior("Mario", 3500.00);
        Desenvolvedor dev6 = new DesenvolvedorSenior("José", 3500.00);
        Desenvolvedor dev7 = new DesenvolvedorPleno("Júlia", 2500.00);
        Desenvolvedor dev8 = new DesenvolvedorPleno("Paula", 2500.00);
        Desenvolvedor dev9 = new DesenvolvedorPleno("Rafaela", 2500.00);
        Desenvolvedor dev10 = new DesenvolvedorPleno("Denise", 2500.00);
        Desenvolvedor dev11 = new DesenvolvedorPleno("Carlos", 2500.00);
        Desenvolvedor dev12 = new DesenvolvedorPleno("Tomaz", 2500.00);
        Desenvolvedor dev13 = new DesenvolvedorJunior("Cíntia", 1800.00);
        Desenvolvedor dev14 = new DesenvolvedorJunior("Glória", 1800.00);
        Desenvolvedor dev15 = new DesenvolvedorJunior("Caio", 1800.00);
        Desenvolvedor dev16 = new DesenvolvedorJunior("Roberto", 1800.00);
        Desenvolvedor dev17 = new DesenvolvedorJunior("Clara", 1800.00);
        Desenvolvedor dev18 = new DesenvolvedorJunior("Mel", 1800.00);
        List<Funcionario> Funcionariolist = new ArrayList<>();
        Funcionariolist.add(ger1);
        Funcionariolist.add(ger2);
        Funcionariolist.add(dev1);
        Funcionariolist.add(dev2);
        Funcionariolist.add(dev3);
        Funcionariolist.add(dev4);
        Funcionariolist.add(dev5);
        Funcionariolist.add(dev6);
        Funcionariolist.add(dev7);
        Funcionariolist.add(dev8);
        Funcionariolist.add(dev9);
        Funcionariolist.add(dev10);
        Funcionariolist.add(dev11);
        Funcionariolist.add(dev12);
        Funcionariolist.add(dev13);
        Funcionariolist.add(dev14);
        Funcionariolist.add(dev15);
        Funcionariolist.add(dev16);
        Funcionariolist.add(dev17);
        Funcionariolist.add(dev18);
        //sem aumento
        System.out.println(Funcionariolist);
        double acum = 0;
        for (Funcionario f : Funcionariolist) {
            acum += f.getSalario() + f.getBonus();
        }
        for (Funcionario f : Funcionariolist) {
            double novoSalario = f.getSalario() * 1.05;
            f.setSalario(novoSalario);
        }

        double aumentodesal = 0;
        for (Funcionario f : Funcionariolist) {
            aumentodesal += f.getSalario() + f.getBonus();
        }

        //novo valor
        System.out.println("Com aumento de 5%" + Funcionariolist);
    }

    }

