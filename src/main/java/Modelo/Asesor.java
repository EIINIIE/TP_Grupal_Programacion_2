package Modelo;

public class Asesor extends Empleados {
    private int cantidadSolicitudes;

    // Constructor
    public Asesor(int id_empleado, String nombre, String apellido, String dni, double sueldo, String usuario, String contrasena, String cargo, int cantidadSolicitudes) {
        super(id_empleado, nombre, apellido, dni, sueldo, usuario, contrasena, cargo);
        this.cantidadSolicitudes = cantidadSolicitudes;
    }

    public Asesor(String nombre, String apellido, String dni, double sueldo, String usuario, String contrasena, String cargo, int cantidadSolicitudes) {
        super(nombre, apellido, dni, sueldo, usuario, contrasena, cargo);
        this.cantidadSolicitudes = cantidadSolicitudes;
    }

    public Asesor() {
    }

    // Get y Setter
    public int getCantidadSolicitudes() {
        return cantidadSolicitudes;
    }

    public void setCantidadSolicitudes(int cantidadSolicitudes) {
        this.cantidadSolicitudes = cantidadSolicitudes;
    }

    // Metodos

    // To String
    @Override
    public String toString() {
        return "Asesor{" +
                super.toString() +
                "cantidadSolicitudes=" + cantidadSolicitudes +
                '}';
    }
}
