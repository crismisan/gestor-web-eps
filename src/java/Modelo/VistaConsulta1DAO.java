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
public class VistaConsulta1DAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List Listarv1(){
        String sql = "SELECT * FROM vista_consulta_1";
        List <VistaConsulta1> lista = new ArrayList<> ();
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                VistaConsulta1 v1 = new VistaConsulta1();
                v1.setMes(rs.getString(1));
                v1.setModalidad_consulta(rs.getString(2));
                v1.setCantidad_pacientes(rs.getInt(3));
                lista.add(v1);
            }
        }
    catch(SQLException ex){
        System.out.println("Error en driver DaoMedico listar: " + ex.getMessage());
    }
        return lista;
}
}