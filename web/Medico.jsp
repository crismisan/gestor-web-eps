<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Modelo.Medicos"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Registro de Paciente</title>
        <!-- Enlace a Bootstrap -->
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body >
        <div class="container-fluid>">
        <div class="d-flex" style="height: 100vh;  ">
            <div class="card col-3" style="overflow-y: auto; height: 100%;">
                <div class="card-body">
                    <form action="Controlador?menu=Medico" method="POST">
                        <div class="form-group">
                            <label for="idmedico">id</label>
                            <input type="text" value="${medico.ID_medico}" name="txtIDmedico" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="Nombre">Nombre</label>
                            <input type="text" value="${medico.getNombre()}" name="txtNombre" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="Telefono">Telefono</label>
                            <input type="text" value="${medico.getTelefono()}" name="txtTelefono" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="Licencia">Licencia</label>
                            <input type="text" value="${medico.getLicencia()}" name="txtLicencia" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="Direccion">Direccion</label>
                            <input type="text" value="${medico.getDireccion()}" name="txtDireccion" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="fecha_ingreso">Fecha de ingreso</label>
                            <input type="date" value="${medico.getFecha_ing()}" name="txtFechaIngreso" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="fecha_retiro">Fecha Retiro</label>
                            <input type="date" value="${medico.getFecha_ret()}" name="txtFechaRetiro" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="idmunicipio">Id Municipio</label>
                            <select class="form-control" name="txtIdmunicipio" required>
                                <option value="1" ${medico.getMunicipioID() == 1 ? 'selected' : ''}> Chia </option> 
                                <option value="2" ${medico.getMunicipioID() == 2 ? 'selected' : ''}> Cájica </option> 
                                <option value="3" ${medico.getMunicipioID() == 3 ? 'selected' : ''}> Cota </option> 
                                <option value="4" ${medico.getMunicipioID() == 4 ? 'selected' : ''}> Granada </option> 
                                <option value="5" ${medico.getMunicipioID() == 5 ? 'selected' : ''}> Soacha </option> 
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="especialidad">Especialidad</label>
                            <input type="text" value="${paciente.Especialidad()}" name="txtEspecialidad" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="tipomedico">Tipo de medico</label>
                            <select class="form-control" name="txtTipomedico" required>

                                <option value="1" ${medico.getTipoID() == 1 ? 'selected' : ''}>Principal</option>
                                <option value="2" ${medico.getTipoID() == 2 ? 'selected' : ''}>Sustituto</option>

                            </select>
                        </div>
                        <div class="form-group">
                            <label for="sedeMedico">Sede del Medico</label>
                            <select class="form-control" name="txtIdSedeMedico" required>
                                <option value="1" ${medico.getID_sede() == 1 ? 'selected' : ''}>Bogotá</option>
                                <option value="2" ${medico.getID_sede() == 2 ? 'selected' : ''}>Cali</option>
                                <option value="3" ${medico.getID_sede() == 3 ? 'selected' : ''}>Medellin</option>
                                <option value="4" ${medico.getID_sede() == 4 ? 'selected' : ''}>Cartagena</option>
                                <option value="5" ${medico.getID_sede() == 5 ? 'selected' : ''}>Barranquilla</option>
                                <option value="6" ${medico.getID_sede() == 6 ? 'selected' : ''}>Cúcuta</option>
                                <option value="7" ${medico.getID_sede() == 7 ? 'selected' : ''}>Villavicencio</option>
                                <option value="8" ${medico.getID_sede() == 8 ? 'selected' : ''}>Pasto</option>
                                <option value="9" ${medico.getID_sede() == 9 ? 'selected' : ''}>Leticia</option>
                            </select>
                        </div>  
                        <input type="submit" name="accion" value="Agregar" class="btn btn-info">
                        <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                    </form>
                </div>
            </div>
            <div class="container-fluid>">
                <div class="col-10" style="max-height: 500px; overflow: auto;">
                    <div class="col-sm-8">
                        <div style="width: 150%; overflow-x: auto;">
                            <table class="table table-hover" style="width: 80%; overflow-x: auto;">
                                <thead>
                                    <tr>
                                        <th>Id </th>
                                        <th>Nombre </th>
                                        <th>Telefono </th>
                                        <th>Licencia </th>
                                        <th>Direccion </th>
                                        <th>Fecha ingreso </th>
                                        <th>Fecha retiro</th>
                                        <th> Id Municipio </th>
                                        <th>Especialidad </th>
                                        <th>Tipo de medico </th>
                                        <th>Id Sede </th>
                                    </tr>
                                </thead>
                                <tbody>

                                    <c:forEach var="me" items="${medicos}">
                                        <tr>
                                            <td>${me.getID_medico()}</td>
                                            <td>${me.getNombre()}</td>
                                            <td>${me.getTelefono()}</td>
                                            <td>${me.getLicencia()}</td>
                                            <td>${me.getDireccion()}</td>
                                            <td>${me.getFecha_ing()}</td>
                                            <td>${me.getFecha_ret()}</td>
                                            <td>${me.getMunicipioID()}</td>
                                            <td>${me.getEspecialidad()}</td>
                                            <td>${me.getTipoID()}</td>
                                            <td>${me.getID_sede()}</td>
                                            <td>
                                                <a style="width: 80px;"class="btn btn-warning" href="Controlador?menu=Medico&accion=Editar&ID_medico=${me.getID_medico()}"> Editar</a>
                                                <a style="width: 80px;"class="btn btn-danger" href="Controlador?menu=Medico&accion=Delete&ID_medico=${me.getID_medico()}">Eliminar</a>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div> 
                    </div>
                </div>
            </div>
        </div>


        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
        </div>
        </body>
</html>


