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
import java.util.ArrayList;

public class DaoMedicos {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public List listar() {
        System.out.println("ingreso a listar");
        String sql = "SELECT * FROM medico";
        List<Medicos> lista = new ArrayList<>();

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("carga registros medicos");
                Medicos medico = new Medicos();
                medico.setID_medico(rs.getInt(1));
                medico.setNombre(rs.getString(2));
                medico.setTelefono(rs.getString(3));
                medico.setLicencia(rs.getString(4));
                medico.setDireccion(rs.getString(5));
                medico.setFecha_ing(rs.getString(6));
                medico.setFecha_ret(rs.getString(7));
                medico.setMunicipioID(rs.getInt(8));
                medico.setEspecialidad(rs.getString(9));
                medico.setTipoID(rs.getInt(10));
                medico.setID_sede(rs.getInt(11));

                lista.add(medico);
            }
        } catch (SQLException ex) {
            System.out.println("Error en driver DaoMedico listar: " + ex.getMessage());
        }

        return lista;
    }

    public int Agregar(Medicos medico) {
        System.out.println("ingreso a agregar medico en dao");
        String sql = "INSERT INTO medico(nombre, telefono, licencia, direccion, fecha_ing, fecha_reti, municipio_id, especialidad, tipo_id, id_sede) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, medico.getNombre());
            ps.setString(2, medico.getTelefono());
            ps.setString(3, medico.getLicencia());
            ps.setString(4, medico.getDireccion());
            ps.setString(5, medico.getFecha_ing());
            ps.setString(6, medico.getFecha_ret());
            ps.setInt(7, medico.getMunicipioID());
            ps.setString(8, medico.getEspecialidad());
            ps.setInt(9, medico.getTipoID());
            ps.setInt(10, medico.getID_sede());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error en driver DaoMedico agregar: " + ex.getMessage());
        }

        return r;
    }

    public Medicos listarId(int id) {
        Medicos medico = new Medicos();
        String sql = "SELECT * FROM medico WHERE id_medico = " + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                medico.setID_medico(rs.getInt(1));
                medico.setNombre(rs.getString(2));
                medico.setTelefono(rs.getString(3));
                medico.setLicencia(rs.getString(4));
                medico.setDireccion(rs.getString(5));
                medico.setFecha_ing(rs.getString(6));
                medico.setFecha_ret(rs.getString(7));
                medico.setMunicipioID(rs.getInt(8));
                medico.setEspecialidad(rs.getString(9));
                medico.setTipoID(rs.getInt(10));
                medico.setID_sede(rs.getInt(11));
            }
        } catch (SQLException ex) {
            System.out.println("Error en driver DaoMedico listarId: " + ex.getMessage());
        }
        return medico;
    }

    public int Actualizar(Medicos medico) {
        System.out.println("Ingreso a daomedico actualizar");
        String sql = "UPDATE medico SET nombre=?, telefono=?, licencia=?, direccion=?, "
                + "fecha_ing=?, fecha_reti=?, municipio_id=?, especialidad=?, tipo_id=?, id_sede=? WHERE id_medico=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, medico.getNombre());
            ps.setString(2, medico.getTelefono());
            ps.setString(3, medico.getLicencia());
            ps.setString(4, medico.getDireccion());
            ps.setString(5, medico.getFecha_ing());
            ps.setString(6, medico.getFecha_ret());
            ps.setInt(7, medico.getMunicipioID());
            ps.setString(8, medico.getEspecialidad());
            ps.setInt(9, medico.getTipoID());
            ps.setInt(10, medico.getID_sede());
            ps.setInt(11, medico.getID_medico());
            System.out.println("id medico: " + medico.getID_medico());
            ps.executeUpdate();
            System.out.println("Medico Actualizado");
        } catch (SQLException ex) {
            System.out.println("Error en driver DaoMedico actualizar: " + ex.getMessage());
        }
        return r;
    }

    public void delete(int id_medico) {
        String sql = "DELETE FROM medico WHERE id_medico=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_medico);
            ps.executeUpdate();
            System.out.println("Medico Eliminado");
        } catch (SQLException ex) {
            System.out.println("Error en driver DaoMedico delete: " + ex.getMessage());
        }
    }

}
