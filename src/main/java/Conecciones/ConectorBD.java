package Conecciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectorBD {
    private static String url = "jdbc:mysql://localhost:3306/TP_Gestion_Prestamo";
    private static String usuario = "root";
    private static String password = "Mellis";

    public static Connection conectar () throws SQLException {
        return DriverManager.getConnection(url, usuario, password);
    }
}
