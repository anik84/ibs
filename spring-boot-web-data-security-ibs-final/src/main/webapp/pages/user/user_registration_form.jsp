<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, 
                   initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>IBS Home</title>
<link rel="stylesheet" type="text/css"
	href="/css/user_registration_form.css">
</head>

<body>

	<h1>Common Bank of India</h1>
	<h2>New User Registration</h2>
	<ul>
		<li><a href="/login">Login</a></li>
	</ul>
	<form:form action="/userRegister" method="POST"
		modelAttribute="newUser">
		<div>
			<form:label path="custFirstName">First Name: </form:label>
			<form:input path="custFirstName" type="text"/>
		</div>
		<div>
			<form:label path="custLastName">Last Name: </form:label>
			<form:input path="custLastName" type="text"/>
		</div>
		<div>
			<form:label path="userName">User Name: </form:label>
			<form:input path="userName" type="text"/>
		</div>
		<div>
			<form:label path="custEmail">Email Id: </form:label>
			<form:input path="custEmail" type="email" />
		</div>
		<div>
			<form:label path="custAddress">Residential Address:</form:label>
			<form:input path="custAddress" type="text" />
		</div>
		
		<div>
			<form:label path="custPhoneNo">Phone Number: </form:label>
			<form:input path="custPhoneNo" type="text" />
		</div>
		<div>
			<form:label path="custdob">Date Of Birth:</form:label>
			<form:input path="custdob" type="date" />
		</div>
		<div>
			<button>Register</button>
		</div>
	</form:form>
	<footer>
		<p>&copy;National Bank</p>
	</footer>
</body>

</html>