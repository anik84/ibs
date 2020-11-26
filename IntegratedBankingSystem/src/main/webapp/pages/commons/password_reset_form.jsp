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
		<li><a href="index.html">User Login</a></li>
		<li><a href="emp_Login_form.html">Employee/Svc. Provider
				Login</a></li>
	</ul>
	<form action="newuser" method="POST">
		<div>
			<label>Login ID: </label> <input type="text" name="loginId"
				placeholder="Enter User ID" required />
		</div>
		<div>
			<label for="pwd">Existing Password: </label> <input type="text"
				name="pwd" placeholder="Enter Password" required />
		</div>
		<div>
			<label for="newPwd">New Password: </label> <input type="text"
				name="newPwd" placeholder="Enter New Password" required />
		</div>
		<div>
			<label for="confirmPwd">Confirm Password: </label> <input type="text"
				name="confirmPwd" placeholder="Confirm New Password" required />
		</div>
		<div>
			<button>Update</button>
		</div>
	</form>
	<footer>
		<p>&copy;National Bank</p>
	</footer>
</body>

</html>