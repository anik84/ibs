<%@page import="java.time.LocalDate"%>
<html>
<head>
<title>deposit fund</title>
</head>
<body>
	<h1>
		!! Deposit Fund :
		<%=LocalDate.now()%>
		!!
	</h1>
	<jsp:include page="ibs_representative_home_menu.jsp" />

	<form action="depositfund" method="POST">
		<br/>
		<div>
			<label>Account No: </label> <input type="number" name="accountNo"
				required />
		</div><br />
		<div>
			<label>Amount: </label> <input type="number" name="depositAmount"
				required />
		</div><br />
		<div>
			<button>Deposit Fund</button>
		</div>
	</form>
</body>
</html>