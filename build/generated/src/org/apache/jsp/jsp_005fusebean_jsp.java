package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import usebean.Person;

public final class jsp_005fusebean_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>use Bean Action</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<p>1. Locate an existing Bean in page, request, session or application scope.</p>\n");

    Person p = new Person("Tina", "Xing");
    request.setAttribute("person", p);

      out.write('\n');
      out.write('\n');
      usebean.Person person = null;
      synchronized (request) {
        person = (usebean.Person) _jspx_page_context.getAttribute("person", PageContext.REQUEST_SCOPE);
        if (person == null){
          person = new usebean.Person();
          _jspx_page_context.setAttribute("person", person, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((usebean.Person)_jspx_page_context.findAttribute("person")).getFirstName())));
      out.write('\n');
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((usebean.Person)_jspx_page_context.findAttribute("person")).getLastName())));
      out.write("\n");
      out.write("\n");
      out.write("<p>2. Create a Bean</p>\n");
      usebean.Person person2 = null;
      synchronized (_jspx_page_context) {
        person2 = (usebean.Person) _jspx_page_context.getAttribute("person2", PageContext.PAGE_SCOPE);
        if (person2 == null){
          person2 = new usebean.Employee();
          _jspx_page_context.setAttribute("person2", person2, PageContext.PAGE_SCOPE);
          out.write('\n');
        }
      }
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((usebean.Employee)_jspx_page_context.findAttribute("person2")).getFirstName())));
      out.write('\n');
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((usebean.Employee)_jspx_page_context.findAttribute("person2")).getLastName())));
      out.write('\n');
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((usebean.Employee)_jspx_page_context.findAttribute("person2")).getSalary())));
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<p>3. demo for jsp :setProperty, property=\"*\" to set all values from incoming request</p>\n");
      usebean.Person person3 = null;
      synchronized (_jspx_page_context) {
        person3 = (usebean.Person) _jspx_page_context.getAttribute("person3", PageContext.PAGE_SCOPE);
        if (person3 == null){
          person3 = new usebean.Person();
          _jspx_page_context.setAttribute("person3", person3, PageContext.PAGE_SCOPE);
          out.write('\n');
          out.write('\n');
        }
      }
      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("person3"), "firstName", request.getParameter("first"), request, "first", false);
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("person3"), "lastName", request.getParameter("last"), request, "last", false);
      out.write('\n');
      out.write('\n');
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((usebean.Person)_jspx_page_context.findAttribute("person3")).getFirstName())));
      out.write('\n');
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((usebean.Person)_jspx_page_context.findAttribute("person3")).getLastName())));
      out.write("\n");
      out.write("\n");
      out.write("<p>4. demo for jsp:setProperty, use value=\"\"</p>\n");
      usebean.Person person4 = null;
      synchronized (_jspx_page_context) {
        person4 = (usebean.Person) _jspx_page_context.getAttribute("person4", PageContext.PAGE_SCOPE);
        if (person4 == null){
          person4 = new usebean.Employee();
          _jspx_page_context.setAttribute("person4", person4, PageContext.PAGE_SCOPE);
          out.write("\n");
          out.write("    ");
          org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("person4"), "firstName", "William", null, null, false);
          out.write('\n');
        }
      }
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("person4"), "lastName", "Edward", null, null, false);
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("person4"), "salary", "30000", null, null, false);
      out.write('\n');
      out.write('\n');
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((usebean.Employee)_jspx_page_context.findAttribute("person4")).getFirstName())));
      out.write('\n');
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((usebean.Employee)_jspx_page_context.findAttribute("person4")).getLastName())));
      out.write('\n');
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((usebean.Employee)_jspx_page_context.findAttribute("person4")).getSalary())));
      out.write("\n");
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
