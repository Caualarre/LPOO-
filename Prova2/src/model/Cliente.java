package model;
public class Cliente implements Associados {
    private String nome;
    private int numCotas;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public double lucros(int numCotas, double valorCota) {
        return numCotas * valorCota;
    }

    public void setNumCotas(int numCotas) {
        this.numCotas = numCotas;
    }

    public int getNumCotas() {
        return numCotas;
    }

    @Override
    public String toString() {
        return "\nCliente" +
                "nome='" + nome + '\'' +
                ", numCotas=" + numCotas +
                '\n';
    }
}


