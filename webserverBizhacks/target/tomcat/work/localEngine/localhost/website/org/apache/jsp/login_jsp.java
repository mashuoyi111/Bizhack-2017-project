package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zh-cn\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<title>Website Manager!</title>\n");
      out.write("\n");
      out.write("<link href=\"./css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"./css/signin.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("</head>\n");
 String type=request.getParameter("type");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"signin\">\n");
      out.write("\t<div class=\"signin-head\"><img src=\"./pic/myself.jpg\" alt=\"\" class=\"img-rounded\"></div>\n");
      out.write("\t<form class=\"form-signin\" role=\"form\" name=\"form\" action=\"./home/login.do\" method=\"post\">\n");
      out.write("\t    <div class=\"message\">\n");
      out.write("\t     ");

	       if(type!=null&&type.equals("0")){
	       
      out.write("\n");
      out.write("\t       password or user name is wrong!\n");
      out.write("\t     ");

           }
           
      out.write("\n");
      out.write("           ");

           if(type!=null&&type.equals("-1")){
           	       
      out.write("\n");
      out.write("           Log out success!\n");
      out.write("           ");

           }
           
      out.write("\n");
      out.write("           ");

           if(type!=null&&type.equals("1")){
           
      out.write("\n");
      out.write("           register success!\n");
      out.write("           ");

           }
           
      out.write("\n");
      out.write("\t    </div>\n");
      out.write("\t\t<input type=\"text\" class=\"form-control\" name=\"username\" id=\"username\" required autofocus placeholder=\"user name\" />\n");
      out.write("\t\t<input type=\"password\" class=\"form-control\" name=\"password\" id=\"password\" required placeholder=\"password\"/>\n");
      out.write("\t\t<button class=\"btn btn-lg btn-danger btn-block\" type=\"submit\">login</button>\n");
      out.write("\t</form>\n");
      out.write("\t<form class=\"form-signin\" role=\"form\" name=\"form\" action=\"./register.jsp\" method=\"post\">\n");
      out.write("\t\t<button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">register</button>\n");
      out.write("\t</form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
