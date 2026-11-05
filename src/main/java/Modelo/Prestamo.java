package Modelo;

public class Prestamo {
    private int id_prestamo;
    private Cliente cliente;
    private double montoSolicitado;
    private int cantidadCuotas;
    private double interes;
    private double montoTotal;
    private double valorCuota;
    private String fechaSolicitud;
    private String estado;

    // Constructor
    public Prestamo(int id_prestamo, Cliente cliente, double montoSolicitado, int cantidadCuotas, double interes, double montoTotal, double valorCuota, String fechaSolicitud, String estado) {
        this.id_prestamo = id_prestamo;
        this.cliente = cliente;
        this.montoSolicitado = montoSolicitado;
        this.cantidadCuotas = cantidadCuotas;
        this.interes = interes;
        this.montoTotal = montoTotal;
        this.valorCuota = valorCuota;
        this.fechaSolicitud = fechaSolicitud;
        this.estado = estado;
    }

    public Prestamo(Cliente cliente, double montoSolicitado, int cantidadCuotas, double interes, double montoTotal, double valorCuota, String fechaSolicitud, String estado) {
        this.cliente = cliente;
        this.montoSolicitado = montoSolicitado;
        this.cantidadCuotas = cantidadCuotas;
        this.interes = interes;
        this.montoTotal = montoTotal;
        this.valorCuota = valorCuota;
        this.fechaSolicitud = fechaSolicitud;
        this.estado = estado;
    }

    public Prestamo() {
    }

    // Get y Setter
    public int getid_prestamo() {
        return id_prestamo;
    }

    public void setid_prestamo(int id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getMontoSolicitado() {
        return montoSolicitado;
    }

    public void setMontoSolicitado(double montoSolicitado) {
        this.montoSolicitado = montoSolicitado;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public double getValorCuota() {
        return valorCuota;
    }

    public void setValorCuota(double valorCuota) {
        this.valorCuota = valorCuota;
    }

    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(String fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Metodos

    // To String
    @Override
    public String toString() {
        return "Prestamo{" +
                "id_prestamo=" + id_prestamo +
                ", cliente=" + cliente +
                ", montoSolicitado=" + montoSolicitado +
                ", cantidadCuotas=" + cantidadCuotas +
                ", interes=" + interes +
                ", montoTotal=" + montoTotal +
                ", valorCuota=" + valorCuota +
                ", fechaSolicitud='" + fechaSolicitud + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
