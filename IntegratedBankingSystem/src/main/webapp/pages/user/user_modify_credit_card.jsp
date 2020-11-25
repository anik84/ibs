<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, 
                   initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>IBS</title>user_modify_credit_card
<link rel="stylesheet" type="text/css"
	href="/css/user_modify_credit_card.css">
</head>

<body>
	<h1>Common Bank of India</h1>
	<h2>Beneficiary</h2>
	<ul>
		<li><a href="user_home.html">Home</a></li>
		<li><a href="user_accounts.html">Accounts</a></li>
		<li><a href="user_beneficiary.html">Beneficiary</a></li>
		<li><a href="index.html">Logout</a></li>
	</ul>
	<ul class="acctsMenue">
		<li class="acctsSubMenue"><a href="user_add_beneficiary.html">Add
				Beneficiary</a></li>
		<li class="acctsSubMenue"><a href="user_modify_beneficiary.html">Modify
				Beneficiary</a></li>
		<li class="acctsSubMenue"><a href="user_add_credit_card.html">Add
				Credit Card</a></li>
		<li class="acctsSubMenue"><a href="user_modify_credit_card.html">Modify
				Credit Card</a></li>
	</ul>
	<h2 id="welcomeText">Modify Credit Card.</h2>
	<form>
		<div>
			<label for="benefCreditCard" id="benefCreditCard">Select
				Credit Card Number:</label> <select name="benefCreditCard">
				<option value="benefCreditCard">CC NO (need to populate
					from DB)</option>
			</select>
		</div>
		<div>
			<button>Select</button>
		</div>
	</form>
	<footer>
		<p>&copy;National Bank</p>
	</footer>

	<a href="user_save_credit_card_mofication.html">Temp Save CC
		Modification</a>
</body>

</html>