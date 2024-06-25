/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.time.format.DateTimeFormatter;
import Modelo.Pacientes;
import java.util.List;
import Modelo.DaoPacientes;
import Modelo.DaoMedicos;
import Modelo.Medicos;
import Modelo.VistaConsulta1DAO;
import Modelo.VistaConsulta2DAO;
import Modelo.VistaConsulta3DAO;
import Modelo.VistaConsulta4DAO;
import Modelo.VistaConsulta5DAO;
import Modelo.Diagnostico;
import Modelo.DaoDiagnostico;
import Modelo.CitaMedica;
import Modelo.DaoCitaMedica;
import Modelo.DaoCitaMedica;
import Modelo.DaoExamenMedico;
import Modelo.ExamenMedico;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author usuario
 */
@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

    Pacientes p = new Pacientes();
    CitaMedica cm = new CitaMedica();
    Medicos m = new Medicos();
    DaoPacientes dp = new DaoPacientes();
    DaoMedicos dm = new DaoMedicos();
    ExamenMedico em = new ExamenMedico();
    DaoExamenMedico dem = new DaoExamenMedico();
    DaoCitaMedica dcm = new DaoCitaMedica();
    VistaConsulta1DAO dv1 = new VistaConsulta1DAO();
    VistaConsulta2DAO dv2 = new VistaConsulta2DAO();
    VistaConsulta3DAO dv3 = new VistaConsulta3DAO();
    VistaConsulta4DAO dv4 = new VistaConsulta4DAO();
    VistaConsulta5DAO dv5 = new VistaConsulta5DAO();
    Diagnostico d = new Diagnostico();
    DaoDiagnostico dd = new DaoDiagnostico();
    int idp, idm, idcm, idd, idem;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        if (menu.equals("Paciente")) {
            switch (accion) {
                case "Listar" -> {
                    System.out.println("ingreso a switch");
                    List lista = dp.listar();
                    request.setAttribute("pacientes", lista); //en el jsp, la lista se llama como pacientes, por eso en la tabla se pone pacientes
                    request.getRequestDispatcher("Paciente.jsp").forward(request, response);
                }
                case "Agregar" -> {

                    String identificacionStr = request.getParameter("txtIdentificacion");
                    String fechaNto = request.getParameter("txtFechaNacimiento");
                    String Nombres = request.getParameter("txtNombres");
                    String Apellidos = request.getParameter("txtApellidos");
                    String DireccionCorres = request.getParameter("txtDireccionCorres");
                    String DireccionResid = request.getParameter("txtDireccionResidencia");
                    String Telefono = request.getParameter("txtTelefono");
                    String Celular = request.getParameter("txtCelular");
                    String Estrato = request.getParameter("txtEstrato");
                    String lugarNto = request.getParameter("txtLugarNto");
                    String IdSedeAfl = request.getParameter("txtIdSedeAfiliacion");
                    String IdCiudadNatal = request.getParameter("txtIdCiudadNatal");
                    String IdSede = request.getParameter("txtIdSedePaciente");

                    int identificacion = Integer.parseInt(identificacionStr);
                    p.setIdentificacion(identificacion);
                    p.setFechaN(fechaNto);
                    p.setNombres(Nombres);
                    p.setApellidos(Apellidos);
                    p.setDireccion_corres(DireccionCorres);
                    p.setDireccion_resid(DireccionResid);
                    p.setTelefono(Telefono);
                    p.setCelular(Celular);
                    p.setEstrato(Estrato);
                    p.setLugarN(lugarNto);
                    int idCiudadAfiliacion = Integer.parseInt(IdSedeAfl);
                    p.setIdCiudadAfiliacion(idCiudadAfiliacion);
                    int IdCiudad_Natal1 = Integer.parseInt(IdCiudadNatal);
                    p.setIdCiudadNatal(IdCiudad_Natal1);
                    int Id_sede = Integer.parseInt(IdSede);
                    p.setIdSede(Id_sede);
                    dp.Agregar(p);

                    request.getRequestDispatcher("Controlador?menu=Paciente&accion=Listar").forward(request, response);

                }
                case "Editar" -> {
                    idp = Integer.parseInt(request.getParameter("identificacion"));
                    Pacientes p = dp.listarId(idp);
                    request.setAttribute("paciente", p); // aca establezco que mi objeto p en el jsp es paciente
                    request.getRequestDispatcher("Controlador?menu=Paciente&accion=Listar").forward(request, response);
                }

                case "Actualizar" -> {
                    String identificacionStr = request.getParameter("txtIdentificacion");
                    String FechaNto = request.getParameter("txtFechaNacimiento");
                    String Nombres = request.getParameter("txtNombres");
                    String Apellidos = request.getParameter("txtApellidos");
                    String DireccionCorres = request.getParameter("txtDireccionCorres");
                    String DireccionResid = request.getParameter("txtDireccionResidencia");
                    String Telefono = request.getParameter("txtTelefono");
                    String Celular = request.getParameter("txtCelular");
                    String Estrato = request.getParameter("txtEstrato");
                    String lugarNto = request.getParameter("txtLugarNto");
                    String IdSedeAfl = request.getParameter("txtIdSedeAfiliacion");
                    String IdCiudadNatal = request.getParameter("txtIdCiudadNatal");
                    String IdSede = request.getParameter("txtIdSedePaciente");

                    Pacientes p = new Pacientes();
                    p.setIdentificacion(Integer.parseInt(identificacionStr));
                    p.setFechaN(FechaNto);
                    p.setNombres(Nombres);
                    p.setApellidos(Apellidos);
                    p.setDireccion_corres(DireccionCorres);
                    p.setDireccion_resid(DireccionResid);
                    p.setTelefono(Telefono);
                    p.setCelular(Celular);
                    p.setEstrato(Estrato);
                    p.setLugarN(lugarNto);
                    int idCiudadAfiliacion = Integer.parseInt(IdSedeAfl);
                    p.setIdCiudadAfiliacion(idCiudadAfiliacion);
                    int IdCiudad_Natal1 = Integer.parseInt(IdCiudadNatal);
                    p.setIdCiudadNatal(IdCiudad_Natal1);
                    int Id_sede = Integer.parseInt(IdSede);
                    p.setIdSede(Id_sede);
                    dp.Actualizar(p);

                    request.getRequestDispatcher("Controlador?menu=Paciente&accion=Listar").forward(request, response);
                }

                case "Delete" -> {
                    idp = Integer.parseInt(request.getParameter("identificacion"));
                    dp.delete(idp);
                    request.getRequestDispatcher("Controlador?menu=Paciente&accion=Listar").forward(request, response);
                }

            }
            request.getRequestDispatcher("Paciente.jsp").forward(request, response);
        }
        if (menu.equals("Medico")) {
            switch (accion) {
                case "Listar" -> {
                    System.out.println("ingreso a switch listar medico");
                    List lista = dm.listar();
                    request.setAttribute("medicos", lista); //en el jsp, la lista se llama como pacientes, por eso en la tabla se pone pacientes  
                    request.getRequestDispatcher("Medico.jsp").forward(request, response);
                }
                case "Agregar" -> {
                    // String idMedico = request.getParameter("txtIdmedico");
                    System.out.println("ingreso a switch agregar medico");
                    String Nombre = request.getParameter("txtNombre");
                    String Telefono = request.getParameter("txtTelefono");
                    String Licencia = request.getParameter("txtLicencia");
                    String Direccion = request.getParameter("txtDireccion");
                    String Fechaing = request.getParameter("txtFechaIngreso");
                    String Fecharet = request.getParameter("txtFechaRetiro");
                    String idmunicipio = request.getParameter("txtIdmunicipio");
                    String Especialidad = request.getParameter("txtEspecialidad");
                    String tipoid = request.getParameter("txtTipomedico");
                    String idsede = request.getParameter("txtIdSedeMedico");

                    m.setNombre(Nombre);
                    m.setTelefono(Telefono);
                    m.setLicencia(Licencia);
                    m.setDireccion(Direccion);
                    m.setFecha_ing(Fechaing);
                    m.setFecha_ret(Fecharet);
                    m.setMunicipioID(Integer.parseInt(idmunicipio));
                    m.setEspecialidad(Especialidad);
                    m.setTipoID(Integer.parseInt(tipoid));
                    m.setID_sede(Integer.parseInt(idsede));
                    dm.Agregar(m);
                    request.getRequestDispatcher("Controlador?menu=Medico&accion=Listar").forward(request, response);
                }
                case "Editar" -> {
                    idm = Integer.parseInt(request.getParameter("ID_medico"));
                    Medicos m = dm.listarId(idm);
                    request.setAttribute("medico", m); // aca establezco que mi objeto m en el jsp es medico
                    request.getRequestDispatcher("Controlador?menu=Medico&accion=Listar").forward(request, response);
                }
                case "Actualizar" -> {
                    System.out.println("ingreso a switch actualizar medico");
                    String idMedico = request.getParameter("txtIDmedico");
                    /*asi sea autoincrementable, hay que 
                    tambien enviar el valor de idmedico, porque lo alamacena el objeto m mas abajo, ese objeti
                     se le envia a la bd, ahi se envia id_medico, si no se pone, con el objeto no se envia 
                     id_medico al dao actualizar*/
                    String Nombre = request.getParameter("txtNombre");
                    String Telefono = request.getParameter("txtTelefono");
                    String Licencia = request.getParameter("txtLicencia");
                    String Direccion = request.getParameter("txtDireccion");
                    String Fechaing = request.getParameter("txtFechaIngreso");
                    String Fecharet = request.getParameter("txtFechaRetiro");
                    String idmunicipio = request.getParameter("txtIdmunicipio");
                    String Especialidad = request.getParameter("txtEspecialidad");
                    String tipoid = request.getParameter("txtTipomedico");
                    String idsede = request.getParameter("txtIdSedeMedico");
                    Medicos m = new Medicos();

                    m.setID_medico(Integer.parseInt(idMedico));
                    m.setNombre(Nombre);
                    m.setTelefono(Telefono);
                    m.setLicencia(Licencia);
                    m.setDireccion(Direccion);
                    m.setFecha_ing(Fechaing);
                    m.setFecha_ret(Fecharet);
                    m.setMunicipioID(Integer.parseInt(idmunicipio));
                    m.setEspecialidad(Especialidad);
                    m.setTipoID(Integer.parseInt(tipoid));
                    m.setID_sede(Integer.parseInt(idsede));
                    dm.Actualizar(m);
                    request.getRequestDispatcher("Controlador?menu=Medico&accion=Listar").forward(request, response);
                }
                case "Delete" -> {
                    idm = Integer.parseInt(request.getParameter("ID_medico"));
                    dm.delete(idm);
                    request.getRequestDispatcher("Controlador?menu=Medico&accion=Listar").forward(request, response);
                }
            }
            request.getRequestDispatcher("Medico.jsp").forward(request, response);
        }
        if (menu.equals("Vista1")) {
            switch (accion) {
                case "Listar" -> {
                    System.out.println("ingreso a switch listar vista1");
                    List lista = dv1.Listarv1();
                    request.setAttribute("vista1", lista); //en el jsp, la lista se llama como pacientes, por eso en la tabla se pone pacientes  
                    request.getRequestDispatcher("Vista1.jsp").forward(request, response);
                }
            }
        }
        if (menu.equals("Vista2")) {
            switch (accion) {
                case "Listar" -> {
                    System.out.println("ingreso a switch listar vista2");
                    List lista = dv2.Listarv2();
                    request.setAttribute("vista2", lista); //en el jsp, la lista se llama como pacientes, por eso en la tabla se pone pacientes  
                    request.getRequestDispatcher("Vista2.jsp").forward(request, response);
                }
            }
        }
        if (menu.equals("Vista3")) {
            switch (accion) {
                case "Listar" -> {
                    System.out.println("ingreso a switch listar vista3");
                    List lista = dv3.Listarv3();
                    request.setAttribute("vista3", lista); //en el jsp, la lista se llama como pacientes, por eso en la tabla se pone pacientes  
                    request.getRequestDispatcher("Vista3.jsp").forward(request, response);
                }
            }
        }
        if (menu.equals("Vista4")) {
            switch (accion) {
                case "Listar" -> {
                    System.out.println("ingreso a switch listar vista4");
                    List lista = dv4.Listarv4();
                    request.setAttribute("vista4", lista); //en el jsp, la lista se llama como pacientes, por eso en la tabla se pone pacientes  
                    request.getRequestDispatcher("Vista4.jsp").forward(request, response);
                }
            }
        }
        if (menu.equals("Vista5")) {
            switch (accion) {
                case "Listar" -> {
                    System.out.println("ingreso a switch listar vista5");
                    List lista = dv5.Listarv5();
                    request.setAttribute("vista5", lista); //en el jsp, la lista se llama como pacientes, por eso en la tabla se pone pacientes  
                    request.getRequestDispatcher("Vista5.jsp").forward(request, response);
                }
            }
        }
        if (menu.equals("CitaMedica")) {
            switch (accion) {
                case "Listar" -> {
                    System.out.println("ingreso a switch lista cita medica");
                    List lista = dcm.listar();
                    request.setAttribute("citamedicaa", lista); //en el jsp, la lista se llama como pacientes, por eso en la tabla se pone pacientes
                    request.getRequestDispatcher("CitaMedica.jsp").forward(request, response);
                }
                case "Agregar" -> {

                    String id_cita = request.getParameter("txtIdcita");
                    String modalidad = request.getParameter("txtModalidad");
                    String fecha1 = request.getParameter("txtFecha");
                    String id_medico = request.getParameter("txtIdmedico");
                    String identificacion = request.getParameter("txtIdentificacion");
                    String asistencia = request.getParameter("txtAsistencia");
                    System.out.println("asistencia: " + asistencia);
                    cm.setIdcita(Integer.parseInt(id_cita));
                    cm.setModalidad(Integer.parseInt(modalidad));
                    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                    java.util.Date fechad1 = null;
                    System.out.println("Fecha sin convertir: " + fecha1);
                    try {
                        // Convertimos la cadena a un objeto Date
                        fechad1 = formato.parse(fecha1);

                        // Imprimimos la fecha obtenida
                        System.out.println("Fecha como Date: " + fechad1);
                    } catch (ParseException e) {
                        e.printStackTrace();

                    }
                    cm.setFecha(fechad1);
                    cm.setIdmedico(Integer.parseInt(id_medico));
                    cm.setIdentificacion(Integer.parseInt(identificacion));
                    cm.setAsistencia(asistencia);
                    dcm.Agregar(cm);
                    request.getRequestDispatcher("Controlador?menu=CitaMedica&accion=Listar").forward(request, response);

                }
                case "Editar" -> {
                    idcm = Integer.parseInt(request.getParameter("idcita"));
                    CitaMedica cm = dcm.listarId(idcm);
                    request.setAttribute("citamedica", cm); // aca establezco que mi objeto cm en el jsp es citamedica
                    request.getRequestDispatcher("Controlador?menu=CitaMedica&accion=Listar").forward(request, response);
                }
                case "Actualizar" -> {
                    String id_cita = request.getParameter("txtIdcita");
                    String modalidad = request.getParameter("txtModalidad");
                    String fecha1 = request.getParameter("txtFecha");
                    String id_medico = request.getParameter("txtIdmedico");
                    String identificacion = request.getParameter("txtIdentificacion");
                    String asistencia = request.getParameter("txtAsistencia");

                    cm.setIdcita(Integer.parseInt(id_cita));
                    cm.setModalidad(Integer.parseInt(modalidad));
                    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

                    Date fechad1 = null;
                    System.out.println("Fecha sin convertir: " + fecha1);
                    try {
                        // Convertimos la cadena a un objeto Date
                        fechad1 = formato.parse(fecha1);

                        // Imprimimos la fecha obtenida
                        System.out.println("Fecha como Date: " + fechad1);
                    } catch (ParseException e) {
                        e.printStackTrace();

                    }
                    cm.setFecha(fechad1);
                    System.out.println("Fecha como Date: " + fechad1);
                    cm.setIdmedico(Integer.parseInt(id_medico));
                    cm.setIdentificacion(Integer.parseInt(identificacion));
                    cm.setAsistencia(asistencia);
                    dcm.Actualizar(cm);

                    request.getRequestDispatcher("Controlador?menu=CitaMedica&accion=Listar").forward(request, response);
                }
                case "Delete" -> {
                    idcm = Integer.parseInt(request.getParameter("idcita"));
                    dcm.delete(idcm);
                    request.getRequestDispatcher("Controlador?menu=CitaMedica&accion=Listar").forward(request, response);
                }
            }

        }
        if (menu.equals("Diagnostico")) {
            switch (accion) {
                case "Listar" -> {
                    System.out.println("ingreso a switch lista diagnostico");
                    List lista = dd.Listar();
                    request.setAttribute("Diag", lista); //en el jsp, la lista se llama como pacientes, por eso en la tabla se pone pacientes
                    request.getRequestDispatcher("Diagnostico.jsp").forward(request, response);
                }
                case "Agregar" -> {
                    String descripcion = request.getParameter("txtDescripcion");
                    System.out.println("la descripcion es: " + descripcion);
                    String idcita = request.getParameter("txtIdcita");
                    System.out.println("id cita es: " + idcita);
                    d.setDescripcion(descripcion);
                    d.setIdcita(Integer.parseInt(idcita));
                    dd.Agregar(d);
                    request.getRequestDispatcher("Controlador?menu=Diagnostico&accion=Listar").forward(request, response);
                }
                case "Editar" -> {
                    idd = Integer.parseInt(request.getParameter("IdDiagnostico"));
                    System.out.println("iddiagnostico=" + idd);
                    Diagnostico d = dd.listarid(idd);
                    request.setAttribute("diagnostico", d); // aca establezco que mi objeto cm en el jsp es diagnostico
                    request.getRequestDispatcher("Controlador?menu=Diagnostico&accion=Listar").forward(request, response);
                }
                case "Actualizar" -> {
                    String descripcion = request.getParameter("txtDescripcion");
                    String idcita = request.getParameter("txtIdcita");
                    d.setDescripcion(descripcion);
                    d.setIdcita(Integer.parseInt(idcita));
                    d.setId(idd);
                    dd.Actualizar(d);
                    request.getRequestDispatcher("Controlador?menu=Diagnostico&accion=Listar").forward(request, response);
                }
                case "Delete" -> {
                    idd = Integer.parseInt(request.getParameter("IdDiagnostico"));
                    dd.delete(idd);
                    request.getRequestDispatcher("Controlador?menu=Diagnostico&accion=Listar").forward(request, response);
                }

            }
        }
        if (menu.equals("ExamenMedico")) {
            switch (accion) {
                case "Listar" -> {
                    System.out.println("ingreso a switch lista diagnostico");
                    List lista = dem.listar();
                    request.setAttribute("list", lista); //en el jsp, la lista se llama como pacientes, por eso en la tabla se pone pacientes
                    request.getRequestDispatcher("ExamenMedico.jsp").forward(request, response);

                }
                case "Agregar" -> {
                    String resultado = request.getParameter("txtResultado");
                    String idexamen = request.getParameter("txtIdexamen");
                    em.setResultado(resultado);
                    em.setIdexamen(Integer.parseInt(idexamen));
                    dem.agregar(em);
                    request.getRequestDispatcher("Controlador?menu=ExamenMedico&accion=Listar").forward(request, response);
                }
                case "Editar" -> {
                    idem = Integer.parseInt(request.getParameter("Id"));
                    System.out.println("idexamen=" + idem);
                    ExamenMedico em = dem.listarId(idem);
                    request.setAttribute("examen", em); // aca establezco que mi objeto cm en el jsp es diagnostico
                    request.getRequestDispatcher("Controlador?menu=ExamenMedico&accion=Listar").forward(request, response);
                }
                case "Actualizar" -> {
                   String resultado = request.getParameter("txtResultado");
                    String idexamen = request.getParameter("txtIdexamen");
                    em.setResultado(resultado);
                    em.setIdexamen(Integer.parseInt(idexamen));
                    em.setId(idem);
                    dem.Actualizar(em);
                    request.getRequestDispatcher("Controlador?menu=ExamenMedico&accion=Listar").forward(request, response);
                }
                case "Delete" -> {
                    idd = Integer.parseInt(request.getParameter("Id"));
                    dem.eliminar(idd);
                    request.getRequestDispatcher("Controlador?menu=ExamenMedico&accion=Listar").forward(request, response);
                }
            }

        }
    }




// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
/**
 * Handles the HTTP <code>GET</code> method.
 *
 * @param request servlet request
 * @param response servlet response
 * @throws ServletException if a servlet-specific error occurs
 * @throws IOException if an I/O error occurs
 */
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

