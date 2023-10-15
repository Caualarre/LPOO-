package model;

public class Carro extends Veiculo implements Automovel {
    private int CapacidadeMala;
    private String renavan;
    private String chassi;
    private String placa;

    public Carro(int capacidadeMala, String renavan, String chassi, String placa) {
        CapacidadeMala = capacidadeMala;
        this.renavan = renavan;
        this.chassi = chassi;
        this.placa = placa;
    }
    public Carro(int numeroDeEixos, String propulsao, String marca, String modelo, int dataFab, int capacidadeMala, String renavan, String chassi, String placa) {
        super(numeroDeEixos, propulsao, marca, modelo, dataFab);
        CapacidadeMala = capacidadeMala;
        this.renavan = renavan;
        this.chassi = chassi;
        this.placa = placa;
    }

    @Override
    public String getRenavan() {
        return renavan;
    }

    @Override
    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }

    @Override
    public String getChassi() {
        return chassi;
    }

    @Override
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    @Override
    public String toString() {
        return "Carro" + " " +
                "CapacidadeMala=" + CapacidadeMala +
                ", NumeroDeEixos=" + getNumeroDeEixos() +
                ", Propulsao='" + getPropulsao() + '\'' +
                ", Marca='" + getMarca() + '\'' +
                ", Modelo='" + getModelo() + '\'' +
                ", DataFab=" + getDataFab() +
                ", RENAVAN='" + getRenavan() + '\'' +
                ", Chassi='" + getChassi() + '\'' +
                ", Placa='" + getPlaca() + '\'' +
                '\n';
    }

}
