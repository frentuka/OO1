package org.example;

public class CajaDeAhorro extends Cuenta {

    @Override
    public void depositar(double monto) {
        super.depositar(monto - (monto * 0.02));
    }

    @Override
    public boolean extraer(double monto) {
        return super.extraer(monto + (monto * 0.02));
    }

    @Override
    public boolean transferirACuenta(Cuenta cuenta, double monto) {
        if (cuenta != null && this.puedeExtraer(monto + (monto * 0.02))) {
            this.extraer(monto + (monto * 0.02));
            cuenta.depositar(monto);
            return true;
        }

        return false;
    }

}
