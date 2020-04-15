<%@page import="coneccion.consultas"%>
<%@page session = "true"%>
<nav id="navigation">
    <!-- container -->
    <div class="container">
        <!-- responsive-nav -->
        <div id="responsive-nav">
            <!-- NAV -->
            <ul class="main-nav nav navbar-nav">
                <li><a href="index.jsp">Inicio</a></li>
                <li><a href="mailto:montoyaquinadrian@gmail.com">informar errores</a></li>
                    <%
                        String nom = null;
                        
                        if(session.getAttribute("nombre")!= null){
                            nom = session.getAttribute("nombre").toString();
                    }
                       
                        
                       
                        if (nom != null) {

                            // out.print("<li><a href='proceso.jsp'>Mascotas en proceso de adopción</a></li>");
                            out.print("<li><a href='inicio.jsp'>Mascotas en espera por ser adoptadas</a></li>");
                            out.print("<li><a href='misMascotas.jsp'>Mis mascotas</a></li>");

                        }
                    %>      
            </ul>
            </ul>
            <!-- /NAV -->
        </div>
        <!-- /responsive-nav -->
    </div>
    <!-- /container -->
</nav>