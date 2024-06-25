<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-info">
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="#">Home </a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href=" Controlador?menu=Paciente&accion=Listar" target="myFrame">Pacientes</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light"href="Controlador?menu=Medico&accion=Listar"target="myFrame">Medicos</a>

                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light"href="Controlador?menu=CitaMedica&accion=Listar"target="myFrame">Citas Medicas</a>

                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light"href="Controlador?menu=Diagnostico&accion=Listar"target="myFrame">Diagnosticos</a>

                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light"href="Controlador?menu=ExamenMedico&accion=Listar"target="myFrame">Examenes Medicos</a>

                    </li>
                    <div class="btn-group">
                    <button type="button" style="margin-left: 10px; border: none" class="btn btn-outline-light dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Vistas
                    </button>
                        
                    <div class="dropdown-menu bg-primary">
                        <a style=" border: none"class="dropdown-item bg-primary text-white" href="Controlador?menu=Vista1&accion=Listar" target="myFrame">Vista 1</a>
                        <a style=" border: none"class="dropdown-item bg-primary text-white" href="Controlador?menu=Vista2&accion=Listar"target="myFrame">Vista 2</a>
                        <a style=" border: none"class="dropdown-item bg-primary text-white" href="Controlador?menu=Vista3&accion=Listar"target="myFrame">Vista 3</a>
                        <a style=" border: none"class="dropdown-item bg-primary text-white" href="Controlador?menu=Vista4&accion=Listar"target="myFrame">Vista 4</a>
                        <a style=" border: none"class="dropdown-item bg-primary text-white" href="Controlador?menu=Vista5&accion=Listar"target="myFrame">Vista 5</a>
                    </div>
                </div>
                </ul>
            </div>
        </nav>
        <div class="m-4" style="height: 550px;">
            <iframe name="myFrame" style="height: 100%; width: 100%; border: none"></iframe>
        </div>
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>
</html> 
