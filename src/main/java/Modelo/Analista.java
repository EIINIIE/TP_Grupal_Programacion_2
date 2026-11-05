package Modelo;

public class Analista extends Usuario {
    private int id_Analista;
    private int cantidadPrestamosAnalizados;

    // Constructor
    public Analista(int id_usuario, String nombre, String apellido, String dni, double sueldo, String usuario, String contrasena, String cargo, int cantidadPrestamosAnalizados) {
        super(id_usuario, nombre, apellido, dni, sueldo, usuario, contrasena, cargo);
        this.cantidadPrestamosAnalizados = cantidadPrestamosAnalizados;
    }

    public Analista(String nombre, String apellido, String dni, double sueldo, String usuario, String contrasena, String cargo, int id_Analista, int cantidadPrestamosAnalizados) {
        super(nombre, apellido, dni, sueldo, usuario, contrasena, cargo);
        this.id_Analista = id_Analista;
        this.cantidadPrestamosAnalizados = cantidadPrestamosAnalizados;
    }

    public Analista() {
    }

    // Get y Setter
    public int getId_Analista() {
        return id_Analista;
    }

    public void setId_Analista(int id_Analista) {
        this.id_Analista = id_Analista;
    }

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
                "id_Analista=" + id_Analista +
                ", cantidadPrestamosAnalizados=" + cantidadPrestamosAnalizados +
                '}';
    }
}
