<%@page import="java.time.LocalDate"%>
<html>
<head>
<title>new user registration</title>
</head>
<body>
	<h1>
		!! New User Registration :
		<%=LocalDate.now()%>
		!!
	</h1>
	<jsp:include page="user_menu.jsp" />

	<form action="newuser" method="POST">
		<br \>
		<div>
			<label>First Name: </label> <input type="text" name="firstName"
				required />
		</div><br />
		<div>
			<label>Last Name: </label> <input type="text" name="lastName"
				required />
		</div><br />
		<div>
			<label>Email Id: </label> <input type="text" name="emailId" required />
		</div><br />
		<div>
			<label>Residential Address: </label> <input type="text"
				name="address" required />
		</div><br />
		<div>
			<label>Date Of Birth: </label> <input type="date" name="dob"
				required />
		</div><br />
		<div>
			<label>Phone Number: </label> <input type="number" name="phoneNo"
				required />
		</div><br />
		<div>
			Select User Category: <select name="userCategory">
				<option value="userCategory_1">Customer</option>
				<option value="userCategory_2">Service Provider</option>

			</select>
		</div><br />
		<div>
			<button>Register</button>
		</div>
	</form>
</body>
</html>