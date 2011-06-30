<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Smart Clinic</title>
</head>
<body>
	<form action="../clinics/add" method="post">
		<table>
			<tbody>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="clinic.name" value="${clinic.name}"/></td>
				</tr>
				<tr>
					<td>Address:</td>
					<td><input type="text" name="clinic.address" value="${clinic.address}"/></td>
				</tr>
				<tr>
				    <td></td>
				    <td>
				    <c:choose>
				        <c:when test="${clinic != null }">
				            <a href="../clinics">Voltar</a>   
				        </c:when>
				        <c:otherwise>
				            <input type="submit" value="Adicionar"/>
				        </c:otherwise>
				    </c:choose>
				    </td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>