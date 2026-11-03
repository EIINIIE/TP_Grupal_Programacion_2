package Modelo;

public class Empleados {
    private int id_empleado;
    private String nombre;
    private String apellido;
    private String dni;
    private double sueldo;
    private String usuario;
    private String contrasena;
    private String cargo;

    // Constructor
    public Empleados(int id_empleado, String nombre, String apellido, String dni, double sueldo, String usuario, String contrasena, String cargo) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldo = sueldo;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.cargo = cargo;
    }

    public Empleados(String nombre, String apellido, String dni, double sueldo, String usuario, String contrasena, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldo = sueldo;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.cargo = cargo;
    }

    public Empleados() {
    }

    // Get y Setter
    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
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
        return "Empleados{" +
                "id_empleado=" + id_empleado +
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
