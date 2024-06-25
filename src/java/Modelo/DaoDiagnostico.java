/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author usuario
 */
public class DaoDiagnostico {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    public List Listar(){
        String sql="select * from diagnostico";
        List<Diagnostico> lista = new ArrayList<>();
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Diagnostico d = new Diagnostico();
                d.setId(rs.getInt(1));
                d.setDescripcion(rs.getString(2));
                d.setIdcita(rs.getInt(3));
                lista.add(d);
                System.out.println("Diagnostico listado");
            }
            
        }catch(SQLException ex){
            System.out.println("Error en driver DaoCitaMedica listar: " + ex.getMessage());
        }
    return lista;
}
    public int Agregar(Diagnostico d){
        String sql = "INSERT INTO diagnostico (descripcion, id_cita) VALUES(?,?)";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, d.getDescripcion());
            ps.setInt(2, d.getIdcita());
            ps.executeUpdate();
            System.out.println("diagnostico Agregado");
        }catch(SQLException ex){
            System.out.println("Error en driver DaoCitaDiagnostico agregar: " + ex.getMessage());
        }
        return r;
    }
    public Diagnostico listarid(int id){
        Diagnostico d = new Diagnostico();
        String sql="select * from diagnostico WHERE id_diagnostico=" + id;
        System.out.println("ingreso a listarid");
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                d.setId(rs.getInt(1));
            d.setDescripcion(rs.getString(2));
            d.setIdcita(rs.getInt(3));
            }
            
        }catch(SQLException ex){
             System.out.println("Error en driver DaoCitaDiagnostico listarid: " + ex.getMessage());
        }
        return d; 
}
    public int Actualizar(Diagnostico d){
        System.out.println("Ingresando a la acción de Actualizar diagnostico");
        String sql =" UPDATE diagnostico SET  descripcion=?, id_cita=? WHERE id_diagnostico=?";
        try {
             con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, d.getDescripcion());
            ps.setInt(2, d.getIdcita());
            ps.setInt(3, d.getId());
            ps.executeUpdate();
            System.out.println("diagnostico Actualizado");
        } catch (SQLException ex) {
            System.out.println("Error en driver DaoMedico actualizar: " + ex.getMessage());
        }
        return r;
    }
    public void delete(int id) {
        System.out.println("Ingresando a la acción de Eliminar diagnostico");
        String sql = "DELETE FROM diagnostico WHERE id_diagnostico=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("diagnostico Eliminada");
        } catch (SQLException ex) {
            System.out.println("Error en driver DaoDiagnostico  delete: " + ex.getMessage());
        }
    }
}
