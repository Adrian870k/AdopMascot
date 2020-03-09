package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adopcion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <title>SOULMATE</title>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"img/logo.png\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,500,700\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick.css\"/>\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick-theme.css\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/nouislider.min.css\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\"/>\r\n");
      out.write("\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/style2.css\"/>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- HEADER -->\r\n");
      out.write("        <header>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"header\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-3\">\r\n");
      out.write("                            <div class=\"header-logo\">\r\n");
      out.write("                                <a href=\"#\" class=\"logo\">\r\n");
      out.write("                                    <img src=\"./img/logo.png\" alt=\"\">\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <!-- SEARCH BAR -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- row -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- container -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /MAIN HEADER -->\r\n");
      out.write("        </header>\r\n");
      out.write("        <!-- /HEADER -->\r\n");
      out.write("\r\n");
      out.write("        <!-- NAVIGATION -->\r\n");
      out.write("        <nav id=\"navigation\">\r\n");
      out.write("            <!-- container -->\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <!-- responsive-nav -->\r\n");
      out.write("                <div id=\"responsive-nav\">\r\n");
      out.write("                    <!-- NAV -->\r\n");
      out.write("\r\n");
      out.write("                    <section>\r\n");
      out.write("                        <div class=\"contenedor\">\r\n");
      out.write("                            <article>\r\n");
      out.write("\r\n");
      out.write("                                <ul class=\"main-nav nav navbar-nav\">\r\n");
      out.write("                                    <li ><a href=\"index.jsp\">Inicio</a></li>\r\n");
      out.write("                                    <li><a href=\"mailto:montoyaquinadrian@gmail.com\">informar errores</a></li>\r\n");
      out.write("                                    <li class=\"active\"><a href=\"#\">Iniciar</a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                </ul>\r\n");
      out.write("                                <!-- /NAV -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- /responsive-nav -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /container -->\r\n");
      out.write("        </nav>\r\n");
      out.write("        <!-- /NAVIGATION -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- SECTION -->\r\n");
      out.write("        <div class=\"section\">\r\n");
      out.write("            <!-- container -->\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <!-- row -->\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <!-- Product tab -->\r\n");
      out.write("                    <div class=\"col-md-12\">\r\n");
      out.write("                        <div id=\"product-tab\">\r\n");
      out.write("                            <!-- product tab nav -->\r\n");
      out.write("\r\n");
      out.write("                            <!-- /product tab nav -->\r\n");
      out.write("\r\n");
      out.write("                            <!-- product tab content -->\r\n");
      out.write("                            <div class=\"tab-content\">\r\n");
      out.write("                                <!-- tab1  -->\r\n");
      out.write("                                <div id=\"tab1\" class=\"tab-pane fade in active\">\r\n");
      out.write("                                    <div class=\"row\">\r\n");
      out.write("                                        <div class=\"col-md-12\">\r\n");
      out.write("                                            <div>\r\n");
      out.write("\r\n");
      out.write("                                                <h1>Datos de la mascota.</h1>\r\n");
      out.write("                                                <div class=\"contenedor-inputs\">\r\n");
      out.write("                                                    <form action=\"Controler\" method=\"POST\" enctype=\"multipart/form-data\">\r\n");
      out.write("                                                        <ul>\r\n");
      out.write("                                                            Foto:\r\n");
      out.write("                                                            <li><input type=\"file\" class=\"btn-submit\" name=\"accion\" value=\"Subir Foto\"></li><br>\r\n");
      out.write("                                                            Nombre:\r\n");
      out.write("                                                            <li><input type=\"text\" placeholder=\"Nombre\" name=\"nombre\"></li><br>\r\n");
      out.write("                                                            Especie:\r\n");
      out.write("                                                            <li><input type=\"text\" placeholder=\"Especie\" name=\"especie\"></li><br>\r\n");
      out.write("                                                            Edad:\r\n");
      out.write("                                                            <li><input type=\"text\" placeholder=\"Edad\" name=\"edad\"></li><br>\r\n");
      out.write("                                                            Telefono:\r\n");
      out.write("                                                            <li><input type=\"text\" placeholder=\"Telefono\" name=\"telefono\"></li><br>\r\n");
      out.write("                                                            Correo:\r\n");
      out.write("                                                            <li><input type=\"text\" placeholder=\"Correo\" name=\"correo\"></li><br>\r\n");
      out.write("                                                            Vacunas que tiene:\r\n");
      out.write("                                                            <li><input type=\"text\" placeholder=\"Vacunas que se le han aplicado a la mascota\" name=\"vacuna\"></li><br>\r\n");
      out.write("                                                            Descripcion breve:\r\n");
      out.write("                                                            <li><input type=\"text\" placeholder =\"Breve descripción de la mascota\" name=\"descripcion\"></li>\r\n");
      out.write("\r\n");
      out.write("                                                        </ul>\r\n");
      out.write("                                                        <input type=\"submit\" class=\"btn-submit\" name=\"accion\" value=\"Enviar\">\r\n");
      out.write("                                                    </form>\r\n");
      out.write("\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!-- /tab1  -->\r\n");
      out.write("\r\n");
      out.write("                                <!-- tab2  -->\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\t\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /product tab -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- jQuery Plugins -->\r\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"js/slick.min.js\"></script>\r\n");
      out.write("        <script src=\"js/nouislider.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.zoom.min.js\"></script>\r\n");
      out.write("        <script src=\"js/main.js\"></script>\r\n");
      out.write("        <script src=\"js/popup.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
