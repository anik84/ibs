<%@page import="java.time.LocalDate"%>
<html>
<head>
<title>login page</title>
</head>
<body>
	<h1>
		!! IBS Employee Login Page :
		<%=LocalDate.now()%>
		!!
	</h1>
	<jsp:include page="user_menu.jsp" />

	<form action="emplogin" method="POST">
		<br \>
		<div>
			<label>Login Id: </label> <input type="text" name="loginId"
				required />
		</div><br />
		<div>
			<label>Password:</label> <input type="text" name="empPassword" required />
		</div><br />
		<div>Select Domain:
			<select name="empCategory">
				<option value="empCategory_1">Executive</option>
				<option value="empCategory_2">Representative</option>
				
			</select>
		</div><br />
		<div>
			<button>Login</button>
		</div>
	</form>
</body>
</html>