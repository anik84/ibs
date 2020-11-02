<%@page import="java.time.LocalDate"%>
<html>
<head>
<title>modify own credit card as beneficiary</title>
</head>
<body>
	<h1>
		!! Modify Own Credit Card as Beneficiary :
		<%=LocalDate.now()%>
		!!
	</h1>
	<jsp:include page="user_home_menu.jsp" />

	<form action="modifybenefcreditcard" method="POST">
		<br />
		<div>
			<label>Existing Beneficiary Credit Card No: </label> <input type="number" name="existingBenefCreditCardNo"
				required />
		</div><br />
		<div>
			<label>Beneficiary Credit Card No to: </label> <input type="text" name="modifyBenefCreditCardNoTo" />
		</div><br />
		<div>
			<label>Name on the Credit Card to: </label> <input type="text" name="modifyBenefCreditCardNameTo" />
		</div><br />
		<div>
			<label>Credit Card CVV to: </label> <input type="text" name="modifyBenefCreditCardCVVTo" />
		</div><br />
		<div>
			<button>Update</button>
		</div>
	</form>
</body>
</html>