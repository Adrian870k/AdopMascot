<%-- 
    Document   : inicio
    Created on : 14/07/2019, 01:49:15 PM
    Author     : hp
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            </div>




        </header>



        <nav id="navigation">

            <div class="container">

                <div id="responsive-nav">

                    <ul class="main-nav nav navbar-nav">
                        <li><a href="index.jsp">Inicio</a></li>
                        <li class="active"><a href="#">Mascotas en espera por ser adoptadas</a></li>
                        <li><a href="proceso.jsp">Mascotas en proceso de adopción</a></li>


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
                            <h1 class="title">Mascotas en espera de adopción</h1>

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
                                                <img src="./img/01.jpg" alt="">

                                            </div>
                                            <div class="product-body">
                                                <h3>Laila</h3>
                                                <c:forEach var="dato" items="${lista}">
                                                <p>${dato.getDescripcion()}</p>
                                                </c:forEach>

                                            </div>
                                            <div class="add-to-cart">
                                                <button class="add-to-cart-btn" onclick="location.href = 'adoptar.jsp'">¡ADOPTAR!</button>
                                            </div>
                                        </div>


                                        <!--MASCOTA 2-->
                                        <div class="product">
                                            <div class="product-img">
                                                <img src="./img/02.jpg" alt="">

                                            </div>
                                            <div class="product-body">
                                                <h3>Hachiko</h3>
                                                <p>Hachico es un cachorro muy divertido, le gusta hacer mucho ejercicio y disfrutar al aire libre.</p>


                                            </div>
                                            <div class="add-to-cart">
                                                <button class="add-to-cart-btn">¡ADOPTAR!</button>
                                            </div>

                                        </div>


                                        <!-- MASCOTA 3 -->


                                        <div class="product">
                                            <div class="product-img">
                                                <img src="./img/03.jpg" alt="">

                                            </div>
                                            <div class="product-body">
                                                <h3>Simon</h3>
                                                <p>Este es el mejor gato del mundo</p>

                                            </div>
                                            <div class="add-to-cart">

                                                <button class="add-to-cart-btn">¡ADOPTAR!</button>
                                            </div>
                                        </div>


                                        <!-- MASCOTA 4 -->



                                        <!-- MASCOTA 5 -->
                                        <div class="product">
                                            <div class="product-img">
                                                <img src="./img/05.jpg" alt="">

                                            </div>
                                            <div class="product-body">
                                                <h3>Lucas</h3>
                                                <p>Soy muy divertido</p>


                                            </div>
                                            <div class="add-to-cart">
                                                <button class="add-to-cart-btn">¡ADOPTAR!</button>
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
                                    <!-- MASCOTA 6 -->

                                    <div class="product">
                                        <div class="product-img">
                                            <img src="./img/09.jpg" alt="">

                                        </div>
                                        <div class="product-body">
                                            <h3>Nina</h3>
                                            <p>GUGJVjkibkiblños nbiodbcbixdx</p>


                                        </div>
                                        <div class="add-to-cart">
                                            <button class="add-to-cart-btn">¡ADOPTAR!</button>
                                        </div>
                                    </div>


                                    <!--MASCOTA 10-->
                                    <div class="product">
                                        <div class="product-img">
                                            <img src="./img/10.jpg" alt="">

                                        </div>
                                        <div class="product-body">
                                            <h3>Mike</h3>
                                            <p>IUGIUJGBgbbknhsosjosj</p>


                                        </div>
                                        <div class="add-to-cart">
                                            <button class="add-to-cart-btn">¡ADOPTAR!</button>
                                        </div>
                                    </div>
                                </div>


                                <div id="slick-nav-2" class="products-slick-nav"></div>
                            </div>
                            <!-- /tab -->
                        </div>
                    </div>
                </div>
                <!-- /Products tab & slick -->
            </div>
            <!-- /row -->
        </div>


        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/slick.min.js"></script>
        <script src="js/nouislider.min.js"></script>
        <script src="js/jquery.zoom.min.js"></script>
        <script src="js/main.js"></script>


    </body>
</html>

