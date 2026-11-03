package Modelo;

public class Administrador extends Empleados {
    private int nivelAcceso;

    // Constructor
    public Administrador(int id_empleado, String nombre, String apellido, String dni, double sueldo, String usuario, String contrasena, String cargo, int nivelAcceso) {
        super(id_empleado, nombre, apellido, dni, sueldo, usuario, contrasena, cargo);
        this.nivelAcceso = nivelAcceso;
    }

    public Administrador(String nombre, String apellido, String dni, double sueldo, String usuario, String contrasena, String cargo, int nivelAcceso) {
        super(nombre, apellido, dni, sueldo, usuario, contrasena, cargo);
        this.nivelAcceso = nivelAcceso;
    }

    public Administrador() {
    }

    // Get y Setter
    public int getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(int nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    // Metodos


    // To String
    @Override
    public String toString() {
        return "Administrador{" +
                super.toString() +
                "nivelAcceso=" + nivelAcceso +
                '}';
    }
}
