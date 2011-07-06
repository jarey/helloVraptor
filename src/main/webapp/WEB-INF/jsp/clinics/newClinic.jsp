<%@page contentType="text/html; charset=UTF-8"%>

<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layout"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<layout:page title="New Clinic">
	<div>
		<form action="<c:url value='/clinics/add'/>" method="post"	accept-charset="utf-8">
			<%@include file="_form.jsp"%>
		</form>
	</div>
</layout:page>

