/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author usuario
 */
public class VistaConsulta1 {
    String mes, modalidad_consulta;
    int cantidad_pacientes;

    public VistaConsulta1() {
    }

    public VistaConsulta1(String mes, String modalidad_consulta, int cantidad_pacientes) {
        this.mes = mes;
        this.modalidad_consulta = modalidad_consulta;
        this.cantidad_pacientes = cantidad_pacientes;
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

    public int getCantidad_pacientes() {
        return cantidad_pacientes;
    }

    public void setCantidad_pacientes(int cantidad_pacientes) {
        this.cantidad_pacientes = cantidad_pacientes;
    }
    
}
