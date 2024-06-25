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
public class DaoPacientes {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
     public List listar() {
        System.out.println("ingreso a listar");
        String sql = "select * from paciente ";
        List<Pacientes> lista = new ArrayList<>();
        try {
            System.out.println("ingreso a try listar");
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("carga registros");
                Pacientes p = new Pacientes();
                p.setIdentificacion(rs.getInt(1));
                p.setFechaN(rs.getString(2));
                p.setNombres(rs.getString(3));
                p.setApellidos(rs.getString(4));
                p.setDireccion_corres(rs.getString(5));
                p.setDireccion_resid(rs.getString(6));
                p.setTelefono(rs.getString(7));
                p.setCelular(rs.getString(8));
                p.setEstrato(rs.getString(9));
                p.setLugarN(rs.getString(10));
                p.setIdCiudadAfiliacion(rs.getInt(11));
                p.setIdCiudadNatal(rs.getInt(12));
                p.setIdSede(rs.getInt(13));
                lista.add(p);
            }
        } catch (SQLException ex) {
            System.out.println("error en driver DaoPacientes listar: " + ex.getMessage());
        }
        return lista;
    }
    public int Agregar(Pacientes p) {
        String sql = "insert into paciente(identificacion, fecha_nto, nombres, apellidos, direccion_corres, "
                + "direccion_resid, telefono, celular, estrato, lugar_nto, ciudad_afil_id, ciudad_natal_id,"
                + "id_sede)values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, p.getIdentificacion());
            ps.setString(2, p.getFechaN());
            ps.setString(3, p.getNombres());
            ps.setString(4, p.getApellidos());
            ps.setString(5, p.getDireccion_corres());
            ps.setString(6, p.getDireccion_resid());
            ps.setString(7, p.getTelefono());
            ps.setString(8, p.getCelular());
            ps.setString(9, p.getEstrato());
            ps.setString(10, p.getLugarN());
            ps.setInt(11, p.getIdCiudadAfiliacion());
            ps.setInt(12, p.getIdCiudadNatal());
            ps.setInt(13, p.getIdSede());
            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("error2 en driver DaoPaciente agregar: " + ex.getMessage());
        }
        return r;
    }
    public Pacientes buscar(String identificacion){
    Pacientes p = new Pacientes();
    String sql="select * from paciente where identificacion="+identificacion;
    try{
        con=cn.Conexion();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next()){
            p.setIdentificacion(rs.getInt(1));
            p.setFechaN(rs.getString(2));
            p.setNombres(rs.getString(3));
            p.setApellidos(rs.getString(4));
            p.setDireccion_corres(rs.getString(5));
            p.setDireccion_resid(rs.getString(6));
            p.setTelefono(rs.getString(7));
            p.setCelular(rs.getString(8));
            p.setEstrato(rs.getString(9));
            p.setLugarN(rs.getString(10));
            p.setIdCiudadAfiliacion(rs.getInt(11));
            p.setIdCiudadNatal(rs.getInt(12));
            p.setIdSede(rs.getInt(13));
        }
    }catch(SQLException ex){
        System.out.println("error2 en driver DaoPaciente buscar: " + ex.getMessage());
    }
        return p;
    
}
    public Pacientes listarId(int id) {
    Pacientes paciente = new Pacientes();
    String sql = "SELECT * FROM paciente WHERE identificacion = " + id;
    try {
        con = cn.Conexion();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            paciente.setIdentificacion(rs.getInt(1));
            paciente.setFechaN(rs.getString(2));
            paciente.setNombres(rs.getString(3));
            paciente.setApellidos(rs.getString(4));
            paciente.setDireccion_corres(rs.getString(5));
            paciente.setDireccion_resid(rs.getString(6));
            paciente.setTelefono(rs.getString(7));
            paciente.setCelular(rs.getString(8));
            paciente.setEstrato(rs.getString(9));
            paciente.setLugarN(rs.getString(10));
            paciente.setIdCiudadAfiliacion(rs.getInt(11));
            paciente.setIdCiudadNatal(rs.getInt(12));
            paciente.setIdSede(rs.getInt(13));
        }
    } catch (SQLException ex) {
        System.out.println("Error en driver PacienteDAO listarId: " + ex.getMessage());
    }
    return paciente;
}
    public int Actualizar(Pacientes paciente) {
    System.out.println("Ingreso a actualizar");
    String sql = "UPDATE paciente SET fecha_nto=?, nombres=?, apellidos=?, direccion_corres=?, "
                + "direccion_resid=?, telefono=?, celular=?, estrato=?, lugar_nto=?, ciudad_afil_id=?, ciudad_natal_id=?, "
                + "id_sede=? WHERE identificacion=?";
    try {
        con = cn.Conexion();
        ps = con.prepareStatement(sql);
        ps.setString(1, paciente.getFechaN());
        ps.setString(2, paciente.getNombres());
        ps.setString(3, paciente.getApellidos());
        ps.setString(4, paciente.getDireccion_corres());
        ps.setString(5, paciente.getDireccion_resid());
        ps.setString(6, paciente.getTelefono());
        ps.setString(7, paciente.getCelular());
        ps.setString(8, paciente.getEstrato());
        ps.setString(9, paciente.getLugarN());
        ps.setInt(10, paciente.getIdCiudadAfiliacion());
        ps.setInt(11, paciente.getIdCiudadNatal());
        ps.setInt(12, paciente.getIdSede());
        ps.setInt(13, paciente.getIdentificacion());  
        ps.executeUpdate();
        System.out.println(paciente.getIdentificacion());
        System.out.println("Paciente Actualizado");
    } catch (SQLException ex) {
        System.out.println("Error en driver PacienteDAO actualizar: " + ex.getMessage());
    }
    return r;
}
    
    public void delete(int identificacion) {
    String sql = "DELETE FROM paciente WHERE identificacion=?";
    try {
        con = cn.Conexion();
        ps = con.prepareStatement(sql);
        ps.setInt(1, identificacion);
        ps.executeUpdate();
        System.out.println("Eliminado");
    } catch (SQLException ex) {
        System.out.println("Error en driver PacienteDAO delete: " + ex.getMessage());
    }
}



}

