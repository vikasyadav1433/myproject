/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.33
 * Generated at: 2017-08-10 04:19:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.alljsppages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("jar:file:/F:/workspace2/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/hustle/WEB-INF/lib/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098691290000L));
    _jspx_dependants.put("jar:file:/F:/workspace2/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/hustle/WEB-INF/lib/spring-webmvc-4.3.9.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1496842942000L));
    _jspx_dependants.put("/WEB-INF/alljsppages/navbarBeforelogin.jsp", Long.valueOf(1502102570575L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.9.RELEASE.jar", Long.valueOf(1501926260706L));
    _jspx_dependants.put("/WEB-INF/alljsppages/links.jsp", Long.valueOf(1502293618567L));
    _jspx_dependants.put("/WEB-INF/lib/standard-1.1.2.jar", Long.valueOf(1501926142798L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-2.2.1.min.js\"></script>\r\n");
      out.write("  <script src=\"https://cdn.datatables.net/1.10.10/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <link href=\"https://cdn.datatables.net/1.10.10/css/jquery.dataTables.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write(".carousel-inner>.item>img, .carousel-inner>.item>a>img {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tmargin: auto;\r\n");
      out.write("\theight: 400px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".carousel-control.left, .carousel-control.right {\r\n");
      out.write("\tbackground-image: none;\r\n");
      out.write("\topacity\r\n");
      out.write("\t=0.4;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".zoomin img {\r\n");
      out.write("\theight: 200px;\r\n");
      out.write("\twidth: 200px;\r\n");
      out.write("\t-webkit-transition: all 2s ease;\r\n");
      out.write("\t-moz-transition: all 2s ease;\r\n");
      out.write("\t-ms-transition: all 2s ease;\r\n");
      out.write("\ttransition: all 2s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".zoomin img:hover {\r\n");
      out.write("\twidth: 300px;\r\n");
      out.write("\theight: 300px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#preview {\r\n");
      out.write("\tmargin-top: 10px;\r\n");
      out.write("\tborder: 1px solid black;\r\n");
      out.write("\twidth: 350px;\r\n");
      out.write("\theight: 500px;\r\n");
      out.write("\tbackground-repeat: no-repeat;\r\n");
      out.write("\tmargin-left: auto;\r\n");
      out.write("\tmargin-right: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#samples {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#samples img {\r\n");
      out.write("\tmargin: 10px;\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tborder: 2px solid #6A6462;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#samples img:hover {\r\n");
      out.write("\tcursor: zoom-in;\r\n");
      out.write("\tborder: 0;\r\n");
      out.write("\t-moz-box-shadow: 2px 2px 7px 2px rgba(130, 130, 130, 1), -1px -1px 7px\r\n");
      out.write("\t\t2px rgba(130, 130, 130, 1);\r\n");
      out.write("\t-webkit-box-shadow: 2px 2px 7px 2px rgba(130, 130, 130, .7), -1px -1px\r\n");
      out.write("\t\t7px 2px rgba(130, 130, 130, 1);\r\n");
      out.write("\tbox-shadow: 2px 2px 7px 2px rgba(130, 130, 130, .7), -2px -2px 7px 2px\r\n");
      out.write("\t\trgba(130, 130, 130, 1);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media screen and (max-width: 767px) {\r\n");
      out.write("\t#samples img {\r\n");
      out.write("\t\tdisplay: inline-block;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("<div class=\"container\">\r\n");
      out.write("<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">BikeAdda</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <ul class=\"nav navbar-nav\">\r\n");
      out.write("      <li class=\"active\"><a href=\"reqHome\">Home</a></li>\r\n");
      out.write("      <li><a href=\"#\">About Us</a></li>\r\n");
      out.write("      <li><a href=\"#\">Contact Us</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("      <li><a href=\"reqSignupPage\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\r\n");
      out.write("      <li><a href=\"reqLoginPage\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav></div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"col-sm-12\">\r\n");
      out.write("\t\t\t<div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("\t\t\t\t<!-- Indicators -->\r\n");
      out.write("\t\t\t\t<ol class=\"carousel-indicators\">\r\n");
      out.write("\t\t\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("\t\t\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("\t\t\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\r\n");
      out.write("\t\t\t\t</ol>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Wrapper for slides -->\r\n");
      out.write("\t\t\t\t<div class=\"carousel-inner\">\r\n");
      out.write("\t\t\t\t\t<div class=\"item active\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"resources/images/carsousel/cr1.jpg\" class=\"img-rounded\"\r\n");
      out.write("\t\t\t\t\t\t\talt=\"Cinque Terre\" width=\"800px;\" height=\"500px\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"resources/images/carsousel/cr2.jpg\" class=\"img-rounded\"\r\n");
      out.write("\t\t\t\t\t\t\talt=\"Cinque Terre\" width=\"700px;\" height=\"800px\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"resources/images/carsousel/cr3.jpg\" class=\"img-rounded\"\r\n");
      out.write("\t\t\t\t\t\t\talt=\"Cinque Terre\" width=\"1000px;\" height=\"90px\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Left and right controls -->\r\n");
      out.write("\t\t\t\t<a class=\"left carousel-control\" href=\"#myCarousel\"\r\n");
      out.write("\t\t\t\t\tdata-slide=\"prev\"> <span\r\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-chevron-left\"></span> <span\r\n");
      out.write("\t\t\t\t\tclass=\"sr-only\">Previous</span>\r\n");
      out.write("\t\t\t\t</a> <a class=\"right carousel-control\" href=\"#myCarousel\"\r\n");
      out.write("\t\t\t\t\tdata-slide=\"next\"> <span\r\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-chevron-right\"></span> <span\r\n");
      out.write("\t\t\t\t\tclass=\"sr-only\">Next</span>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"zoomin\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-sm-3 \">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<img src=\"resources/images/carsousel/cr1.jpg\" class=\"img-rounded\"\r\n");
      out.write("\t\t\t\t\talt=\"Cinque Terre\" width=\"150px;\" height=\"130px\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t<img src=\"resources/images/carsousel/cr2.jpg\" class=\"img-rounded\"\r\n");
      out.write("\t\t\t\t\talt=\"Cinque Terre\" width=\"150px;\" height=\"130px\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t<img src=\"resources/images/carsousel/cr3.jpg\" class=\"img-rounded\"\r\n");
      out.write("\t\t\t\t\talt=\"Cinque Terre\" width=\"150px;\" height=\"130px\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t<img src=\"resources/images/carsousel/cr4.jpg\" class=\"img-rounded\"\r\n");
      out.write("\t\t\t\t\talt=\"Cinque Terre\" width=\"150px;\" height=\"130px\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-lg-3 col-md-3 col-sm-3 col-xs-12\" id=\"samples\">\r\n");
      out.write("\t\t\t\t<img id=\"zoom1\" width=\"100px\" height=\"250px\"\r\n");
      out.write("\t\t\t\t\tonmousemove=\"zoomIn(event)\" onmouseout=\"zoomOut()\"\r\n");
      out.write("\t\t\t\t\tsrc=\"resources/images/carsousel/cr1.jpg\"> <img id=\"zoom2\"\r\n");
      out.write("\t\t\t\t\twidth=\"100px\" height=\"250px\" onmousemove=\"zoomIn(event)\"\r\n");
      out.write("\t\t\t\t\tonmouseout=\"zoomOut()\" src=\"resources/images/carsousel/cr2.jpg\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-9 col-md-9 col-sm-9 col-xs-12\">\r\n");
      out.write("\t\t\t\t<div id=\"preview\" onmousemove=\"zoomIn(event)\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/alljsppages/newhome.jsp(77,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message!=null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t<div class=\"container\">\r\n");
        out.write("\r\n");
        out.write("\t\t\t<div col-sm-3></div>\r\n");
        out.write("\t\t\t<div col-sm-6>\r\n");
        out.write("\t\t\t\t<div class=\"alert alert-success alert-dismissable fade in\">\r\n");
        out.write("\t\t\t\t\t<a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">×</a>\r\n");
        out.write("\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t</div>\r\n");
        out.write("\t\t</div>\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}
