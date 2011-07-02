<%@include file="/header.jsp" %>
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
	
<%@include file="/footer.jsp" %> 