<%@page import="java.time.LocalDate"%>
<html>
<head>
<title>user account operations</title>
</head>
<body>
	<h1>
		!! User Accounts Operation Page :
		<%=LocalDate.now()%>
		!!
	</h1>
	<jsp:include page="user_home_menu.jsp" />
	
	<br />
	<a href="user_open_account_form.jsp">Open New Account</a><br /><br />
	
	<a href="user_balance_check_display_form.jsp">Balance Check</a><br /><br />
	
	<!--  need to check if on click value can be retrieved for user_balance_check_display_form.jsp
	<form action="displaybalance" method="POST">
		<a href="">Balance Check</a><br /><br />
	</form>
	-->
	
	<a href="user_mini_statement_display_form.jsp">Mini Statement</a><br /><br />
	<a href="user_monthly_statement_display_form.jsp">Monthly Statement</a><br /><br />
	<a href="user_periodic_statement_display_form.jsp">Periodic Statement</a><br /><br />
	<a href="user_annual_statement_display_form.jsp">Annual Statement</a><br /><br />
	<a href="user_transfer_funds_display_form.jsp">Transfer Funds</a><br /><br />
	<a href="user_pay_utility_bills_form.jsp">Pay Utility Bills</a><br /><br />

</body>
</html>