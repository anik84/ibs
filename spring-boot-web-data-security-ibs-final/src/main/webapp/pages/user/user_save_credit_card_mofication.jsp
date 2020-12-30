<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, 
                   initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>IBS</title>
<link rel="stylesheet" type="text/css"
	href="/css/user_save_credit_card_mofication.css">
</head>

<body>
	<h1>Common Bank of India</h1>
	<h2>Beneficiary</h2>
	<jsp:include page="/mainHeader" />
	<jsp:include page="/benefHeader" />
	<h2 id="welcomeText">Modify Credit Card.</h2>
	<form>
		<div>
			<label for="benefCreditCardName">Name on Credit Card: </label> <input
				type="text" name="benefCreditCardName"
				placeholder="Populate from DB" required />
		</div>
		<div>
			<label for="benefCreditCardNo">Credit Card Number: </label> <input
				type="number" name="benefCreditCardNo"
				placeholder="Populate from DB" required />
		</div>
		<div>
			<label for="benefCardCVV">CVV Number: </label> <input type="number"
				name="benefCardCVV" placeholder="Populate from DB" required />
		</div>
		<div>
			<button>Save</button>
		</div>
	</form>
	<footer>
		<p>&copy;National Bank</p>
	</footer>
</body>

</html>