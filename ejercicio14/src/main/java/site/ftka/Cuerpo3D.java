package site.ftka;

public class Cuerpo3D {

    private double altura;
    private Figura2D caraBasal;

    public Cuerpo3D() {}

    public Cuerpo3D(double altura, Figura2D caraBasal) {
        this.altura = altura;
        this.caraBasal = caraBasal;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Figura2D getCaraBasal() {
        return caraBasal;
    }

    public void setCaraBasal(Figura2D caraBasal) {
        this.caraBasal = caraBasal;
    }

    public double getVolumen() {
        return caraBasal.getArea() * altura;
    }

    public double getSuperficieExterior() {
        return (2 * caraBasal.getArea()) + (caraBasal.getPerimetro() * altura);
    }
}
