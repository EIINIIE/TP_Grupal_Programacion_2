package Modelo;

public class Analista extends Empleados {
    private int cantidadPrestamosAnalizados;

    // Constructor
    public Analista(int id_empleado, String nombre, String apellido, String dni, double sueldo, String usuario, String contrasena, String cargo, int cantidadPrestamosAnalizados) {
        super(id_empleado, nombre, apellido, dni, sueldo, usuario, contrasena, cargo);
        this.cantidadPrestamosAnalizados = cantidadPrestamosAnalizados;
    }

    public Analista(String nombre, String apellido, String dni, double sueldo, String usuario, String contrasena, String cargo, int cantidadPrestamosAnalizados) {
        super(nombre, apellido, dni, sueldo, usuario, contrasena, cargo);
        this.cantidadPrestamosAnalizados = cantidadPrestamosAnalizados;
    }

    public Analista() {
    }

    // Get y Setter
    public int getCantidadPrestamosAnalizados() {
        return cantidadPrestamosAnalizados;
    }

    public void setCantidadPrestamosAnalizados(int cantidadPrestamosAnalizados) {
        this.cantidadPrestamosAnalizados = cantidadPrestamosAnalizados;
    }

    // Metodos

    // To String
    @Override
    public String toString() {
        return "Analista{" +
                super.toString() +
                "cantidadPrestamosAnalizados=" + cantidadPrestamosAnalizados +
                '}';
    }
}
