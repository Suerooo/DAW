package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private Conexion() {
    }

    private static final String url = "jdbc:mysql://localhost:3306/instituto";
    private static final String user = "root";
    private static final String pass = "";
    
    public static Connection getConexion() throws SQLException{
        return DriverManager.getConnection(url, user, pass);
    }
}
