/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.10.v20180503
 * Generated at: 2020-03-22 12:29:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.resources.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Date");
  }

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
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"cn\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>传智播客千亿级实时数据仓库可视化平台</title>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/res/css/main.css\">\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/res/js/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/res/js/echarts.js\"></script>\r\n");
      out.write("\t<script src=\"http://echarts.baidu.com/gallery/vendors/echarts/map/js/china.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/res/js/main.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"viewport\" id=\"viewport\">\r\n");
      out.write("\t\t<!-- 顶部 -->\r\n");
      out.write("\t\t<div class=\"header\">\r\n");
      out.write("\t\t\t<span class=\"logo\">传智播客</span>\r\n");
      out.write("\t\t\t<h2>传智播客千亿级实时数据仓库可视化平台</h2>\r\n");
      out.write("\t\t\t<span class=\"title\">xxx</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- 主体部分 -->\r\n");
      out.write("\t\t<div class=\"body\">\r\n");
      out.write("\t\t\t<div class=\"column\">\r\n");
      out.write("\t\t\t\t<!-- 用户 -->\r\n");
      out.write("\t\t\t\t<div class=\"panel user\">\r\n");
      out.write("\t\t\t\t\t<h3>用户日活对比分析</h3>\r\n");
      out.write("\t\t\t\t\t<div class=\"chart\" id=\"userChart\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- 转化率分析 -->\r\n");
      out.write("\t\t\t\t<div class=\"panel rate\">\r\n");
      out.write("\t\t\t\t\t<h3>漏斗转化分析</h3>\r\n");
      out.write("\t\t\t\t\t<div class=\"chart\" id=\"rateChart\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"data\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"item\">200</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"item\">500</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"item\">2000</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"item\">10000</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- 订单完成率 -->\r\n");
      out.write("\t\t\t\t<div class=\"panel channel\">\r\n");
      out.write("\t\t\t\t\t<h3>周销售额环比分析</h3>\r\n");
      out.write("\t\t\t\t\t<div class=\"chart\" id=\"channelChart\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"column\">\r\n");
      out.write("\t\t\t\t<!-- 地图 -->\r\n");
      out.write("\t\t\t\t<div class=\"order\">\r\n");
      out.write("\t\t\t\t\t<div class=\"caption\">\r\n");
      out.write("\t\t\t\t\t\t<span>本月订单数: <strong>846489</strong>单</span>\r\n");
      out.write("\t\t\t\t\t\t<span style=\"margin:0 34px\">本周订单数: <strong>145628</strong>单</span>\r\n");
      out.write("\t\t\t\t\t\t<span>今日订单数: <strong>49874</strong>单</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"chart\" id=\"map\"></div>\r\n");
      out.write("\t\t\t\t\t<!-- 其它 -->\r\n");
      out.write("\t\t\t\t\t<div class=\"extra\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"upper\">高</span> <span class=\"lower\">低</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- 销量统计 -->\r\n");
      out.write("\t\t\t\t<div class=\"sales\">\r\n");
      out.write("\t\t\t\t\t<!-- 数据 -->\r\n");
      out.write("\t\t\t\t\t<div class=\"data\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t\t<h5>本月总销售额</h5>\r\n");
      out.write("\t\t\t\t\t\t\t<span>7</span><span>3</span><span>5</span><span>7</span><span>4</span>\r\n");
      out.write("\t\t\t\t\t\t\t<span>7</span><span>3</span><span>0</span><span>0</span><span>0</span>\r\n");
      out.write("\t\t\t\t\t\t\t<span>元</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t\t<h5>今日总销售额</h5>\r\n");
      out.write("\t\t\t\t\t\t\t<span>7</span><span>3</span><span>5</span><span>7</span><span>4</span>\r\n");
      out.write("\t\t\t\t\t\t\t<span>7</span><span>3</span><span>0</span><span>0</span><span>0</span>\r\n");
      out.write("\t\t\t\t\t\t\t<span>元</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<h3>今日24小时销售额</h3>\r\n");
      out.write("\t\t\t\t\t<div class=\"chart\" id=\"salesChart\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"column\">\r\n");
      out.write("\t\t\t\t<!-- 订单状态占比 -->\r\n");
      out.write("\t\t\t\t<div class=\"panel status\">\r\n");
      out.write("\t\t\t\t\t<h3>订单状态占比分析</h3>\r\n");
      out.write("\t\t\t\t\t<div class=\"chart\" id=\"statusChart\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"extra\" data-text=\"全国\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- 订单完成率 -->\r\n");
      out.write("\t\t\t\t<div class=\"panel completed\">\r\n");
      out.write("\t\t\t\t\t<h3>周订单完成趋势分析</h3>\r\n");
      out.write("\t\t\t\t\t<div class=\"chart\" id=\"completedChart\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- 销售趋势 -->\r\n");
      out.write("\t\t\t\t<div class=\"panel trend\">\r\n");
      out.write("\t\t\t\t\t<h3>Top4地区销售排行</h3>\r\n");
      out.write("\t\t\t\t\t<div class=\"chart\" id=\"trendChart\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"extra\">单位: 万元</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script>\r\n");
      out.write("      // 调整屏幕适配\r\n");
      out.write("      \tsetFont();\r\n");
      out.write("      \twindow.addEventListener('resize', function () {\r\n");
      out.write("        \tsetFont();\r\n");
      out.write("      \t})\r\n");
      out.write("\t\tfunction query() {\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t        type: 'POST',\r\n");
      out.write("\t\t        url: 'dashboard/list',\r\n");
      out.write("\t\t        data: null,\r\n");
      out.write("\t\t        dataType: 'json',\r\n");
      out.write("\t\t        success: function(data){\r\n");
      out.write("\t\t        \tuserChart(data.visitor);\r\n");
      out.write("\t\t          \trateChart(data.convert);\r\n");
      out.write("\t\t          \tchannelChart(data.weekSale);\r\n");
      out.write("\t\t          \tsalesChart(data.sales);\r\n");
      out.write("\t\t          \tstatusChart(data.top8orderNum);\r\n");
      out.write("\t\t          \tcompletedChart(data.weekOrderFinish);\r\n");
      out.write("\t\t          \ttrendChart(data.top4sale);\r\n");
      out.write("\t\t          \torderNum(data.orderNum);\r\n");
      out.write("\t\t          \tsales(data.sales);\r\n");
      out.write("\t\t          \torderChart(data.chinaMap)\r\n");
      out.write("\t\t        },\r\n");
      out.write("\t\t        error: function(data){\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t    });\r\n");
      out.write("\t\t}\r\n");
      out.write("      \tvar timeInterval = setInterval(function(){query()},1000)\r\n");
      out.write("      \t//query();\r\n");
      out.write("  </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
}