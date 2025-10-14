package site.ftka;

public class EmpleadoJerarquico extends Empleado {

    public double bonoPorCategoria() {
        return 8000;
    }

    @Override
    public double montoBasico() {
        return 45000;
    }

    @Override
    public double sueldoBasico() {
        return this.montoBasico() + this.bonoPorCategoria();
    }

}