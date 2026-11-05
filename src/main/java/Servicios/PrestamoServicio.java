package Servicios;

import Modelo.Prestamo;
import Persistencia.PrestamoDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PrestamoServicio {
    private List<Prestamo> prestamo;
    private PrestamoDAO prestamoDAO;

    public PrestamoServicio() throws SQLException {
        prestamo = new ArrayList<>();
        prestamoDAO = new PrestamoDAO();
        /// agregar metodo porque /// lo hago para poder guardar el dato a la base de datos
        //cargarPrestamo();
    }


}
