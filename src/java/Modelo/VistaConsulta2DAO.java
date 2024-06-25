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

/**
 *
 * @author usuario
 */
public class VistaConsulta2DAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public List Listarv2(){
        String sql = "SELECT * FROM vista_consulta_2";
        List <VistaConsulta2> lista = new ArrayList<> ();
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                VistaConsulta2 v2 = new VistaConsulta2();
                v2.setMes(rs.getString(1));
                v2.setModalidad_consulta(rs.getString(2));
                v2.setSede(rs.getString(3));
                v2.setPacientes(rs.getInt(4));
                lista.add(v2);
                System.out.println("listando v2");
            }
        }
    catch(SQLException ex){
        System.out.println("Error en driver daovista2 listar: " + ex.getMessage());
    }
        return lista;
}
}
