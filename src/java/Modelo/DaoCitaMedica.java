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
import Modelo.Medicos;
import java.sql.Date;
import java.util.ArrayList;
public class DaoCitaMedica {
     Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    public List listar() {
        System.out.println("ingreso a listar cita medica");
        String sql = "SELECT * FROM cita_medica";
        List<CitaMedica> lista = new ArrayList<>();

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("carga registros cita medica");
                CitaMedica cm = new CitaMedica();
                cm.setIdcita(rs.getInt(1));
                cm.setModalidad(rs.getInt(2));
                cm.setFecha(rs.getDate(3));
                cm.setIdmedico(rs.getInt(4));
                cm.setIdentificacion(rs.getInt(5));
                cm.setAsistencia(rs.getString(6));
                lista.add(cm);
            }
        } catch (SQLException ex) {
            System.out.println("Error en driver DaoCitaMedica listar: " + ex.getMessage());
        }

        return lista;
    }
    public int Agregar(CitaMedica cm) {
        System.out.println("ingreso a agregar medico en dao");
        String sql = "INSERT INTO cita_medica(id_cita, modalidad_id, fecha_hora, id_medico,"
                + " identificacion, asistencia) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cm.getIdcita());
            ps.setInt(2, cm.getModalidad());
            ps.setDate(3, new java.sql.Date(cm.getFecha().getTime()));
            ps.setInt(4, cm.getIdmedico());
            ps.setInt(5, cm.getIdentificacion());
            ps.setString(6, cm.getAsistencia());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error en driver DaoCitaMedica agregar: " + ex.getMessage());
        }

        return r;
    }
    public CitaMedica listarId(int id) {
        CitaMedica cm = new CitaMedica();
        String sql = "SELECT * FROM cita_medica WHERE id_medico = " + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                cm.setIdcita(rs.getInt(1));
                cm.setModalidad(rs.getInt(2));
                cm.setFecha(rs.getDate(3));
                cm.setIdmedico(rs.getInt(4));
                cm.setIdentificacion(rs.getInt(5));
                cm.setAsistencia(rs.getString(6));
            }
        } catch (SQLException ex) {
            System.out.println("Error en driver DaoMedico listarId: " + ex.getMessage());
        }
        return cm;
    }
    public int Actualizar(CitaMedica cm) {
        System.out.println("Ingreso a daocitamedica actualizar");
        String sql = "UPDATE cita_medica SET id_cita=?, modalidad_id=?, fecha_hora=?, id_medico=?, "
                + "identificacion=?, asistencia=? WHERE id_cita=?";
        try {
            con = cn.Conexion();
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, cm.getIdcita());
            ps.setInt(2, cm.getModalidad());
            ps.setDate(3, new java.sql.Date(cm.getFecha().getTime()));
            ps.setInt(4, cm.getIdmedico());
            ps.setInt(5, cm.getIdentificacion());
            ps.setString(6, cm.getAsistencia());
            ps.setInt(7, cm.getIdcita());
            ps.executeUpdate();
            System.out.println("cita medica Actualizado");
        } catch (SQLException ex) {
            System.out.println("Error en driver DaoMedico actualizar: " + ex.getMessage());
        }
        return r;
    }
    public void delete(int id_cita) {
        String sql = "DELETE FROM cita_medica WHERE id_cita=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_cita);
            ps.executeUpdate();
            System.out.println("Cita medica Eliminada");
        } catch (SQLException ex) {
            System.out.println("Error en driver DaoCitaMedica delete: " + ex.getMessage());
        }
    }
}
