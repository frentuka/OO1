package org.example;

public class Gerente extends EmpleadoJerarquico {

    @Override
    public double montoBasico() {
        return 57000;
    }

    @Override
    public double aportes() {
        return this.montoBasico() * 0.05d;
    }

}
