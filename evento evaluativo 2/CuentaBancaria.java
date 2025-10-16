public class CuentaBancaria {
    private String titular;
    private String numeroCuenta;
    double saldo;

    public CuentaBancaria() {
        this.titular = "No Hay Titular";
        this.numeroCuenta = "000000";
        this.saldo = 0.0;
    }

    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;

        } else {
            this.saldo = 0.0;
        }
        if (numeroCuenta != null && numeroCuenta.length() >= 6) {
            this.numeroCuenta = numeroCuenta;
        } else {
            this.numeroCuenta = "000000";
        }
        if (titular != null && !titular.isEmpty()) {
            this.titular = titular;
        } else {
            this.titular = "No Hay Titular";
        }

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular != null && !titular.isEmpty()) {
            this.titular = titular;
        }
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        if (numeroCuenta != null && numeroCuenta.length() >= 6) {
            this.numeroCuenta = numeroCuenta;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo = saldo + monto;
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo = saldo - monto;
        }
    }

    public String tooString() {
        return " titular: " + titular + " Numero de cuenta: " + numeroCuenta + " saldo: " + saldo;
    }
}
