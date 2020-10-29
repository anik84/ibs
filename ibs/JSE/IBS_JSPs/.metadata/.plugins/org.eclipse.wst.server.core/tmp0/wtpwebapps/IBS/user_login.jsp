<%@page import="java.time.LocalDate"%>
<html>
<head>
<title>login page</title>
</head>
<body>
	<h1>
		!! User Login Page :
		<%=LocalDate.now()%>
		!!
	</h1>
	<jsp:include page="user_menu.jsp" />

	<h2>Please enter the registered user credential to login:</h2>
	<form action="userlogin" method="POST">
		<div>
			<label>Login Id: </label> <input type="text" name="firstName"
				required />
		</div><br />
		<div>
			<label>Password:</label> <input type="text" name="userPassword"
				required />
		</div><br />
		<div>
			Select Domain: <select name="userCategory">
				<option value="category_1">Customer</option>
				<option value="category_2">Service Provider</option>

			</select>
		</div><br />
		<div>
			<button>Login</button>
		</div>
	</form>
</body>
</html>