<%@page import="java.time.LocalDate"%>
<html>
<head>
<title>open new account</title>
</head>
<body>
	<h1>
		!! Account Balance :
		<%=LocalDate.now()%>
		!!
	</h1>
	<jsp:include page="user_home_menu.jsp" />

	<h2>Here is the balance details of each account:</h2>
	
	<h2>This page will be auto populated from DB once implemented</h2>
		
		
		
	</body>
</html>