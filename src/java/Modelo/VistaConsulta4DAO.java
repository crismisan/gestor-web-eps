/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Modelo;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VistaConsulta4DAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
     public List Listarv4(){
        String sql = "SELECT * FROM vista_consulta_4";
        List <VistaConsulta4> lista = new ArrayList<> ();
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                VistaConsulta4 v4 = new VistaConsulta4();
                v4.setSede(rs.getString(1));
                v4.setModalidad_consulta(rs.getString(2));
                v4.setId(rs.getInt(3));
                v4.setNombre(rs.getString(4));
                v4.setApellido(rs.getString(5));
                v4.setExamen_solicitado(rs.getString(6));
                v4.setMes(rs.getString(7));
                lista.add(v4);
                System.out.println("listando v4");
            }
        }
    catch(SQLException ex){
        System.out.println("Error en driver daovista2 listar: " + ex.getMessage());
    }
        return lista;
}
}
