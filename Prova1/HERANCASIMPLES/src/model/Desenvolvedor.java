package model;
public class Desenvolvedor extends Funcionario {
    public Desenvolvedor() {
        super();
    }
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }
    //
    @Override
    public double getBonus(){
        return getSalario() * 0.05;
    }
    @Override
    public String toString() {
        return "\nDesenvolvedor{Nome=" + super.getNome() + " Salário=" + super.getSalario()
                + "}";
    }
}
