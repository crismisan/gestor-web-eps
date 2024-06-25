/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author usuario
 */
public class Pacientes {
    int identificacion, idCiudadAfiliacion, idCiudadNatal, idSede;
    String fechaN, nombres, apellidos, direccion_corres, direccion_resid, lugarN, telefono, celular, estrato;

    public Pacientes() {
    }

    public Pacientes(String fechaN, String nombres, String apellidos, String direccion_corres, String direccion_resid, String lugarN, int identificacion, String telefono, String celular, String estrato, int idCiudadAfiliacion, int idCiudadNatal, int idSede) {
        this.fechaN = fechaN;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion_corres = direccion_corres;
        this.direccion_resid = direccion_resid;
        this.lugarN = lugarN;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.celular = celular;
        this.estrato = estrato;
        this.idCiudadAfiliacion = idCiudadAfiliacion;
        this.idCiudadNatal = idCiudadNatal;
        this.idSede = idSede;
    }

    public String getFechaN() {
        return fechaN;
    }

    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion_corres() {
        return direccion_corres;
    }

    public void setDireccion_corres(String direccion_corres) {
        this.direccion_corres = direccion_corres;
    }

    public String getDireccion_resid() {
        return direccion_resid;
    }

    public void setDireccion_resid(String direccion_resid) {
        this.direccion_resid = direccion_resid;
    }

    public String getLugarN() {
        return lugarN;
    }

    public void setLugarN(String lugarN) {
        this.lugarN = lugarN;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEstrato() {
        return estrato;
    }

    public void setEstrato(String estrato) {
        this.estrato = estrato;
    }

    public int getIdCiudadAfiliacion() {
        return idCiudadAfiliacion;
    }

    public void setIdCiudadAfiliacion(int idCiudadAfiliacion) {
        this.idCiudadAfiliacion = idCiudadAfiliacion;
    }

    public int getIdCiudadNatal() {
        return idCiudadNatal;
    }

    public void setIdCiudadNatal(int idCiudadNatal) {
        this.idCiudadNatal = idCiudadNatal;
    }

    public int getIdSede() {
        return idSede;
    }

    public void setIdSede(int idSede) {
        this.idSede = idSede;
    }


    
}
