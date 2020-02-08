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
                        <li><a href="mailto:montoyaquinadrian@gmail.com">informar errores</a></li>
                        <li class="active"><a href="#">Mascotas en espera por ser adoptadas</a></li>
                        
                         <!--<li><a href="proceso.jsp">Mascotas en proceso de adopción</a></li>-->


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














                    <form action="Controler" method="POST">
                        <input type="submit" name="accion" value="Listar">
                        
                    </form>
                    <c:forEach var="dato" items="${lista}">
                        <div class="products-slick" data-nav="#slick-nav-2">
                            <div class="product">
                                <div class="product-img">
                                    <img src="ControlerIMG?id=${dato.getId()}" width="300" height="120">

                                </div>
                                <div class="product-body">
                                    <h1>${dato.getNombre()}</h1>
                                    <p>${dato.getDescripcion()}</p>
                                    <ul style="text-align: justify;">
                                        <li><strong>Especie: </strong>${dato.getEspecie()}</li>
                                        <li><strong>Edad: </strong>${dato.getEdad()}</li>
                                        <li><strong>Vacunas: </strong>${dato.getVacuna()}</li>
                                        <li><strong>Teléfono: </strong>3008341594</li>
                                       

                                    </ul>
                                </div>
                                <div class="add-to-cart">
                                    <button class="add-to-cart-btn" onclick="location.href = 'adoptar.jsp?#'">¡ADOPTAR!</button>
                                </div>
                            </div>
                        </div>
                        <br>
                        <br>


                    </c:forEach>


                    <script src="js/jquery.min.js"></script>
                    <script src="js/bootstrap.min.js"></script>
                    <script src="js/slick.min.js"></script>
                    <script src="js/nouislider.min.js"></script>
                    <script src="js/jquery.zoom.min.js"></script>
                    <script src="js/main.js"></script>


                    </body>
                    </html>

