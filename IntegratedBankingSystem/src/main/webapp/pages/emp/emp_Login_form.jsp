<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, 
                   initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>IBS Home</title>
<link rel="stylesheet" type="text/css" href="/css/emp_Login_form.css">
</head>

<body>
	<h1>Common Bank of India</h1>
	<h2>Employee/Svc. Provider Login</h2>
	<ul>
		<li><a href="index.html">Bank Home</a></li>
	</ul>
	<form action="userLogin" method="post">
		<div>
			<label for="loginId">Login ID:</label> <input type="text"
				id="loginId" name="loginId" placeholder="Enter Login ID" required>
		</div>
		<div>
			<label for="pwd" class="label">Password:</label> <input
				type="password" id="pwd" name="pwd" placeholder="Enter Password"
				required>
		</div>
		<div>
			<label for="empCategory" id="empCategory">Domain:</label> <select
				name="empCategory">
				<option value="acctExecutive">Accounts Executive</option>
				<option value="bankRep">Bank Representative</option>
				<option value="svcProvider">Service Provider</option>
			</select>
		</div>
		<input id="action" name="action" type="hidden" value="validate">
		<div>
			<button>Sign In</button>
		</div>
		<div class="formInput">
			<a href="emp_registration_form.html">New Employee</a> <a
				href="password_reset_form.html">Change Password</a>
		</div>
	</form>
	<footer>
		<p>&copy;National Bank</p>
	</footer>
	<a href="emp_executive_home.html">Temp Executive Home</a>
	<a href="emp_bank_rep_home.html">Temp Bank Rep Home</a>
	<a href="service_provider_home.html">Temp Svc Provider Home</a>
</body>

</html>