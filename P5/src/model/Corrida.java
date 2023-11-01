package model;

import java.util.Date;

public class Corrida {
        private Date dataInicio;
        private String id;
        private String pagamento;
        private String detalhespaga;
        private Date datainicio;
        private double preco;
        private int atributo;
        private Usuario usuario;
        private Motorista motorista;
        private Veiculo veiculo;
        // getters e setters

    public Corrida() {
    }

    public Corrida(Date dataInicio, String id, String pagamento, String detalhespaga, Date datainicio, double preco, int atributo, Usuario usuario, Motorista motorista, Veiculo veiculo) {
        this.dataInicio = dataInicio;
        this.id = id;
        this.pagamento = pagamento;
        this.detalhespaga = detalhespaga;
        this.datainicio = datainicio;
        this.preco = preco;
        this.atributo = atributo;
        this.usuario = usuario;
        this.motorista = motorista;
        this.veiculo = veiculo;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public String getDetalhespaga() {
        return detalhespaga;
    }

    public void setDetalhespaga(String detalhespaga) {
        this.detalhespaga = detalhespaga;
    }

    public Date getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(Date datainicio) {
        this.datainicio = datainicio;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAtributo() {
        return atributo;
    }

    public void setAtributo(int atributo) {
        this.atributo = atributo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public String toString() {
        return "Corrida{" +
                "dataInicio=" + dataInicio +
                ", id='" + id + '\'' +
                ", pagamento='" + pagamento + '\'' +
                ", detalhespaga='" + detalhespaga + '\'' +
                ", datainicio=" + datainicio +
                ", preco=" + preco +
                ", atributo=" + atributo +
                ", usuario=" + usuario +
                ", motorista=" + motorista +
                ", veiculo=" + veiculo +
                '}';
    }
}

