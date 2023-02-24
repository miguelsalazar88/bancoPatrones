package modelo;

public class Empleado extends Persona{

    private String posicion;
    private long salario;

    public Empleado(String nombre, String apellido, String correo, String direccion, long cedula) {
        super(nombre, apellido, correo, direccion, cedula);
    }
}
