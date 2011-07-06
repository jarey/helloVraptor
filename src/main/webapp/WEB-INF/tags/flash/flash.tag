<%@ tag description="Flash notes" body-content="empty" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:if test="${not empty errors}">
	<div id="errors">
		<ul>
			<c:forEach items="${errors }" var="error">
				<li>${error.category } - ${error.message }</li>
			</c:forEach>
		</ul>
	</div>
</c:if>

<c:if test="${not empty notice}">
	<div id="notice">
		<p>${notice }</p>
	</div>
</c:if>
