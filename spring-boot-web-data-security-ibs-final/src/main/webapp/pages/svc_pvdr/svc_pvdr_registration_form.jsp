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
	href="/css/emp_registration_form.css">
</head>

<body>
	<h1>Common Bank of India</h1>
	<h2>Service Provider Registration</h2>
	<ul>
		<li><a href="/login">Login</a></li>
	</ul>
	<form:form action="/svcPvdrRegister" method="POST"
		modelAttribute="newSvcPvdr">
		<div>
			<form:label path="accountNumber">Account Number: </form:label>
			<form:input path="accountNumber" type="number" />
		</div>
		<div>
			<form:label path="userName">Service Provider Name: </form:label>
			<form:input path="userName" type="text" />
		</div>
		<div>
			<form:label path="svcPvdrEmail">Email: </form:label>
			<form:input path="svcPvdrEmail" type="email" />
		</div>
		<div>
			<form:label path="svcPvdrPhoneNo">Phone Number: </form:label>
			<form:input path="svcPvdrPhoneNo" type="text" />
		</div>
		<div>
			<form:label path="password">Password: </form:label>
			<form:input path="password" type="password" />
		</div>
		<div>
			<form:label path="confirmPwd">Confirm Password: </form:label>
			<form:input path="confirmPwd" type="password" />
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