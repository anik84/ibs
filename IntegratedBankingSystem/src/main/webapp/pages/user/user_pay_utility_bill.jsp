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
	href="/css/user_pay_utility_bill.css">
</head>

<body>
	<h1>Common Bank of India</h1>
	<h2>Accounts</h2>
	<ul>
		<li><a href="user_home.html">Home</a></li>
		<li><a href="user_accounts.html">Accounts</a></li>
		<li><a href="user_beneficiary.html">Beneficiary</a></li>
		<li><a href="index.html">Logout</a></li>
	</ul>
	<ul class="acctsMenue">
		<li class="acctsSubMenue"><a href="user_open_account.html">Open
				Account</a></li>
		<li class="acctsSubMenue"><a href="user_balance_check.html">Balance
				Check</a></li>
		<li class="acctsSubMenue"><a href="user_mini_statement.html">Mini
				Statement</a></li>
		<li class="acctsSubMenue"><a href="user_monthly_statement.html">Monthly
				Statement</a></li>
		<li class="acctsSubMenue"><a href="user_periodic_statement.html">Periodic
				Statement</a></li>
		<li class="acctsSubMenue"><a href="user_annual_statement.html">Annual
				Statement</a></li>
		<li class="acctsSubMenue"><a href="user_transfer_fund.html">Transfer
				Fund</a></li>
		<li class="acctsSubMenue"><a href="user_pay_utility_bill.html">Pay
				Utility Bill</a></li>
	</ul>
	<h2 id="welcomeText">Pay Utility Bill.</h2>
	<form>
		<div>
			<label for="fromAcctNo" id="month">Select From Account:</label> <select
				name="fromAcctNo">
				<option value="fromAcctNo">Acct1 (need to populate from DB)</option>
			</select>
		</div>
		<div>
			<label for="svcProvider" id="svcProvider">Select Service
				Provider:</label> <select name="svcProvider">
				<option value="airtel">airtel (need to populate from DB)</option>
			</select>
		</div>
		<div>
			<button>Select</button>
		</div>
	</form>
	<footer>
		<p>&copy;National Bank</p>
	</footer>
	<a href="user_pay_utility_bill_payment.html">Temp Bill Pay</a>
</body>

</html>