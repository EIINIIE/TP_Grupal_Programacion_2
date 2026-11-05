package Modelo;

public class Asesor extends Usuario {
    private int id_asesor;
    private int cantidadSolicitudes;

    // Constructor
    public Asesor(int id_usuario, String nombre, String apellido, String dni, double sueldo, String usuario, String contrasena, String cargo, int cantidadSolicitudes) {
        super(id_usuario, nombre, apellido, dni, sueldo, usuario, contrasena, cargo);
        this.cantidadSolicitudes = cantidadSolicitudes;
    }

    public Asesor(String nombre, String apellido, String dni, double sueldo, String usuario, String contrasena, String cargo, int id_asesor, int cantidadSolicitudes) {
        super(nombre, apellido, dni, sueldo, usuario, contrasena, cargo);
        this.id_asesor = id_asesor;
        this.cantidadSolicitudes = cantidadSolicitudes;
    }

    public Asesor() {
    }

    // Get y Setter
    public int getId_asesor() {
        return id_asesor;
    }

    public void setId_asesor(int id_asesor) {
        this.id_asesor = id_asesor;
    }

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
                "id_asesor=" + id_asesor +
                ", cantidadSolicitudes=" + cantidadSolicitudes +
                '}';
    }
}
