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
	<table border=1>
		<thead>
			<tr>
				<td>Name</td>
				<td>Address</td>
				<td>Ações</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${clinicList}" var="clinic">
				<tr>
					<form action="clinics/${clinic.id}" method="post" id="form">
						<input type="hidden" name="_method" value="DELETE" />
						
						<td>${clinic.name}</td>
						<td>${clinic.address}</td>
						<td><input type="submit" value="Apagar" />
						<a href="clinics/${clinic.id}">Detalhar</a></td>
					</form>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>