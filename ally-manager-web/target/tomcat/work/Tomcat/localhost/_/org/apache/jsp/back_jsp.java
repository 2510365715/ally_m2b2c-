/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-05-29 05:44:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class back_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
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
      out.write("    <title>后台管理系统</title>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("    <link href=\"assets/css/dpl-min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <link href=\"assets/css/bui-min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <link href=\"assets/css/main-min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"dl-title\">\r\n");
      out.write("        <!--<img src=\"/chinapost/Public/assets/img/top.png\">-->\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"dl-log\">欢迎您，<span class=\"dl-log-user\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span><a href=\"/back/loginout.do\" title=\"退出系统\" class=\"dl-log-quit\">[退出]</a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"content\">\r\n");
      out.write("    <div class=\"dl-main-nav\">\r\n");
      out.write("        <div class=\"dl-inform\"><div class=\"dl-inform-title\"><s class=\"dl-inform-icon dl-up\"></s></div></div>\r\n");
      out.write("        <ul id=\"J_Nav\"  class=\"nav-list ks-clear\">\r\n");
      out.write("            <li class=\"nav-item dl-selected\"><div class=\"nav-item-inner nav-home\">用户管理</div></li>\r\n");
      out.write("            <li class=\"nav-item dl-selected\"><div class=\"nav-item-inner nav-home\">权限管理</div></li>\r\n");
      out.write("            <li class=\"nav-item dl-selected\"><div class=\"nav-item-inner nav-home\">商品管理</div></li>\r\n");
      out.write("            <li class=\"nav-item dl-selected\"><div class=\"nav-item-inner nav-home\">仓库管理</div></li>\r\n");
      out.write("            <li class=\"nav-item dl-selected\"><div class=\"nav-item-inner nav-home\">订单管理</div></li>\r\n");
      out.write("            <li class=\"nav-item dl-selected\"><div class=\"nav-item-inner nav-home\">钱包管理</div></li>\t\t\r\n");
      out.write("            <li class=\"nav-item dl-selected\"><div class=\"nav-item-inner nav-order\">个人资料</div></li>\r\n");
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <ul id=\"J_NavContent\" class=\"dl-tab-conten\">\r\n");
      out.write("\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"center\">\r\n");
      out.write("\t欢迎访问阿里路亚后台管理系统!\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/jquery-1.8.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/bui-min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/common/main-min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/config-min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("BUI.use('common/main',function(){\r\n");
      out.write("        var config = [\r\n");
      out.write("           {id:'1',menu:[\r\n");
      out.write("        \t   {text:'品牌商管理',items:[\r\n");
      out.write("        \t\t{id:'userback_pps',text:'品牌管理',href:'User/index.html'},\r\n");
      out.write("        \t\t{id:'userback_qy',text:'企业管理',href:'User/index.html'}]},\r\n");
      out.write("        \t   {text:'分销商管理',items:[\r\n");
      out.write("            \t\t{id:'userback_dz',text:'店主管理',href:'User/index.html'},\r\n");
      out.write("            \t\t{id:'userback_pt',text:'平台管理',href:'User/index.html'}]},\r\n");
      out.write("        \t   {text:'管理员管理',items:[\r\n");
      out.write("            \t\t{id:'userback_pt',text:'管理员',href:'Admin/index.html'}]},\r\n");
      out.write("               {text:'用户入驻审核',items:[\r\n");
      out.write("                \t{id:'userback_dz',text:'品牌商入驻审核',href:'User/index.html'},\r\n");
      out.write("                \t{id:'userback_pt',text:'分销商入驻审核',href:'User/index.html'}]}\r\n");
      out.write("        \t\t]},\r\n");
      out.write("            \t\t\r\n");
      out.write("            \t\t\r\n");
      out.write("           {id:'2',menu:[{text:'权限管理',items:[{id:'auth_j',text:'用户角色管理',href:'Back/index.html'}]}]},\r\n");
      out.write("         \r\n");
      out.write("           {id:'3',menu:[\r\n");
      out.write("        \t   {text:'产品管理',items:[\r\n");
      out.write("        \t   \t\t{id:'shop_f',text:'分类管理',href:'Back/index.html'},\r\n");
      out.write("        \t  \t\t{id:'shop_c',text:'产品管理',href:'Back/index.html'}]},\r\n");
      out.write("        \t   {text:'产品信息',items:[\r\n");
      out.write("            \t   \t{id:'shop_f',text:'图片管理',href:'Back/index.html'},\r\n");
      out.write("            \t  \t{id:'shop_c',text:'评论管理',href:'Back/index.html'},\r\n");
      out.write("            \t  \t{id:'shop_f',text:'属性管理',href:'Back/index.html'},\r\n");
      out.write("            \t  \t{id:'shop_c',text:'属值管理',href:'Back/index.html'}]},\r\n");
      out.write("            \t   \t\r\n");
      out.write("           ]},\r\n");
      out.write("        \t   \r\n");
      out.write("        \t{id:'4',menu:[{text:'仓库管理',items:[\r\n");
      out.write("            \t   {id:'shop_f',text:'国家管理',href:'Back/index.html'},\r\n");
      out.write("            \t   {id:'shop_c',text:'产品管理',href:'Back/index.html'}\r\n");
      out.write("            \t   ]}]},\r\n");
      out.write("            \t   \r\n");
      out.write("            {id:'5',menu:[{text:'订单管理',items:[\r\n");
      out.write("                \t{id:'shop_f',text:'订单管理',href:'Back/index.html'}\r\n");
      out.write("                \t]}]},\r\n");
      out.write("                \r\n");
      out.write("            {id:'6',menu:[{text:'钱包管理',items:[\r\n");
      out.write("                    {id:'shop_f',text:'钱包管理',href:'Back/index.html'}\r\n");
      out.write("                  \t]}]},\r\n");
      out.write("                  \t\r\n");
      out.write("            {id:'7',menu:[{text:'个人资料',items:[\r\n");
      out.write("                    {id:'shop_f',text:'个人资料',href:'Back/index.html'}\r\n");
      out.write("                    ]}]},\r\n");
      out.write("        \r\n");
      out.write("        ];\r\n");
      out.write("        new PageUtil.MainPage({\r\n");
      out.write("            modulesConfig : config\r\n");
      out.write("        });\r\n");
      out.write("    }); \r\n");
      out.write("/*     BUI.use('common/main',function(){\r\n");
      out.write("    var config = [{   //模块菜单\r\n");
      out.write("    \t  id:'menu',      //模块编号\r\n");
      out.write("    \t  collapsed:true, //默认左侧菜单收缩\r\n");
      out.write("    \t  homePage:'code', //默认打开的主页\r\n");
      out.write("    \t  menu:[{         //二级菜单\r\n");
      out.write("    \t      text:'首页内容',\r\n");
      out.write("    \t      items:[   //三级菜单\r\n");
      out.write("    \t        {id:'code',text:'首页代码',href:'main/code.html',closeable : false}, //设置不能关闭标签\r\n");
      out.write("    \t        {id:'c',text:'标签页',href:'test.html'},\r\n");
      out.write("    \t        {id:'d',text:'窗口变化',href:'test.html'},\r\n");
      out.write("    \t        {id:'e',text:'首页资源文件',href:'test.html'},\r\n");
      out.write("    \t        {id:'g',text:'其他',href:'test.html'}\r\n");
      out.write("    \t      ]\r\n");
      out.write("    \t    },{\r\n");
      out.write("    \t      //二级菜单\r\n");
      out.write("    \t      \r\n");
      out.write("    \t    },{\r\n");
      out.write("    \t      //二级菜单\r\n");
      out.write("    \t  }]\r\n");
      out.write("    \t},{\r\n");
      out.write("    \t  \r\n");
      out.write("    \t  //模块菜单\r\n");
      out.write("    \t}];\r\n");
      out.write("    \t//初始化主页菜单\r\n");
      out.write("    \tnew PageUtil.MainPage({\r\n");
      out.write("    \t  modulesConfig : config\r\n");
      out.write("    \t});\r\n");
      out.write("    }); */\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
