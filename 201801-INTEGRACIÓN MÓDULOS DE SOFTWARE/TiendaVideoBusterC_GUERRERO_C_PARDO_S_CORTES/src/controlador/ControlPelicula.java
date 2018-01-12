
package controlador;
import modelo.Pelicula; //EEl registroL objeto Factura
import conexion.Conexion; //La Conexion
import java.sql.Connection; //Driver de Oracle
import java.sql.ResultSet; //Sentencia Sql
import java.sql.PreparedStatement; // El Registro
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Categoria;
/**
 *
 * @author Duoc
 */
public class ControlPelicula {
    
   public Pelicula buscarPorCodigo(int numero){
       Pelicula pelicula=null;//definimos factura vacía
       Conexion conexionOracle = new Conexion();
       try {
           conexionOracle.conectar();
           Connection conexion = conexionOracle.getConnection(); // Establece Conexion
           String query ="SELECT * FROM PELICULA WHERE CODIGO=?";
           PreparedStatement buscar = conexion.prepareStatement(query);
           buscar.setInt(1, numero); //Pasamos el parametro
           ResultSet rs = buscar.executeQuery();
           while (rs.next()){
             pelicula = new Pelicula();
             pelicula.setCodigo(rs.getInt("codigo"));
             pelicula.setPrecio(rs.getInt("precio"));
             pelicula.setIdcategoria(rs.getInt("idcategoria"));
             pelicula.setFormato4k(rs.getString("formato4k"));
             pelicula.setNombre(rs.getString("nombre"));
       }
       conexion.close();
       } catch (Exception e) {
           System.out.println("Error");
       }
       return pelicula;
   }
   
   public ResultSet listarTodasPeliculas() throws SQLException {
        
        Conexion conexionOracle = new Conexion();
        conexionOracle.conectar();
        Connection conexion = conexionOracle.getConnection(); // Establece Conexion
        Statement st;
        ResultSet rs = null;
        try {
            st = conexion.createStatement();
            rs = st.executeQuery("SELECT * FROM PELICULA");
        } catch (SQLException e) {

        }
        return rs;
    }
   
    public ResultSet listarPeliculasRomance() throws SQLException {
        
        Conexion conexionOracle = new Conexion();
        conexionOracle.conectar();
        Connection conexion = conexionOracle.getConnection(); // Establece Conexion
        Statement st;
        ResultSet rs = null;
        try {
            st = conexion.createStatement();
            rs = st.executeQuery("SELECT * FROM PELICULA WHERE IDCATEGORIA=6");
        } catch (SQLException e) {

        }
        return rs;
    }
    
     public ResultSet listarPeliculasPorPrecio() throws SQLException {
        
        Conexion conexionOracle = new Conexion();
        conexionOracle.conectar();
        Connection conexion = conexionOracle.getConnection(); // Establece Conexion
        Statement st;
        ResultSet rs = null;
        try {
            st = conexion.createStatement();
            rs = st.executeQuery("SELECT * FROM PELICULA WHERE PRECIO>2000");
        } catch (SQLException e) {

        }
        return rs;
    }
   public boolean modificarPelicula(int numero, Pelicula pelicula) {
       try {
            Conexion conexion = new Conexion();
            conexion.conectar();
            Connection conect = conexion.getConnection();
            String query = "UPDATE PELICULA SET  PRECIO=?, IDCATEGORIA=?, FORMATO4K=?, NOMBRE=? where codigo=?";
             PreparedStatement pel = conect.prepareStatement(query);
                pel.setInt(5, numero);
                pel.setInt(1, pelicula.getPrecio());
                pel.setInt(2, pelicula.getIdcategoria());
                pel.setString(3, pelicula.getFormato4k());
                pel.setString(4, pelicula.getNombre());
                if (pel.executeUpdate() > 0) {
                   return true;
                   
                } else {
                    conexion.cerrar();
                    pel.close();
                }
        } catch (Exception e) {
            System.out.println("Error al Actualizar Pelicula: " + e.getMessage());    
            
        } 
        return false;
   }
   
   public boolean eliminarPelicula(int numero){
       try {
           Conexion conexion = new Conexion();
           conexion.conectar();
           Connection conect = conexion.getConnection();
           String query = "DELETE FROM PELICULA WHERE CODIGO=?";
           PreparedStatement pel = conect.prepareStatement(query);
           pel.setInt(1, numero);
           if (pel.executeUpdate() > 0) {
                   return true;
                } else {
                    conexion.cerrar();
                    pel.close();
                }
       } catch (Exception e) {
           System.out.println("Error al Eliminar Pelicula: " + e.getMessage());
       }
       return false;
    }
   
