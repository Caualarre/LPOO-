package controller;

import model.Corrida;
import model.Motorista;
import model.Usuario;
import model.Veiculo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class UberController {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("1sde2", "2de3","novo",2022);
        Usuario usuario = new Usuario("Ana","ela.email", "1s2a","12098731");
        Motorista motorista = new Motorista("jose", "1zaq3","eas2mail","123460988",veiculo1);


        Corrida corrida = new Corrida();
        corrida.setUsuario(usuario);
        corrida.setMotorista(motorista);
        corrida.setVeiculo(veiculo1);
        corrida.setDataInicio(new Date());

        usuario.getCorridas().add(corrida);
        motorista.getCorridas().add(corrida);

        System.out.println("Corrida realizada com sucesso!");
    }

    public void imprimirCorridasPorUsuario(Usuario usuario) {
        List<Corrida> corridas = usuario.getCorridas();
        Collections.sort(corridas, Comparator.comparing(Corrida::getDataInicio).reversed());

        System.out.println("Corridas do Usuário " + usuario.getNome() + ":");
        for (Corrida corrida : corridas) {
            System.out.println("Data de Início: " + corrida.getDataInicio() + " - Valor: " + corrida.getPreco());
        }
    }

    public void imprimirCorridasPorMotorista(Motorista motorista) {
        List<Corrida> corridas = motorista.getCorridas();
        Collections.sort(corridas, Comparator.comparing(Corrida::getDataInicio).reversed());

        System.out.println("Corridas do Motorista " + motorista.getNome() + ":");
        for (Corrida corrida : corridas) {
            System.out.println("Data de Início: " + corrida.getDataInicio() + " - Valor: " + corrida.getPreco());
        }
    }

    public double calcularValorTotalPorMotorista(Motorista motorista) {
        double total = 0.0;

        for (Corrida corrida : motorista.getCorridas()) {
            total += corrida.getPreco();
        }

        return total;
    }
}
