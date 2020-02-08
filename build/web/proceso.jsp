<%-- 
    Document   : proceso
    Created on : 14/07/2019, 01:50:35 PM
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


                        <div style="text-align: right">
                            <div class="col-md-6">
                                <div class="header-search">
                                    <form>
                                        <div class="contenedor">
                                         <article>
                                        <select id="btn-abrir-popup" class="btn-abrir-popup">
                                            <option value="0">Filtro</option>

                                            <option value="1">Perros</option>
                                            <option value="1">Gatos</option>
                                        </select>
                                        
                                    </form>
                                </div>
                            </div>
                        </div>
                        <div class="contenedor">
                            <article>

                                <button id="btn-abrir-popup" class="btn-abrir-popup" onclick="location.href = 'adopcion.jsp?#'">Dar en adopción.</button>





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
                        <li class="active"><a href="#">Mascotas en proceso de adopción</a></li>


                    </ul>

                </div>

            </div>

        </nav>



        <div class="section">
            <!-- container -->
            <div class="container">
                <!-- row -->
                <div class="row">

                    <!-- section title -->
                    <div class="col-md-12">
                        <div class="section-title">
                            <h3 class="title">Mascotas en proceso de adopción</h3>

                        </div>
                    </div>

                    <div class="col-md-12">
                        <div class="row">
                            <div class="products-tabs">
                                <!-- tab -->
                                <div id="tab1" class="tab-pane active">
                                    <div class="products-slick" data-nav="#slick-nav-1">

                                        <!--MASCOTA 1-->
                                        <div class="product">
                                            <div class="product-img">
                                                <img src="./img/p1.jpg" alt="">

                                            </div>
                                            <div class="product-body">
                                                <h3>kevy</h3>
                                                <p>Kevy es muy simpatico, pero a veces no le gusta bañarse, pero cuando es el día del platano se pone muuy feliz</p>


                                            </div>
                                            <div class="add-to-cart">
                                                <button class="add-to-cart-btn">¡EN PROCESO!</button>
                                            </div>
                                        </div>


                                        <!--MASCOTA 2-->
                                        <div class="product">
                                            <div class="product-img">
                                                <img src="./img/p2.jpg" alt="">

                                            </div>
                                            <div class="product-body">
                                                <h3>Kant</h3>
                                                <p>¡Este amiguito tiene energia infinita!</p>


                                            </div>
                                            <div class="add-to-cart">
                                                <button class="add-to-cart-btn">¡EN PROCESO!</button>
                                            </div>
                                        </div>


                                        <!-- MASCOTA 3 -->


                                        <!-- MASCOTA 4 -->
                                        <div class="product">
                                            <div class="product-img">
                                                <img src="./img/p4.jpg" alt="">

                                            </div>
                                            <div class="product-body">
                                                <h3>King</h3>
                                                <p>King es el perro más tierno que existe :3 </p>


                                            </div>
                                            <div class="add-to-cart">
                                                <button class="add-to-cart-btn">¡EN PROCESO!</button>
                                            </div>
                                        </div>





                                    </div>
                                    <div id="slick-nav-1" class="products-slick-nav"></div>
                                </div>

                            </div>
                        </div>
                    </div>

                </div>

            </div>

        </div>



        <!-- SECTION -->
        <div class="section">
            <!-- container -->
            <div class="container">
                <!-- row -->
                <div class="row">


                </div>

                <div class="col-md-12">
                    <div class="row">
                        <div class="products-tabs">
                            <!-- tab -->
                            <div id="tab2" class="tab-pane fade in active">
                                <div class="products-slick" data-nav="#slick-nav-2">

                                    <!-- MASCOTA 5 -->
                                    <div class="product">
                                        <div class="product-img">
                                            <img src="./img/p5.jpg" alt="">

                                        </div>
                                        <div class="product-body">
                                            <h3>Louis</h3>
                                            <p>AFFVUIJA ibgiab OIGBSIKBGIKBDX</p>


                                        </div>
                                        <div class="add-to-cart">
                                            <button class="add-to-cart-btn">¡EN PROCESO!</button>
                                        </div>
                                    </div>

                                    <!-- MASCOTA 6 -->
                                    <div class="product">
                                        <div class="product-img">
                                            <img src="./img/12.jpg" alt="">

                                        </div>
                                        <div class="product-body">
                                            <h3>lúis</h3>
                                            <p>Hgjugab asoihaoiks asokahibd</p>


                                        </div>
                                        <div class="add-to-cart">
                                            <button class="add-to-cart-btn">¡EN PROCESO!</button>
                                        </div>
                                    </div>





                                </div>
                                <!-- /tab -->
                            </div>
                        </div>
                    </div>
                    <!-- /Products tab & slick -->
                </div>
                <!-- /row -->
            </div>
            <!-- /container -->
        </div>
        <!-- /SECTION -->





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

