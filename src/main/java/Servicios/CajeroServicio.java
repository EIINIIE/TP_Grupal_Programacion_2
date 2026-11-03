package Servicios;

import Modelo.Cajero;
import Persistencia.CajeroDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CajeroServicio {
    private List<Cajero> cajeros;
    private CajeroDAO cajeroDAO;

    public CajeroServicio() throws SQLException {
        cajeros = new ArrayList<>();
        cajeroDAO = new CajeroDAO();
        /// agregar metodo porque /// lo hago para poder guardar el dato a la base de datos
        //cargarCajero();
    }

    // Metodos

}
