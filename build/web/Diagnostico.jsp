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
                    <form action="Controlador?menu=Diagnostico" method="POST">

                        <div class="form-group">
                            <label for="nombres">Descripcion</label>
                            <input type="text" value="${diagnostico.getDescripcion()}" name="txtDescripcion" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="apellidos">Id cita</label>
                            <input type="text" value="${diagnostico.getIdcita()}" name="txtIdcita" class="form-control">
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
                                <th>Id diagnostico </th>
                                <th>Descripcion </th>
                                <th>Id cita </th>
                            </tr>
                        </thead>
                        <tbody>
                            
                            <c:forEach var="d" items="${Diag}">
                                <tr>
                                    <td>${d.getId()}</td>
                                    <td>${d.getDescripcion()}</td>
                                    <td>${d.getIdcita()}</td>
                                    <td>
                                        <a style="width: 80px;"class="btn btn-warning" href="Controlador?menu=Diagnostico&accion=Editar&IdDiagnostico=${d.getId()}"> Editar</a>
                                        <a style="width: 80px;"class="btn btn-danger" href="Controlador?menu=Diagnostico&accion=Delete&IdDiagnostico=${d.getId()}">Eliminar</a>
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

 
