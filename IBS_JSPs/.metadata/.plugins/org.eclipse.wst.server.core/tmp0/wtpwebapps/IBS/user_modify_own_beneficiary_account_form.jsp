<%@page import="java.time.LocalDate"%>
<html>
<head>
<title>modify own beneficiary account</title>
</head>
<body>
	<h1>
		!! Modify Beneficiary Account :
		<%=LocalDate.now()%>
		!!
	</h1>
	<jsp:include page="user_home_menu.jsp" />

	<form action="modifybenefacct" method="POST">
		<br />
		<div>
			<label>Existing Beneficiary Account No: </label> <input type="text" name="existingBenefAcctNo"
				required />
		</div><br />
		<div>
			<label>Modify Beneficiary Account No to: </label> <input type="text" name="modifyBenefAcctNoTo"
				required />
		</div><br />
		<div>
			<button>Update</button>
		</div>
	</form>
</body>
</html>