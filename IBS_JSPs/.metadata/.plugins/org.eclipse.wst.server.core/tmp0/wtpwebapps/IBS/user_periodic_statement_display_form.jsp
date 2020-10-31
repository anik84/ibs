<%@page import="java.time.LocalDate"%>
<html>
<head>
<title>periodic user statement</title>
</head>
<body>
	<h1>
		!! Periodic User Statements :
		<%=LocalDate.now()%>
		!!
	</h1>
	<jsp:include page="user_home_menu.jsp" />

	<h2>Enter the details for Periodic Statement:</h2>
	<form action="periodicstatement" method="POST">
		<div>
			<label>Account No: </label> <input type="number" name="accountNo"
				required />
		</div><br />
		<div>
			<label>From Date: </label> <input type="date" name="fromDate"
				required />
		</div><br />
		<div>
			<label>To Date: </label> <input type="date" name="toDate"
				required />
		</div><br />
		<div>
			<button>Get Statement</button>
		</div>
	</form>
</body>
</html>