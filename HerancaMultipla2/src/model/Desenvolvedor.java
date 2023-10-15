package model;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {

        return 0.0;
    }

    @Override
    public String toString() {
        return "Desenvolvedor " + super.toString() + "\n";
    }
}
