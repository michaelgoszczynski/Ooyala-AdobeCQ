package org.apache.jsp.libs.foundation.components.iparsys;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import com.day.cq.wcm.api.WCMMode;
import com.day.cq.wcm.api.components.IncludeOptions;
import javax.jcr.*;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;
import com.day.cq.commons.inherit.InheritanceValueMap;
import com.day.cq.wcm.commons.WCMUtils;
import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.NameConstants;
import com.day.cq.wcm.api.PageManager;
import com.day.cq.wcm.api.designer.Designer;
import com.day.cq.wcm.api.designer.Design;
import com.day.cq.wcm.api.designer.Style;
import com.day.cq.wcm.api.components.ComponentContext;
import com.day.cq.wcm.api.components.EditContext;

public final class iparsys_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/libs/foundation/global.jsp");
  }

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005finclude_005fresourceType_005fpath_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcq_005finclude_005fresourceType_005fpath_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fcq_005finclude_005fresourceType_005fpath_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;













      //  cq:defineObjects
      com.day.cq.wcm.tags.DefineObjectsTag _jspx_th_cq_005fdefineObjects_005f0 = (com.day.cq.wcm.tags.DefineObjectsTag) _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.get(com.day.cq.wcm.tags.DefineObjectsTag.class);
      _jspx_th_cq_005fdefineObjects_005f0.setPageContext(_jspx_page_context);
      _jspx_th_cq_005fdefineObjects_005f0.setParent(null);
      int _jspx_eval_cq_005fdefineObjects_005f0 = _jspx_th_cq_005fdefineObjects_005f0.doStartTag();
      if (_jspx_th_cq_005fdefineObjects_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.reuse(_jspx_th_cq_005fdefineObjects_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.reuse(_jspx_th_cq_005fdefineObjects_005f0);
      org.apache.sling.api.SlingHttpServletRequest slingRequest = null;
      org.apache.sling.api.SlingHttpServletResponse slingResponse = null;
      org.apache.sling.api.resource.Resource resource = null;
      javax.jcr.Node currentNode = null;
      org.apache.sling.api.resource.ResourceResolver resourceResolver = null;
      org.apache.sling.api.scripting.SlingScriptHelper sling = null;
      org.slf4j.Logger log = null;
      org.apache.sling.api.scripting.SlingBindings bindings = null;
      com.day.cq.wcm.api.components.ComponentContext componentContext = null;
      com.day.cq.wcm.api.components.EditContext editContext = null;
      org.apache.sling.api.resource.ValueMap properties = null;
      com.day.cq.wcm.api.PageManager pageManager = null;
      com.day.cq.wcm.api.Page currentPage = null;
      com.day.cq.wcm.api.Page resourcePage = null;
      com.day.cq.commons.inherit.InheritanceValueMap pageProperties = null;
      com.day.cq.wcm.api.components.Component component = null;
      com.day.cq.wcm.api.designer.Designer designer = null;
      com.day.cq.wcm.api.designer.Design currentDesign = null;
      com.day.cq.wcm.api.designer.Design resourceDesign = null;
      com.day.cq.wcm.api.designer.Style currentStyle = null;
      com.adobe.granite.xss.XSSAPI xssAPI = null;
      slingRequest = (org.apache.sling.api.SlingHttpServletRequest) _jspx_page_context.findAttribute("slingRequest");
      slingResponse = (org.apache.sling.api.SlingHttpServletResponse) _jspx_page_context.findAttribute("slingResponse");
      resource = (org.apache.sling.api.resource.Resource) _jspx_page_context.findAttribute("resource");
      currentNode = (javax.jcr.Node) _jspx_page_context.findAttribute("currentNode");
      resourceResolver = (org.apache.sling.api.resource.ResourceResolver) _jspx_page_context.findAttribute("resourceResolver");
      sling = (org.apache.sling.api.scripting.SlingScriptHelper) _jspx_page_context.findAttribute("sling");
      log = (org.slf4j.Logger) _jspx_page_context.findAttribute("log");
      bindings = (org.apache.sling.api.scripting.SlingBindings) _jspx_page_context.findAttribute("bindings");
      componentContext = (com.day.cq.wcm.api.components.ComponentContext) _jspx_page_context.findAttribute("componentContext");
      editContext = (com.day.cq.wcm.api.components.EditContext) _jspx_page_context.findAttribute("editContext");
      properties = (org.apache.sling.api.resource.ValueMap) _jspx_page_context.findAttribute("properties");
      pageManager = (com.day.cq.wcm.api.PageManager) _jspx_page_context.findAttribute("pageManager");
      currentPage = (com.day.cq.wcm.api.Page) _jspx_page_context.findAttribute("currentPage");
      resourcePage = (com.day.cq.wcm.api.Page) _jspx_page_context.findAttribute("resourcePage");
      pageProperties = (com.day.cq.commons.inherit.InheritanceValueMap) _jspx_page_context.findAttribute("pageProperties");
      component = (com.day.cq.wcm.api.components.Component) _jspx_page_context.findAttribute("component");
      designer = (com.day.cq.wcm.api.designer.Designer) _jspx_page_context.findAttribute("designer");
      currentDesign = (com.day.cq.wcm.api.designer.Design) _jspx_page_context.findAttribute("currentDesign");
      resourceDesign = (com.day.cq.wcm.api.designer.Design) _jspx_page_context.findAttribute("resourceDesign");
      currentStyle = (com.day.cq.wcm.api.designer.Style) _jspx_page_context.findAttribute("currentStyle");
      xssAPI = (com.adobe.granite.xss.XSSAPI) _jspx_page_context.findAttribute("xssAPI");


    // add more initialization code here




    if(editContext!=null && WCMMode.fromRequest(request) == WCMMode.EDIT) {
        editContext.getEditConfig().setOrderable(false);
    }

    boolean hasFake = false;
    Iterator<Resource> iter = resourceResolver.listChildren(resource);
    while (iter.hasNext()) {
        Resource r = iter.next();
        if (r.getResourceType().endsWith("/iparsys/par")) {
            hasFake = true;
            IncludeOptions.getOptions(request, true).forceCellName("");
            
      out.write("<div class=\"iparys_inherited\">");
      //  cq:include
      com.day.cq.wcm.tags.IncludeTag _jspx_th_cq_005finclude_005f0 = (com.day.cq.wcm.tags.IncludeTag) _005fjspx_005ftagPool_005fcq_005finclude_005fresourceType_005fpath_005fnobody.get(com.day.cq.wcm.tags.IncludeTag.class);
      _jspx_th_cq_005finclude_005f0.setPageContext(_jspx_page_context);
      _jspx_th_cq_005finclude_005f0.setParent(null);
      // /libs/foundation/components/iparsys/iparsys.jsp(32,44) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005finclude_005f0.setPath( r.getPath() );
      // /libs/foundation/components/iparsys/iparsys.jsp(32,44) name = resourceType type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005finclude_005f0.setResourceType( r.getResourceType() );
      int _jspx_eval_cq_005finclude_005f0 = _jspx_th_cq_005finclude_005f0.doStartTag();
      if (_jspx_th_cq_005finclude_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fcq_005finclude_005fresourceType_005fpath_005fnobody.reuse(_jspx_th_cq_005finclude_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fcq_005finclude_005fresourceType_005fpath_005fnobody.reuse(_jspx_th_cq_005finclude_005f0);
      out.write("</div>");

        } else {
            
      out.write("<div class=\"section\">");
      //  cq:include
      com.day.cq.wcm.tags.IncludeTag _jspx_th_cq_005finclude_005f1 = (com.day.cq.wcm.tags.IncludeTag) _005fjspx_005ftagPool_005fcq_005finclude_005fresourceType_005fpath_005fnobody.get(com.day.cq.wcm.tags.IncludeTag.class);
      _jspx_th_cq_005finclude_005f1.setPageContext(_jspx_page_context);
      _jspx_th_cq_005finclude_005f1.setParent(null);
      // /libs/foundation/components/iparsys/iparsys.jsp(34,35) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005finclude_005f1.setPath( r.getPath() );
      // /libs/foundation/components/iparsys/iparsys.jsp(34,35) name = resourceType type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005finclude_005f1.setResourceType( r.getResourceType() );
      int _jspx_eval_cq_005finclude_005f1 = _jspx_th_cq_005finclude_005f1.doStartTag();
      if (_jspx_th_cq_005finclude_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fcq_005finclude_005fresourceType_005fpath_005fnobody.reuse(_jspx_th_cq_005finclude_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fcq_005finclude_005fresourceType_005fpath_005fnobody.reuse(_jspx_th_cq_005finclude_005f1);
      out.write("</div>");

        }
    }
    // include fake inheritance if not present in the content
    if (!hasFake) {
        // draw new bar before inherited ones
        String newType = resource.getResourceType() + "/new";
        
      out.write("<div class=\"section\">");
      //  cq:include
      com.day.cq.wcm.tags.IncludeTag _jspx_th_cq_005finclude_005f2 = (com.day.cq.wcm.tags.IncludeTag) _005fjspx_005ftagPool_005fcq_005finclude_005fresourceType_005fpath_005fnobody.get(com.day.cq.wcm.tags.IncludeTag.class);
      _jspx_th_cq_005finclude_005f2.setPageContext(_jspx_page_context);
      _jspx_th_cq_005finclude_005f2.setParent(null);
      // /libs/foundation/components/iparsys/iparsys.jsp(41,31) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005finclude_005f2.setPath("*");
      // /libs/foundation/components/iparsys/iparsys.jsp(41,31) name = resourceType type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005finclude_005f2.setResourceType( newType );
      int _jspx_eval_cq_005finclude_005f2 = _jspx_th_cq_005finclude_005f2.doStartTag();
      if (_jspx_th_cq_005finclude_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fcq_005finclude_005fresourceType_005fpath_005fnobody.reuse(_jspx_th_cq_005finclude_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fcq_005finclude_005fresourceType_005fpath_005fnobody.reuse(_jspx_th_cq_005finclude_005f2);
      out.write("</div>");


        IncludeOptions.getOptions(request, true).forceCellName("");
        //String path = resource.getPath() + "/iparsys_fake_par";
        String path = resource.getPath() + "/iparsys_fake_par";
        String resType = resource.getResourceType() + "/par";
        
      out.write("<div class=\"iparys_inherited\">");
      //  cq:include
      com.day.cq.wcm.tags.IncludeTag _jspx_th_cq_005finclude_005f3 = (com.day.cq.wcm.tags.IncludeTag) _005fjspx_005ftagPool_005fcq_005finclude_005fresourceType_005fpath_005fnobody.get(com.day.cq.wcm.tags.IncludeTag.class);
      _jspx_th_cq_005finclude_005f3.setPageContext(_jspx_page_context);
      _jspx_th_cq_005finclude_005f3.setParent(null);
      // /libs/foundation/components/iparsys/iparsys.jsp(47,40) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005finclude_005f3.setPath( path );
      // /libs/foundation/components/iparsys/iparsys.jsp(47,40) name = resourceType type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005finclude_005f3.setResourceType( resType );
      int _jspx_eval_cq_005finclude_005f3 = _jspx_th_cq_005finclude_005f3.doStartTag();
      if (_jspx_th_cq_005finclude_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fcq_005finclude_005fresourceType_005fpath_005fnobody.reuse(_jspx_th_cq_005finclude_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fcq_005finclude_005fresourceType_005fpath_005fnobody.reuse(_jspx_th_cq_005finclude_005f3);
      out.write("</div>");

    } else {
        // new bar
        String newType = resource.getResourceType() + "/new";
        
      out.write("<div class=\"section\">");
      //  cq:include
      com.day.cq.wcm.tags.IncludeTag _jspx_th_cq_005finclude_005f4 = (com.day.cq.wcm.tags.IncludeTag) _005fjspx_005ftagPool_005fcq_005finclude_005fresourceType_005fpath_005fnobody.get(com.day.cq.wcm.tags.IncludeTag.class);
      _jspx_th_cq_005finclude_005f4.setPageContext(_jspx_page_context);
      _jspx_th_cq_005finclude_005f4.setParent(null);
      // /libs/foundation/components/iparsys/iparsys.jsp(51,31) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005finclude_005f4.setPath("*");
      // /libs/foundation/components/iparsys/iparsys.jsp(51,31) name = resourceType type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cq_005finclude_005f4.setResourceType( newType );
      int _jspx_eval_cq_005finclude_005f4 = _jspx_th_cq_005finclude_005f4.doStartTag();
      if (_jspx_th_cq_005finclude_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fcq_005finclude_005fresourceType_005fpath_005fnobody.reuse(_jspx_th_cq_005finclude_005f4);
        return;
      }
      _005fjspx_005ftagPool_005fcq_005finclude_005fresourceType_005fpath_005fnobody.reuse(_jspx_th_cq_005finclude_005f4);
      out.write("</div>");

    }


      out.write('\n');
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