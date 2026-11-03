package Servicios;

import Modelo.Asesor;
import Persistencia.AsesorDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AsesorServicio {
    private List<Asesor> asesores;
    private AsesorDAO asesorDAO;

    public AsesorServicio() throws SQLException {
        asesores = new ArrayList<>();
        asesorDAO = new AsesorDAO();
        /// agregar metodo porque /// lo hago para poder guardar el dato a la base de datos
        //cargarAsesor);
    }

    // Metodos

}
