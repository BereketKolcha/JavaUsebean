package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title> Actions Demo</title>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("\t* {\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            \n");
      out.write("             }\n");
      out.write("             .col-3 {\n");
      out.write("        width: 80%;\n");
      out.write("        margin: 0 auto;\n");
      out.write("        padding: 20px;\n");
      out.write("        background: #f0e68c;\n");
      out.write("    }\n");
      out.write("             .col-3 {width: 25%;}\n");
      out.write("         .menu ul {\n");
      out.write("                       list-style-type: none;\n");
      out.write("                       margin: 0;\n");
      out.write("                       padding: 0;\n");
      out.write("                      }\n");
      out.write("        .menu li {\n");
      out.write("                       padding: 8px;\n");
      out.write("                       margin-bottom: 7px;\n");
      out.write("                       background-color :#33b5e5;\n");
      out.write("                       color: #ffffff;\n");
      out.write("                       box-shadow: 0 1px 3px rgba(0,0,0,0.12), 0 1px 2px rgba(0,0,0,0.24);\n");
      out.write("                     }\n");
      out.write("            .menu li:hover {\n");
      out.write("                       background-color: #0099cc;\n");
      out.write("                     }\n");
      out.write("\t</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1 style=\"text-align: center;color:#FF0000;\"> USE BEAN </h1>\n");
      out.write("    \n");
      out.write("    <div class=\"col-3 menu\">\n");
      out.write("<ul>\n");
      out.write("    <li><a  href=\"jsp_forward.jsp\"> Forward action</a> </li>\n");
      out.write("    <li><a  href=\"jsp_include.jsp\"> Include Action</a> </li>\n");
      out.write("    <li><a  href=\"jsp_usebean.jsp\">usebean Action</a> </li>\n");
      out.write("    <li><a  href=\"person_form.jsp\">Person Form Page</a> </li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
