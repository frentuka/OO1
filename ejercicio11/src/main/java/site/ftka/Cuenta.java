package site.ftka;

public abstract class Cuenta {

    private double saldo;

    public Cuenta() {
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        this.saldo+= monto;
    }

    protected void extraerSinControlar(double monto) {
        this.saldo-= monto;
    }

    protected boolean puedeExtraer(double monto) {
        return monto <= this.saldo;
    }

    public boolean extraer(double monto) {
        if (!this.puedeExtraer(monto))
            return false;

        this.extraerSinControlar(monto);
        return true;
    }

    public boolean transferirACuenta(Cuenta cuenta, double monto) {
        if (cuenta != null && this.puedeExtraer(monto)) {
            this.extraer(monto);
            cuenta.depositar(monto);
            return true;
        }

        return false;
    }

}
