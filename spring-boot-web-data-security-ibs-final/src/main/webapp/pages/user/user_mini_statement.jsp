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
	href="/css/user_mini_statement.css">
</head>

<body>
	<h1>Common Bank of India</h1>
	<h2>Accounts</h2>
	<jsp:include page="/user/mainHeader" />
	<jsp:include page="/user/accountsHeader" />
	<h2 id="welcomeText">Mini Statement.</h2>
	<table>
		<tr>
			<th>Account Number</th>
			<th>Generate Statement Link</th>
		</tr>
		<c:choose>
			<c:when test="${flag == 'LoadMiniStatement' }">
				<c:forEach var="m" items="${miniStatement }">
					<c:if test="${m.acctStatus=='approved' }">
						<tr>
							<td>${m.acctNumber }</td>
							<td><a
								href="/user/generateStatement?acctNumber=${m.acctNumber }">Generate</a>
							</td>
						</tr>
					</c:if>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<c:forEach var="m" items="${miniStatement1 }">
					<c:if test="${m.acctStatus=='approved' }">
						<tr>
							<td>${m.acctNumber }</td>
							<td><a
								href="/user/generateStatement?acctNumber=${m.acctNumber }">Generate</a>
							</td>
						</tr>
					</c:if>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>

	<table>
		<tr>
			<th>Account Number</th>
			<th>Transaction Amount</th>
			<th>Transaction Date</th>
		</tr>
		<c:forEach var="m" items="${miniStatement2 }">
			<tr>
				<td>${m.acctNumber }</td>
				<td>${m.debitCreditAmount }</td>
				<td>${m.transactionDate }</td>
			</tr>
		</c:forEach>
	</table>
	<footer>
		<p>&copy;National Bank</p>
	</footer>
</body>

</html>