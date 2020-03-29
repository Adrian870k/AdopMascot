<%@page import="java.sql.SQLException"%>
<%@page import="coneccion.conexion"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="coneccion.mascota"%>
<%@page import="java.sql.PreparedStatement"%>
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
        <%
            HttpSession sesion = request.getSession();
            String user;
            String id;
            if (sesion.getAttribute("correo") != null && sesion.getAttribute("id") != null) {
                user = sesion.getAttribute("correo").toString();
                id = sesion.getAttribute("id").toString();
                String nombreUsuario = "";
                PreparedStatement pst = null;
                mascota m = new mascota();

                ResultSet rs = null;

                try {
                    String consulta = "select nombre from soulmate.usuario where id = ?";
                    pst = conexion.getConnection().prepareStatement(consulta);
                    pst.setString(1, id);
                    rs = pst.executeQuery();
                    if (rs.next()) {
                        nombreUsuario = rs.getString(1);
                        sesion.setAttribute("nombre", nombreUsuario);
                    }
                } catch (SQLException e) {
                    System.err.print("Error" + e);
                }

                out.print("<h5>Bienvenido " + nombreUsuario + "</h5>");
            } else {
                out.print("<script>location.replace('index.jsp');</script>");
            }

        %>
    </body>
</html>
