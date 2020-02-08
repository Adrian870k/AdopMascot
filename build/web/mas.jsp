<%-- 
    Document   : mas
    Created on : 18/07/2019, 09:08:40 AM
    Author     : hp
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <div>
            <form action="Controler" method="POST">
                <input type="submit" name="accion" value="Listar">
                <input type="submit" name="accion" value="Nuevo">
            </form>
            <table>
                <thead>
                    <tr>
                        <th>id</th>
                        <th>Nombre</th>
                        <th>especie</th>
                        <th>edad</th>
                        <th>foto</th>
                        <th>descripcion</th>
                        <th>vacuna</th>

                    </tr>

                </thead>
                <tbody>
                    <c:forEach var="dato" items="${lista}">
                        <tr>
                            <td>${dato.getId()}</td>
                            <td>${dato.getNombre()}</td>
                            <td>${dato.getEspecie()}</td>
                            <td>${dato.getEdad()}</td>
                            
                            <td><img src="ControlerIMG?id=${dato.getId()}" width="300" height="168"></td>
                            <td>${dato.getDescripcion()}</td>
                            <td>${dato.getVacuna()}</td>
                            <td><form action="Controler" method="POST">
                <input type="submit" name="accion" value="editar">
                <input type="submit" name="accion" value="eliminar">
            </form></td>
                        </tr>


                    </c:forEach>


                </tbody>

            </table>

            
        </div>
    </center>
</body>
</html>
