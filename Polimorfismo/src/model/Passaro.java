package model;

public class Passaro extends Animal {
    private double z;

    public Passaro() {
    }

    public Passaro(double x, double y, double z) {
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
        // Implemente o desenho de um pássaro aqui
    }

    @Override
    public String toString() {
        return "\nPassaro{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                "} ";
    }
}
