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
<title>IBS Login</title>
<link rel="stylesheet" type="text/css" href="/css/index.css">
</head>

<body>
	<h1>Common Bank of India</h1>
	<h2>IBS Login</h2>
	<form action="/login" method="POST">
		<c:if test="${param.error != null}">
					Invalid Credentials! Access Denied!
				</c:if>
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
		<div>
			<label for="userName">User Name: </label>
			<input name="userName" type="text" />
		</div>
		<div>
			<label for="password">Password: </label>
			<input name="password" type="password" />
		</div>
		<div>
			<button>Sign In</button>
		</div>
	</form>

	<div class="formInput">
		<a href="/newUser">New User?</a>
		<a href="/newSvcPvdr">New Svc. Pvdr.?</a>
	</div>

	<footer>
		<p>&copy;National Bank</p>
	</footer>
</body>

</html>