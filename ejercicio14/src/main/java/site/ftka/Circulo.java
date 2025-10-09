package site.ftka;

public class Circulo extends Figura2D {

    private double radio;

    public Circulo() {}

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return 2 * radio;
    }

    public void setDiametro() {
        this.radio = getDiametro() / 2;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }


}