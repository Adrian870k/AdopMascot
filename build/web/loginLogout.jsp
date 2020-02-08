<%-- 
    Document   : newjsp
    Created on : 18/07/2019, 02:08:28 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="" method="POST">
             
                <label for="usuario">correo electronico</label>
                <input type="email" name="correo" value="" required /> <br/>
                <label for="pass">Contraseña cuenta</label>
                <input type="password" name="password" value="" required />
                 
                 
               
                    <input type="submit" value="Enviar" name="enviar" />
                    <input type="reset" value="Limpiar" name="limpiar" />  
                
                  

                <!-- Si el nombre de usuario o password es invalido muestra el sigueinte mensaje -->
                
            </form>
    </body>
</html>
