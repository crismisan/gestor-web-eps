<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Modelo.Pacientes"%>
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
                    <form action="Controlador?menu=Paciente" method="POST">
                        <div class="form-group">
                            <label>Identificación</label>
                            <input type="text" value="${paciente.getIdentificacion()}" name="txtIdentificacion" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="fechaNacimiento">Fecha de Nacimiento</label>
                            <input type="date" value="${paciente.getFechaN()}" name="txtFechaNacimiento" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="nombres">Nombres</label>
                            <input type="text" value="${paciente.getNombres()}" name="txtNombres" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="apellidos">Apellidos</label>
                            <input type="text" value="${paciente.getApellidos()}" name="txtApellidos" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="correoElectronico">Direccion Correspondencia</label>
                            <input type="text" value="${paciente.getDireccion_corres()}" name="txtDireccionCorres" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="direccionResidencia">Dirección de Residencia</label>
                            <input type="text" value="${paciente.getDireccion_resid()}" name="txtDireccionResidencia" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="telefono">Teléfono</label>
                            <input type="text" value="${paciente.getTelefono()}" name="txtTelefono" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="celular">Celular</label>
                            <input type="text" value="${paciente.getCelular()}" name="txtCelular" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="estrato">Estrato</label>
                            <select class="form-control" name="txtEstrato" required>
                                <option value="1" ${paciente.getEstrato() == 1 ? 'selected' : ''}> 1 </option> 
                                <option value="2" ${paciente.getEstrato() == 2 ? 'selected' : ''}> 2 </option> 
                                <option value="3" ${paciente.getEstrato() == 3 ? 'selected' : ''}> 3 </option> 
                                <option value="4" ${paciente.getEstrato() == 4 ? 'selected' : ''}> 4 </option> 
                                <option value="5" ${paciente.getEstrato() == 5 ? 'selected' : ''}> 5 </option> 
                                <option value="6" ${paciente.getEstrato() == 6 ? 'selected' : ''}> 6 </option> 
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="lugarNacimiento">Lugar de nacimiento</label>
                            <input type="text" value="${paciente.getLugarN()}" name="txtLugarNto" class="form-control">
                        </div>
                        <div class="form-group">
                            <label for="sedeAfiliacion">Ciudad de Afiliación</label>
                            <select class="form-control" name="txtIdSedeAfiliacion" required>

                                <option value="1" ${paciente.getIdCiudadAfiliacion() == 1 ? 'selected' : ''}>Santa Marta</option>
                                <option value="2" ${paciente.getIdCiudadAfiliacion() == 2 ? 'selected' : ''}>Chocó</option>
                                <option value="3" ${paciente.getIdCiudadAfiliacion() == 3 ? 'selected' : ''}>SA</option>
                                <option value="4" ${paciente.getIdCiudadAfiliacion() == 4 ? 'selected' : ''}>Bucaramanga</option>
                                <option value="5" ${paciente.getIdCiudadAfiliacion() == 5 ? 'selected' : ''}>Pereira</option>
                                <option value="6" ${paciente.getIdCiudadAfiliacion() == 6 ? 'selected' : ''}>Cali</option>
                                <option value="7" ${paciente.getIdCiudadAfiliacion() == 7 ? 'selected' : ''}>Medellin</option>
                                <option value="8" ${paciente.getIdCiudadAfiliacion() == 8 ? 'selected' : ''}>Barranquilla</option>
                                <option value="9" ${paciente.getIdCiudadAfiliacion() == 9 ? 'selected' : ''}>Cartagena</option>
                                <option value="11" ${paciente.getIdCiudadAfiliacion() == 11 ? 'selected' : ''}>Bogotá</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="ciudadNatal">Ciudad Natal</label>
                            <select class="form-control" name="txtIdCiudadNatal" required>
                                <option value="1" ${paciente.getIdCiudadNatal() == 1 ? 'selected' : ''}>Valledupar</option>
                                <option value="2" ${paciente.getIdCiudadNatal() == 2 ? 'selected' : ''}>Manizales</option>
                                <option value="3" ${paciente.getIdCiudadNatal() == 3 ? 'selected' : ''}>Bello</option>
                                <option value="4" ${paciente.getIdCiudadNatal() == 4 ? 'selected' : ''}>Leticia</option>
                                <option value="5" ${paciente.getIdCiudadNatal() == 5 ? 'selected' : ''}>Pasto</option>
                                <option value="6" ${paciente.getIdCiudadNatal() == 6 ? 'selected' : ''}>Cúcuta</option>
                                <option value="7" ${paciente.getIdCiudadNatal() == 7 ? 'selected' : ''}>Villavicencio</option>
                                <option value="8" ${paciente.getIdCiudadNatal() == 8 ? 'selected' : ''}>Ibague</option>
                                <option value="9" ${paciente.getIdCiudadNatal() == 9 ? 'selected' : ''}>Pereira</option>

                            </select>
                        </div>
                        <div class="form-group">
                            <label for="sedePaciente">Sede del Paciente</label>
                            <select class="form-control" name="txtIdSedePaciente" required>
                                <option value="1" ${paciente.getIdSede() == 1 ? 'selected' : ''}>Bogotá</option>
                                <option value="2" ${paciente.getIdSede() == 2 ? 'selected' : ''}>Cali</option>
                                <option value="3" ${paciente.getIdSede() == 3 ? 'selected' : ''}>Medellin</option>
                                <option value="4" ${paciente.getIdSede() == 4 ? 'selected' : ''}>Cartagena</option>
                                <option value="5" ${paciente.getIdSede() == 5 ? 'selected' : ''}>Barranquilla</option>
                                <option value="6" ${paciente.getIdSede() == 6 ? 'selected' : ''}>Cúcuta</option>
                                <option value="7" ${paciente.getIdSede() == 7 ? 'selected' : ''}>Villavicencio</option>
                                <option value="8" ${paciente.getIdSede() == 8 ? 'selected' : ''}>Pasto</option>
                                <option value="9" ${paciente.getIdSede() == 9 ? 'selected' : ''}>Leticia</option>
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
                                <th>Identificacion </th>
                                <th>Fecha nacimiento </th>
                                <th>Nombres </th>
                                <th>Apellidos </th>
                                <th>Direccion </th>
                                <th>Direccion </th>
                                <th>Telefono</th>
                                <th>Celular </th>
                                <th>Estrato </th>
                                <th>Lugar de nacimiento </th>
                                <th>Ciudad Nacimiento </th>
                                <th>Ciudad afiliación </th>
                                <th>Ciudad Natal </th>
                                <th>Sede </th>
                            </tr>
                        </thead>
                        <tbody>
                            
                            <c:forEach var="pa" items="${pacientes}">
                                <tr>
                                    <td>${pa.getIdentificacion()}</td>
                                    <td>${pa.getFechaN()}</td>
                                    <td>${pa.getNombres()}</td>
                                    <td>${pa.getApellidos()}</td>
                                    <td>${pa.getDireccion_corres()}</td>
                                    <td>${pa.getDireccion_resid()}</td>
                                    <td>${pa.getTelefono()}</td>
                                    <td>${pa.getCelular()}</td>
                                    <td>${pa.getEstrato()}</td>
                                    <td>${pa.getLugarN()}</td>
                                    <td>${pa.getIdCiudadAfiliacion()}</td>
                                    <td>${pa.getIdCiudadNatal()}</td>
                                    <td>${pa.getIdSede()}</td>
                                    <td>
                                        <a style="width: 80px;"class="btn btn-warning" href="Controlador?menu=Paciente&accion=Editar&identificacion=${pa.getIdentificacion()}"> Editar</a>
                                        <a style="width: 80px;"class="btn btn-danger" href="Controlador?menu=Paciente&accion=Delete&identificacion=${pa.getIdentificacion()}">Eliminar</a>
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

 