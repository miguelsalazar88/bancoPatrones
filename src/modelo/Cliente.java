package modelo;

public class Cliente {
    private String nombre;
    private String apellido;
    private String correo;
    private long documento;
    private int clave;
    private Wallet wallet;

    public Cliente(String nombre, String apellido, String correo, long documento, int clave, Wallet wallet) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.documento = documento;
        this.clave = clave;
        this.wallet = wallet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
}
