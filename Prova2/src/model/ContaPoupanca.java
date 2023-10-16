package model;

public class ContaPoupanca extends Conta{
    public ContaPoupanca() {
    }

    @Override
    public String toString() {
        return "\nContaPoupanca" + " " +
                "saldo=" + saldo +
                "\n";
    }
}


