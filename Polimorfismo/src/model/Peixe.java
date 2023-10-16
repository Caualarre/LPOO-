package model;

public class Peixe extends Animal {
    private double z;

    public Peixe(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public void mover(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void desenhar() {
        // Implemente o desenho de um peixe aqui
    }

    @Override
    public String toString() {
        return "\nPeixe{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                "} ";
    }
}

