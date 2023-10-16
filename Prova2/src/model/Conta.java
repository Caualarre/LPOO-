package model;

public abstract class Conta {
    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void atualizar(double taxa) {
        saldo += saldo * taxa;
    }

    public double getSaldo() {
        return saldo;
    }

}
