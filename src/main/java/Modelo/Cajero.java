package Modelo;

public class Cajero extends Usuario {
    private int id_cajero;
    private int numeroCaja;

    // Constructor
    public Cajero(int id_usuario, String nombre, String apellido, String dni, double sueldo, String usuario, String contrasena, String cargo, int numeroCaja) {
        super(id_usuario, nombre, apellido, dni, sueldo, usuario, contrasena, cargo);
        this.numeroCaja = numeroCaja;
    }

    public Cajero(String nombre, String apellido, String dni, double sueldo, String usuario, String contrasena, String cargo, int id_cajero, int numeroCaja) {
        super(nombre, apellido, dni, sueldo, usuario, contrasena, cargo);
        this.id_cajero = id_cajero;
        this.numeroCaja = numeroCaja;
    }

    public Cajero() {
    }

    // Get y Setter
    public int getId_cajero() {
        return id_cajero;
    }

    public void setId_cajero(int id_cajero) {
        this.id_cajero = id_cajero;
    }

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
