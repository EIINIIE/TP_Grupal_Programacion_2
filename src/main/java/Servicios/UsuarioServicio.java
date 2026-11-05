package Servicios;

import Modelo.Usuario;
import Persistencia.UsuarioDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioServicio {
    private List<Usuario> usuario;
    private UsuarioDAO usuarioDAO;

    public UsuarioServicio() throws SQLException {
        this.usuario = new ArrayList();
        this.usuarioDAO = new UsuarioDAO();
        /// agregar metodo porque /// lo hago para poder guardar el dato a la base de datos
        // cargarUsuario();
    }

    // Metodos

}
