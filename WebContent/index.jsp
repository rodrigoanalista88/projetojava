<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h3>Formul�rio dos Produtos -- CADASTRAR TUDO </h3>
	<form action="Controle?cmd=gravar" method="post">
		Nome: <br>
		<input type="text" name="nome">
		<br><br>
		Pre�o: <br>
		<input type="text" name="preco">
		<br><br>
		<input type="submit" value="CADASTRAR">
	</form>
	${msg }
	
</body>
</html>