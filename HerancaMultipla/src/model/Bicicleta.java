package model;

public class Bicicleta extends Veiculo {
    private int TamanhoRoda;
    private String Chassi;

    public Bicicleta() {
    }

    public Bicicleta(int numeroDeEixos, String propulsao, String marca, String modelo, int dataFab, int tamanhoRoda, String chassi) {
        super(numeroDeEixos, propulsao, marca, modelo, dataFab);
        TamanhoRoda = tamanhoRoda;
        Chassi = chassi;
    }

    public int getTamanhoRoda() {
        return TamanhoRoda;
    }

    public void setTamanhoRoda(int tamanhoRoda) {
        TamanhoRoda = tamanhoRoda;
    }

    public String getChassi() {
        return Chassi;
    }

    public void setChassi(String chassi) {
        Chassi = chassi;
    }

    @Override
    public String toString() {
        return "Bicicleta" +
                "TamanhoRoda=" + getTamanhoRoda() +
                ", Chassi='" + getChassi() + '\'' +
                ", NumeroDeEixos=" + getNumeroDeEixos() +
                ", Propulsao='" + getPropulsao() + '\'' +
                ", Marca='" + getMarca() + '\'' +
                ", Modelo='" + getModelo() + '\'' +
                ", DataFab=" + getDataFab() +
                '\n';
    }

}
