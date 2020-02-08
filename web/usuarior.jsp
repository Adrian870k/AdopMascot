<%-- 
    Document   : usuarior
    Created on : 14/07/2019, 01:45:45 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

        <title>SOULMATE</title>

        <link rel="icon" type="image/png" href="img/logo.png" />


        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700" rel="stylesheet">


        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"/>


        <link type="text/css" rel="stylesheet" href="css/slick.css"/>
        <link type="text/css" rel="stylesheet" href="css/slick-theme.css"/>


        <link type="text/css" rel="stylesheet" href="css/nouislider.min.css"/>


        <link rel="stylesheet" href="css/font-awesome.min.css">


        <link type="text/css" rel="stylesheet" href="css/style.css"/>
        <link type="text/css" rel="stylesheet" href="css/style2.css"/>




    </head>
    <body>
        <!-- HEADER -->
        <header>

            <div id="header">

                <div class="container">

                    <div class="row">

                        <div class="col-md-3">
                            <div class="header-logo">
                                <a href="#" class="logo">
                                    <img src="./img/logo.png" alt="">
                                </a>
                            </div>
                        </div>


                        <!-- SEARCH BAR -->
                        <div class="col-md-6">
                            <div class="header-search">
                                <form>
                                    <select class="input-select">
                                        <option value="0">Filtro</option>

                                        <option value="1">Perros</option>
                                        <option value="1">Gatos</option>

                                    </select>
                                    <input class="input" placeholder="Buscar Aquí">
                                    <button class="search-btn">Buscar</button>
                                </form>
                            </div>
                        </div>


                        <section>
                            <div class="contenedor">
                                <article>

                                    <a data-toggle="tab" href="#tab1"> <button  class="btn-abrir-popup" onclick="location.href = 'usuario.jsp?#'">Iniciar sesión</button></a>
                                    <a data-toggle="tab" href="#tab2"> <button id="btn-abrir-popup" class="btn-abrir-popup" onclick="location.href = '#'">Registrarse</button></a>







                            </div>

                    </div>
                    <!-- row -->
                </div>
                <!-- container -->
            </div>
            <!-- /MAIN HEADER -->
        </header>
        <!-- /HEADER -->

        <!-- NAVIGATION -->
        <nav id="navigation">
            <!-- container -->
            <div class="container">
                <!-- responsive-nav -->
                <div id="responsive-nav">
                    <!-- NAV -->
                    <ul class="main-nav nav navbar-nav">
                        <li ><a href="index.jsp">Inicio</a></li>
                        <li class="active"><a href="usuario.jsp">Iniciar</a></li>


                    </ul>
                    <!-- /NAV -->
                </div>
                <!-- /responsive-nav -->
            </div>
            <!-- /container -->
        </nav>
        <!-- /NAVIGATION -->



        <!-- SECTION -->
        <div class="section">
            <!-- container -->
            <div class="container">
                <!-- row -->
                <div class="row">


                    <!-- Product tab -->
                    <div class="col-md-12">
                        <div id="product-tab">
                            
                            <div class="tab-content">

                                <div id="tab2" class="tab-pane fade in">
                                    <div class="row">


                                        <div class="overlay" id="overlay">
                                            <div class="popup" id="popup">
                                                <a href="#" id="btn-cerrar-popup" class="btn-cerrar-popup"><i class="fas fa-times"></i></a>
                                                <div>
                                                    <h3>SoulMate</h3>
                                                    <h4>Llene los campos para registrarte.</h4>
                                                    <form action="nuevousuario" method="post">
                                                        <div class="contenedor-inputs">
                                                            <input type="text" placeholder="Nombre Completo" name="nombre">
                                                            <input type="text" placeholder="Edad" name="edad">
                                                            <input type="text" placeholder ="Documento De Identificación" name="documento">
                                                            <input type="text" placeholder="Número De Telefono Celular" name="telefono">
                                                            <input type="email" placeholder="Correo" name="correo">
                                                            <input type="password" placeholder="Contraseña" name="password">
                                                            <input type="submit" value="Registrarse"/>
                                                        </div>
                                                       

                                                    </form>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>	

                    </div>
                </div>

            </div>


        </div>
        <!-- /product tab -->

        <!-- /row -->

        <!-- /container -->

        <!-- /SECTION -->




        <!-- jQuery Plugins -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/slick.min.js"></script>
        <script src="js/nouislider.min.js"></script>
        <script src="js/jquery.zoom.min.js"></script>
        <script src="js/main.js"></script>
        <script src="js/popup.js"></script>

    </body>
</html>
