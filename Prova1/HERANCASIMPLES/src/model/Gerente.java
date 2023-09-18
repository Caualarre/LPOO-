package model;
public class Gerente extends Funcionario {
    public Gerente() {
        super();
    }
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    @Override
    public double getBonus(){
        return getSalario() * 0.20;
    }
    @Override
    public String toString() {
        return "\nGerente{nome=" + super.getNome()
                + " Salario=" + super.getSalario() + "}" ;
    }
}