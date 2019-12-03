/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2019-12-03 11:14:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Locale;
import org.openxava.util.XavaResources;
import org.openxava.util.Primitives;
import org.openxava.util.Strings;
import org.openxava.util.Is;
import org.openxava.tab.meta.MetaTab;
import org.openxava.tab.Tab;
import org.openxava.component.MetaComponent;
import org.openxava.model.meta.MetaModel;
import org.openxava.model.meta.MetaProperty;
import org.openxava.util.XSystem;
import org.openxava.util.XavaPreferences;

public final class jasperReport_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {


private static int EXTRA_WIDTH = 15; 
private static int MAX_CHARACTERS_PER_ROW = 122;   // If you modify these
private static int WIDE_CHARACTERS_PER_ROW = 104; // values please verify
private static int MEDIUM_CHARACTERS_PER_ROW = 63; // if the tests in PrettyPrintingTest
private static int NARROW_CHARACTERS_PER_ROW = 44; // pass for the 4 branch of the if below

private int [] parseWidths(String widths, Integer columnCountLimit) { 
	String [] tokens = widths.split("[\\[\\], ]+");		
	int size = columnCountLimit == null?tokens.length - 1:columnCountLimit.intValue(); 
	int [] result = new int[size];
	for (int i=0; i<result.length; i++) {
		result[i] = Integer.parseInt(tokens[i+1]);
	}	
	return result;	
}

private int adjustWithsToLabels(List metaProperties, int [] widths, Locale locale) {  
	int totalWidth = 0;	
	int i=0;
	for (Iterator it = metaProperties.iterator(); it.hasNext(); i++) {
		MetaProperty p = (MetaProperty) it.next();
		String label = p.getQualifiedLabel(locale);  
		if (widths[i] == 0) widths[i] = p.getSize();
		int labelLength = Math.min(label.length(), 10); 
		if (widths[i] < labelLength) widths[i] = labelLength;
		totalWidth+=widths[i];		
	}
	return totalWidth;
}

private int calculateRowsInHeader(List metaProperties, int [] widths, Locale locale) { 	 	
	int rowsInHeader = 1;
	int i=0;
	for (Iterator it = metaProperties.iterator(); it.hasNext(); i++) {
		MetaProperty p = (MetaProperty) it.next();
		String label = p.getQualifiedLabel(locale); 
		int rows = (label.length() - 1) / (int) (widths[i] * 1.58) + 1; 
		rowsInHeader = Math.max(rowsInHeader, rows);	
	}
	return rowsInHeader;
}

private void expandWidths(List metaProperties, int [] widths, int max, Locale locale) { 
	int totalWidth = 0;
	Collection candidates = new java.util.ArrayList();
	for (int i=0; i<widths.length; i++) {
		if (widths[i] < ((MetaProperty) metaProperties.get(i)).getQualifiedLabel(locale).length()) {
			candidates.add(new Integer(i));
		}
		totalWidth += widths[i];
	}
	if (totalWidth < max && !candidates.isEmpty()) {
		int extra = (max - totalWidth) / candidates.size();
		for (Iterator it = candidates.iterator(); it.hasNext(); ) {
			int i = ((Integer) it.next()).intValue();
			widths[i] = widths[i] + extra;
		}
	}	
}

private int [] tightenWidths(List metaProperties, int [] widths) { 
	int [] originalWidths = widths.clone(); 
	int littleOnesTotal = 0;
	int littleOnesCount = 0;
	for (int i=0; i<widths.length; i++) {
		if (widths[i] <= 20) {
			littleOnesTotal+=widths[i];
			littleOnesCount++;
		}
	}	
	int spaceForBigOnes = MAX_CHARACTERS_PER_ROW - littleOnesTotal;
	int bigOnesCount = widths.length - littleOnesCount; 
	int widthForBig = bigOnesCount==0?20:spaceForBigOnes / bigOnesCount; 
	if (widthForBig < 20) widthForBig = 20;
	int total = 0; 
	for (int i=0; i<widths.length; i++) {
		if (widths[i] > 20 && widths[i] > widthForBig) widths[i] = widthForBig;
		total += widths[i];
	}		
	if (total > MAX_CHARACTERS_PER_ROW) {
		metaProperties.remove(metaProperties.size() - 1);
		widths = org.apache.commons.lang.ArrayUtils.remove(originalWidths, originalWidths.length - 1);
		return tightenWidths(metaProperties, widths);
	}
	return widths;
}

private String getAlign(MetaProperty p) throws Exception {
	String align = "Left";
	if (p.isNumber() && !p.hasValidValues()) align = "Right";
	else if (p.getType().equals(boolean.class)) align = "Center";
	return align;
}

private List getMetaProperties(Tab tab, Integer columnCountLimit) { 
	if (columnCountLimit == null) return new java.util.ArrayList(tab.getMetaProperties()); 
	List result = new java.util.ArrayList(); 
	int c = 0;
	for (MetaProperty p: tab.getMetaProperties()) {
		if (++c > columnCountLimit) break; 
		result.add(p);
	}
	return result;
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/standard-jstlel.jar", Long.valueOf(1575371535963L));
    _jspx_dependants.put("jar:file:/C:/Users/javi/git/openxava/OpenXavaTest/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/c-1_0.tld", Long.valueOf(1425975068000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.openxava.model.meta.MetaProperty");
    _jspx_imports_classes.add("org.openxava.tab.meta.MetaTab");
    _jspx_imports_classes.add("org.openxava.util.Primitives");
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("org.openxava.util.Strings");
    _jspx_imports_classes.add("org.openxava.util.XavaPreferences");
    _jspx_imports_classes.add("java.util.Collection");
    _jspx_imports_classes.add("java.util.HashMap");
    _jspx_imports_classes.add("org.openxava.util.Is");
    _jspx_imports_classes.add("org.openxava.util.XSystem");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.util.Locale");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("org.openxava.util.XavaResources");
    _jspx_imports_classes.add("org.openxava.tab.Tab");
    _jspx_imports_classes.add("org.openxava.component.MetaComponent");
    _jspx_imports_classes.add("org.openxava.model.meta.MetaModel");
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

      out.print("<?xml version='1.0' encoding='" + org.openxava.util.XSystem.getEncoding() + "' ?>");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE jasperReport PUBLIC \"-//JasperReports//DTD Report Design//EN\" \n");
      out.write("\"http://jasperreports.sourceforge.net/dtds/jasperreport.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
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
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');

Tab tab = (Tab) request.getSession().getAttribute("xava_reportTab");
String reportName = Strings.change(tab.getModelName(), ".", "_"); 
Collection totalProperties = tab.getTotalPropertiesNames();  		
String language = request.getParameter("language");
if (language == null) language = org.openxava.util.Locales.getCurrent().getDisplayLanguage();
language = language == null?request.getLocale().getDisplayLanguage():language;
Locale locale = new Locale(language, "");
String scolumnCountLimit = request.getParameter("columnCountLimit");
Integer columnCountLimit = scolumnCountLimit == null?null:Integer.parseInt(scolumnCountLimit);
List metaProperties = getMetaProperties(tab, columnCountLimit);
int columnsSeparation = 10;
int [] widths = parseWidths(request.getParameter("widths"), columnCountLimit); 
int totalWidth = adjustWithsToLabels(metaProperties, widths, locale); 
int letterWidth;
int letterSize;
int detailHeight;
int pageWidth;
int pageHeight;
int columnWidth;
String orientation = null;

if (totalWidth > WIDE_CHARACTERS_PER_ROW) {
	if (totalWidth > MAX_CHARACTERS_PER_ROW) tightenWidths(metaProperties, widths);
	else expandWidths(metaProperties, widths, MAX_CHARACTERS_PER_ROW, locale); 
	orientation="Landscape";
	letterWidth = 4;
	letterSize = 7;
	detailHeight = 8; 
	pageWidth=842;
	pageHeight=595;
	columnWidth=780;	
}
else if (totalWidth > MEDIUM_CHARACTERS_PER_ROW) {
	expandWidths(metaProperties, widths, WIDE_CHARACTERS_PER_ROW, locale); 
	orientation="Landscape";
	letterWidth = 5;  
	letterSize=8;
	detailHeight = 10;
	pageWidth=842;
	pageHeight=595;
	columnWidth=780;	
} 
else if (totalWidth > NARROW_CHARACTERS_PER_ROW) {
	expandWidths(metaProperties, widths, MEDIUM_CHARACTERS_PER_ROW, locale); 
	orientation="Portrait";
	letterWidth = 5; 
	letterSize=8;
	detailHeight = 10;
	pageWidth=595;
	pageHeight=842;
	columnWidth=535;
}
else {
	expandWidths(metaProperties, widths, NARROW_CHARACTERS_PER_ROW, locale);
	orientation="Portrait";
	letterWidth = 10;
	letterSize = 12;
	detailHeight = 15;
	pageWidth=595;
	pageHeight=842;
	columnWidth=535;
}

int rowsInHeader = calculateRowsInHeader(metaProperties, widths, locale);

      out.write("\n");
      out.write("\n");
      out.write("<jasperReport\n");
      out.write("\t\t name=\"");
      out.print(reportName);
      out.write("\"\n");
      out.write("\t\t columnCount=\"1\"\n");
      out.write("\t\t printOrder=\"Vertical\"\n");
      out.write("\t\t orientation=\"");
      out.print(orientation);
      out.write("\"\n");
      out.write("\t\t pageWidth=\"");
      out.print(pageWidth);
      out.write("\"\n");
      out.write("\t\t pageHeight=\"");
      out.print(pageHeight);
      out.write("\"\n");
      out.write("\t\t columnWidth=\"");
      out.print(columnWidth);
      out.write("\"\n");
      out.write("\t\t columnSpacing=\"0\"\n");
      out.write("\t\t leftMargin=\"30\"\n");
      out.write("\t\t rightMargin=\"30\"\n");
      out.write("\t\t topMargin=\"20\"\n");
      out.write("\t\t bottomMargin=\"20\"\n");
      out.write("\t\t whenNoDataType=\"NoPages\"\n");
      out.write("\t\t isTitleNewPage=\"false\"\n");
      out.write("\t\t isSummaryNewPage=\"false\">\t\t \n");
      out.write("\t");

	String fontPath=request.getSession().getServletContext().getRealPath("/WEB-INF/fonts/").concat(System.getProperty("file.separator"));
	String fontName="DejaVu Sans";
	String fontNameExt="DejaVuSans.ttf";
	String boldFontNameExt="DejaVuSans-Bold.ttf";	
	String pdfEncoding="Identity-H";
	
      out.write("\t\n");
      out.write("\t<reportFont name=\"Arial_Normal\" isDefault=\"true\" fontName=\"");
      out.print(fontName);
      out.write("\" size=\"8\" pdfFontName=\"");
      out.print(fontPath.concat(fontNameExt));
      out.write("\" pdfEncoding=\"");
      out.print(pdfEncoding);
      out.write("\" isPdfEmbedded=\"true\"/>\n");
      out.write("\t<reportFont name=\"Arial_Bold\" isDefault=\"false\" fontName=\"");
      out.print(fontName);
      out.write("\" size=\"8\" isBold=\"true\" pdfFontName=\"");
      out.print(fontPath.concat(boldFontNameExt));
      out.write("\" pdfEncoding=\"");
      out.print(pdfEncoding);
      out.write("\" isPdfEmbedded=\"true\"/>\n");
      out.write("\t<reportFont name=\"Arial_Italic\" isDefault=\"false\" fontName=\"");
      out.print(fontName);
      out.write("\" size=\"8\" isItalic=\"true\" pdfFontName=\"");
      out.print(fontPath.concat(fontNameExt));
      out.write("\" pdfEncoding=\"");
      out.print(pdfEncoding);
      out.write("\" isPdfEmbedded=\"true\"/>\n");
      out.write("\n");
      out.write("\t<parameter name=\"Title\" class=\"java.lang.String\"/>\t\n");
      out.write("\t<parameter name=\"Organization\" class=\"java.lang.String\"/>\n");
      out.write("\t<parameter name=\"Date\" class=\"java.lang.String\"/>\n");
      out.write("\t");
	 
	for (Iterator it = metaProperties.iterator(); it.hasNext();) {
		MetaProperty p = (MetaProperty) it.next();				
		if (totalProperties.contains(p.getQualifiedName())) {				 
	
      out.write("\n");
      out.write("\t<parameter name=\"");
      out.print(p.getQualifiedName());
      out.write("__TOTAL__\" class=\"java.lang.String\"/> \t\n");
      out.write("\t");

		}
	}
	
      out.write("\t\n");
      out.write("\t\t\n");
      out.write("\t");
		 
	for (Iterator it = metaProperties.iterator(); it.hasNext();) {
		MetaProperty p = (MetaProperty) it.next();
	
      out.write("\n");
      out.write("\t<field name=\"");
      out.print(Strings.change(p.getQualifiedName(), ".", "_"));
      out.write("\" class=\"java.lang.String\"/> \t\n");
      out.write("\t");

	}
	
      out.write("\t\n");
      out.write("\t\t<background>\n");
      out.write("\t\t\t<band height=\"0\"  isSplitAllowed=\"true\" >\n");
      out.write("\t\t\t</band>\n");
      out.write("\t\t</background>\n");
      out.write("\t\t<title>\n");
      out.write("\t\t\t<band height=\"25\"  isSplitAllowed=\"true\" >\n");
      out.write("\n");
      out.write("\t\t\t\t<textField>\n");
      out.write("\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Transparent\"\n");
      out.write("\t\t\t\t\t\tx=\"0\"\n");
      out.write("\t\t\t\t\t\ty=\"0\"\n");
      out.write("\t\t\t\t\t\twidth=\"200\"\n");
      out.write("\t\t\t\t\t\theight=\"25\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#000000\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"FixRelativeToTop\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"false\"/>\n");
      out.write("\t\t\t\t\t<textElement textAlignment=\"Left\" verticalAlignment=\"Top\" lineSpacing=\"Single\">\n");
      out.write("\t\t\t\t\t\t<font reportFont=\"Arial_Normal\" size=\"8\"/>\n");
      out.write("\t\t\t\t\t</textElement>\n");
      out.write("\t\t\t\t\t<textFieldExpression class=\"java.lang.String\">$P{Organization}</textFieldExpression>\t\t\t\t\t\n");
      out.write("\t\t\t\t</textField>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t<textField>\n");
      out.write("\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Transparent\"\n");
      out.write("\t\t\t\t\t\tx=\"5\"\n");
      out.write("\t\t\t\t\t\ty=\"5\"\n");
      out.write("\t\t\t\t\t\twidth=\"");
      out.print(columnWidth);
      out.write("\"\n");
      out.write("\t\t\t\t\t\theight=\"20\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#000000\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"FixRelativeToTop\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"false\"/>\n");
      out.write("\t\t\t\t\t<textElement textAlignment=\"Center\" verticalAlignment=\"Top\" lineSpacing=\"Single\">\n");
      out.write("\t\t\t\t\t\t<font reportFont=\"Arial_Normal\" size=\"15\"/>\n");
      out.write("\t\t\t\t\t</textElement>\n");
      out.write("\t\t\t\t\t<textFieldExpression class=\"java.lang.String\">$P{Title}</textFieldExpression>\t\t\t\t\t\n");
      out.write("\t\t\t\t</textField>\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t<line direction=\"TopDown\">\n");
      out.write("\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Opaque\"\n");
      out.write("\t\t\t\t\t\tx=\"0\"\n");
      out.write("\t\t\t\t\t\ty=\"23\"\n");
      out.write("\t\t\t\t\t\twidth=\"");
      out.print(columnWidth);
      out.write("\"\n");
      out.write("\t\t\t\t\t\theight=\"0\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#000000\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"FixRelativeToTop\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"false\"/>\n");
      out.write("\t\t\t\t\t<graphicElement stretchType=\"NoStretch\" pen=\"1Point\" fill=\"Solid\" />\n");
      out.write("\t\t\t\t</line>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Top line\n");
      out.write("\t\t\t\t<line direction=\"TopDown\">\n");
      out.write("\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Opaque\"\n");
      out.write("\t\t\t\t\t\tx=\"0\"\n");
      out.write("\t\t\t\t\t\ty=\"3\"\n");
      out.write("\t\t\t\t\t\twidth=\"");
      out.print(columnWidth);
      out.write("\"\n");
      out.write("\t\t\t\t\t\theight=\"0\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#000000\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"FixRelativeToTop\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"false\"/>\n");
      out.write("\t\t\t\t\t<graphicElement stretchType=\"NoStretch\" pen=\"1Point\" fill=\"Solid\" />\n");
      out.write("\t\t\t\t</line>\n");
      out.write("\t\t\t\t-->\n");
      out.write("\t\t\t</band>\n");
      out.write("\t\t</title>\n");
      out.write("\t\t<pageHeader>\n");
      out.write("\t\t\t<band height=\"9\"  isSplitAllowed=\"true\" >\n");
      out.write("\t\t\t</band>\n");
      out.write("\t\t</pageHeader>\n");
      out.write("\t\t");
 
		int headerHeight = rowsInHeader * detailHeight + 8; 
		
      out.write("\n");
      out.write("\t\t<columnHeader>\n");
      out.write("\t\t\t<band height=\"");
      out.print(headerHeight);
      out.write("\" isSplitAllowed=\"true\" >\n");
      out.write("\t\t\t\t<rectangle radius=\"0\" >\n");
      out.write("\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Opaque\"\n");
      out.write("\t\t\t\t\t\tx=\"0\"\n");
      out.write("\t\t\t\t\t\ty=\"0\"\n");
      out.write("\t\t\t\t\t\twidth=\"");
      out.print(columnWidth);
      out.write("\"\n");
      out.write("\t\t\t\t\t\theight=\"");
      out.print(headerHeight - 5);
      out.write("\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#000000\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#808080\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"FixRelativeToTop\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"false\"/>\n");
      out.write("\t\t\t\t\t<graphicElement stretchType=\"NoStretch\" pen=\"None\" fill=\"Solid\" />\n");
      out.write("\t\t\t\t</rectangle>\n");
      out.write("\t\t\t\t<line direction=\"BottomUp\">\n");
      out.write("\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Opaque\"\n");
      out.write("\t\t\t\t\t\tx=\"0\"\n");
      out.write("\t\t\t\t\t\ty=\"0\"\n");
      out.write("\t\t\t\t\t\twidth=\"");
      out.print(columnWidth);
      out.write("\"\n");
      out.write("\t\t\t\t\t\theight=\"0\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#000000\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"FixRelativeToTop\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"false\"/>\n");
      out.write("\t\t\t\t\t<graphicElement stretchType=\"NoStretch\" pen=\"Thin\" fill=\"Solid\" />\n");
      out.write("\t\t\t\t</line>\n");
      out.write("\t\t\t\t<line direction=\"BottomUp\">\n");
      out.write("\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Opaque\"\n");
      out.write("\t\t\t\t\t\tx=\"0\"\n");
      out.write("\t\t\t\t\t\ty=\"");
      out.print(headerHeight - 6);
      out.write("\"\n");
      out.write("\t\t\t\t\t\twidth=\"");
      out.print(columnWidth);
      out.write("\"\n");
      out.write("\t\t\t\t\t\theight=\"0\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#000000\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"FixRelativeToTop\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"false\"/>\n");
      out.write("\t\t\t\t\t<graphicElement stretchType=\"NoStretch\" pen=\"Thin\" fill=\"Solid\" />\n");
      out.write("\t\t\t\t</line>\n");
 
int x = 0;
int i = 0;
for (Iterator it = metaProperties.iterator(); it.hasNext(); i++) {			
	MetaProperty p = (MetaProperty) it.next();
	int width=widths[i]*letterWidth + EXTRA_WIDTH; 		

      out.write("\n");
      out.write("\t\t\t\t<staticText>\n");
      out.write("\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Transparent\"\n");
      out.write("\t\t\t\t\t\tx=\"");
      out.print(x);
      out.write("\"\n");
      out.write("\t\t\t\t\t\ty=\"2\"\n");
      out.write("\t\t\t\t\t\twidth=\"");
      out.print(width);
      out.write("\"\n");
      out.write("\t\t\t\t\t\theight=\"");
      out.print(headerHeight-2);
      out.write("\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"FixRelativeToTop\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"true\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"true\"/>\n");
      out.write("\t\t\t\t\t<textElement textAlignment=\"");
      out.print(getAlign(p));
      out.write("\" verticalAlignment=\"Top\" lineSpacing=\"Single\">\n");
      out.write("\t\t\t\t\t\t<font reportFont=\"Arial_Normal\" size=\"");
      out.print(letterSize);
      out.write("\"/>\n");
      out.write("\t\t\t\t\t</textElement>\n");
      out.write("\t\t\t\t\t");
 String label = "<![CDATA[" + p.getQualifiedLabel(locale) + "]]>"; 
      out.write("\n");
      out.write("\t\t\t\t\t<text>");
      out.print(label);
      out.write("</text>\t\t\t\t\t\n");
      out.write("\t\t\t\t</staticText>\n");

	x+=(width+columnsSeparation);
}

      out.write("\t\t\t\t\n");
      out.write("\t\t\t</band>\n");
      out.write("\t\t</columnHeader>\n");
      out.write("\t\t\n");
      out.write("\t\t<detail>\n");
      out.write("\t\t\t<band height=\"");
      out.print(detailHeight + 2);
      out.write("\"  isSplitAllowed=\"true\" >\n");
      out.write("\t\t\t\t<line direction=\"TopDown\">\n");
      out.write("\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Opaque\"\n");
      out.write("\t\t\t\t\t\tx=\"0\"\n");
      out.write("\t\t\t\t\t\ty=\"0\" \n");
      out.write("\t\t\t\t\t\twidth=\"");
      out.print(columnWidth);
      out.write("\"\n");
      out.write("\t\t\t\t\t\theight=\"0\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#808080\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"Float\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"true\"/>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<graphicElement stretchType=\"NoStretch\" pen=\"Thin\" fill=\"Solid\" />\n");
      out.write("\t\t\t\t</line>\n");
 
x = 0;
i = 0;
for (Iterator it = metaProperties.iterator(); it.hasNext(); i++) {			
	MetaProperty p = (MetaProperty) it.next();	
	int width=widths[i]*letterWidth + EXTRA_WIDTH; 

      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t<textField isStretchWithOverflow=\"true\" pattern=\"\" isBlankWhenNull=\"true\" evaluationTime=\"Now\" hyperlinkType=\"None\" >\n");
      out.write("\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Transparent\"\n");
      out.write("\t\t\t\t\t\tx=\"");
      out.print(x);
      out.write("\"\n");
      out.write("\t\t\t\t\t\ty=\"2\"\n");
      out.write("\t\t\t\t\t\twidth=\"");
      out.print(width);
      out.write("\"\n");
      out.write("\t\t\t\t\t\theight=\"");
      out.print(detailHeight);
      out.write("\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#000000\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"FixRelativeToTop\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"false\"/>\n");
      out.write("\t\t\t\t\t<textElement textAlignment=\"");
      out.print(getAlign(p));
      out.write("\" verticalAlignment=\"Top\" lineSpacing=\"Single\">\n");
      out.write("\t\t\t\t\t\t<font reportFont=\"Arial_Normal\" size=\"");
      out.print(letterSize);
      out.write("\"/>\n");
      out.write("\t\t\t\t\t</textElement>\n");
      out.write("\t\t\t\t\t<textFieldExpression class=\"java.lang.String\">$F{");
      out.print(Strings.change(p.getQualifiedName(), ".", "_"));
      out.write("}</textFieldExpression>\n");
      out.write("\t\t\t\t</textField>\n");

	x+=(width+columnsSeparation);
}

      out.write("\t\t\t\t\n");
      out.write("\t\t\t</band>\n");
      out.write("\t\t</detail>\n");
      out.write("\t\t<pageFooter>\n");
      out.write("\t\t\t<band height=\"27\"  isSplitAllowed=\"true\" >\n");
      out.write("\t\t\t\t<textField isStretchWithOverflow=\"false\" pattern=\"\" isBlankWhenNull=\"false\" evaluationTime=\"Now\" hyperlinkType=\"None\" >\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Transparent\"\n");
      out.write("\t\t\t\t\t\tx=\"");
      out.print(columnWidth - 210);
      out.write("\"\n");
      out.write("\t\t\t\t\t\ty=\"4\"\n");
      out.write("\t\t\t\t\t\twidth=\"174\"\n");
      out.write("\t\t\t\t\t\theight=\"19\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#000000\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"FixRelativeToTop\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"false\"/>\n");
      out.write("\t\t\t\t\t<textElement textAlignment=\"Right\" verticalAlignment=\"Top\" lineSpacing=\"Single\">\n");
      out.write("\t\t\t\t\t\t<font reportFont=\"Arial_Normal\" size=\"10\"/>\n");
      out.write("\t\t\t\t\t</textElement>\n");
      out.write("\t\t\t\t");

				String iniPageLabel = "<![CDATA[\"" + XavaResources.getString(request, "page") + " \"";
				String endPageLabel = " \" " + XavaResources.getString("of") + " \"]]>";
				
      out.write("\n");
      out.write("\t\t\t\t<textFieldExpression class=\"java.lang.String\">");
      out.print(iniPageLabel);
      out.write(" + $V{PAGE_NUMBER} + ");
      out.print(endPageLabel);
      out.write("</textFieldExpression>\n");
      out.write("\t\t\t\t</textField>\n");
      out.write("\t\t\t\t<textField isStretchWithOverflow=\"false\" pattern=\"\" isBlankWhenNull=\"false\" evaluationTime=\"Report\" hyperlinkType=\"None\" >\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Transparent\"\n");
      out.write("\t\t\t\t\t\tx=\"");
      out.print(columnWidth - 36);
      out.write("\"\n");
      out.write("\t\t\t\t\t\ty=\"4\"\n");
      out.write("\t\t\t\t\t\twidth=\"36\"\n");
      out.write("\t\t\t\t\t\theight=\"19\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#000000\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"FixRelativeToTop\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"false\"/>\n");
      out.write("\t\t\t\t\t<textElement textAlignment=\"Left\" verticalAlignment=\"Top\" lineSpacing=\"Single\">\n");
      out.write("\t\t\t\t\t\t<font reportFont=\"Arial_Normal\" size=\"10\" />\n");
      out.write("\t\t\t\t\t</textElement>\n");
      out.write("\t\t\t\t<textFieldExpression   class=\"java.lang.String\"><![CDATA[\" \" + $V{PAGE_NUMBER}]]></textFieldExpression>\n");
      out.write("\t\t\t\t</textField>\n");
      out.write("\t\t\t\t<line direction=\"TopDown\">\n");
      out.write("\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Opaque\"\n");
      out.write("\t\t\t\t\t\tx=\"0\"\n");
      out.write("\t\t\t\t\t\ty=\"1\"\n");
      out.write("\t\t\t\t\t\twidth=\"");
      out.print(columnWidth);
      out.write("\"\n");
      out.write("\t\t\t\t\t\theight=\"0\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#000000\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"FixRelativeToTop\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"false\"/>\n");
      out.write("\t\t\t\t\t<graphicElement stretchType=\"NoStretch\" pen=\"2Point\" fill=\"Solid\" />\n");
      out.write("\t\t\t\t</line>\n");
      out.write("\t\t\t\t<textField isStretchWithOverflow=\"false\" pattern=\"\" isBlankWhenNull=\"false\" evaluationTime=\"Now\" hyperlinkType=\"None\" >\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Transparent\"\n");
      out.write("\t\t\t\t\t\tx=\"1\"\n");
      out.write("\t\t\t\t\t\ty=\"6\"\n");
      out.write("\t\t\t\t\t\twidth=\"209\"\n");
      out.write("\t\t\t\t\t\theight=\"19\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#000000\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"FixRelativeToTop\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"false\"/>\n");
      out.write("\t\t\t\t\t<textElement textAlignment=\"Left\" verticalAlignment=\"Top\" lineSpacing=\"Single\">\n");
      out.write("\t\t\t\t\t\t<font reportFont=\"Arial_Normal\" size=\"10\"/>\n");
      out.write("\t\t\t\t\t</textElement>\n");
      out.write("\t\t\t\t<textFieldExpression   class=\"java.lang.String\">\n");
      out.write("\t\t\t\t\t<![CDATA[$P{Date}]]>\n");
      out.write("\t\t\t\t</textFieldExpression>\n");
      out.write("\t\t\t\t</textField>\n");
      out.write("\t\t\t</band>\n");
      out.write("\t\t</pageFooter>\n");
      out.write("\t\t<summary>\n");
      out.write("\t\t\t<band height=\"19\" isSplitAllowed=\"true\" >\n");
      out.write("\t\t\t\t<line direction=\"TopDown\">\n");
      out.write("\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Opaque\"\n");
      out.write("\t\t\t\t\t\tx=\"0\"\n");
      out.write("\t\t\t\t\t\ty=\"0\" \n");
      out.write("\t\t\t\t\t\twidth=\"");
      out.print(columnWidth);
      out.write("\"\n");
      out.write("\t\t\t\t\t\theight=\"0\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#808080\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"Float\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"true\"/>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<graphicElement stretchType=\"NoStretch\" pen=\"Thin\" fill=\"Solid\" />\n");
      out.write("\t\t\t\t</line>\n");
 
x = 0;
i = 0;
for (Iterator it = metaProperties.iterator(); it.hasNext(); i++) {			
	MetaProperty p = (MetaProperty) it.next();	
	int width=widths[i]*letterWidth + EXTRA_WIDTH;
	if (totalProperties.contains(p.getQualifiedName())) { 

      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t<textField isStretchWithOverflow=\"true\" pattern=\"\" isBlankWhenNull=\"true\" evaluationTime=\"Now\" hyperlinkType=\"None\" >\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Transparent\"\n");
      out.write("\t\t\t\t\t\tx=\"");
      out.print(x);
      out.write("\"\n");
      out.write("\t\t\t\t\t\ty=\"2\"\n");
      out.write("\t\t\t\t\t\twidth=\"");
      out.print(width);
      out.write("\"\n");
      out.write("\t\t\t\t\t\theight=\"");
      out.print(detailHeight);
      out.write("\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#000000\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"FixRelativeToTop\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"false\"/>\n");
      out.write("\t\t\t\t\t<textElement textAlignment=\"");
      out.print(getAlign(p));
      out.write("\" verticalAlignment=\"Top\" lineSpacing=\"Single\">\n");
      out.write("\t\t\t\t\t\t<font reportFont=\"Arial_Bold\" size=\"");
      out.print(letterSize);
      out.write("\"/>\n");
      out.write("\t\t\t\t\t</textElement>\n");
      out.write("\t\t\t\t\t<textFieldExpression class=\"java.lang.String\">$P{");
      out.print(p.getQualifiedName());
      out.write("__TOTAL__}</textFieldExpression>\n");
      out.write("\t\t\t\t</textField>\n");

	} 			
	x+=(width+columnsSeparation);
}

      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t</band>\n");
      out.write("\t\t</summary>\n");
      out.write("</jasperReport>\n");
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
