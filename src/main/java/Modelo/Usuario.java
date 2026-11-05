package Modelo;

public class Usuario {
    private int id_usuario;
    private String nombre;
    private String apellido;
    private String dni;
    private double sueldo; /// ver esto porque lo qgregamos en la clase Cliente
    private String usuario;
    private String contrasena;
    private String cargo; /// ver esto porque lo qgregamos en la clase Cliente

    // Constructor
    public Usuario(int id_usuario, String nombre, String apellido, String dni, double sueldo, String usuario, String contrasena, String cargo) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldo = sueldo;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.cargo = cargo;
    }

    public Usuario(String nombre, String apellido, String dni, double sueldo, String usuario, String contrasena, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldo = sueldo;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.cargo = cargo;
    }

    public Usuario() {
    }

    // Get y Setter
    public int getid_usuario() {
        return id_usuario;
    }

    public void setid_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Metodos

    // To String
    @Override
    public String toString() {
        return "Usuario{" +
                "id_usuario=" + id_usuario +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", sueldo=" + sueldo +
                ", usuario='" + usuario + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
