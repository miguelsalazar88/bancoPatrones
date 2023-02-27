package modelo;

public class Producto {
    private long idCliente;
    private long idProducto;
    private boolean estado;
    private Double saldo;

    public Producto(long idCliente, long idProducto, Double saldo) {
        this.idCliente = idCliente;
        this.idProducto = idProducto;
        this.estado = true;
        this.saldo = saldo;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(long idProducto) {
        this.idProducto = idProducto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
