package model;

public class Gerente extends Funcionario implements Investidor {
    private String ticker;
    private int quant;

    public Gerente(String nome, double salario, String ticker, int quant) {
        super(nome, salario);
        this.ticker = ticker;
        this.quant = quant;
    }

    @Override
    public String getTicker() {
        return ticker;
    }

    @Override
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    @Override
    public int getQuant() {
        return quant;
    }

    @Override
    public void setQuant(int quant) {
        this.quant = quant;
    }

    @Override
    public double getBonus() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Gerente nome=" + getNome() + ", salario=" + getSalario() + ", ticker=" + ticker + ", quant=" + quant + "\n";
    }
}
