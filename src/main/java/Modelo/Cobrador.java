package Modelo;

public class Cobrador extends Empleados {
    private String zonaAsignada;

    // Constructor
    public Cobrador(int id_empleado, String nombre, String apellido, String dni, double sueldo, String usuario, String contrasena, String cargo, String zonaAsignada) {
        super(id_empleado, nombre, apellido, dni, sueldo, usuario, contrasena, cargo);
        this.zonaAsignada = zonaAsignada;
    }

    public Cobrador(String nombre, String apellido, String dni, double sueldo, String usuario, String contrasena, String cargo, String zonaAsignada) {
        super(nombre, apellido, dni, sueldo, usuario, contrasena, cargo);
        this.zonaAsignada = zonaAsignada;
    }

    public Cobrador() {
    }

    // Get y Setter
    public String getZonaAsignada() {
        return zonaAsignada;
    }

    public void setZonaAsignada(String zonaAsignada) {
        this.zonaAsignada = zonaAsignada;
    }

    // Metodos

    // To String
    @Override
    public String toString() {
        return "Cobrador{" +
                super.toString() +
                "zonaAsignada='" + zonaAsignada + '\'' +
                '}';
    }
}
