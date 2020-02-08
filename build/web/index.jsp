<%-- 
    Document   : index
    Created on : 14/07/2019, 01:43:38 PM
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


                        <div class="contenedor">
                            <article>
                                <div>

                                    <h4>Llene los campos para iniciar sesión.</h4>
                                    <form action="iniciar" method="post">
                                        <div class="contenedor-inputs">
                                            <ul>

                                                <%@include file="loginLogout.jsp" %>
                                            </ul>
                                        </div>



                                    </form>
                                </div><br>

                                <a data-toggle="tab" href="#tab2"> <button id="btn-abrir-popup" class="btn-abrir-popup" onclick="location.href = 'usuario.jsp?#'">Registrarse</button></a>






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

        <%@include file="navegacion.jsp" %>






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
                            <ul class="tab-nav">
                                <li class="active"><a data-toggle="tab" href="#tab1">Descripción</a></li>
                                <li><a data-toggle="tab" href="#tab2">Alcance</a></li>
                                <li><a data-toggle="tab" href="#tab3">Objetivos</a></li>


                            </ul>
                            <!-- /product tab nav -->

                            <!-- product tab content -->
                            <div class="tab-content">
                                <!-- tab1  -->
                                <div id="tab1" class="tab-pane fade in active">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <p align="justify">Para nadie es un secreto que desde hace mucho se presenta una problemática con las mascotas
                                                en situación de calle. Según la personería de Medellín, se está registrando un aumento en estos
                                                casos de abandono y maltrato a mascotas domésticas, debido a que las personas tienen muy poca
                                                concientización al respecto de la gran responsabilidad que conlleva adoptar u cuidar una
                                                mascota, ya que muchas personas los tratan como un objeto y obsequio que se da en fechas
                                                especiales y esta situación se evidencia en las fechas decembrinas con el aumento de adopción de
                                                mascotas pero así mismo también a mediados de marzo del siguiente año incrementan los casos
                                                de abandono. Otras mascota, se encuentran en las calles por el desconocimiento de métodos de
                                                adopción y sus dueños no “encuentran” otra opción más que abandonarlas en la calle.</p>
                                        </div>
                                    </div>
                                </div>
                                <!-- /tab1  -->

                                <!-- tab2  -->
                                <div id="tab2" class="tab-pane fade in">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <p align="justify">Un aplicativo web que permite una interacción fácil entre los usuarios que desean dar en
                                                adopción o adoptar mascotas en la ciudad de Medellín. El público objetivo para este aplicativo
                                                son personas entre los 18 y 35 años.
                                                En esta aplicación las personas deben registrar un usuario para que en el momento de dar en
                                                adopción o de adoptar puedan facilitar un medio de comunicación personal, como por ejemplo:
                                                número de teléfono y correo electrónico. También, permitirá ingresar las características de las
                                                mascotas a dar en adopción, tales como: nombre, raza, vacunas, edad, tamaño, imágenes y una
                                                breve descripción de estas.
                                                El aplicativo informará a los usuarios si alguien desea adoptar su mascota a través de un correo
                                                electrónico. Y tiene un tiempo de respuesta de máximo 48 horas para habilitar o deshabilitar la
                                                opción de adopción..</p>
                                        </div>
                                    </div>
                                </div>

                                <!-- tab3  -->
                                <div id="tab3" class="tab-pane fade in">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <h4 style="text-align: center;">General</h4>
                                            <P ALIGN="justify">
                                                <br>
                                            <p>Desarrollar un aplicativo web dirigido a personas entre los 18 y 35 años que viven en la ciudad
                                                de Medellín y desean dar en adopción o adoptar mascotas.</p>
                                            <br>
                                            <h4 style="text-align: center;">Específicos</h4>
                                            <br>
                                            <ul>

                                                <li type="square">Diseñar una interfaz amigable con los diferentes usuarios.</li>

                                                <li type="square">Almacenar en una base de datos la información esencial sobre las mascotas a dar en adopción, e información de contacto del usuario.</li>

                                                <li type="square">Probar que la solución tenga la funcionalidad deseada.</li>

                                            </ul>
                                        </div>
                                    </div>
                                </div>					
                            </div>
                            <!-- /product tab content  -->
                        </div>
                    </div>
                    <!-- /product tab -->
                </div>
                <!-- /row -->
            </div>
            <!-- /container -->
        </div>
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
