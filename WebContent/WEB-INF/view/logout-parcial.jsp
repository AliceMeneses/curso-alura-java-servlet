<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/entrada?acao=Logout" var="linkServletEntradaAcaoLogout" />
<a href="${linkServletEntradaAcaoLogout}">Sair</a>