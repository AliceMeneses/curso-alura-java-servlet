<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "br.com.alura.gerenciador.servlet.Empresa, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Lista de empresas cadastradas:</h1>
	<ul>
		<%List<Empresa> empresas = (List<Empresa>) request.getAttribute("empresas");
		for(Empresa empresa: empresas) {%>
		<li><%= empresa.getNome()%></li>
		<% } %>
	</ul>
</body>
</html>