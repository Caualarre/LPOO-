package controller;

import model.Animal;
import model.Cachorro;
import model.Passaro;
import model.Peixe;

import java.util.ArrayList;
import java.util.List;

public class ControllerDenhamal {
    public static void main(String[] args) {


        // Crie instâncias de cada classe e insira na lista
        Peixe p1 = new Peixe(3, 4, 7);
        Peixe p2 = new Peixe(2, 5, 6);
        Peixe p3 = new Peixe(1, 1, 1);
        Cachorro p4 = new Cachorro(4, 6);
        Cachorro p5 = new Cachorro(7, 7);
        Cachorro p6 = new Cachorro(9, 9);
        Passaro p7 = new Passaro(34, 23, 69);
        Passaro p8 = new Passaro(12, 22, 13);
        Passaro p9 = new Passaro(69, 96, 969);
        List <Animal> animais = new ArrayList<>();
        animais.add(p1);
        animais.add(p2);
        animais.add(p3);
        animais.add(p4);
        animais.add(p5);
        animais.add(p6);
        animais.add(p7);
        animais.add(p8);
        animais.add(p9);
        System.out.println(animais);


        // Animais
        for (Animal animal : animais) {
            System.out.println(animais);
        }
        // Colocando todos no mesmo quadrado
        animais.forEach(a -> {
            a.mover(2, 2);
            a.desenhar();
            System.out.println(a);
        });
        // Reposicionando e desenhando cachorros
        animais.forEach(c -> {
            if (c instanceof Cachorro) {
                c.mover(8.0, 8.0);
                c.desenhar();
                System.out.println(c);
            }});
            // Reposicionando e desenhando passaro e peixe
            animais.forEach(pc -> {
                if(pc instanceof Peixe) {
                    ((Peixe) pc).mover(5.0, 5.0, 5.0);
                    pc.desenhar();
                    System.out.print(pc);
                } else if(pc instanceof Passaro) {
                    if(pc instanceof Passaro) {
                        ((Passaro) pc).mover(5.0, 5.0, 5.0);
                        pc.desenhar();
                        System.out.print(pc);
                    }}}
            );



    }
}


