<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layout"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<layout:page title="Clinic - ${clinic.name }">
	<div>
		<p>Id: ${clinic.id }</p>
		<p>Name: ${clinic.name }</p>
		<p>Address: ${clinic.address }</p>
		<p><a href="<c:url value='/clinics/'/>">Listar</a></p>
	</div>
</layout:page>