package Servicios;

import Modelo.Analista;
import Persistencia.AnalistaDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AnalistaServicio {
    private List<Analista> analistas;
    private AnalistaDAO analistaDAO;

    public AnalistaServicio() throws SQLException {
        analistas = new ArrayList<>();
        analistaDAO = new AnalistaDAO();
        /// agregar metodo porque /// lo hago para poder guardar el dato a la base de datos
        //cargarAnalistas();
    }

    // Metodos

}
