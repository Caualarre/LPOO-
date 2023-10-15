package model;
public abstract class Desenvolvedor extends Funcionario {
    public Desenvolvedor() {
        super();
    }
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }
    //
    @Override
    public abstract double getBonus();
    @Override
    public String toString() {
        return "\n Nome=" + super.getNome() + " Salário=" + super.getSalario();
    }
}
