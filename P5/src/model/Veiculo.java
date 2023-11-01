package model;

public class Veiculo {
    private String placa;
    private String id;
    private String tipo;
    private Integer anoFabricacao;
    // getters e setters

    public Veiculo() {
    }

    public Veiculo(String placa, String id, String tipo, Integer anoFabricacao) {
        this.placa = placa;
        this.id = id;
        this.tipo = tipo;
        this.anoFabricacao = anoFabricacao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", id='" + id + '\'' +
                ", tipo='" + tipo + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }
}
