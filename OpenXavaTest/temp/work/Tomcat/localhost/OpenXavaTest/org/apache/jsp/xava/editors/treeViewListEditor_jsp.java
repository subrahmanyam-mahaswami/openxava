/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2019-10-31 11:23:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava.editors;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.openxava.view.View;
import org.openxava.model.MapFacade;
import org.openxava.web.Actions;
import org.openxava.web.Ids;
import org.openxava.controller.meta.MetaAction;
import org.openxava.controller.meta.MetaControllers;
import org.openxava.tab.impl.IXTableModel;
import org.openxava.web.editors.TreeView;
import org.openxava.web.editors.TreeViewActions;
import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.util.Collection;
import java.util.Collections;
import java.text.DateFormat;
import org.openxava.util.Locales;
import org.openxava.util.Is;
import org.apache.commons.beanutils.PropertyUtils;

public final class treeViewListEditor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/lib/standard-jstlel.jar", Long.valueOf(1572520885660L));
    _jspx_dependants.put("jar:file:/C:/Users/javi/git/openxava/OpenXavaTest/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/fmt-1_0.tld", Long.valueOf(1425975068000L));
    _jspx_dependants.put("jar:file:/C:/Users/javi/git/openxava/OpenXavaTest/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/c-1_0.tld", Long.valueOf(1425975068000L));
    _jspx_dependants.put("/xava/editors/../imports.jsp", Long.valueOf(1572520885384L));
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1572520885664L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.apache.commons.beanutils.PropertyUtils");
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("org.openxava.web.editors.TreeViewActions");
    _jspx_imports_classes.add("java.util.Collection");
    _jspx_imports_classes.add("org.openxava.web.Ids");
    _jspx_imports_classes.add("org.openxava.util.Is");
    _jspx_imports_classes.add("org.openxava.controller.meta.MetaAction");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("org.openxava.tab.impl.IXTableModel");
    _jspx_imports_classes.add("org.openxava.web.Actions");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("org.openxava.view.View");
    _jspx_imports_classes.add("org.openxava.controller.meta.MetaControllers");
    _jspx_imports_classes.add("org.openxava.web.editors.TreeView");
    _jspx_imports_classes.add("java.util.Collections");
    _jspx_imports_classes.add("org.openxava.util.Locales");
    _jspx_imports_classes.add("org.openxava.model.MapFacade");
    _jspx_imports_classes.add("java.text.DateFormat");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005faction_0026_005fargv_005faction_005fnobody;

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
    _005fjspx_005ftagPool_005fxava_005faction_0026_005fargv_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005faction_0026_005fargv_005faction_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.openxava.controller.ModuleContext context = null;
      synchronized (session) {
        context = (org.openxava.controller.ModuleContext) _jspx_page_context.getAttribute("context", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (context == null){
          context = new org.openxava.controller.ModuleContext();
          _jspx_page_context.setAttribute("context", context, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      org.openxava.web.style.Style style = null;
      style = (org.openxava.web.style.Style) _jspx_page_context.getAttribute("style", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (style == null){
        style = new org.openxava.web.style.Style();
        _jspx_page_context.setAttribute("style", style, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\n');
      org.openxava.web.editors.TreeViewParser treeParser = null;
      synchronized (session) {
        treeParser = (org.openxava.web.editors.TreeViewParser) _jspx_page_context.getAttribute("treeParser", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (treeParser == null){
          treeParser = new org.openxava.web.editors.TreeViewParser();
          _jspx_page_context.setAttribute("treeParser", treeParser, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      org.openxava.util.Messages errors = null;
      errors = (org.openxava.util.Messages) _jspx_page_context.getAttribute("errors", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (errors == null){
        errors = new org.openxava.util.Messages();
        _jspx_page_context.setAttribute("errors", errors, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\n');
      out.write('\n');

String viewObject = request.getParameter("viewObject"); // Id to access to the view object of the collection
View collectionView = (View) context.get(request, viewObject); // We get the collection view by means of context
View rootView = collectionView.getRoot(); // In this case we use the root view
String collectionName = request.getParameter("collectionName");
Map key = rootView.getKeyValues();
String action = request.getParameter("rowAction");
String actionArgv = ",viewObject=" + viewObject;
String actionArg = "viewObject=" + viewObject;
String actionWithArgs;
String tabObject = org.openxava.tab.Tab.COLLECTION_PREFIX + collectionName.replace('.', '_');
String prefix = tabObject + "_";
org.openxava.tab.Tab tab = collectionView.getCollectionTab();
tab.setRequest(request);
Map[] keyValues;
String prefixIdRow = Ids.decorate(request, prefix);
String xavaId = Ids.decorate(request, "xava_selected");
tab.reset();
context.put(request, tabObject, tab);
context.put(request, org.openxava.web.editors.TreeViewParser.XAVA_TREE_VIEW_PARSER, treeParser);
treeParser.createMetaTreeView(tab, viewObject, collectionName, style, errors);
String []parseData = treeParser.parse(tab.getModelName());
String javaScriptCode = parseData[0];
String indexList = parseData[1];
String module = request.getParameter("module");
String tableId = Ids.decorate(request.getParameter("application"), module, collectionName);
TreeViewActions metaTreeViewActions = new TreeViewActions(collectionView, treeParser.getMetaTreeView(tab.getModelName()));

if(!Is.empty(key)){

      out.write('\n');
      out.write('	');
      //  xava:action
      org.openxava.web.taglib.ActionTag _jspx_th_xava_005faction_005f0 = (org.openxava.web.taglib.ActionTag) _005fjspx_005ftagPool_005fxava_005faction_0026_005fargv_005faction_005fnobody.get(org.openxava.web.taglib.ActionTag.class);
      boolean _jspx_th_xava_005faction_005f0_reused = false;
      try {
        _jspx_th_xava_005faction_005f0.setPageContext(_jspx_page_context);
        _jspx_th_xava_005faction_005f0.setParent(null);
        // /xava/editors/treeViewListEditor.jsp(58,1) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005faction_005f0.setAction(metaTreeViewActions.getUpAction());
        // /xava/editors/treeViewListEditor.jsp(58,1) name = argv type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005faction_005f0.setArgv(actionArg);
        int _jspx_eval_xava_005faction_005f0 = _jspx_th_xava_005faction_005f0.doStartTag();
        if (_jspx_th_xava_005faction_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005faction_0026_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005faction_005f0);
        _jspx_th_xava_005faction_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005faction_005f0, _jsp_getInstanceManager(), _jspx_th_xava_005faction_005f0_reused);
      }
      out.write('\n');
      out.write('	');
      //  xava:action
      org.openxava.web.taglib.ActionTag _jspx_th_xava_005faction_005f1 = (org.openxava.web.taglib.ActionTag) _005fjspx_005ftagPool_005fxava_005faction_0026_005fargv_005faction_005fnobody.get(org.openxava.web.taglib.ActionTag.class);
      boolean _jspx_th_xava_005faction_005f1_reused = false;
      try {
        _jspx_th_xava_005faction_005f1.setPageContext(_jspx_page_context);
        _jspx_th_xava_005faction_005f1.setParent(null);
        // /xava/editors/treeViewListEditor.jsp(59,1) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005faction_005f1.setAction(metaTreeViewActions.getDownAction());
        // /xava/editors/treeViewListEditor.jsp(59,1) name = argv type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005faction_005f1.setArgv(actionArg);
        int _jspx_eval_xava_005faction_005f1 = _jspx_th_xava_005faction_005f1.doStartTag();
        if (_jspx_th_xava_005faction_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005faction_0026_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005faction_005f1);
        _jspx_th_xava_005faction_005f1_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005faction_005f1, _jsp_getInstanceManager(), _jspx_th_xava_005faction_005f1_reused);
      }
      out.write('\n');
      out.write('	');
      //  xava:action
      org.openxava.web.taglib.ActionTag _jspx_th_xava_005faction_005f2 = (org.openxava.web.taglib.ActionTag) _005fjspx_005ftagPool_005fxava_005faction_0026_005fargv_005faction_005fnobody.get(org.openxava.web.taglib.ActionTag.class);
      boolean _jspx_th_xava_005faction_005f2_reused = false;
      try {
        _jspx_th_xava_005faction_005f2.setPageContext(_jspx_page_context);
        _jspx_th_xava_005faction_005f2.setParent(null);
        // /xava/editors/treeViewListEditor.jsp(60,1) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005faction_005f2.setAction(metaTreeViewActions.getLeftAction());
        // /xava/editors/treeViewListEditor.jsp(60,1) name = argv type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005faction_005f2.setArgv(actionArg);
        int _jspx_eval_xava_005faction_005f2 = _jspx_th_xava_005faction_005f2.doStartTag();
        if (_jspx_th_xava_005faction_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005faction_0026_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005faction_005f2);
        _jspx_th_xava_005faction_005f2_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005faction_005f2, _jsp_getInstanceManager(), _jspx_th_xava_005faction_005f2_reused);
      }
      out.write('\n');
      out.write('	');
      //  xava:action
      org.openxava.web.taglib.ActionTag _jspx_th_xava_005faction_005f3 = (org.openxava.web.taglib.ActionTag) _005fjspx_005ftagPool_005fxava_005faction_0026_005fargv_005faction_005fnobody.get(org.openxava.web.taglib.ActionTag.class);
      boolean _jspx_th_xava_005faction_005f3_reused = false;
      try {
        _jspx_th_xava_005faction_005f3.setPageContext(_jspx_page_context);
        _jspx_th_xava_005faction_005f3.setParent(null);
        // /xava/editors/treeViewListEditor.jsp(61,1) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005faction_005f3.setAction(metaTreeViewActions.getRightAction());
        // /xava/editors/treeViewListEditor.jsp(61,1) name = argv type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005faction_005f3.setArgv(actionArg);
        int _jspx_eval_xava_005faction_005f3 = _jspx_th_xava_005faction_005f3.doStartTag();
        if (_jspx_th_xava_005faction_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005faction_0026_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005faction_005f3);
        _jspx_th_xava_005faction_005f3_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005faction_005f3, _jsp_getInstanceManager(), _jspx_th_xava_005faction_005f3_reused);
      }
      out.write("\n");
      out.write("\t<div id = \"tree_");
      out.print(collectionName);
      out.write("\" class=\"ygtv-checkbox\" >\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div id = \"openxavaInput_");
      out.print(collectionName);
      out.write("\" style=\"visibility: hidden; height:0px\">\n");
      out.write("\t\t<table id = \"");
      out.print(tableId);
      out.write("\" name=\"treeTable_");
      out.print(collectionName);
      out.write("\" style=\"height:0px\">\n");
      out.write("\t\t\t<tbody id = \"");
      out.print(tableId);
      out.write("_body\" >\n");
      out.write("\t\t\t");

			int count = 0;
			String [] indexes = indexList.split(","); 
			for (int i=0; i<indexes.length; i++) { 
				String index = indexes[i]; 
				actionWithArgs = "row=" + index  + actionArgv;
				String indexId = prefixIdRow + index;
				String nodeId = xavaId + index;
				String nodeValue = prefix + "selected:" + index;
				String nodeRef = "openxava.executeAction('" +
					request.getParameter("application") + "', '" + request.getParameter("module") +"', '', false, '" + action + "', '" +
					actionWithArgs + "')";
				
      out.write("\n");
      out.write("\t\t\t\t<tr id=\"");
      out.print(indexId);
      out.write("\">\n");
      out.write("\t\t\t\t  <td>\n");
      out.write("\t\t\t\t    <input type=\"checkbox\" name=\"");
      out.print(xavaId);
      out.write("\" id=\"");
      out.print(nodeId);
      out.write("\"\n");
      out.write("\t\t\t\t        value = \"");
      out.print(nodeValue);
      out.write("\" style=\"height:0px\" />\n");
      out.write("\t\t\t\t    <a href = \"");
      out.print(nodeRef);
      out.write("\">_</a>\n");
      out.write("\t\t\t\t  </td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t");

				count++;
			}
				
			
			
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t\t</tbody>\n");
      out.write("\t\t</table>\t\t\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(document).ready(function(){\n");
      out.write("\t\t\tvar tree_");
      out.print(collectionName);
      out.write(" = {};\n");
      out.write("\t\t\ttree_");
      out.print(collectionName);
      out.write(".tree = ");
      out.print(javaScriptCode);
      out.write("\n");
      out.write("\t\t\ttree_");
      out.print(collectionName);
      out.write(".suppress = false; // this will prevent collapse/expand when clicking on label\n");
      out.write("\t\t\ttree_");
      out.print(collectionName);
      out.write(".loading = true; // this will prevent collapse/expand when loading\n");
      out.write("\t\t\ttree_");
      out.print(collectionName);
      out.write(".tree.render();\n");
      out.write("\t\t\ttree_");
      out.print(collectionName);
      out.write(".loading = false;\n");
      out.write("\n");
      out.write("\t\t\ttree_");
      out.print(collectionName);
      out.write(".tree.subscribe(\"clickEvent\", function(args) {\n");
      out.write("\t\t\t\ttree_");
      out.print(collectionName);
      out.write(".suppress=true;\n");
      out.write("\t\t\t\ttree_");
      out.print(collectionName);
      out.write(".tree.onEventToggleHighlight(args);\n");
      out.write("\t\t\t\tnode = args[\"node\"];\n");
      out.write("\t\t\t\tnodeIndex = node.data;\n");
      out.write("\t\t\t\tvar actionWithArgs = \"row=\" + nodeIndex  + \"");
      out.print(actionArgv);
      out.write("\";\n");
      out.write("\t\n");
      out.write("\t\t\t\t// syncronize state with openxava hidden input item\n");
      out.write("\t\t\t\tvar htmlInput = document.getElementById(\"");
      out.print(xavaId);
      out.write("\" + node.data);\n");
      out.write("\t\t\t\tif (htmlInput != null) {\n");
      out.write("\t\t\t\t\tif (node.highlightState == 1){\n");
      out.write("\t\t\t\t\t\thtmlInput.checked = true;\n");
      out.write("\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\thtmlInput.checked = false;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\ttree_");
      out.print(collectionName);
      out.write(".tree.subscribe(\"dblClickEvent\", function(args) {\n");
      out.write("\t\t\t\tnode = args[\"node\"];\n");
      out.write("\t\t\t\ttree_");
      out.print(collectionName);
      out.write(".suppress=true; \n");
      out.write("\t\t\t\tvar actionWithArgs = \"row=\" + (node.data)  + \"");
      out.print(actionArgv);
      out.write("\";\n");
      out.write("\t\t\t\topenxava.executeAction('");
      out.print(request.getParameter("application"));
      out.write("', '");
      out.print(request.getParameter("module"));
      out.write("', \"\", false, '");
      out.print(action);
      out.write("', actionWithArgs);\n");
      out.write("\t\t\t});\n");
      out.write("\t\n");
      out.write("\t\t\ttree_");
      out.print(collectionName);
      out.write(".tree.subscribe(\"expand\", function(node) {\n");
      out.write("\t\t\t\tif (tree_");
      out.print(collectionName);
      out.write(".suppress) {\n");
      out.write("\t\t\t\t\ttree_");
      out.print(collectionName);
      out.write(".suppress = false;\n");
      out.write("\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tif (!tree_");
      out.print(collectionName);
      out.write(".loading) {\n");
      out.write("\t\t\t\t\tvar actionWithArgs = \"row=\" + (node.data)  + \"");
      out.print(actionArgv);
      out.write("\";\n");
      out.write("\t\t\t\t\topenxava.executeAction('");
      out.print(request.getParameter("application"));
      out.write("', '");
      out.print(request.getParameter("module"));
      out.write("', \"\", false, 'TreeView.expand', actionWithArgs);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\n");
      out.write("\t\t\ttree_");
      out.print(collectionName);
      out.write(".tree.subscribe(\"collapse\", function(node) {\n");
      out.write("\t\t\t\tif (tree_");
      out.print(collectionName);
      out.write(".suppress || tree_");
      out.print(collectionName);
      out.write(".loading) {\n");
      out.write("\t\t\t\t\ttree_");
      out.print(collectionName);
      out.write(".suppress = false;\n");
      out.write("\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tif (!tree_");
      out.print(collectionName);
      out.write(".loading) {\n");
      out.write("\t\t\t\t\tvar actionWithArgs = \"row=\" + (node.data)  + \"");
      out.print(actionArgv);
      out.write("\";\n");
      out.write("\t\t\t\t\topenxava.executeAction('");
      out.print(request.getParameter("application"));
      out.write("', '");
      out.print(request.getParameter("module"));
      out.write("', \"\", false, 'TreeView.collapse', actionWithArgs);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t})\n");
      out.write("\t</script>\n");
      out.write("\t\n");
      out.write("\t");

}

      out.write('\n');
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
