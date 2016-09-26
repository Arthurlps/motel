<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro</title>
</head>
<body>	
<form action="clienteCadastrado" method="POST">
	Nome: <input type="text" name="nome"> <br>
	RG: <input type="text" name="rg"> CPF: <input type="text" name="cpf"> <br>
	<input type="submit" value="Cadastrar"/>
</form>
</body>
</html>