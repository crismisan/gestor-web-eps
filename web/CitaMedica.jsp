<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Modelo.CitaMedica"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Registro de Paciente</title>
        <!-- Enlace a Bootstrap -->
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="d-flex">
            <div class="card col-3">
                <div class="card-body">
                    <form action="Controlador?menu=CitaMedica" method="POST">
                        <div class="form-group">
                            <label>Id cita medica</label>
                            <input type="text" value="${citamedica.getIdcita()}" name="txtIdcita" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="modalidad">Modalidad</label>
                            <select class="form-control" name="txtModalidad" required>
                                <option value="1" ${citamedica.getModalidad() == 1 ? 'selected' : ''}> Medicina general </option> 
                                <option value="2" ${citamedica.getModalidad() == 2 ? 'selected' : ''}> Especialidad </option> 
                                <option value="3" ${citamedica.getModalidad() == 3 ? 'selected' : ''}> Urgencias </option> 
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="nombres">Fecha</label>
                            <input type="text" value="${citamedica.getFecha()}" name="txtFecha" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="apellidos">Id medico</label>
                            <input type="text" value="${citamedica.getIdmedico()}" name="txtIdmedico" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="correoElectronico">Identificacion</label>
                            <input type="text" value="${citamedica.getIdentificacion()}" name="txtIdentificacion" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="asistencia">Asistencia</label>
                            <select class="form-control" name="txtAsistencia" required>
                                <option value="Asistio" ${citamedica.getAsistencia() }> Asistio </option> 
                                <option value="No Asistio" ${citamedica.getAsistencia() }> No Asistio </option> 
      
                            </select>
                        </div>
                        <input type="submit" name="accion" value="Agregar" class="btn btn-info">
                        <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                    </form>

                </div>
            </div>
            <div>
                <div class="col-8">  
                    <table class="table table-hover"style="width: 80%;">
                        <thead>
                            <tr>
                                <th>Id cita </th>
                                <th>Modalidad </th>
                                <th>Fecha </th>
                                <th>Medico </th>
                                <th>Identificacion </th>
                                <th>Asistencia </th>
                            </tr>
                        </thead>
                        <tbody>
                            
                            <c:forEach var="cm" items="${citamedicaa}">
                                <tr>
                                    <td>${cm.getIdcita()}</td>
                                    <td>${cm.getModalidad()}</td>
                                    <td>${cm.getFecha()}</td>
                                    <td>${cm.getIdmedico()}</td>
                                    <td>${cm.getIdentificacion()}</td>
                                    <td>${cm.getAsistencia()}</td>
                                    <td>
                                        <a style="width: 80px;"class="btn btn-warning" href="Controlador?menu=CitaMedica&accion=Editar&idcita=${cm.getIdcita()}"> Editar</a>
                                        <a style="width: 80px;"class="btn btn-danger" href="Controlador?menu=CitaMedica&accion=Delete&idcita=${cm.getIdcita()}">Eliminar</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    
                   
                </div>
                
        </div>


        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>
</html>

 