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
<link rel="stylesheet" type="text/css"
	href="/css/user_transfer_fund.css">
</head>

<body>
	<h1>Common Bank of India</h1>
	<h2>Accounts</h2>
	<jsp:include page="/user/mainHeader" />
	<jsp:include page="/user/accountsHeader" />
	<h2 id="welcomeText">Transfer Fund.</h2>
	<form:form method="POST" action="/user/userTransferFundForm"
		modelAttribute="transferFund">
		<div>
			<form:label path="acctNumber">Select Accounts:</form:label>
			<form:select path="acctNumber" class="select">

				<form:options items="${accounts }" itemLabel="acctNumber"
					itemValue="acctNumber" />

			</form:select>
		</div>
		<div>
			<form:label path="benefAcctNo">Select Accounts:</form:label>
			<form:select path="benefAcctNo" class="select">

				<form:options items="${benefAccounts }" itemLabel="benefAcctNo"
					itemValue="benefAcctNo" />

			</form:select>
		</div>
		<div>
			<form:label path="depositAmount">Transfer Amount: </form:label>
			<form:input type="number" path="depositAmount" required="true"/>
		</div>
		<%-- <div>
			<form:label path="transPwd">Transaction Password: </form:label>
			<form:input type="password" path="transPwd" required="true"/>
		</div> --%>
		<div>
			<button>Transfer</button>
		</div>
	</form:form>
	<footer>
		<p>&copy;National Bank</p>
	</footer>
</body>

</html>