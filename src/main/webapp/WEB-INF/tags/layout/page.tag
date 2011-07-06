<%@ tag pageEncoding="UTF-8" body-content="scriptless" description="Page layout"%>

<%@ taglib tagdir="/WEB-INF/tags/layout/section" prefix="section"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib tagdir="/WEB-INF/tags/flash" prefix="flash" %>

<%@ attribute name="title" required="true" rtexprvalue="true" description="Page Title"%>
<%@ attribute name="javascript" fragment="true" description="javascript section"%>
<%@ attribute name="css" fragment="true" description="css declaration"%>

<fmt:setLocale value="${locale}" />

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"></meta>
        <meta name="description" content="<fmt:message key="meta.description"/>"></meta>
        <title>SmartClinic - ${title}</title>
        <link href="<c:url value='/public/css/application.css'/>" rel="stylesheet" type="text/css" media="screen"></link>
		<!--[if lt IE 7]>
	    <script src="http://ie7-js.googlecode.com/svn/version/2.0(beta3)/IE7.js" type="text/javascript"></script>
	    <![endif]-->
	    <jsp:invoke fragment="css"></jsp:invoke>
    </head>
    <body>
		<c:if test="${not empty param.language}">
			<fmt:setLocale value="${param.language}" scope="session" />
		</c:if>
		<div id="headerWrap">
    		<section:header />
		</div>
		
		<div id="contentWrap">
		    <flash:flash/>
            <jsp:doBody/>
		</div>
		<div id="footerWrap">
			<section:footer/>
		</div>
		<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
		<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.14/jquery-ui.min.js"></script>
		<jsp:invoke fragment="javascript"/>
    </body>
</html>