package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.ir.annotations.Ignore;
import oracle.jdbc.driver.OracleDriver;

public class ConexionORACLE {

    private final String USUARIO = "SYSTEM";
    private final String PASS = "aws-duoc";
    private final String SID = "XE";
    private final String HOST = "VDM-PM-03-03.aws.smartcloud.cl";

    private final int PUERTO = 1521;

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
            String cadenaConexion = "jdbc:oracle:thin:@" + HOST + ":" + PUERTO + ":" + SID;//VDM-AM-02-04.aws.smartcloud.cl:1521:XE [system on SYSTEM]";
            registrarDriver();
            connection = DriverManager.getConnection(cadenaConexion, USUARIO, PASS);
        }
    }

    public void cerrar() throws SQLException {
        if (connection != null && connection.isClosed() == false) {
            connection.close();
        }
    }

    /**
     * @param args the command line arguments
     * / 
    public static void main(String[] args) {

        ConexionORACLE conexionOracle = new ConexionORACLE();

        try {

            conexionOracle.conectar();
            Connection conn = conexionOracle.getConnection();
            try (Statement stmt = conn.createStatement()) {
                System.out.println("Conexión Establecida!");
                System.out.println("OK");
            }

            try {
                String query = "SELECT * from PELICULAS; ";
                System.out.println("query " + query);
                PreparedStatement buscar = conn.prepareStatement(query);
                ResultSet rs = buscar.executeQuery();

                while (rs.next()) {
                    System.out.println("hola");
                    System.out.println(rs.getString(0));
                }
            } catch (Exception e) {

            }

            conexionOracle.cerrar();
        } catch (SQLException ex) {
            //System.out.println(e.getMessage().toString());
            Logger.getLogger(ConexionORACLE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    * */
}
