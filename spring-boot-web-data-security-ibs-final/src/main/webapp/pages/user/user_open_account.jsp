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
<title>IBS</title>
<link rel="stylesheet" type="text/css" href="/css/user_open_account.css">
</head>

<body>
	<h1>Common Bank of India</h1>
	<h2>Accounts</h2>
	<jsp:include page="/user/mainHeader" />
	<jsp:include page="/user/accountsHeader" />
	<h2 id="welcomeText">Open New Account.</h2>
	<form:form action="/user/openAccounts" method="POST"
		modelAttribute="newAccount">
		<div>
			<form:label path="depositAmount">Deposit Amount: </form:label>
			<form:input path="depositAmount" type="number" placeholder="Enter Amount"/>
		</div>
		<div>
			<form:label path="AcctType">Select Account Type: </form:label>
			<form:select path="AcctType">
				<form:option value="savings">Savings Account</form:option>
				<form:option value="current">Current Account</form:option>
				<form:option value="fixedDeposit">Fixed Deposit Account</form:option>
			</form:select>
		</div>
		<div>
			<button>Open</button>
		</div>
	</form:form>
	<footer>
		<p>&copy;National Bank</p>
	</footer>
</body>

</html>