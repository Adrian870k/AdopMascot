/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import coneccion.consultas;
import coneccion.mascota;
import coneccion.mascotaDAO;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Calendar;
import java.text.SimpleDateFormat;

import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.servlet.http.HttpSession;

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
    static final int CHUNK_SIZE = 1024 * 4;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion = request.getSession();
        List<mascota> listaFiltrada;
        String accion = request.getParameter("accion");
        String idMascota = "";
        PrintWriter out = response.getWriter();
        switch (accion) {
            case "Listar":
                List<mascota> lista = dao.listar();
                request.setAttribute("lista", lista);
                request.getRequestDispatcher("inicio.jsp").forward(request, response);
                break;
            case "Listar mis mascotas":
                List<mascota> listaMisMascotas = dao.listarMisMascotas(sesion.getAttribute("id").toString());
                request.setAttribute("listaMisMascotas", listaMisMascotas);
                request.getRequestDispatcher("misMascotas.jsp").forward(request, response);
                break;
            case "Nuevo":
                request.getRequestDispatcher("adopcion.jsp").forward(request, response);
                break;
            case "Enviar":
                String rutaNombreArchivo = "";
                String nombreImagen = "";
                try {
                    Part ParteDelArchivo = request.getPart("foto");
                    String fileName = Paths.get(ParteDelArchivo.getSubmittedFileName()).getFileName().toString();

                    String extension[];
                    extension = fileName.split("\\.");
                    InputStream fileContent = ParteDelArchivo.getInputStream();
                    Calendar calendar = Calendar.getInstance();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss");
                    String Hrc = simpleDateFormat.format(calendar.getTime());
                    nombreImagen = "NV" + Hrc + "." + extension[1];
                    rutaNombreArchivo = "C:\\IDE\\workspace\\SoulMate\\web\\imagenesSubidas\\" + nombreImagen;
                    OutputStream os = new BufferedOutputStream(new FileOutputStream(new File(rutaNombreArchivo)));
                    byte[] chunk = new byte[CHUNK_SIZE];
                    int bytesLeidos = 0;

                    while ((bytesLeidos = fileContent.read(chunk)) > 0) {
                        os.write(chunk, 0, bytesLeidos);
                    }
                    os.close();

                } catch (Exception e) {
                    System.out.println("Error " + e);
                }
                String nom = request.getParameter("nombre");
                String descripcion = request.getParameter("descripcion");
                String edad = request.getParameter("edad");
                String vacuna = request.getParameter("vacuna");
                String especie = request.getParameter("especie");
                String telefono = request.getParameter("telefono");
                String correo = request.getParameter("correo");
                String idDueño = sesion.getAttribute("id").toString();

                if (nom.equals("") || descripcion.equals("") || edad.equals("") || vacuna.equals("") || especie.equals("") || telefono.equals("") || correo.equals("") || idDueño.equals("") || nombreImagen.equals("")) {
                    out.write("<script> alert(\"Faltan campos obligatorios\"); window.history.back();  </script>");
                } else {
                    if (edad.length() > 3) {
                        out.write("<script> alert(\"Edad ingresada demasiado largo\"); window.history.back();  </script>");
                    } else {
                        try {
                            m.setDescripcion(descripcion);
                            m.setEdad(Integer.parseInt(edad));
                            m.setEspecie(especie);
                            m.setFoto(nombreImagen);
                            m.setNombre(nom);
                            m.setVacuna(vacuna);
                            m.setTelefono(Integer.parseInt(telefono));
                            m.setCorreo(correo);
                            System.out.println("Este es el id: " + idDueño);
                            m.setDueño(Integer.parseInt(idDueño));
                            dao.agregar(m);
                            Thread.sleep(7000);
                            request.getRequestDispatcher("Controler?accion=Listar").forward(request, response);

                        } catch (Exception e) {
                            System.out.println("Error en la inserción: " + e);
                        }
                    }
                }

                break;
            case "FiltrarPerro":
                listaFiltrada = dao.listaFlitrada(1);
                request.setAttribute("lista", listaFiltrada);
                request.getRequestDispatcher("inicio.jsp").forward(request, response);
                break;
            case "FiltrarGato":
                listaFiltrada = dao.listaFlitrada(2);
                request.setAttribute("lista", listaFiltrada);
                request.getRequestDispatcher("inicio.jsp").forward(request, response);

                break;
            case "Adoptar mascota":
                idMascota = request.getParameter("idMascotaAdoptar");
                List<mascota> listaMascota = dao.mascotaAdoptar(idMascota);
                System.out.println("D: " + listaMascota.get(0).getNombre());
                request.setAttribute("listaMascota", listaMascota);
                request.getRequestDispatcher("adoptar.jsp").forward(request, response);

                break;

            case "confirmarAdopcion":
                response.setContentType("text/html;charset=UTF-8");

                String correoCon = request.getParameter("correoConfirm");
                String password = request.getParameter("passwordConfirm");
                String correoDueño = request.getParameter("correoDueño");
                System.out.println("Dueño "+correoDueño);
                //IMPLEMENTAR MAÑANA LO DE ARRIBA
                consultas co = new consultas();

                if (co.autenticacion(correoCon, password) == Integer.parseInt(sesion.getAttribute("id").toString())) {

                    out.write("<script> location.href = \"mailto:" + correoDueño + "?subject=Deseo adoptar esta mascota\"; location.href = \"inicio.jsp\" </script>");
                    

                } else {

                    //response.sendRedirect("index.jsp");
                    out.write("<script> alert(\"Usuario o contraseña incorrecta\"); window.history.back();  </script>");
                }

                break;
            case "Eliminar mi mascota":
                try {
                    System.out.println("SE DESEA ELIMINAR!!!!!!!!!!!!!!!!");
                String idMascotaEliminar = request.getParameter("idMascotaAdoptarEL");
                System.out.println("ID a eliminar " + idMascotaEliminar);
                dao.eliminarMascota(idMascotaEliminar);
                request.getRequestDispatcher("Controler?accion=Listar mis mascotas").forward(request, response);
                
                } catch (Exception e) {
                    System.out.println("Error al eliminar :"+e);
                }
                

                break;

            //DELETE FROM `soulmate`.`mascota` WHERE (`idMascota` = '187');
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

    private static void copyFile(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath());
    }

}
