package Servicios;

import Modelo.Administrador;
import Persistencia.AdministradorDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdministradorServicio {
    private List<Administrador> administradores;
    private AdministradorDAO administradorDAO;

    public AdministradorServicio() throws SQLException {
        administradores = new ArrayList<>();
        administradorDAO = new AdministradorDAO();
        /// agregar metodo porque /// lo hago para poder guardar el dato a la base de datos
        // cargarAdminitradores
    }

    // Metodos

}