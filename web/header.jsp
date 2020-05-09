<%@page import="coneccion.consultas"%>
<%@page session = "true"%>
<div id="header">
    <%@include file="userLog.jsp" %>
    <div class="container">
        <div class="row">
            <div class="col-md-3">
                <div class="header-logo">
                    <a href="#" class="logo">
                        <img src="./img/logo.png" alt="logo">
                    </a>
                </div>
            </div>
            <div style="text-align: right">
                <div class="contenedor">
                    <article>
                        <form action="Controler" method="POST" enctype="multipart/form-data">
                            <button id="btn-abrir-popup" class="btn-abrir-popup" name="accion" value="FiltrarPerro">Perros</button>
                            <button id="btn-abrir-popup" class="btn-abrir-popup" name="accion" value="FiltrarGato">Gatos</button>
                        </form>
                        <button id="btn-abrir-popup" class="btn-abrir-popup" name = "darAdopcion" onclick="location.href = 'adopcion.jsp?#'">Dar en adopción.</button>

                    </article>
                </div>
            </div>
        </div>

    </div>
</div>