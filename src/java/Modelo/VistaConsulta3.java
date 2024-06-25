/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author usuario
 */
public class VistaConsulta3 {
    String sede, modalidad_consulta, nombre, apellido, diagnostico,mes;
    int idpaciente;

    public VistaConsulta3() {
    }

    public VistaConsulta3(String sede, String modalidad_consulta, String nombre, String apellido, String diagnostico, String mes, int idpaciente) {
        this.sede = sede;
        this.modalidad_consulta = modalidad_consulta;
        this.nombre = nombre;
        this.apellido = apellido;
        this.diagnostico = diagnostico;
        this.mes = mes;
        this.idpaciente = idpaciente;
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

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
    }
    
}
