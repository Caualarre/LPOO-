package model;
public class GerenteDesenvolvimento extends Gerente{
    public GerenteDesenvolvimento() {
    }
    public GerenteDesenvolvimento(String nome, double salario) {
        super(nome, salario);
    }
    @Override
    public double getBonus(){
        return getSalario() * 0.20;
    }

    @Override
    public String toString() {
        return "GerenteDesenvolvimento " + super.toString() + " Bonus" + getBonus() + "\n";
    }
}
