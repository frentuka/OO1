package org.example;

public class CuentaCorriente extends Cuenta {

    private double saldoDescubierto;

    public CuentaCorriente() {
        super();
        this.saldoDescubierto = 0;
    }

    public void setSaldoDescubierto(double saldoDescubierto) {
        this.saldoDescubierto = saldoDescubierto;
    }

    public double getSaldoDescubierto() {
        return saldoDescubierto;
    }

    @Override
    protected boolean puedeExtraer(double monto) {
        return this.getSaldo() + this.getSaldoDescubierto() <= monto;
    }

}
