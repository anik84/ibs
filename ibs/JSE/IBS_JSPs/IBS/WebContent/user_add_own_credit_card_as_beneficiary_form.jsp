<%@page import="java.time.LocalDate"%>
<html>
<head>
<title>add own credit card as beneficiary</title>
</head>
<body>
	<h1>
		!! Add Own Credit Card as Beneficiary :
		<%=LocalDate.now()%>
		!!
	</h1>
	<jsp:include page="user_home_menu.jsp" />

	<h2>Enter Credit Card details to add as Beneficiary:</h2>
	<form action="addbenefcreditcard" method="POST">
		<div>
			<label>Name on the Credit Card: </label> <input type="text" name="benefCreditCardName"
				required />
		</div><br />
		<div>
			<label>Credit Card No: </label> <input type="number" name="benefCreditCardNo"
				required />
		</div><br />
		<div>
			<label>Credit Card valid till date: </label> <input type="date" name="benefCreditCardExpiry"
				required />
		</div><br />
		<div>
			<label>Credit Card CVV No: </label> <input type="number" name="benefCVVNo"
				required />
		</div><br />
		<div>
			<button>Add</button>
		</div>
	</form>
</body>
</html>