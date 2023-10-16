package controller;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class SicredController {
    public static void main(String[] args) {
        // parte 1 a

                // Criar clientes e conta corrente e poupança

                Cliente c1 = new Cliente("João");
                Cliente c2 = new Cliente("Marcos");
                Cliente c3 = new Cliente("Maria");

                ContaCorrente cc1 = new ContaCorrente();
                ContaPoupanca pc1 = new ContaPoupanca();
                ContaCorrente cc2 = new ContaCorrente();
                ContaPoupanca pc2 = new ContaPoupanca();
                ContaCorrente cc3 = new ContaCorrente();
                ContaPoupanca pc3 = new ContaPoupanca();

        //b, coleções criadas
        List<Conta> contas = new ArrayList<>();
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);
        contas.add(pc1);
        contas.add(pc2);
        contas.add(pc3);
        System.out.println(contas);

        List<Associados> associadosList = new ArrayList<>();
        associadosList.add(cc1);
        associadosList.add(cc2);
        associadosList.add(cc3);
        associadosList.add(c1);
        associadosList.add(c2);
        associadosList.add(c3);
        System.out.println(associadosList);



                // Realizar operações nas contas
        //d
                cc1.depositar(500.0);
                cc1.sacar(400.0);
                cc1.atualizar(0.1);
                cc1.setNumCotas(100);
                cc2.setNumCotas(400);
                cc3.setNumCotas(600);
                cc2.depositar(2200);
                cc3.depositar(3450);
                //c
                pc1.depositar(1000.0);
                pc1.sacar(50.0);
                pc1.atualizar(0.05);
                pc2.depositar(2000);
                pc3.depositar(5989);
        System.out.println(pc2);
                //e
                cc1.setNumCotas(100);
                cc2.setNumCotas(400);
                cc3.setNumCotas(600);
                c1.setNumCotas(300);
                c2.setNumCotas(600);
                c3.setNumCotas(600);
        System.out.println(associadosList);
//g
        System.out.println("Associados ordenados por número de cotas em ordem decrescente:");
                associadosList.stream().sorted(Comparator.comparing(ass -> {
                            if (ass instanceof Cliente) {
                                return ((Cliente) ass).getNumCotas();
                            } else if (ass instanceof ContaCorrente) {
                                return ((ContaCorrente) ass).getNumCotas();
                            }
                            return 0;}).reversed()).forEach(ass -> {
                            if (ass instanceof Cliente) {
                                System.out.println("Nome do Associado: " + ((Cliente) ass).getNome() + ", Cotas: " + ((Cliente) ass).getNumCotas());
                            } else if (ass instanceof ContaCorrente) {
                                System.out.println("Nome do Associado: " + ((ContaCorrente) ass) + ", Cotas: " + ((ContaCorrente) ass).getNumCotas());
                            }
                        });


                int maiorNumCotas = associadosList.stream()
                        .map(ass -> {
                            if (ass instanceof Cliente) {
                                return ((Cliente) ass).getNumCotas();
                            } else if (ass instanceof ContaCorrente) {
                                return ((ContaCorrente) ass).getNumCotas();
                            }
                            return 0;
                        })
                        .max(Integer::compareTo)
                        .orElse(0);

                System.out.println("\nAssociados com o maior número de cotas no sistema:");
                associadosList.stream()
                        .filter(ass -> {
                            if (ass instanceof Cliente) {
                                return ((Cliente) ass).getNumCotas() == maiorNumCotas;
                            } else if (ass instanceof ContaCorrente) {
                                return ((ContaCorrente) ass).getNumCotas() == maiorNumCotas;
                            }
                            return false;
                        })
                        .forEach(associado -> {
                            if (associado instanceof Cliente) {
                                System.out.println("Nome do Associado: " + ((Cliente) associado).getNome() + ", Cotas: " + ((Cliente) associado).getNumCotas());
                            } else if (associado instanceof ContaCorrente) {
                                System.out.println("Nome do Associado: " + ((ContaCorrente) associado) + ", Cotas: " + ((ContaCorrente) associado).getNumCotas());
                            }
                        });
        contas.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println("saldo decrescente \n " + contas);

        System.out.println("Conta associada com maior saldo");
        double maiorsala = 0;



        for (Conta c : contas){
            if(c instanceof Associados){
                if (c.getSaldo() > maiorsala){
                    maiorsala = c.getSaldo();
                }
            }
        }
        System.out.println(maiorsala);
}
}
