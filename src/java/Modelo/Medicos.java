/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author usuario
 */
public class Medicos {
    int ID_medico, municipioID, tipoID, ID_sede;
    String nombre, telefono, licencia, direccion, fecha_ing, fecha_ret, especialidad;

    public Medicos() {
    }

    public Medicos(int ID_medico, int municipioID, int tipoID, int ID_sede, String nombre, String telefono, String licencia, String direccion, String fecha_ing, String fecha_ret, String especialidad) {
        this.ID_medico = ID_medico;
        this.municipioID = municipioID;
        this.tipoID = tipoID;
        this.ID_sede = ID_sede;
        this.nombre = nombre;
        this.telefono = telefono;
        this.licencia = licencia;
        this.direccion = direccion;
        this.fecha_ing = fecha_ing;
        this.fecha_ret = fecha_ret;
        this.especialidad = especialidad;
    }

    public int getID_medico() {
        return ID_medico;
    }

    public void setID_medico(int ID_medico) {
        this.ID_medico = ID_medico;
    }

    public int getMunicipioID() {
        return municipioID;
    }

    public void setMunicipioID(int municipioID) {
        this.municipioID = municipioID;
    }

    public int getTipoID() {
        return tipoID;
    }

    public void setTipoID(int tipoID) {
        this.tipoID = tipoID;
    }

    public int getID_sede() {
        return ID_sede;
    }

    public void setID_sede(int ID_sede) {
        this.ID_sede = ID_sede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha_ing() {
        return fecha_ing;
    }

    public void setFecha_ing(String fecha_ing) {
        this.fecha_ing = fecha_ing;
    }

    public String getFecha_ret() {
        return fecha_ret;
    }

    public void setFecha_ret(String fecha_ret) {
        this.fecha_ret = fecha_ret;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
}
