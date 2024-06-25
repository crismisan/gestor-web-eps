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
public class VistaConsulta5DAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public List Listarv5(){
        String sql = "SELECT * FROM vista_consulta_5";
        List <VistaConsulta5> lista = new ArrayList<> ();
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                VistaConsulta5 v5 = new VistaConsulta5();
                v5.setId(rs.getInt(1));
                v5.setNombre(rs.getString(2));
                v5.setApellido(rs.getString(3));
                v5.setFecha(rs.getString(4));
                v5.setModalidad(rs.getInt(5));
                lista.add(v5);
                System.out.println("listando v4");
            }
        }
    catch(SQLException ex){
        System.out.println("Error en driver daovista5 listar: " + ex.getMessage());
    }
        return lista;
}
}
