<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/entrada?acao=RemoveEmpresa" var="linkServletRemoveEmpresa"/>
<c:url value="/entrada?acao=MostraEmpresa" var="linkMostraEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<ul>
	<c:if test="${not empty nomeEmpresa}">
		<p>Empresa ${nomeEmpresa} cadastrada com sucesso!</p> 
	</c:if>
	<h2>Lista de empresas Cadastradas:</h2>
		<c:forEach items="${empresas}" var="empresa">
            <li>
            	${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
            	<a href="${linkServletRemoveEmpresa}&id=${empresa.id}">remover</a>
            	<a href="${linkMostraEmpresa}&id=${empresa.id}">editar</a> 
            </li>
        </c:forEach>
	</ul>
</body>
</html>