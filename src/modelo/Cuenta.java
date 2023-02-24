package modelo;

public class Cuenta {

    private Persona titular;
    private long numCuenta;
    private long saldo;

    public Cuenta(long numCuenta, long saldo) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public long getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(long numCuenta) {
        this.numCuenta = numCuenta;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }
}
