<%@page import="java.time.LocalDate"%>
<html>
<head>
<title>add own beneficiary account</title>
</head>
<body>
	<h1>
		!! Add Own Beneficiary Account :
		<%=LocalDate.now()%>
		!!
	</h1>
	<jsp:include page="user_home_menu.jsp" />

	<form action="addbenefacct" method="POST">
		<br />
		<div>
			<label>Beneficiary Account No: </label> <input type="number" name="benefAcctNo"
				required />
		</div><br />
		<div>
			<button>Add</button>
		</div>
	</form>
</body>
</html>