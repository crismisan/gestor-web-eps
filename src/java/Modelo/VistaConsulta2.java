/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author usuario
 */
public class VistaConsulta2 {
    String mes, modalidad_consulta, sede;
    int pacientes;

    public VistaConsulta2() {
    }

    public VistaConsulta2(String mes, String modalidad_consulta, String sede, int pacientes) {
        this.mes = mes;
        this.modalidad_consulta = modalidad_consulta;
        this.sede = sede;
        this.pacientes = pacientes;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getModalidad_consulta() {
        return modalidad_consulta;
    }

    public void setModalidad_consulta(String modalidad_consulta) {
        this.modalidad_consulta = modalidad_consulta;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public int getPacientes() {
        return pacientes;
    }

    public void setPacientes(int pacientes) {
        this.pacientes = pacientes;
    }
    
    
}
