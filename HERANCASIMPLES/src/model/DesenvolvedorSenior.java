package model;
public class DesenvolvedorSenior extends Desenvolvedor {
    public DesenvolvedorSenior() {
    }

    public DesenvolvedorSenior(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return "DesenvolvedorSenior " + super.toString() + " Bonus" + getBonus() + "\n";
    }
}