
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Main {
    
    
    public static void main(String[] args) {
        try (Connection con = Conexion.getConexion();
            ResultSet rs = con.createStatement().executeQuery("SELECT * from alumnos");) {
            
            System.out.println(rs);
            
            while (rs.next()) {
                System.out.println(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}