package model;

abstract public class Veiculo {
    private int NumeroDeEixos;
    private String Propulsao;
    private String Marca;
    private String Modelo;
    private int DataFab;

    public Veiculo() {
    }

    public Veiculo(int numeroDeEixos, String propulsao, String marca, String modelo, int dataFab) {
        NumeroDeEixos = numeroDeEixos;
        Propulsao = propulsao;
        Marca = marca;
        Modelo = modelo;
        DataFab = dataFab;

    }

    public int getNumeroDeEixos() {
        return NumeroDeEixos;
    }

    public void setNumeroDeEixos(int numeroDeEixos) {
        NumeroDeEixos = numeroDeEixos;
    }

    public String getPropulsao() {
        return Propulsao;
    }

    public void setPropulsao(String propulsao) {
        Propulsao = propulsao;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getDataFab() {
        return DataFab;
    }

    public void setDataFab(int dataFab) {
        DataFab = dataFab;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "NumeroDeEixos=" + NumeroDeEixos +
                ", Propulsao='" + Propulsao + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", DataFab=" + DataFab +
                '}';
    }
}
