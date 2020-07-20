/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import coneccion.consultas;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp
 */
public class registrarusuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String nombre = request.getParameter("nombre");
        String edad = request.getParameter("edad");
        String documento = request.getParameter("documento");
        String telefono = request.getParameter("telefono");
        String correo = request.getParameter("correo");
        String password = request.getParameter("password");
        if (nombre.equals("") || edad.equals("") || documento.equals("") || password.equals("") || telefono.equals("") || correo.equals("")) {
            out.write("<script> alert(\"Faltan campos obligatorios\"); window.history.back();  </script>");
        } else {
            if (nombre.length() > 45) {
                out.write("<script> alert(\"Nombre ingresado demasiado largo\"); window.history.back();  </script>");
            } else if (edad.length() > 45) {
                out.write("<script> alert(\"Edad ingresada demasiado largo\"); window.history.back();  </script>");
            } else if (documento.length() > 15) {
                out.write("<script> alert(\"Documento ingresado demasiado largo\"); window.history.back();  </script>");
            } else if (password.length() > 30) {
                out.write("<script> alert(\"Password ingresado demasiado largo\"); window.history.back();  </script>");
            } else if (telefono.length() > 11) {
                out.write("<script> alert(\"Telefono ingresado demasiado largo\"); window.history.back();  </script>");
            } else if (correo.length() > 45) {
                out.write("<script> alert(\"Correo ingresado demasiado largo\"); window.history.back();  </script>");
            } else {
                consultas co = new consultas();

                if (co.registrar(nombre, Integer.parseInt(edad), Integer.parseInt(documento), Integer.parseInt(telefono), correo, password)) {
                    System.out.println("op1");
                    request.getRequestDispatcher("Controler?accion=Listar").forward(request, response);
                } else {
                    System.out.println("op2");
                    response.sendRedirect("usuario.jsp");
                }

            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
