<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "br.com.alura.gerenciador.servlet.Empresa, java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Lista de empresas cadastradas:</h1>
	<ul>
		<c:forEach items="${empresas}" var="empresa">
            <li>${empresa.getNome()}</li>
        </c:forEach>
	</ul>
</body>
</html>