<%@page import="java.time.LocalDate"%>
<html>
	<head>
		<title>IBS Home</title>
	</head>
	<body>
		<h1>!! Welcome to IBS : <%=LocalDate.now() %> !!</h1>		
		<h2>Please select what you want to do today from the following:</h2>
		<jsp:include page="user_menu.jsp"/>
	</body>
</html>