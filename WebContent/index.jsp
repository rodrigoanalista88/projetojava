<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h3>Formulário dos Produtos  </h3>
	<form action="Controle?cmd=gravar" method="post">
		Nome: <br>
		<input type="text" name="nome">
		<br><br>
		Preço: <br>
		<input type="text" name="preco">
		<br><br>
		<input type="submit" value="CADASTRAR">
	</form>
	${msg }
	
</body>
</html>