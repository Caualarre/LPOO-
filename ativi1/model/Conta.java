package model;

public class Conta {

    private int id;
    private double saldo;

    public Conta() {
    }

    public Conta(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double saldo) {
        this.saldo = saldo;
    }

    public void saca(double valor) {
        System.out.println("\nSaque realizado com sucesso. Saldo atual= " + this.saldo);
    }

    public void atualiza(double taxa) {
        System.out.println("Saldo atualizado pela taxa. Saldo atual=" + this.saldo);
    }

    @Override
    public String toString() {
        return "\nConta [id=" + id + ", saldo=" + saldo + "]";
    }
}

