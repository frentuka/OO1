package org.example;

public class Empleado {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public double aportes() {
        return 13500;
    }

    public double montoBasico() {
        return 35000;
    }

    public double sueldoBasico() {
        return this.montoBasico() + this.aportes();
    }

}
