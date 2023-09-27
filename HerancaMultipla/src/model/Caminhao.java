package model;

public class Caminhao extends Veiculo implements Automovel {
    private int CapacidadeCarga;
    private String renavan;
    private String chassi;
    private String placa;

    public Caminhao() {
    }

    public Caminhao(int capacidadeCarga, String renavan, String chassi, String placa) {
        CapacidadeCarga = capacidadeCarga;
        this.renavan = renavan;
        this.chassi = chassi;
        this.placa = placa;
    }

    public Caminhao(int numeroDeEixos, String propulsao, String marca, String modelo, int dataFab, int capacidadeCarga, String renavan, String chassi, String placa) {
        super(numeroDeEixos, propulsao, marca, modelo, dataFab);
        CapacidadeCarga = capacidadeCarga;
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

    public int getCapacidadeCarga() {
        return CapacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        CapacidadeCarga = capacidadeCarga;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "CapacidadeCarga=" + CapacidadeCarga +
                ", renavan='" + renavan + '\'' +
                ", chassi='" + chassi + '\'' +
                ", placa='" + placa + '\'' +
                "} " + super.toString();
    }
}
