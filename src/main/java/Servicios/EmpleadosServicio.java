package Servicios;

import Modelo.Empleados;
import Persistencia.EmpleadosDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpleadosServicio {
    private List<Empleados> empleados;
    private EmpleadosDAO empleadosDAO;

    public EmpleadosServicio() throws SQLException {
        this.empleados = new ArrayList();
        this.empleadosDAO = new EmpleadosDAO();
        /// agregar metodo porque /// lo hago para poder guardar el dato a la base de datos
        // cargarEmpleado();
    }

    // Metodos

}
