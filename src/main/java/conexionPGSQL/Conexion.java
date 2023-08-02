package conexionPGSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {

    Connection conectar = null;

    String usuario = "postgres";
    String contrasenia = "root";
    String db = "tpDied";
    String ip = "localhost";
    String puerto = "5432";

    String cadena = "jdbc:postgresql://" + ip + ":" + puerto + "/" + db;

    public Connection establecerConexion() {
        try {
            Class.forName("org.postgresql.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos. Error: " + e.toString());
        }
        return conectar;
    }
}
