package Modelo;

public class Cliente extends Usuario {
    private int id_Cliente;
    private String telefono;
    private String email;
    private String direccion;

    // Constructor
    public Cliente(int id_usuario, String nombre, String apellido, String dni, double sueldo, String usuario, String contrasena, String cargo, String telefono, String email, String direccion) {
        super(id_usuario, nombre, apellido, dni, sueldo, usuario, contrasena, cargo);
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }

    public Cliente(String nombre, String apellido, String dni, double sueldo, String usuario, String contrasena, String cargo, int id_Cliente, String telefono, String email, String direccion) {
        super(nombre, apellido, dni, sueldo, usuario, contrasena, cargo);
        this.id_Cliente = id_Cliente;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }

    public Cliente() {
    }

    // Get y Setter
    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Metodos

    // To String
    @Override
    public String toString() {
        return "Cliente{" +
                super.toString() +
                "id_Cliente=" + id_Cliente +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
