package model;

public class Cachorro extends Animal {
    public Cachorro(double x, double y) {
        super(x, y);
    }

    @Override
    public void desenhar() {
        // Implemente o desenho de um cachorro aqui
    }

    @Override
    public String toString() {
        return "\nCachorro{" +
                "x=" + x +
                ", y=" + y +
                "} ";
    }
}
