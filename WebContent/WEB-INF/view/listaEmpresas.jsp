<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/entrada?acao=RemoveEmpresa" var="linkServletEntradaAcaoRemoveEmpresa"/>
<c:url value="/entrada?acao=MostraEmpresa" var="linkServletEntradaAcaoMostraEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:import url="logout-parcial.jsp"/>
	<h3>Usuário logado: ${usuarioLogado.login} </h3>
	<c:if test="${not empty nomeEmpresa}">
		<p>Empresa ${nomeEmpresa} cadastrada com sucesso!</p> 
	</c:if>
	<h2>Lista de empresas Cadastradas:</h2>
	<ul>
		<c:forEach items="${empresas}" var="empresa">
            <li>
            	${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
            	<a href="${linkServletEntradaAcaoRemoveEmpresa}&id=${empresa.id}">remover</a>
            	<a href="${linkServletEntradaAcaoMostraEmpresa}&id=${empresa.id}">editar</a> 
            </li>
        </c:forEach>
	</ul>
</body>
</html>