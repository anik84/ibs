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
	href="/css/user_add_credit_card.css">
</head>

<body>
	<h1>Common Bank of India</h1>
	<h2>Beneficiary</h2>
	<jsp:include page="/user/mainHeader" />
	<jsp:include page="/user/benefHeader" />
	<h2 id="welcomeText">Add Credit Card.</h2>
	
	<form:form action="/user/userAddCreditCard" method="POST"
		modelAttribute="newCredit">
		<div>
			<form:label path="benefAcctNo">Credit Card Number: </form:label>
			<form:input path="benefAcctNo" type="number" />
		</div>
		<div>
			<form:label path="benefName">Beneficiary Name: </form:label>
			<form:input path="benefName" type="text" />
		</div>
		<div>
			<form:label path="benefType">Select Account Type: </form:label>
			<form:select path="benefType">
				<form:option value="self">self</form:option>
				<form:option value="other">other</form:option>
				
			</form:select>
		</div>
		<div>
			<button>Add</button>
		</div>
	</form:form>
	
	<footer>
		<p>&copy;National Bank</p>
	</footer>
</body>

</html>