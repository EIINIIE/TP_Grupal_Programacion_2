package Modelo;

public class Cajero extends Empleados {
    private int numeroCaja;

    // Constructor
    public Cajero(int id_empleado, String nombre, String apellido, String dni, double sueldo, String usuario, String contrasena, String cargo, int numeroCaja) {
        super(id_empleado, nombre, apellido, dni, sueldo, usuario, contrasena, cargo);
        this.numeroCaja = numeroCaja;
    }

    public Cajero(String nombre, String apellido, String dni, double sueldo, String usuario, String contrasena, String cargo, int numeroCaja) {
        super(nombre, apellido, dni, sueldo, usuario, contrasena, cargo);
        this.numeroCaja = numeroCaja;
    }

    public Cajero() {
    }

    // Get y Setter
    public int getNumeroCaja() {
        return numeroCaja;
    }

    public void setNumeroCaja(int numeroCaja) {
        this.numeroCaja = numeroCaja;
    }

    // Metodos

    // To String
    @Override
    public String toString() {
        return "Cajero{" +
                super.toString() +
                "numeroCaja=" + numeroCaja +
                '}';
    }
}
