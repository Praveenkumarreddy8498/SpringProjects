<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="text-align: right">
		<a href="admin">Admin</a><br>
	</div>
	<br>
	<h3>Questions By Topic</h3>
	<form action="search-topic">
		<label>Search By Topic:
		</label> <select name="topic" >
			<option value="JAVA">JAVA</option>
			<option value="HTML">HTML</option>
			<option value="General Knowledge">General Knowledge</option>
			
		</select> 
		<input type="submit" value="Search">
	</form><br>	
<br>
	
	${questionsBySearch }
	<br>
	<%-- <h2>All questions</h2>
	${questions} --%>
	

</body>
</html>