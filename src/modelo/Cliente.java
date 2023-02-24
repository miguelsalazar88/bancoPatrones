package modelo;

import java.util.ArrayList;

public class Cliente extends Persona {

    private String contrasenia;
    private long saldo;
    private ArrayList<Cuenta> cuentas;

    public Cliente(String nombre, String apellido, String correo, String direccion, long cedula,
                    String contrasenia) {
        super(nombre, apellido, correo, direccion, cedula);
        this.contrasenia = contrasenia;
        this.saldo = 0;

    }

    public void actualizarSaldo(){

    }

    public void agregarCuenta(Cuenta cuenta){
        cuenta.setTitular(this);
        cuentas.add(cuenta);
    }
}
