<%@page import="java.time.LocalDate"%>
<html>
<head>
<title>user beneficiary operations</title>
</head>
<body>
	<h1>
		!! User Beneficiary Operations Page :
		<%=LocalDate.now()%>
		!!
	</h1>
	<jsp:include page="user_home_menu.jsp" />
	
	<br />
	<a href="user_add_own_beneficiary_account_form.jsp">Add Own Beneficiary Account</a><br /><br />
	<a href="user_modify_own_beneficiary_account_form.jsp">Modify Own Beneficiary Account</a><br /><br />
	<a href="user_add_own_credit_card_as_beneficiary_form.jsp">Add Own Credit Card As Beneficiary</a><br /><br />
	<a href="user_modify_own_credit_card_as_beneficiary_form.jsp">Modify Own Beneficiary Credit Card</a><br /><br />
	<a href="user_add_other_bank_beneficiary_account_form.jsp">Add Other Bank Beneficiary Account</a><br /><br />
	<a href="user_modify_other_bank_beneficiary_account_form.jsp">Modify Other Bank Beneficiary Account</a><br /><br />
	

</body>
</html>