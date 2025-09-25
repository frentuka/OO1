package site.ftka;

public class Cuadrado extends Figura2D {

    private double lado;

    public Cuadrado() {}

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getPerimetro() {
        return 4 * lado;
    }

    public double getArea() {
        return Math.pow(lado, 2);
    }

    public double getDiagonal() {
        return Math.sqrt(2) * lado;
    }
}