package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inicio_005frespaldo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("        <title>SOULMATE</title>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"img/logo.png\" />\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div id=\"header\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-3\">\r\n");
      out.write("                            <div class=\"header-logo\">\r\n");
      out.write("                                <a href=\"#\" class=\"logo\">\r\n");
      out.write("                                    <img src=\"./img/logo.png\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("                                </a>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div style=\"text-align: right\">\r\n");
      out.write("                            <div class=\"col-md-6\">\r\n");
      out.write("                                <div class=\"header-search\">\r\n");
      out.write("                                    <form>\r\n");
      out.write("                                        <div class=\"contenedor\">\r\n");
      out.write("                                            <article>\r\n");
      out.write("                                                <select id=\"btn-abrir-popup\" class=\"btn-abrir-popup\">\r\n");
      out.write("                                                    <option value=\"0\">Filtro</option>\r\n");
      out.write("\r\n");
      out.write("                                                    <option value=\"1\">Perros</option>\r\n");
      out.write("                                                    <option value=\"1\">Gatos</option>\r\n");
      out.write("                                                </select>\r\n");
      out.write("\r\n");
      out.write("                                                </form>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"contenedor\">\r\n");
      out.write("                                <article>\r\n");
      out.write("\r\n");
      out.write("                                    <button id=\"btn-abrir-popup\" class=\"btn-abrir-popup\" onclick=\"location.href = 'adopcion.jsp?#'\">Dar en adopción.</button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <nav id=\"navigation\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("                <div id=\"responsive-nav\">\r\n");
      out.write("\r\n");
      out.write("                    <ul class=\"main-nav nav navbar-nav\">\r\n");
      out.write("                        <li><a href=\"index.jsp\">Inicio</a></li>\r\n");
      out.write("                        <li class=\"active\"><a href=\"#\">Mascotas en espera por ser adoptadas</a></li>\r\n");
      out.write("                        <li><a href=\"proceso.jsp\">Mascotas en proceso de adopción</a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"section\">\r\n");
      out.write("            <!-- container -->\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <!-- row -->\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- section title -->\r\n");
      out.write("                    <div class=\"col-md-12\">\r\n");
      out.write("                        <div class=\"section-title\">\r\n");
      out.write("                            <h1 class=\"title\">Mascotas en espera de adopción</h1>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-md-12\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"products-tabs\">\r\n");
      out.write("                                <!-- tab -->\r\n");
      out.write("                                <div id=\"tab1\" class=\"tab-pane active\">\r\n");
      out.write("                                    <div class=\"products-slick\" data-nav=\"#slick-nav-1\">\r\n");
      out.write("\r\n");
      out.write("                                        <!--MASCOTA 1-->\r\n");
      out.write("                                        <div class=\"product\">\r\n");
      out.write("                                            <div class=\"product-img\">\r\n");
      out.write("                                                <img src=\"./img/01.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"product-body\">\r\n");
      out.write("                                                <h3>Laila</h3>\r\n");
      out.write("                                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"add-to-cart\">\r\n");
      out.write("                                                <button class=\"add-to-cart-btn\" onclick=\"location.href = 'adoptar.jsp'\">¡ADOPTAR!</button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <!--MASCOTA 2-->\r\n");
      out.write("                                        <div class=\"product\">\r\n");
      out.write("                                            <div class=\"product-img\">\r\n");
      out.write("                                                <img src=\"./img/02.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"product-body\">\r\n");
      out.write("                                                <h3>Hachiko</h3>\r\n");
      out.write("                                                <p>Hachico es un cachorro muy divertido, le gusta hacer mucho ejercicio y disfrutar al aire libre.</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"add-to-cart\">\r\n");
      out.write("                                                <button class=\"add-to-cart-btn\">¡ADOPTAR!</button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <!-- MASCOTA 3 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"product\">\r\n");
      out.write("                                            <div class=\"product-img\">\r\n");
      out.write("                                                <img src=\"./img/03.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"product-body\">\r\n");
      out.write("                                                <h3>Simon</h3>\r\n");
      out.write("                                                <p>Este es el mejor gato del mundo</p>\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"add-to-cart\">\r\n");
      out.write("\r\n");
      out.write("                                                <button class=\"add-to-cart-btn\">¡ADOPTAR!</button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <!-- MASCOTA 4 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <!-- MASCOTA 5 -->\r\n");
      out.write("                                        <div class=\"product\">\r\n");
      out.write("                                            <div class=\"product-img\">\r\n");
      out.write("                                                <img src=\"./img/05.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"product-body\">\r\n");
      out.write("                                                <h3>Lucas</h3>\r\n");
      out.write("                                                <p>Soy muy divertido</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"add-to-cart\">\r\n");
      out.write("                                                <button class=\"add-to-cart-btn\">¡ADOPTAR!</button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div id=\"slick-nav-1\" class=\"products-slick-nav\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
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
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"products-tabs\">\r\n");
      out.write("                            <!-- tab -->\r\n");
      out.write("                            <div id=\"tab2\" class=\"tab-pane fade in active\">\r\n");
      out.write("                                <div class=\"products-slick\" data-nav=\"#slick-nav-2\">\r\n");
      out.write("                                    <!-- MASCOTA 6 -->\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"product\">\r\n");
      out.write("                                        <div class=\"product-img\">\r\n");
      out.write("                                            <img src=\"./img/09.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"product-body\">\r\n");
      out.write("                                            <h3>Nina</h3>\r\n");
      out.write("                                            <p>GUGJVjkibkiblños nbiodbcbixdx</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"add-to-cart\">\r\n");
      out.write("                                            <button class=\"add-to-cart-btn\">¡ADOPTAR!</button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    <!--MASCOTA 10-->\r\n");
      out.write("                                    <div class=\"product\">\r\n");
      out.write("                                        <div class=\"product-img\">\r\n");
      out.write("                                            <img src=\"./img/10.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"product-body\">\r\n");
      out.write("                                            <h3>Mike</h3>\r\n");
      out.write("                                            <p>IUGIUJGBgbbknhsosjosj</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"add-to-cart\">\r\n");
      out.write("                                            <button class=\"add-to-cart-btn\">¡ADOPTAR!</button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <div id=\"slick-nav-2\" class=\"products-slick-nav\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- /tab -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /Products tab & slick -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /row -->\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"js/slick.min.js\"></script>\r\n");
      out.write("        <script src=\"js/nouislider.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.zoom.min.js\"></script>\r\n");
      out.write("        <script src=\"js/main.js\"></script>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("dato");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getDescripcion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