     public boolean eliminarPeliculaPorPrecio(int precio){
       try {
           Conexion conexion = new Conexion();
           conexion.conectar();
           Connection conect = conexion.getConnection();
           String query = "DELETE * FROM PELICULA WHERE PRECIO>?";
           System.out.println("precio "+precio);
           PreparedStatement pel = conect.prepareStatement(query);
           pel.setInt(1, precio);
           if (pel.executeUpdate() > 0) {
                   return true;
                } else {
                    conexion.cerrar();
                    pel.close();
                }
       } catch (Exception e) {
           System.out.println("Error al Eliminar Pelicula: " + e.getMessage());
       }
       return false;
    }
     
    public boolean agregarP(){
            try {
               Conexion conexion = new Conexion();
                conexion.conectar();
                Connection conect = conexion.getConnection();
                String query = "UPDATE PELICULA SET NOMBRE=CONCAT('P',NOMBRE)";
                PreparedStatement pel = conect.prepareStatement(query);
                if (pel.executeUpdate() > 0) {
                    return true;
                } else {
                    conexion.cerrar();
                    pel.close();
                }
        } catch (Exception e) {
        }
       return false;
                
    }
    public boolean agregarPelicula(Pelicula pelicula) {
        try {
            
            if (verificaPelicula(pelicula.getCodigo()) == false) {
                Conexion conexion = new Conexion();
                conexion.conectar();
                Connection conect = conexion.getConnection();
                String query = "INSERT INTO PELICULA (codigo, precio, idcategoria, formato4k, nombre) VALUES(?,?,?,?,?)";
                PreparedStatement pel = conect.prepareStatement(query);
                pel.setInt(1, pelicula.getCodigo());
                pel.setInt(2, pelicula.getPrecio());
                pel.setInt(3, pelicula.getIdcategoria());
                pel.setString(4, pelicula.getFormato4k());
                pel.setString(5, pelicula.getNombre());
                if (pel.executeUpdate() > 0) {
                    return true;
                } else {
                    conexion.cerrar();
                    pel.close();
                }

            } else {
                   
                    JOptionPane.showMessageDialog(null, "El Codigo de Pelicula ya existe");
                  
            }
        } catch (Exception e) {
                 System.out.println("Error en Agregar Pelicula: " + e.getMessage());
                  
        }
        return false;
    }
   
    public boolean verificaPelicula(int numero) {
        System.out.println("codigo de busqueda "+numero);
        boolean variable=false;
        try {
            Conexion conexion = new Conexion();
            conexion.conectar();
            Connection conect = conexion.getConnection();
            String query = "SELECT COUNT(CODIGO) AS CONTADOR FROM PELICULA WHERE CODIGO=?";
            
            PreparedStatement buscar = conect.prepareStatement(query);
            buscar.setInt(1, numero);
            ResultSet rs = buscar.executeQuery();
            
            if (rs.next()) {
                if (rs.getInt("CONTADOR") > 0) {
                   
                    return true;
                } else {
                    conexion.cerrar();
                   
                }
            } else {
                conexion.cerrar();
              
            }
        } catch (Exception e) {
            System.out.println("Error en Verificar Pelicula: " + e.getMessage());
            
        }
        return false;
    } 
    
     public boolean agregarCategoria(Categoria categoria) {
        try {
            
            if (verificaPelicula(categoria.getIdcategoria()) == false) {
                Conexion conexion = new Conexion();
                conexion.conectar();
                Connection conect = conexion.getConnection();
                String query = "INSERT INTO CATEGORIA (idcategoria, descripcion) VALUES(?,?)";
                PreparedStatement pel = conect.prepareStatement(query);
                pel.setInt(1, categoria.getIdcategoria());
                pel.setString(2, categoria.getDescripcion());
                if (pel.executeUpdate() > 0) {
                    return true;
                } else {
                    conexion.cerrar();
                    pel.close();
                }

            } else {
                   
                    JOptionPane.showMessageDialog(null, "El Codigo de Categoria ya existe");
                  
            }
        } catch (Exception e) {
                 System.out.println("Error en Agregar Categoria: " + e.getMessage());
                  
        }
        return false;
    }
   
}
