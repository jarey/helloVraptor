<%@ tag body-content="empty" pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="footbar">
	<img class="logoFooter"
		src="<c:url value='/public/images/logoCaelumGray-trans.png'/>" alt="vraptor logo" />
	<ul>
		<li>site map:</li>
		<li><a href="${path}">home</a>
		</li>
		<li>|</li>
		<li><a href="${path}professores/form">Adiciona Professor</a>
		</li>
	</ul>
	<p>
		<a href="http://www.apache.org/licenses/LICENSE-2.0">Licença
			Apache</a> - VRaptor �2009 Caelum - Ensino e Inovação
	</p>
</div>
