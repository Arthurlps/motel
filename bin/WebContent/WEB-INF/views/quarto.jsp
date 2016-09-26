<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
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
<title>Insert title here</title>
</head>
<body>
		<h1>Quartos</h1>
		<table>
			<tr>
			    <th>Quarto</th>
			    <th>Valor</th> 
			    <th>Tempo</th> 
			    
			</tr>
			<c:forEach var="item" items="${quarto}">
		  		<tr>
		  			<td>${item.name}</td>
		  			<td>R$ ${item.preco}0</td>
		  			<td><input type='number' id='quantidade'></td>
		  		</tr>  	
			</c:forEach> 
		</table>

</body>
</html>