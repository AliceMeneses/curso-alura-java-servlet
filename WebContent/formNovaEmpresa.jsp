<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novaEmpresa" var="linkServletNovaEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulário de cadastro</title>
</head>
<body>
	<form action="${linkServletNovaEmpresa}" method="post">
		<label for="nome">Nome:</label>
		<input type="text" id="nome" name="nome"/>
		<label for="data">Data de Entrega:</label>
		<input type="text" name="data" id="data">
		<input type="submit"/>
	</form>

</body>
</html>