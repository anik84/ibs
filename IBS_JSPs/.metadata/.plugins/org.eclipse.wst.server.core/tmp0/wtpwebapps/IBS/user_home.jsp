<%@page import="java.time.LocalDate"%>
<html>
	<head>
		<title>user home page</title>
	</head>
	<body>
		<h1>!! Banking Home Page : <%=LocalDate.now() %> !!</h1>
		<h2>Please select from the menu:</h2>		
		<jsp:include page="user_home_menu.jsp"/>
	</body>
</html>