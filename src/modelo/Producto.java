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
}
