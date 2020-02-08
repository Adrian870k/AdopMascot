/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import coneccion.mascota;
import coneccion.mascotaDAO;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author hp
 */
@MultipartConfig
public class Controler extends HttpServlet {

    mascotaDAO dao = new mascotaDAO();

    mascota m = new mascota();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controler</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controler at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        switch (accion) {
            case "Listar":
                List<mascota> lista = dao.listar();
                request.setAttribute("lista", lista);
                request.getRequestDispatcher("inicio.jsp").forward(request, response);
                break;
            case "Nuevo":
                request.getRequestDispatcher("adopcion.jsp").forward(request, response);
                break;
            case "Enviar":
                String nom= request.getParameter("nombre");
                String descripcion = request.getParameter("descripcion");
                Part part = request.getPart("foto");
                String edad = request.getParameter("edad");
                String vacuna = request.getParameter("vacuna");
                String especie = request.getParameter("especie");
                String telefono = request.getParameter("telefono");
                String correo = request.getParameter("correo");
                InputStream inputStream = part.getInputStream();
                m.setDescripcion(descripcion);
                m.setEdad(Integer.parseInt(edad));
                m.setEspecie(especie);
                m.setFoto(inputStream);
                m.setNombre(nom);
                m.setVacuna(vacuna);
                m.setTelefono(Integer.parseInt(telefono));
                m.setCorreo(correo);
                dao.agregar(m);
                request.getRequestDispatcher("Controler?accion=Listar").forward(request, response);
               
                
                break;
            default:
                request.getRequestDispatcher("Controler?accion=Listar").forward(request, response);

                break;
        }

    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
