<%-- 
    Document   : usuario
    Created on : 14/07/2019, 01:45:25 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">


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

                    <section>
                        <div class="contenedor">
                            <article>

                                <ul class="main-nav nav navbar-nav">
                                    <li ><a href="index.jsp">Inicio</a></li>
                                    <li class="active"><a href="#">Iniciar</a></li>


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

                    <div class="col-md-12">
                        <div id="product-tab">

                            <div class="tab-content">

                                <div>

                                    <h1>Llene los campos para registrarte.</h1>
                                    <form action="nuevousuario" method="post">
                                        <div style = "align-content: center">
                                            <ul>
                                                Nombre:
                                                <li><input type="text" placeholder="Nombre Completo" name="nombre"></li><br>
                                                Edad:
                                                <li><input type="text" placeholder="Edad" name="edad"></li><br>
                                                Documento:
                                                <li><input type="text" placeholder ="Documento De Identificación" name="documento"></li><br>
                                                Telefono:
                                                <li><input type="text" placeholder="Número De Telefono Celular" name="telefono"></li><br>
                                                Correo electronico:
                                                <li><input type="email" placeholder="Correo" name="correo"></li><br>
                                                Contraseña:
                                                <li><input type="password" placeholder="Contraseña" name="password"></li><br>
                                            </ul>





                                            <input type="submit" value="Registrarse"/>
                                        </div>

                                    </form>
                                </div>
                            </div>
                        </div>	
                    </div>
                </div>
                </article>	
            </div>
        </section>
    </div>
    



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