<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>Insert title here</title>
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: center;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
</head>
<body>

	<c:if test="${not empty cliente}">
    	<table>
			<tr>
				<td>Nome: ${cliente.nome}</td>
			</tr>
			<tr>
				<td>Cpf: ${cliente.cpf}</td>	
			</tr>
			<tr>
				<td>Rg: ${cliente.rg}</td>		
			</tr>
		</table>
	</c:if>
	
	<c:if test="${ empty cliente}">
		Cliente nao encontrado em nossa base de dados
	</c:if>

	<form	action="home" method="POST">
		<input type="submit" value="Voltar">
	</form>



</body>
</html>