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


public class DaoExamenMedico {

     Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    // Método para listar todos los exámenes médicos
    public List listar() {
        System.out.println("Ingreso a listar exámenes médicos");
        String sql = "SELECT * FROM examen_medico_del_paciente";
        List<ExamenMedico> lista = new ArrayList<>();

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                ExamenMedico examenMedico = new ExamenMedico();
                examenMedico.setId(rs.getInt(1));
                examenMedico.setResultado(rs.getString(2));
                examenMedico.setIdexamen(rs.getInt(3));
                lista.add(examenMedico);
            }
        } catch (SQLException ex) {
            System.out.println("Error en driver DaoExamenMedico listar: " + ex.getMessage());
        }

        return lista;
    }

    public int agregar(ExamenMedico examenMedico) {
        System.out.println("Ingreso a agregar examen médico en DAO");
        String sql = "INSERT INTO examen_medico_del_paciente(resultado, tipo_examen_id) VALUES (?, ?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, examenMedico.getResultado());
            ps.setInt(2, examenMedico.getIdexamen());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error en driver DaoExamenMedico agregar: " + ex.getMessage());
        } 

        return r;
    }

    // Método para obtener un examen médico por su ID
    public ExamenMedico listarId (int idExamen) {
        ExamenMedico examenMedico = new ExamenMedico();
        String sql = "SELECT * FROM examen_medico_del_paciente WHERE id_examen =" + idExamen;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
         rs = ps.executeQuery();
            
            while (rs.next()) {
                examenMedico.setId(rs.getInt(1));
                examenMedico.setResultado(rs.getString(2));
                examenMedico.setIdexamen(rs.getInt(3));
            }
        } catch (SQLException ex) {
            System.out.println("Error en driver DaoExamenMedico obtenerPorId: " + ex.getMessage());
        } 

        return examenMedico;
    }

    // Método para actualizar un examen médico
    public int Actualizar(ExamenMedico examenMedico) {
        System.out.println("Ingreso a DaoExamenMedico actualizar");
        String sql = "UPDATE examen_medico_del_paciente SET id_examen=?, resultado=?, tipo_examen_id=? WHERE id_examen=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, examenMedico.getId());
            ps.setString(2, examenMedico.getResultado());
            ps.setInt(3, examenMedico.getIdexamen());
            ps.setInt(4, examenMedico.getId());
            ps.executeUpdate();
            System.out.println("Examen médico actualizado");
        } catch (SQLException ex) {
            System.out.println("Error en driver DaoExamenMedico actualizar: " + ex.getMessage());
        }

        return r;
    }

    // Método para eliminar un examen médico por su ID
    public void eliminar(int idExamen) {
        String sql = "DELETE FROM examen_medico_del_paciente WHERE id_examen=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idExamen);
            ps.executeUpdate();
            System.out.println("Examen médico eliminado");
        } catch (SQLException ex) {
            System.out.println("Error en driver DaoExamenMedico eliminar: " + ex.getMessage());
        } 
    }
}


