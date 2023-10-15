package model;

public class Cliente implements Investidor {
    private String nome;
    private String sobrenome;
    private String ticker;
    private int quant;

    public Cliente(String nome, String sobrenome, String ticker, int quant) {
        this.nome = nome;
        this.sobrenome = sobrenome;
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
    public String toString() {
        return "Cliente nome=" + nome + ", sobrenome=" + sobrenome + ", ticker=" + ticker + ", quant=" + quant + "\n";
    }
}
