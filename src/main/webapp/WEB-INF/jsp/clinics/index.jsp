<%@ page contentType="text/html; charset=UTF-8"%>

<%@ taglib tagdir="/WEB-INF/tags/layout" prefix="layout"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<layout:page title="Clinics">
	<jsp:attribute name="javascript">
        <script type="text/javascript">
             $(document).ready(function(){
                 
             });
        </script>	
	</jsp:attribute>
	<jsp:body>
		<div>
		<table>
			<thead>
				<tr>
					<td>Name</td>
					<td>Address</td>
					<td></td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${clinicList}" var="clinic">
					<tr>
						<td>${clinic.name}</td>
						<td>${clinic.address}</td>
						<td>
						  <a href="${clinic.id }">Detalhar</a>
						  <a href="${clinic.id }">Remover</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
        <div>
            <a href="new" id="new">New</a>
        </div>		
	</jsp:body>

</layout:page>