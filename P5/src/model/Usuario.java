package model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private String id;
    private String telefone;
    private List<Corrida> corridas = new ArrayList<>();
    // getters e setters

    public Usuario() {
    }

    public Usuario(String nome, String email, String id, String telefone, List<Corrida> corridas) {
        this.nome = nome;
        this.email = email;
        this.id = id;
        this.telefone = telefone;
        this.corridas = corridas;
    }
    public Usuario(String nome, String email, String id, String telefone) {
        this.nome = nome;
        this.email = email;
        this.id = id;
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Corrida> getCorridas() {
        return corridas;
    }

    public void setCorridas(List<Corrida> corridas) {
        this.corridas = corridas;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", id='" + id + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
