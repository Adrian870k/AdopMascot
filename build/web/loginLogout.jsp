<%@page import="coneccion.consultas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="loginLogout.jsp" method="POST">

            <label style="color: white" for="usuario">Correo electronico:&nbsp;</label>
            <input type="email"  name="correo" value="" required /></br>
            <label style="color: white" for="pass">Contraseña cuenta:&nbsp;</label>
            <input type="password" name="password"  value="" required />
    
            <button type="submit" id = "enviar" value="Enviar" name="btnEnviar"  class="btn-abrir-popup">Enviar</button>
            
             <button type="reset" id = "limpiar" value="Limpiar" name="limpiar"  class="btn-abrir-popup">Limpiar</button>
             <button id="btn-abrir-popup"id = "registrar" class="btn-abrir-popup" onclick="location.href = 'usuario.jsp?#'">Registrarse</button>

        </form>
    </body>
</html>
