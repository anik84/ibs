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
	href="/css/user_annual_statement.css">
</head>

<body>
	<h1>Common Bank of India</h1>
	<h2>Accounts</h2>
	<jsp:include page="/user/mainHeader" />
	<jsp:include page="/user/accountsHeader" />
	<h2>Annual Statement.</h2>
	<form:form method="POST" action="/user/getYearlyStmt"
		modelAttribute="yearlyStmt">
		<div>
			<form:label path="acctNumber">Select Accounts:</form:label>
			<form:select path="acctNumber" class="select">

				<form:options items="${accounts }" itemLabel="acctNumber"
					itemValue="acctNumber" />

			</form:select>
		</div>
		<div>
			<form:label path="year">Enter Year: </form:label>
			<form:input type="text" path="year" required="true"/>
		</div>
		<div>
			<button>Generate</button>
		</div>
	</form:form>
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
				</tr>
				<c:forEach var="p" items="${yearlyStmt1 }">
					<tr>
						<td>${p.acctNumber }</td>
						<td>${p.debitCreditAmount }</td>
						<td>${p.transactionDate }</td>
					</tr>
				</c:forEach>
			</table>
		</c:otherwise>
	</c:choose>
	<footer>
		<p>&copy;National Bank</p>
	</footer>
</body>

</html>