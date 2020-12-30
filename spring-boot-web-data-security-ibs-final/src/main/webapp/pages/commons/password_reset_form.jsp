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
	href="/css/password_reset_form.css">
</head>

<body>
	<h1>Common Bank of India</h1>
	<h2>Password Reset</h2>
	<ul>
		<li><a href="/user/userHome">Home</a></li>
		<li><a href="/logout">Logout</a></li>
	</ul>
	<form:form action="/user/resetPwd" method="POST" modelAttribute="resetPwd">
		<div>
			<form:label path="password">New Password: </form:label>
			<form:input type="password" path="password" />
		</div>
		<div>
			<form:label path="confirmPwd">Confirm Password: </form:label>
			<form:input type="password" path="confirmPwd" />
		</div>
		<div>
			<button>Reset</button>
		</div>
	</form:form>
	<footer>
		<p>&copy;National Bank</p>
	</footer>
</body>

</html>