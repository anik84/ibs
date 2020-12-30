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
	href="/css/emp_monthly_statement.css">
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
	<h2>Monthly Statement.</h2>
	<form>
		<div>
			<label for="acctNo">Enter Account Number: </label> <input type="text"
				name="acctNo" placeholder="Enter Account Number" required />
		</div>
		<div>
			<label for="month" id="month">Month:</label> <select name="month">
				<option value="jan">January</option>
				<option value="feb">February</option>
				<option value="mar">March</option>
				<option value="apr">April</option>
				<option value="may">May</option>
				<option value="jun">June</option>
				<option value="jul">July</option>
				<option value="aug">August</option>
				<option value="sep">September</option>
				<option value="oct">October</option>
				<option value="nov">November</option>
				<option value="dec">December</option>
			</select>
		</div>
		<div>
			<button>Generate</button>
		</div>
	</form>
	<table>
		<tr>
			<th>Account Number</th>
			<th>Transaction Amount</th>
			<th>Transaction Date</th>
			<th>Transaction Type</th>
		</tr>
		<tr>
			<td>enter variable for jsp</td>
			<td>enter variable for jsp</td>
			<td>check not null to display</td>
			<td>check not null to display</td>
		</tr>
	</table>
	<footer>
		<p>&copy;National Bank</p>
	</footer>
</body>

</html>