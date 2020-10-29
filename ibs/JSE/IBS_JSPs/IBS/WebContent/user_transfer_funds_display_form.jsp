<%@page import="java.time.LocalDate"%>
<html>
<head>
<title>transfer funds</title>
</head>
<body>
	<h1>
		!! Transfer Funds :
		<%=LocalDate.now()%>
		!!
	</h1>
	<jsp:include page="user_home_menu.jsp" />

	<h2>Enter the details for Transferring Funds:</h2>
	<form action="transferfund" method="POST">
		
		<!-- This should be populated from the account details DB -->
		<div>
			From Account No: <select name="fromAccountNo">
				<option value="fromAccountNo_1">100</option>
				<option value="fromAccountNo_2">200</option>

			</select>
		</div><br />
		
		<!-- This should be populated from the account details DB -->
		<div>
			To Account No: <select name="fromAccountNo">
				<option value="fromAccountNo_1">300</option>
				<option value="fromAccountNo_2">400</option>

			</select>
		</div><br />
		
		<!-- 
		<div>
			<label>From Account No: </label> <input type="date" name="fromAccountNo"
				required />
		</div><br />
		<div>
			<label>To Account No: </label> <input type="date" name="toAccountNo"
				required />
		</div><br />
		 -->
		 
		<div>
			<label>Amount: </label> <input type="number" name="amount"
				required />
		</div><br />
		<div>
			<label>Transaction Password: </label> <input type="text" name="transactionPassword"
				required />
		</div><br />
		<div>
			<button>Transfer Fund</button>
		</div>
	</form>
</body>
</html>