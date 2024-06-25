<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Modelo.Pacientes"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="d-flex">
           
            <div>
                <div class="col-1000">
                    <table class="table table-hover"style="width: 100%;">
                        <thead>
                            <tr>
                                <th>Sede </th>
                                <th>Modalidad consulta </th>
                                <th>Id paciente </th>
                                <th>Nombre del pacientes</th>
                                <th>Apellido del paciente</th>
                                <th>Diagnostico</th>
                                <th>Mes</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="v3" items="${vista3}">
                                <tr>
                                    <td>${v3.getSede()}</td>
                                    <td>${v3.getModalidad_consulta()}</td>
                                    <td>${v3.getIdpaciente()}</td>
                                    <td>${v3.getNombre()}</td>
                                    <td>${v3.getApellido()}</td>
                                    <td>${v3.getDiagnostico()}</td>
                                    <td>${v3.getMes()}</td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>
</html>

