package Servicios;

import Modelo.Cobrador;
import Persistencia.CobradorDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CobradorServicio {
    private List<Cobrador> cobradores;
    private CobradorDAO cobradorDAO;

    public CobradorServicio() throws SQLException {
        cobradores = new ArrayList<>();
        cobradorDAO = new CobradorDAO();
        /// agregar metodo porque /// lo hago para poder guardar el dato a la base de datos
        //cargarCobradores();
    }

    // Metodos

}
