package model;

import java.util.ArrayList;
import java.util.List;

public class Motorista {
    private String nome;
    private String id;
    private String email;
    private String telefone;
    private Veiculo veiculo;
    private List<Corrida> corridas = new ArrayList<>();
    // getters e setters

    public Motorista() {
    }

    public Motorista(String nome, String id, String email, String telefone, Veiculo veiculo, List<Corrida> corridas) {
        this.nome = nome;
        this.id = id;
        this.email = email;
        this.telefone = telefone;
        this.veiculo = veiculo;
        this.corridas = corridas;
    }
    public Motorista(String nome, String id, String email, String telefone, Veiculo veiculo) {
        this.nome = nome;
        this.id = id;
        this.email = email;
        this.telefone = telefone;
        this.veiculo = veiculo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public List<Corrida> getCorridas() {
        return corridas;
    }

    public void setCorridas(List<Corrida> corridas) {
        this.corridas = corridas;
    }

    @Override
    public String toString() {
        return "Motorista{" +
                "nome='" + nome + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", veiculo=" + veiculo +
                '}';
    }
}
