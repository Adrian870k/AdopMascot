<%@page import="coneccion.consultas"%>
<nav id="navigation">
    <!-- container -->
    <div class="container">
        <!-- responsive-nav -->
        <div id="responsive-nav">
            <!-- NAV -->
            <ul class="main-nav nav navbar-nav">
                <li><a href="index.jsp">Inicio</a></li>
               <li><a href="mailto:montoyaquinadrian@gmail.com">informar errores</a></li>
                <!-- Si el usuario logueado es el administrador muestra el hipervínculo maestros -->
                <%
                    String nom = null;
                    consultas con = new consultas();
                   // String correo = request.getParameter("correo");
                    String password = request.getParameter("password");
                     nom = (String) session.getAttribute("correo");
                   
                    if (nom != null) {
                       

                           // out.print("<li><a href='proceso.jsp'>Mascotas en proceso de adopción</a></li>");
                            out.print("<li><a href='usuario.jsp'>Mi cuenta</a></li>");
                            out.print("<li><a href='inicio.jsp'>Mascotas en espera por ser adoptadas</a></li>");
                           
                        
                    }
                %>      

                <!-- Si el usuario logueado es el administrador o un usuario, muestra el hipervínculo maestros -->
               
            </ul>
            </ul>
            <!-- /NAV -->
        </div>
        <!-- /responsive-nav -->
    </div>
    <!-- /container -->
</nav>