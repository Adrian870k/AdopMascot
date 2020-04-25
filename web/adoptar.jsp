<%-- 
    Document   : adoptar
    Created on : 14/07/2019, 01:45:08 PM
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
                </div>

            </div>



        </header>



        <nav id="navigation">

            <div class="container">

                <div id="responsive-nav">

                    <ul class="main-nav nav navbar-nav">
                        <li><a href="index.jsp">Inicio</a></li>
                        <li><a href="inicio.jsp">Mascotas en espera por ser adoptadas</a></li>
                       <!--<li><a href="proceso.jsp">Mascotas en proceso de adopción</a></li>-->


                    </ul>

                </div>

            </div>

        </nav>

        <div>
            <center>
                <h1>SoulMate</h1>
                <h1>Complete los campos para confirmar.</h1>
                <form action="verificacion" method="POST">
                    <div class="contenedor-inputs">
                        Correo electronico:<br>
                        <input type="email" placeholder="Correo electronico" name="correo"><br><br>
                            Contraseña:<br>
                        <input type="password" placeholder="Contraseña" name="pass">
                    </div><br>
                     <a href="mailto:${dato.getCorreo()}">enviar correo</a>
                    <input type="submit" value="Enviar" name="enviar" />                  
                </form>
            </center>
        </div>
   








<!--PLUGINS -->

<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/slick.min.js"></script>
<script src="js/nouislider.min.js"></script>
<script src="js/jquery.zoom.min.js"></script>
<script src="js/main.js"></script>
<script src="js/popup.js"></script>



</body>
</html>
