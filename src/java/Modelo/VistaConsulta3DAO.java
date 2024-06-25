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
public class VistaConsulta3DAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public List Listarv3(){
        String sql = "SELECT * FROM vista_consulta_3";
        List <VistaConsulta3> lista = new ArrayList<> ();
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                VistaConsulta3 v3 = new VistaConsulta3();
                v3.setSede(rs.getString(1));
                v3.setModalidad_consulta(rs.getString(2));
                v3.setIdpaciente(rs.getInt(3));
                v3.setNombre(rs.getString(4));
                v3.setApellido(rs.getString(5));
                v3.setDiagnostico(rs.getString(6));
                v3.setMes(rs.getString(7));
                lista.add(v3);
                System.out.println("listando v3");
            }
        }
    catch(SQLException ex){
        System.out.println("Error en driver daovista2 listar: " + ex.getMessage());
    }
        return lista;
}
}

