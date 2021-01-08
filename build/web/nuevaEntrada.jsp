<%--
    Document   : index
    Created on : 15-dic-2020, 19:22:59
    Author     : Fabricio
--%>

<%@page import="Logica.Juego"%>
<%@page import="java.util.List"%>
<%@page import="Logica.Entrada"%>
<%@page import="Logica.Entrada"%>
<%@page import="Logica.Controladora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <link rel="icon" type="image/svg" href="img/dragon.svg" />
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    
    <style>
      #plus {
     margin-right: 10px;
     margin-left: 45px;
     color: #00ad5f;
     }
          #plus_emple{
     margin-right: 10px;
     margin-left: 30px;
     color: #00ad5f;
     }
     #cabecera{
     padding-left:43%;
     }
     
    </style>
    
    <title>Dungeon Park</title>

    <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body id="page-top">

    <%
                HttpSession misession = request.getSession();
                String usu = (String) request.getSession().getAttribute("usuario");
                
                if(usu == null){
                    
                    response.sendRedirect("Login.jsp");
                    
                }
             else{
            %>
    
    
    <!-- Page Wrapper -->
    <div id="wrapper">

        <!-- Sidebar -->
        <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

            <!-- Sidebar - Brand -->
            <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.jsp">
                <div class="sidebar-brand-icon">
                  <i class="fas fa-dragon"></i>
                </div>
                <div class="sidebar-brand-text mx-3">DUNGEON PARK</div>
            </a>

            <!-- Divider -->
            <hr class="sidebar-divider my-0">

            <!-- Nav Item - Dashboard -->
            <li class="nav-item active">
                <a class="nav-link" href="index.jsp">
                   <i class="fas fa-bars"></i>
                    <span>Menú</span></a>
            </li>

            <!-- Divider -->
            <hr class="sidebar-divider">

         
            <!-- Nav Item - Juegos -->
            <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseOne"
                    aria-expanded="true" aria-controls="collapseOne">
                    <i class="fas fa-gamepad"></i>
                    <span>Juegos</span>
                </a>
                <div id="collapseOne" class="collapse" aria-labelledby="headingTwo"  data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                      
                        <a class="collapse-item" href="nuevoJuego.jsp">Nuevo Juego <i id="plus" class="fas fa-plus"></i></a>
                        <a class="collapse-item" href="listaJuegos.jsp">Lista de Juegos </a>
                    </div>
                </div>
            </li>
            

            <!-- Nav Item - Entradas -->
            <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseThree"
                    aria-expanded="true" aria-controls="collapseThree">
                    <i class="fas fa-ticket-alt"></i>
                    <span>Entradas</span>
                </a>
                <div id="collapseThree" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                      
                        <a class="collapse-item" href="nuevaEntrada.jsp"> Nueva Entrada <i id="plus" class="fas fa-plus"></i> </a>
                        <a class="collapse-item" href="listaEntradas.jsp">Lista de Entradas</a>
                    </div>
                </div>
            </li>

            <!-- Nav Item - EMPLEADOS -->
            <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo"
                    aria-expanded="true" aria-controls="collapseTwo">
                    <i class="fas fa-user"></i>
                    <span>Empleados</span>
                </a>
                <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        
                        <a class="collapse-item" href="nuevoEmpleado.jsp">Nuevo Empleado <i id="plus_emple" class="fas fa-plus"></i></a>
                        <a class="collapse-item" href="listaEmpleados.jsp">Lista de Empleados</a>
                    </div>
                </div>
            </li>
        

        </ul>
        <!-- End of Sidebar -->

        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">

                <!-- Topbar -->
                <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                    <!-- Sidebar Toggle (Topbar) -->
                    <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                        <i class="fa fa-bars"></i>
                    </button>

                    <!-- Topbar Search -->
              

                    <!-- Topbar Navbar -->
                    <ul class="navbar-nav ml-auto">

                        <div class="topbar-divider d-none d-sm-block"></div>

                        <!-- Nav Item - User Information -->
                        <li class="nav-item dropdown no-arrow">
                            <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <span class="mr-2 d-none d-lg-inline text-gray-600 small">Wlodeck Fabricio</span>
                                <img class="img-profile rounded-circle"
                                    src="img/undraw_profile.svg">
                            </a>
                            <!-- Dropdown - User Information -->
                            <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
                                aria-labelledby="userDropdown">
                                <a class="dropdown-item" href="#">
                                    <i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Profile
                                </a>
                                <a class="dropdown-item" href="#">
                                    <i class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Settings
                                </a>
                                <a class="dropdown-item" href="#">
                                    <i class="fas fa-list fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Activity Log
                                </a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">
                                    <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Logout
                                </a>
                            </div>
                        </li>

                    </ul>

                </nav>
                <!-- End of Topbar -->

                <!-- Begin Page Content -->
                
                <div class="text-center">
                    <img class="img-fluid px-3 px-sm-4 mt-3 mb-4"  style="width: 25rem;"
                        src="img/complete_task.svg" alt="">
                </div>
                
                <div class="container-fluid">

                    <!-- Page Heading -->
                    
                    
                    <div class="d-sm-flex align-items-center justify-content-between mb-4">
                        
                       
                    </div>

                    <!-- Content Row -->
                           <div class="container-fluid">

                    <!-- Page Heading -->
                    <div class="d-sm-flex align-items-center justify-content-between mb-4">
                        <h1 class="h3 mb-0 text-gray-800"  id="cabecera" >CARGA ENTRADA</h1>
                       
                    </div>

                    <!-- Content Row -->
                               <div class="contact100-form">
                                <form class="form-horizontal" action="altaEntradaServlet" method ="POST">
                                <fieldset>

                                <!-- Insert DNI -->
                                <div class="form-group">
                                  <label class="col-md-4 control-label" for="dni">DNI</label>  
                                  <div class="col-md-40">
                                  <input id="dni" name="dni" type="text" placeholder="DNI sin puntos" class="form-control input-md" required="">

                                  </div>
                                </div>

                                <!-- Insert Nombre-->
                                <div class="form-group">
                                  <label class="col-md-4 control-label" for="nombre">Nombre</label>  
                                  <div class="col-md-40">
                                  <input id="nombre" name="nombre" type="text" placeholder="Nombre/s" class="form-control input-md" required="">

                                  </div>
                                </div>

                                <!-- Inserte Apellido -->
                                <div class="form-group">
                                  <label class="col-md-4 control-label" for="apellido">Apellido</label>  
                                  <div class="col-md-40">
                                  <input id="apellido" name="apellido" type="text" placeholder="Apellido/s" class="form-control input-md" required="">

                                  </div>
                                </div>

                                <!-- Inserte Fecha de Nacimiento -->
                                <div class="form-group">
                                  <label class="col-md-4 control-label" for="fecha_nac">   Fecha de  Nacimiento   </label>  
                                  <div class="col-md-40">
                                  <input id="fecha_nac" name="fecha_nac" type="Date" placeholder="Año / Mes / Dia" class="form-control input-md" required="">

                                  </div>
                                </div>

                                <!-- Inserte Nombre del Juego-->
                                <div class="form-group">
                                  <label class="col-md-4 control-label" for="juego">Juego</label>  
                                  <div class="col-md-40">                         
                                    <select id="juego" name="juego" type="text" placeholder="Nombre del Juego" class="form-control input-md" required="">
                                        <option disabled selected>Selecciona un juego</option>

                                        <%                                      	
                                    Controladora control = (Controladora) misession.getAttribute("control");
                                    List<Juego> listajuego = control.getListaJuegos();
                                        for (Juego juego : listajuego) {   
                                        %>
                                        <option name="juego"><%=juego.getNombre()%></option>

                                        <% } %>

                                    </select>
                                  </div>              
                                </div>

                                <!-- Inserte Fecha a Utilizar-->
                                <div class="form-group">
                                  <label class="col-md-4 control-label" for="fecha_utilizar">Fecha a Utilizar</label>  
                                  <div class="col-md-40">
                                  <input id="fecha_utilizar" name="fecha_utilizar" type="Date" placeholder=" Año / Mes / Dia " class="form-control input-md" required="">

                                  </div>
                                </div>

                                <!-- Inserte Hora a Utilizar-->
                                 <div class="form-group">
                                  <label class="col-md-4 control-label" for="hora_utilizar">Hora a Utilizar</label>  
                                  <div class="col-md-40">
                                  <input id="hora_utilizar" name="hora_utilizar" type="Time" placeholder=" Año / Mes / Dia " class="form-control input-md" required="">
                                  </div>
                                  
                                  <!-- Inserte DIa Fachero-->
                                 <!-- <label id="fecha" for="start">Start date:</label>
                                    <div class="col-md-40">
                                    <input type="date" id="start" name="trip-start"
                                           placeholder=" 2018-07-22 "
                                           value="2018-07-22"
                                           min="2018-01-01" max="2018-12-31"
                                           class="form-control input-md">
                                    </div>-->
                                  
                                  <!-- Button -->
                                    <div class="form-group">
                                      <label class="col-md-4 control-label" for="Enviar"></label>
                                      <div class="col-md-40">
                                        <button type="submit" name="Enviar" class="btn btn-primary">Enviar</button>
                                      </div>
                                        </div>
            
                                </fieldset>
                                </form>

                      </div>

                    <!-- Content Row -->

                    <div class="row">
                    </div>

                    <!-- Content Row -->
                    <div class="row">

                    </div>

                </div>
                <!-- /.container-fluid -->

            </div>
            <!-- End of Main Content -->

            <!-- Footer -->
            <footer class="sticky-footer bg-white">
                <div class="container my-auto">
                    <div class="copyright text-center my-auto">
                        <span>Copyright &copy; Dungeon Park 2020</span>
                    </div>
                </div>
            </footer>
            <!-- End of Footer -->

        </div>
        <!-- End of Content Wrapper -->

    </div>
    <!-- End of Page Wrapper -->

    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>

    <!-- Logout Modal-->
    <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
        aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                    <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                </div>
                <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
                <div class="modal-footer">
                    <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                    <a class="btn btn-primary" href="Login.jsp">Logout</a>
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap core JavaScript-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="js/sb-admin-2.min.js"></script>

    <!-- Page level plugins -->
    <script src="vendor/chart.js/Chart.min.js"></script>

    <!-- Page level custom scripts -->
    <script src="js/demo/chart-area-demo.js"></script>
    <script src="js/demo/chart-pie-demo.js"></script>

</body>
<%   
}

 %>
</html>