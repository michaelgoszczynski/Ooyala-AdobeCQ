package org.apache.jsp.libs.foundation.components.userinfo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
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
import com.day.cq.i18n.I18n;
import com.day.cq.personalization.ProfileUtil;
import com.day.cq.security.profile.Profile;
import com.day.cq.wcm.api.WCMMode;

public final class userinfo_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/libs/foundation/global.jsp");
  }

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fpersonalization_005fcontextProfileProperty_005fsuffix_005fpropertyName_005fprefix_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fpersonalization_005fcontextProfileLink_005fid_005fhref_005fdisplayValue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fpersonalization_005fcontextProfileProperty_005fsuffix_005fpropertyName_005fprefix_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fpersonalization_005fcontextProfileLink_005fid_005fhref_005fdisplayValue_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fpersonalization_005fcontextProfileProperty_005fsuffix_005fpropertyName_005fprefix_005fnobody.release();
    _005fjspx_005ftagPool_005fpersonalization_005fcontextProfileLink_005fid_005fhref_005fdisplayValue_005fnobody.release();
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








    final I18n i18n = new I18n(slingRequest);
    final Profile currentProfile = slingRequest.adaptTo(Profile.class);
    final boolean isAnonymous = ProfileUtil.isAnonymous(currentProfile);
    final boolean isDisabled = WCMMode.DISABLED.equals(WCMMode.fromRequest(request));
    final String logoutPath = request.getContextPath() + "/system/sling/logout.html";
    final String profilePagePath = currentStyle.get("profilePage", String.class);
    final String myProfileLink = "${profile.path}.form.html" + profilePagePath;
    final String loginPagePath = currentStyle.get("loginPage", String.class);
    final String signupPagePath = currentStyle.get("signupPage", String.class);

      out.write("\n");
      out.write("<script type=\"text/javascript\">function logout() {\n");
 if( !isDisabled ) { 
      out.write("\n");
      out.write("    if (CQ_Analytics && CQ_Analytics.CCM) {\n");
      out.write("        CQ_Analytics.ProfileDataMgr.loadProfile(\"anonymous\");\n");
      out.write("        CQ.shared.Util.reload();\n");
      out.write("    }\n");
 } else { 
      out.write("\n");
      out.write("    if (CQ_Analytics && CQ_Analytics.CCM) {\n");
      out.write("        CQ_Analytics.ProfileDataMgr.clear();\n");
      out.write("        CQ_Analytics.CCM.reset();\n");
      out.write("    }\n");
      out.write("    CQ.shared.Util.load(\"");
      out.print( logoutPath );
      out.write("\");\n");
 } 
      out.write("\n");
      out.write("}</script>\n");
      out.write("<nav>\n");
      out.write("    <ul>\n");
      out.write("        ");

            if (isDisabled) {

                //in publish mode, only display the name if !anonymous
                if (!isAnonymous) {
        
      out.write("\n");
      out.write("        <li class=\"user\">\n");
      out.write("            ");
      if (_jspx_meth_personalization_005fcontextProfileProperty_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </li>\n");
      out.write("        ");

            if (null != profilePagePath) {
        
      out.write("\n");
      out.write("        <li class=\"profilepage\">\n");
      out.write("            ");
      //  personalization:contextProfileLink
      com.day.cq.personalization.tags.ContextProfileLinkTag _jspx_th_personalization_005fcontextProfileLink_005f0 = (com.day.cq.personalization.tags.ContextProfileLinkTag) _005fjspx_005ftagPool_005fpersonalization_005fcontextProfileLink_005fid_005fhref_005fdisplayValue_005fnobody.get(com.day.cq.personalization.tags.ContextProfileLinkTag.class);
      _jspx_th_personalization_005fcontextProfileLink_005f0.setPageContext(_jspx_page_context);
      _jspx_th_personalization_005fcontextProfileLink_005f0.setParent(null);
      // /libs/foundation/components/userinfo/userinfo.jsp(62,12) name = displayValue type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_personalization_005fcontextProfileLink_005f0.setDisplayValue( i18n.get("My Profile") );
      // /libs/foundation/components/userinfo/userinfo.jsp(62,12) name = href type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_personalization_005fcontextProfileLink_005f0.setHref( myProfileLink );
      // /libs/foundation/components/userinfo/userinfo.jsp(62,12) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_personalization_005fcontextProfileLink_005f0.setId("myprofile-link");
      int _jspx_eval_personalization_005fcontextProfileLink_005f0 = _jspx_th_personalization_005fcontextProfileLink_005f0.doStartTag();
      if (_jspx_th_personalization_005fcontextProfileLink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fpersonalization_005fcontextProfileLink_005fid_005fhref_005fdisplayValue_005fnobody.reuse(_jspx_th_personalization_005fcontextProfileLink_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fpersonalization_005fcontextProfileLink_005fid_005fhref_005fdisplayValue_005fnobody.reuse(_jspx_th_personalization_005fcontextProfileLink_005f0);
      out.write("\n");
      out.write("        </li>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("        <li class=\"signout\">\n");
      out.write("            <a href=\"javascript:logout();\">");
      out.print( i18n.get("Sign Out") );
      out.write("</a>\n");
      out.write("        </li>\n");
      out.write("        ");

        } else {

            if (null != loginPagePath) {
        
      out.write("\n");
      out.write("        <li class=\"login\"><a href=\"");
      out.print( loginPagePath );
      out.write(".html\">");
      out.print( i18n.get("Sign In") );
      out.write("</a></li>\n");
      out.write("        ");

            }

            if (null != signupPagePath) {
        
      out.write("\n");
      out.write("        <li class=\"signup\"><a href=\"");
      out.print( signupPagePath );
      out.write(".html\">");
      out.print( i18n.get("Sign Up") );
      out.write("</a></li>\n");
      out.write("        ");

                }
            }

        } else {

            //on author handle link from the ContextCloud
        
      out.write("\n");
      out.write("        <li class=\"user cq-cc-profile-not-anonymous\">\n");
      out.write("            ");
      if (_jspx_meth_personalization_005fcontextProfileProperty_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </li>\n");
      out.write("        ");

            if (null != profilePagePath) {
        
      out.write("\n");
      out.write("        <li class=\"profilepage cq-cc-profile-not-anonymous\">\n");
      out.write("            ");
      //  personalization:contextProfileLink
      com.day.cq.personalization.tags.ContextProfileLinkTag _jspx_th_personalization_005fcontextProfileLink_005f1 = (com.day.cq.personalization.tags.ContextProfileLinkTag) _005fjspx_005ftagPool_005fpersonalization_005fcontextProfileLink_005fid_005fhref_005fdisplayValue_005fnobody.get(com.day.cq.personalization.tags.ContextProfileLinkTag.class);
      _jspx_th_personalization_005fcontextProfileLink_005f1.setPageContext(_jspx_page_context);
      _jspx_th_personalization_005fcontextProfileLink_005f1.setParent(null);
      // /libs/foundation/components/userinfo/userinfo.jsp(99,12) name = displayValue type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_personalization_005fcontextProfileLink_005f1.setDisplayValue( i18n.get("My Profile") );
      // /libs/foundation/components/userinfo/userinfo.jsp(99,12) name = href type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_personalization_005fcontextProfileLink_005f1.setHref( myProfileLink );
      // /libs/foundation/components/userinfo/userinfo.jsp(99,12) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_personalization_005fcontextProfileLink_005f1.setId("myprofile-link");
      int _jspx_eval_personalization_005fcontextProfileLink_005f1 = _jspx_th_personalization_005fcontextProfileLink_005f1.doStartTag();
      if (_jspx_th_personalization_005fcontextProfileLink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fpersonalization_005fcontextProfileLink_005fid_005fhref_005fdisplayValue_005fnobody.reuse(_jspx_th_personalization_005fcontextProfileLink_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fpersonalization_005fcontextProfileLink_005fid_005fhref_005fdisplayValue_005fnobody.reuse(_jspx_th_personalization_005fcontextProfileLink_005f1);
      out.write("\n");
      out.write("        </li>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("        <li class=\"signout cq-cc-profile-not-anonymous\">\n");
      out.write("            <a href=\"javascript:logout();\">");
      out.print( i18n.get("Sign Out") );
      out.write("</a>\n");
      out.write("        </li>\n");
      out.write("        ");

            if (null != loginPagePath) {
        
      out.write("\n");
      out.write("        <li class=\"login cq-cc-profile-anonymous\"><a href=\"");
      out.print( loginPagePath );
      out.write(".html\">");
      out.print( i18n.get("Sign In") );
      out.write("</a></li>\n");
      out.write("        ");

            }

            if (null != signupPagePath) {
        
      out.write("\n");
      out.write("        <li class=\"signup cq-cc-profile-anonymous\"><a href=\"");
      out.print( signupPagePath );
      out.write(".html\">");
      out.print( i18n.get("Sign Up") );
      out.write("</a></li>\n");
      out.write("        ");

                }
            }
        
      out.write("\n");
      out.write("    </ul>\n");
      out.write("</nav>");
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

  private boolean _jspx_meth_personalization_005fcontextProfileProperty_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  personalization:contextProfileProperty
    com.day.cq.personalization.tags.ContextProfilePropertyTag _jspx_th_personalization_005fcontextProfileProperty_005f0 = (com.day.cq.personalization.tags.ContextProfilePropertyTag) _005fjspx_005ftagPool_005fpersonalization_005fcontextProfileProperty_005fsuffix_005fpropertyName_005fprefix_005fnobody.get(com.day.cq.personalization.tags.ContextProfilePropertyTag.class);
    _jspx_th_personalization_005fcontextProfileProperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_personalization_005fcontextProfileProperty_005f0.setParent(null);
    // /libs/foundation/components/userinfo/userinfo.jsp(56,12) name = propertyName type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_personalization_005fcontextProfileProperty_005f0.setPropertyName("formattedName");
    // /libs/foundation/components/userinfo/userinfo.jsp(56,12) name = prefix type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_personalization_005fcontextProfileProperty_005f0.setPrefix("(");
    // /libs/foundation/components/userinfo/userinfo.jsp(56,12) name = suffix type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_personalization_005fcontextProfileProperty_005f0.setSuffix(")");
    int _jspx_eval_personalization_005fcontextProfileProperty_005f0 = _jspx_th_personalization_005fcontextProfileProperty_005f0.doStartTag();
    if (_jspx_th_personalization_005fcontextProfileProperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fpersonalization_005fcontextProfileProperty_005fsuffix_005fpropertyName_005fprefix_005fnobody.reuse(_jspx_th_personalization_005fcontextProfileProperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fpersonalization_005fcontextProfileProperty_005fsuffix_005fpropertyName_005fprefix_005fnobody.reuse(_jspx_th_personalization_005fcontextProfileProperty_005f0);
    return false;
  }

  private boolean _jspx_meth_personalization_005fcontextProfileProperty_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  personalization:contextProfileProperty
    com.day.cq.personalization.tags.ContextProfilePropertyTag _jspx_th_personalization_005fcontextProfileProperty_005f1 = (com.day.cq.personalization.tags.ContextProfilePropertyTag) _005fjspx_005ftagPool_005fpersonalization_005fcontextProfileProperty_005fsuffix_005fpropertyName_005fprefix_005fnobody.get(com.day.cq.personalization.tags.ContextProfilePropertyTag.class);
    _jspx_th_personalization_005fcontextProfileProperty_005f1.setPageContext(_jspx_page_context);
    _jspx_th_personalization_005fcontextProfileProperty_005f1.setParent(null);
    // /libs/foundation/components/userinfo/userinfo.jsp(93,12) name = propertyName type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_personalization_005fcontextProfileProperty_005f1.setPropertyName("formattedName");
    // /libs/foundation/components/userinfo/userinfo.jsp(93,12) name = prefix type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_personalization_005fcontextProfileProperty_005f1.setPrefix("(");
    // /libs/foundation/components/userinfo/userinfo.jsp(93,12) name = suffix type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_personalization_005fcontextProfileProperty_005f1.setSuffix(")");
    int _jspx_eval_personalization_005fcontextProfileProperty_005f1 = _jspx_th_personalization_005fcontextProfileProperty_005f1.doStartTag();
    if (_jspx_th_personalization_005fcontextProfileProperty_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fpersonalization_005fcontextProfileProperty_005fsuffix_005fpropertyName_005fprefix_005fnobody.reuse(_jspx_th_personalization_005fcontextProfileProperty_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fpersonalization_005fcontextProfileProperty_005fsuffix_005fpropertyName_005fprefix_005fnobody.reuse(_jspx_th_personalization_005fcontextProfileProperty_005f1);
    return false;
  }
}