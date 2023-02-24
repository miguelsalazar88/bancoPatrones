package modelo;

public class Persona {
    private String nombre;
    private String apellido;
    private String correo;
    private String direccion;
    private long cedula;

    public Persona(String nombre, String apellido, String correo, String direccion, long cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.direccion = direccion;
        this.cedula = cedula;
    }
}
