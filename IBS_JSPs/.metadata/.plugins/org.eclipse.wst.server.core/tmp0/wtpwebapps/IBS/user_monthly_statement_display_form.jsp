<%@page import="java.time.LocalDate"%>
<html>
<head>
<title>user monthly statement</title>
</head>
<body>
	<h1>
		!! Monthly Statement :
		<%=LocalDate.now()%>
		!!
	</h1>
	<jsp:include page="user_home_menu.jsp" />
	<!--
	<h2>Please fill up the details for monthly statement:</h2> -->
	<form action="monthlystatement" method="POST">
		<div>
			<label>Account Number: </label> <input type="number" name="accountNo"
				required />
		</div><br />
		<div>
			Select Statement Month: <select name="stmtMonth">
				<option value="stmtMonth_1">January</option>
				<option value="stmtMonth_2">February</option>
				<option value="stmtMonth_3">March</option>
				<option value="stmtMonth_4">April</option>
				<option value="stmtMonth_5">May</option>
				<option value="stmtMonth_6">June</option>
				<option value="stmtMonth_7">July</option>
				<option value="stmtMonth_8">August</option>
				<option value="stmtMonth_9">September</option>
				<option value="stmtMonth_10">October</option>
				<option value="stmtMonth_11">November</option>
				<option value="stmtMonth_12">December</option>
			</select>
		</div><br />
		<div>
			<button>Get Statement</button>
		</div>
	</form>
</body>
</html>