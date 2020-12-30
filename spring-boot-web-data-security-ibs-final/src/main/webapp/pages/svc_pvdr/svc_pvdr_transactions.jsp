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
	href="/css/service_provider_home.css">
</head>

<body>
	<h1>Common Bank of India</h1>
	<h2>Service Provider Home</h2>
	<jsp:include page="/svcPvdr/svcPvdrHeader" />
	<h2>Account Credits.</h2>
	<c:choose>
		<c:when test="${msg != null }">
			<h2>${msg }</h2>
		</c:when>
		<c:otherwise>
			<table>
				<tr>
					<th>Account Number</th>
					<th>Transaction Amount</th>
					<th>Transaction Date</th>
					<th>Transaction Type</th>
				</tr>
				<c:forEach var="t" items="${transactions }">
					<c:if test="${t.transType=='Credit' }">
						<tr>
							<td>${t.toAcctNo }</td>
							<td>${t.debitCreditAmount }</td>
							<td>${t.transactionDate }</td>
							<td>${t.transType }</td>
						</tr>
					</c:if>
				</c:forEach>
			</table>
		</c:otherwise>
	</c:choose>
	<footer>
		<p>&copy;National Bank</p>
	</footer>
</body>

</html>