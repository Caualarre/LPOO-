package model;

public class ContaCorrente extends Conta implements Associados {

    private int numCotas;
    public ContaCorrente() {
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
        return "\nContaCorrente" + " " +
                "numCotasumCotas=" + numCotas + " " +
                ", saldo=" + saldo +
                "\n ";
    }


}
