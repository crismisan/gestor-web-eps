/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author usuario
 */
public class VistaConsulta4 {
    String sede, modalidad_consulta, nombre, apellido,examen_solicitado,mes;
    int id;

    public VistaConsulta4() {
    }

    public VistaConsulta4(String sede, String modalidad_consulta, String nombre, String apellido, String examen_solicitado, String mes, int id) {
        this.sede = sede;
        this.modalidad_consulta = modalidad_consulta;
        this.nombre = nombre;
        this.apellido = apellido;
        this.examen_solicitado = examen_solicitado;
        this.mes = mes;
        this.id = id;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getModalidad_consulta() {
        return modalidad_consulta;
    }

    public void setModalidad_consulta(String modalidad_consulta) {
        this.modalidad_consulta = modalidad_consulta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getExamen_solicitado() {
        return examen_solicitado;
    }

    public void setExamen_solicitado(String examen_solicitado) {
        this.examen_solicitado = examen_solicitado;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
