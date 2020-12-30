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
	href="/css/user_balance_check.css">
</head>

<body>
	<h1>Common Bank of India</h1>
	<h2>Accounts</h2>
	<jsp:include page="/user/mainHeader" />
	<jsp:include page="/user/accountsHeader" />

	<h2 id="welcomeText">Account Balance.</h2>
	<table>
		<tr>
			<th>Account Number</th>
			<th>Account Type</th>
			<th>Account Balance</th>
		</tr>
		<c:forEach var="b" items="${balance }">
			<c:if test="${b.acctStatus=='approved' }">
				<tr>
					<td>${b.acctNumber }</td>
					<td>${b.acctType }</td>
					<td>${b.acctBalance }</td>
				</tr>
			</c:if>
		</c:forEach>
	</table>

	<footer>
		<p>&copy;National Bank</p>
	</footer>

</body>

</html>