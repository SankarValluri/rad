/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.26
 * Generated at: 2016-07-05 16:27:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class amazonGrid_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("jar:file:/C:/Sankar/MS/workspace/RAD/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/rad/WEB-INF/lib/struts2-jquery-plugin-3.7.1.jar!/META-INF/struts-jquery-tags.tld", Long.valueOf(1400012610000L));
    _jspx_dependants.put("jar:file:/C:/Sankar/MS/workspace/RAD/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/rad/WEB-INF/lib/struts2-jquery-grid-plugin-3.7.1.jar!/META-INF/struts-jquery-grid-tags.tld", Long.valueOf(1400012748000L));
    _jspx_dependants.put("/WEB-INF/lib/struts2-jquery-grid-plugin-3.7.1.jar", Long.valueOf(1467229840118L));
    _jspx_dependants.put("/WEB-INF/lib/struts2-core-2.3.24.jar", Long.valueOf(1467229836234L));
    _jspx_dependants.put("jar:file:/C:/Sankar/MS/workspace/RAD/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/rad/WEB-INF/lib/struts2-core-2.3.24.jar!/META-INF/struts-tags.tld", Long.valueOf(1430670284000L));
    _jspx_dependants.put("/WEB-INF/lib/struts2-jquery-plugin-3.7.1.jar", Long.valueOf(1467229839545L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005faction_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsjg_005fgrid_0026_005fviewrecords_005frownumbers_005frowNum_005fresizableHandles_005fresizable_005fpager_005floadonce_005fid_005fhref_005fhidegrid_005fgridModel_005fdataType_005faltRows_005faltClass;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005fwidth_005ftitle_005fsortable_005fname_005findex_005fformatter_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005fwidth_005ftitle_005fsortable_005fname_005findex_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005fwidth_005ftitle_005fsortable_005fname_005findex_005fhidden_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsjg_005fgrid_0026_005fviewrecords_005frownumbers_005frowNum_005fresizableHandles_005fresizable_005fpager_005floadonce_005fid_005fhref_005fhidegrid_005fgridModel_005fdataType_005faltRows_005faltClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005fwidth_005ftitle_005fsortable_005fname_005findex_005fformatter_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005fwidth_005ftitle_005fsortable_005fname_005findex_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005fwidth_005ftitle_005fsortable_005fname_005findex_005fhidden_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005faction_005fnobody.release();
    _005fjspx_005ftagPool_005fsjg_005fgrid_0026_005fviewrecords_005frownumbers_005frowNum_005fresizableHandles_005fresizable_005fpager_005floadonce_005fid_005fhref_005fhidegrid_005fgridModel_005fdataType_005faltRows_005faltClass.release();
    _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005fwidth_005ftitle_005fsortable_005fname_005findex_005fformatter_005fnobody.release();
    _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005fwidth_005ftitle_005fsortable_005fname_005findex_005fnobody.release();
    _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005fwidth_005ftitle_005fsortable_005fname_005findex_005fhidden_005fnobody.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("    /**\r\n");
      out.write("     * Creates an HTML snippet for the Image column of a given row.\r\n");
      out.write("     */\r\n");
      out.write("    function imageFormatter(cellvalue,options,row) {\r\n");
      out.write("        if (!row.imageUrl) {\r\n");
      out.write("        \treturn '';\r\n");
      out.write("        }\t \r\n");
      out.write("        return '<img alt=\"Image\" src=\"' + row.imageUrl + '\" height=\"60\">';\r\n");
      out.write("    };\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div id=\"gridDiv\">\r\n");
      out.write("\t");
      if (_jspx_meth_s_005furl_005f0(_jspx_page_context))
        return;
      out.write("\t\r\n");
      out.write("    ");
      if (_jspx_meth_sjg_005fgrid_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>");
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

  private boolean _jspx_meth_s_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f0 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005faction_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005furl_005f0.setParent(null);
    // /amazonGrid.jsp(18,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f0.setVar("amazonGridJson");
    // /amazonGrid.jsp(18,1) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f0.setAction("amazonGridJson.action?keyword=%{keyword}");
    int _jspx_eval_s_005furl_005f0 = _jspx_th_s_005furl_005f0.doStartTag();
    if (_jspx_th_s_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_sjg_005fgrid_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sjg:grid
    com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridTag _jspx_th_sjg_005fgrid_005f0 = (com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridTag) _005fjspx_005ftagPool_005fsjg_005fgrid_0026_005fviewrecords_005frownumbers_005frowNum_005fresizableHandles_005fresizable_005fpager_005floadonce_005fid_005fhref_005fhidegrid_005fgridModel_005fdataType_005faltRows_005faltClass.get(com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridTag.class);
    _jspx_th_sjg_005fgrid_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sjg_005fgrid_005f0.setParent(null);
    // /amazonGrid.jsp(19,4) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgrid_005f0.setId("gridtable");
    // /amazonGrid.jsp(19,4) name = dataType type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgrid_005f0.setDataType("json");
    // /amazonGrid.jsp(19,4) name = href type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgrid_005f0.setHref("%{amazonGridJson}");
    // /amazonGrid.jsp(19,4) name = gridModel type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgrid_005f0.setGridModel("amazonList");
    // /amazonGrid.jsp(19,4) name = pager type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgrid_005f0.setPager("true");
    // /amazonGrid.jsp(19,4) name = rownumbers type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgrid_005f0.setRownumbers("false");
    // /amazonGrid.jsp(19,4) name = rowNum type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgrid_005f0.setRowNum("20");
    // /amazonGrid.jsp(19,4) name = viewrecords type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgrid_005f0.setViewrecords("true");
    // /amazonGrid.jsp(19,4) name = loadonce type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgrid_005f0.setLoadonce("true");
    // /amazonGrid.jsp(19,4) name = resizable type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgrid_005f0.setResizable("false");
    // /amazonGrid.jsp(19,4) name = resizableHandles type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgrid_005f0.setResizableHandles("false");
    // /amazonGrid.jsp(19,4) name = altRows type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgrid_005f0.setAltRows("true");
    // /amazonGrid.jsp(19,4) name = altClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgrid_005f0.setAltClass("altRows");
    // /amazonGrid.jsp(19,4) name = hidegrid type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgrid_005f0.setHidegrid("false");
    int _jspx_eval_sjg_005fgrid_005f0 = _jspx_th_sjg_005fgrid_005f0.doStartTag();
    if (_jspx_eval_sjg_005fgrid_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sjg_005fgrid_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sjg_005fgrid_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sjg_005fgrid_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_sjg_005fgridColumn_005f0(_jspx_th_sjg_005fgrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_sjg_005fgridColumn_005f1(_jspx_th_sjg_005fgrid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_sjg_005fgridColumn_005f2(_jspx_th_sjg_005fgrid_005f0, _jspx_page_context))
          return true;
        out.write("            \r\n");
        out.write("        ");
        if (_jspx_meth_sjg_005fgridColumn_005f3(_jspx_th_sjg_005fgrid_005f0, _jspx_page_context))
          return true;
        out.write("  \r\n");
        out.write("        ");
        if (_jspx_meth_sjg_005fgridColumn_005f4(_jspx_th_sjg_005fgrid_005f0, _jspx_page_context))
          return true;
        out.write("  \r\n");
        out.write("        ");
        if (_jspx_meth_sjg_005fgridColumn_005f5(_jspx_th_sjg_005fgrid_005f0, _jspx_page_context))
          return true;
        out.write("  \r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_sjg_005fgrid_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sjg_005fgrid_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_sjg_005fgrid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsjg_005fgrid_0026_005fviewrecords_005frownumbers_005frowNum_005fresizableHandles_005fresizable_005fpager_005floadonce_005fid_005fhref_005fhidegrid_005fgridModel_005fdataType_005faltRows_005faltClass.reuse(_jspx_th_sjg_005fgrid_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsjg_005fgrid_0026_005fviewrecords_005frownumbers_005frowNum_005fresizableHandles_005fresizable_005fpager_005floadonce_005fid_005fhref_005fhidegrid_005fgridModel_005fdataType_005faltRows_005faltClass.reuse(_jspx_th_sjg_005fgrid_005f0);
    return false;
  }

  private boolean _jspx_meth_sjg_005fgridColumn_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sjg_005fgrid_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sjg:gridColumn
    com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag _jspx_th_sjg_005fgridColumn_005f0 = (com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag) _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005fwidth_005ftitle_005fsortable_005fname_005findex_005fformatter_005fnobody.get(com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag.class);
    _jspx_th_sjg_005fgridColumn_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sjg_005fgridColumn_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sjg_005fgrid_005f0);
    // /amazonGrid.jsp(24,8) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f0.setName("image");
    // /amazonGrid.jsp(24,8) name = index type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f0.setIndex("image");
    // /amazonGrid.jsp(24,8) name = sortable type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f0.setSortable("false");
    // /amazonGrid.jsp(24,8) name = width type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f0.setWidth("95");
    // /amazonGrid.jsp(24,8) name = title type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f0.setTitle("Image");
    // /amazonGrid.jsp(24,8) name = formatter type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f0.setFormatter("imageFormatter");
    int _jspx_eval_sjg_005fgridColumn_005f0 = _jspx_th_sjg_005fgridColumn_005f0.doStartTag();
    if (_jspx_th_sjg_005fgridColumn_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005fwidth_005ftitle_005fsortable_005fname_005findex_005fformatter_005fnobody.reuse(_jspx_th_sjg_005fgridColumn_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005fwidth_005ftitle_005fsortable_005fname_005findex_005fformatter_005fnobody.reuse(_jspx_th_sjg_005fgridColumn_005f0);
    return false;
  }

  private boolean _jspx_meth_sjg_005fgridColumn_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_sjg_005fgrid_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sjg:gridColumn
    com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag _jspx_th_sjg_005fgridColumn_005f1 = (com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag) _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005fwidth_005ftitle_005fsortable_005fname_005findex_005fnobody.get(com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag.class);
    _jspx_th_sjg_005fgridColumn_005f1.setPageContext(_jspx_page_context);
    _jspx_th_sjg_005fgridColumn_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sjg_005fgrid_005f0);
    // /amazonGrid.jsp(27,8) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f1.setName("name");
    // /amazonGrid.jsp(27,8) name = index type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f1.setIndex("name");
    // /amazonGrid.jsp(27,8) name = sortable type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f1.setSortable("true");
    // /amazonGrid.jsp(27,8) name = width type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f1.setWidth("242");
    // /amazonGrid.jsp(27,8) name = title type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f1.setTitle("Name");
    int _jspx_eval_sjg_005fgridColumn_005f1 = _jspx_th_sjg_005fgridColumn_005f1.doStartTag();
    if (_jspx_th_sjg_005fgridColumn_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005fwidth_005ftitle_005fsortable_005fname_005findex_005fnobody.reuse(_jspx_th_sjg_005fgridColumn_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005fwidth_005ftitle_005fsortable_005fname_005findex_005fnobody.reuse(_jspx_th_sjg_005fgridColumn_005f1);
    return false;
  }

  private boolean _jspx_meth_sjg_005fgridColumn_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_sjg_005fgrid_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sjg:gridColumn
    com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag _jspx_th_sjg_005fgridColumn_005f2 = (com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag) _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005fwidth_005ftitle_005fsortable_005fname_005findex_005fnobody.get(com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag.class);
    _jspx_th_sjg_005fgridColumn_005f2.setPageContext(_jspx_page_context);
    _jspx_th_sjg_005fgridColumn_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sjg_005fgrid_005f0);
    // /amazonGrid.jsp(29,8) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f2.setName("title");
    // /amazonGrid.jsp(29,8) name = index type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f2.setIndex("title");
    // /amazonGrid.jsp(29,8) name = sortable type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f2.setSortable("true");
    // /amazonGrid.jsp(29,8) name = width type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f2.setWidth("242");
    // /amazonGrid.jsp(29,8) name = title type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f2.setTitle("Description");
    int _jspx_eval_sjg_005fgridColumn_005f2 = _jspx_th_sjg_005fgridColumn_005f2.doStartTag();
    if (_jspx_th_sjg_005fgridColumn_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005fwidth_005ftitle_005fsortable_005fname_005findex_005fnobody.reuse(_jspx_th_sjg_005fgridColumn_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005fwidth_005ftitle_005fsortable_005fname_005findex_005fnobody.reuse(_jspx_th_sjg_005fgridColumn_005f2);
    return false;
  }

  private boolean _jspx_meth_sjg_005fgridColumn_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_sjg_005fgrid_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sjg:gridColumn
    com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag _jspx_th_sjg_005fgridColumn_005f3 = (com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag) _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005fwidth_005ftitle_005fsortable_005fname_005findex_005fnobody.get(com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag.class);
    _jspx_th_sjg_005fgridColumn_005f3.setPageContext(_jspx_page_context);
    _jspx_th_sjg_005fgridColumn_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sjg_005fgrid_005f0);
    // /amazonGrid.jsp(31,8) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f3.setName("formattedPrice");
    // /amazonGrid.jsp(31,8) name = index type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f3.setIndex("formattedPrice");
    // /amazonGrid.jsp(31,8) name = sortable type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f3.setSortable("true");
    // /amazonGrid.jsp(31,8) name = width type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f3.setWidth("95");
    // /amazonGrid.jsp(31,8) name = title type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f3.setTitle("Price");
    int _jspx_eval_sjg_005fgridColumn_005f3 = _jspx_th_sjg_005fgridColumn_005f3.doStartTag();
    if (_jspx_th_sjg_005fgridColumn_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005fwidth_005ftitle_005fsortable_005fname_005findex_005fnobody.reuse(_jspx_th_sjg_005fgridColumn_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005fwidth_005ftitle_005fsortable_005fname_005findex_005fnobody.reuse(_jspx_th_sjg_005fgridColumn_005f3);
    return false;
  }

  private boolean _jspx_meth_sjg_005fgridColumn_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_sjg_005fgrid_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sjg:gridColumn
    com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag _jspx_th_sjg_005fgridColumn_005f4 = (com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag) _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005fwidth_005ftitle_005fsortable_005fname_005findex_005fhidden_005fnobody.get(com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag.class);
    _jspx_th_sjg_005fgridColumn_005f4.setPageContext(_jspx_page_context);
    _jspx_th_sjg_005fgridColumn_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sjg_005fgrid_005f0);
    // /amazonGrid.jsp(33,8) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f4.setName("asin");
    // /amazonGrid.jsp(33,8) name = index type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f4.setIndex("asin");
    // /amazonGrid.jsp(33,8) name = sortable type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f4.setSortable("false");
    // /amazonGrid.jsp(33,8) name = width type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f4.setWidth("0");
    // /amazonGrid.jsp(33,8) name = hidden type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f4.setHidden("true");
    // /amazonGrid.jsp(33,8) name = title type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f4.setTitle("ASIN");
    int _jspx_eval_sjg_005fgridColumn_005f4 = _jspx_th_sjg_005fgridColumn_005f4.doStartTag();
    if (_jspx_th_sjg_005fgridColumn_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005fwidth_005ftitle_005fsortable_005fname_005findex_005fhidden_005fnobody.reuse(_jspx_th_sjg_005fgridColumn_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005fwidth_005ftitle_005fsortable_005fname_005findex_005fhidden_005fnobody.reuse(_jspx_th_sjg_005fgridColumn_005f4);
    return false;
  }

  private boolean _jspx_meth_sjg_005fgridColumn_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_sjg_005fgrid_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sjg:gridColumn
    com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag _jspx_th_sjg_005fgridColumn_005f5 = (com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag) _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005fwidth_005ftitle_005fsortable_005fname_005findex_005fhidden_005fnobody.get(com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag.class);
    _jspx_th_sjg_005fgridColumn_005f5.setPageContext(_jspx_page_context);
    _jspx_th_sjg_005fgridColumn_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sjg_005fgrid_005f0);
    // /amazonGrid.jsp(35,8) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f5.setName("priceInCents");
    // /amazonGrid.jsp(35,8) name = index type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f5.setIndex("priceInCents");
    // /amazonGrid.jsp(35,8) name = sortable type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f5.setSortable("false");
    // /amazonGrid.jsp(35,8) name = width type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f5.setWidth("0");
    // /amazonGrid.jsp(35,8) name = hidden type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f5.setHidden("true");
    // /amazonGrid.jsp(35,8) name = title type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sjg_005fgridColumn_005f5.setTitle("Average");
    int _jspx_eval_sjg_005fgridColumn_005f5 = _jspx_th_sjg_005fgridColumn_005f5.doStartTag();
    if (_jspx_th_sjg_005fgridColumn_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005fwidth_005ftitle_005fsortable_005fname_005findex_005fhidden_005fnobody.reuse(_jspx_th_sjg_005fgridColumn_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fsjg_005fgridColumn_0026_005fwidth_005ftitle_005fsortable_005fname_005findex_005fhidden_005fnobody.reuse(_jspx_th_sjg_005fgridColumn_005f5);
    return false;
  }
}
