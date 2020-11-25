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
		<li><a href="index.html">User Login</a></li>
	</ul>
	<form action="newuser" method="POST">
		<div>
			<label>First Name: </label> <input type="text" name="firstName"
				placeholder="Enter First Name" required />
		</div>
		<div>
			<label>Last Name: </label> <input type="text" name="lastName"
				placeholder="Enter Last Name" required />
		</div>
		<div>
			<label>Email Id: </label> <input type="text" name="emailId"
				placeholder="Enter Email ID" required />
		</div>
		<div>
			<label>Residential Address: </label> <input type="text"
				name="address" placeholder="Enter Address" required />
		</div>
		<div>
			<label>Date Of Birth: </label> <input type="date" name="dob" required />
		</div>
		<div>
			<label>Phone Number: </label> <input type="number" name="phoneNo"
				placeholder="Enter Phone Number" required />
		</div>
		<div>
			<button>Register</button>
		</div>
	</form>
	<footer>
		<p>&copy;National Bank</p>
	</footer>
</body>

</html>