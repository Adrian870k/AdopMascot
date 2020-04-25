<%-- 
    Document   : adopcion
    Created on : 14/07/2019, 01:48:15 PM
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
        <!-- HEADER -->
        <header>

            <div id="header">
                <%@include file="userLog.jsp" %>

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


                        <section>


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
                                    <li><a href="mailto:montoyaquinadrian@gmail.com">informar errores</a></li>
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



                    <!-- Product tab -->
                    <div class="col-md-12">
                        <div id="product-tab">
                            <!-- product tab nav -->

                            <!-- /product tab nav -->

                            <!-- product tab content -->
                            <div class="tab-content">
                                <!-- tab1  -->
                                <div id="tab1" class="tab-pane fade in active">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <center>

                                                <h1>Datos de la mascota.</h1>
                                                <div class="contenedor-inputs">
                                                    <form action="Controler" method="POST" enctype="multipart/form-data">
                                                        <ul>
                                                            <Foto:
                                                                <li><input type="file" id = "fotoSubida"placeholder="Foto de la mascota" type ="text" name="foto"/></li><br>
                                                                <b>Nombre:</b>
                                                                <li><input type="text" placeholder="Nombre" name="nombre"></li><br>

                                                                <b>Especie:</b>
                                                                <li><select id =listaEspecie" type="text" placeholder="Especie" name="especie">
                                                                        <option value="indefinida">--Seleccione--</option>
                                                                        <option class = "val" value="Perro">Perros</option>
                                                                        <option class = "val" value="Gato">Gatos</option>
                                                                    </select></li>
                                                                <br>

                                                                <b>Edad:</b>
                                                                <li><input type="text" placeholder="Edad" name="edad"></li><br>

                                                                <b>Telefono:</b>
                                                                <li><input type="text" placeholder="Telefono" name="telefono"></li><br>

                                                                <b>Correo:</b>
                                                                <li><input type="text" placeholder="Correo" name="correo"></li><br>

                                                                <b>Vacunas que tiene:</b>
                                                                <li><input type="text" placeholder="Vacunas que se le han aplicado a la mascota" name="vacuna"></li><br>

                                                                <b>Descripcion breve:</b>
                                                                <li><input type="text" placeholder ="Breve descripción de la mascota" name="descripcion"></li>

                                                        </ul></br>
                                                        <input type="submit" id= "btnEnviarAdop"class="btn-submit" name="accion" value="Enviar">
                                                    </form>

                                                </div>
                                                <br>



                                            </center>

                                        </div>







                                    </div>
                                </div>
                                <!-- /tab1  -->

                                <!-- tab2  -->

                            </div>

                        </div>	

                    </div>
                </div>

            </div>


        </div>
        <!-- /product tab -->




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

