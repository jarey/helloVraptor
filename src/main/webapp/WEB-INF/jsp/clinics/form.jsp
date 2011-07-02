<%@include file="/header.jsp" %>

	<form action="../clinics/add" method="post" accept-charset="utf-8">
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

<%@include file="/footer.jsp"%>