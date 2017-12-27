package bd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.driver.OracleDriver;
import java.sql.*;

/**
 *
 * @author Duoc
 */

public class Conexion {
    private final String USUARIO = "system";
    //Contraseña del usuario de la bd
    private final String PASS = "aws-duoc";
    //SID de la bd, este lo registramos en la instalacion
    private final String SID = "XE";
    //Host donde se encuentra la bd
    private final String HOST = "VDM-PM-03-03.aws.smartcloud.cl";
    //puerto 1521 es el estandar para este tipo de instalaciones
    private final int PUERTO = 1521;
    //Objeto donde se almacenará la conexión
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }
    public void registrarDriver() throws SQLException {
        OracleDriver oracleDriver = new oracle.jdbc.driver.OracleDriver();
        DriverManager.registerDriver(oracleDriver);
    }
    
      public void conectar() throws SQLException {
        if (connection == null || connection.isClosed() == true) {
            String cadenaConexion = "jdbc:oracle:thin:@" + HOST + ":" + PUERTO + ":" + SID;
            registrarDriver();
            connection = DriverManager.getConnection(cadenaConexion, USUARIO, PASS);
           
        }
    }
}
