/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;
import Modelo.Factura;//el objeto factura
import bd.Conexion;//la conexion
import java.sql.Connection;//driver oracle
import java.sql.PreparedStatement;// sentencia sql
import java.sql.ResultSet;//el registro
import java.time.LocalDate;
/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PersistenciaFactura {
public Factura buscarPorNumero(int numero){
    Factura factura=null;
    Conexion conexionOracle= new Conexion();
    try {
        conexionOracle.conectar();
        Connection conexion=conexionOracle.getConnection();
        String query="select * from factura where nro_factura=?";
        PreparedStatement buscar=conexion.prepareStatement(query);//prepareStatement ejecutta la consulta query
        buscar.setInt(1, numero);//pasamos el parametro
        ResultSet rs=buscar.executeQuery();
        while  (rs.next()){
            factura=new Factura();
            factura.setNro_factura(rs.getInt("nro_factura"));
            factura.setRut_cliente(rs.getString("rut_cliente"));
            factura.setMonto(rs.getInt("monto"));
            factura.setFecha(rs.getInt("Fecha"));
        }
        conexion.close();
    } catch (Exception e) {
        System.out.println("Error");
        
    }
    return factura;
    
}

public boolean ModificaFactura(int numero,Factura factura){
    Conexion conexionOracle=new Conexion();
    try {
        conexionOracle.conectar();
        Connection conexion=conexionOracle.getConnection();
        String query="update factura set rut_cliente=?,monto=? where Nro_factura=?";
        PreparedStatement ins=conexion.prepareStatement(query);
        ins.setInt(3, numero);
        ins.setString(1, factura.getRut_cliente());
        ins.setInt(2, factura.getMonto());
        if (ins.executeUpdate()>0) {
            return true;
            
        }conexion.close();
    } catch (Exception e) {
        System.out.println("Error al agregar "+e.getMessage());
    }
    return false;
    
}

public boolean agregarFactura(Factura factura){
    Conexion conexionOracle=new Conexion();
    try {
        conexionOracle.conectar();
        Connection conexion =conexionOracle.getConnection();
        String query="insert into factura(nro_factura,rut_cliente,monto)values(?,?,?)";
        PreparedStatement ins=conexion.prepareStatement(query);
        ins.setInt(1, factura.getNro_factura());
        ins.setString(2, factura.getRut_cliente());
        ins.setInt(3, factura.getMonto());
        if (ins.executeUpdate()>0) {
            return true;
        }
    } catch (Exception e) {
        System.out.println("error al agregar"+e.getMessage());
    }
    return false;
}

}
