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
	href="/css/emp_fund_deposit_entry.css">
</head>

<body>
	<h1>Common Bank of India</h1>
	<h2>Bank Representative Home.</h2>
	<ul>
		<li><a href="emp_bank_rep_home.html">Home</a></li>
		<li><a href="emp_Login_form.html">Logout</a></li>
	</ul>
	<ul class="acctsMenue">
		<li class="acctsSubMenue"><a
			href="emp_approve_reject_new_acct.html">New Account Approval</a></li>
		<li class="acctsSubMenue"><a
			href="emp_approve_reject_svc_pvdr.html">New Svc. Pvdr. Approval</a></li>
		<li class="acctsSubMenue"><a href="emp_monthly_statement.html">Monthly
				Statement</a></li>
		<li class="acctsSubMenue"><a href="emp_periodic_statement.html">Periodic
				Statement</a></li>
		<li class="acctsSubMenue"><a href="emp_annual_statement.html">Annual
				Statement</a></li>
		<li class="acctsSubMenue"><a href="emp_fund_deposit_entry.html">Fund
				Deposit Entry</a></li>
	</ul>
	<h2>Fund Deposit.</h2>
	<form>
		<br />
		<div>
			<label>Account No: </label> <input type="number" name="accountNo"
				required />
		</div>
		<div>
			<label>Amount: </label> <input type="number" name="depositAmount"
				required />
		</div>
		<div>
			<button>Deposit</button>
		</div>
	</form>
	<footer>
		<p>&copy;National Bank</p>
	</footer>
</body>

</html>