package Servicios;

import Modelo.Cliente;
import Persistencia.ClienteDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteServicio {
    private List<Cliente> cliente;
    private ClienteDAO clientedao;

    public ClienteServicio() {
        cliente = new ArrayList<>();
        clientedao = new ClienteDAO();
        /// agregar metodo porque /// lo hago para poder guardar el dato a la base de datos
        //cargarCliente();
    }

}

