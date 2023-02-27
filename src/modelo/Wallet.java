package modelo;

import java.util.ArrayList;

public class Wallet {

    private ArrayList<Producto> productos;

    public Wallet() {
        this.productos = new ArrayList<Producto>();
    }

    public void addProducto(Producto producto){
        productos.add(producto);
    }
}
