package Modelo;

public class Cobrador extends Usuario {
    private int id_Cobrador;
    private String zonaAsignada;

    // Constructor
    public Cobrador(int id_usuario, String nombre, String apellido, String dni, double sueldo, String usuario, String contrasena, String cargo, String zonaAsignada) {
        super(id_usuario, nombre, apellido, dni, sueldo, usuario, contrasena, cargo);
        this.zonaAsignada = zonaAsignada;
    }

    public Cobrador(String nombre, String apellido, String dni, double sueldo, String usuario, String contrasena, String cargo, int id_Cobrador, String zonaAsignada) {
        super(nombre, apellido, dni, sueldo, usuario, contrasena, cargo);
        this.id_Cobrador = id_Cobrador;
        this.zonaAsignada = zonaAsignada;
    }

    public Cobrador() {
    }

    // Get y Setter
    public int getId_Cobrador() {
        return id_Cobrador;
    }

    public void setId_Cobrador(int id_Cobrador) {
        this.id_Cobrador = id_Cobrador;
    }

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
                "id_Cobrador=" + id_Cobrador +
                ", zonaAsignada='" + zonaAsignada + '\'' +
                '}';
    }
}
