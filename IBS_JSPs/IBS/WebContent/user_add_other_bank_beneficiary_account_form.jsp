<%@page import="java.time.LocalDate"%>
<html>
<head>
<title>add other people beneficiary account</title>
</head>
<body>
	<h1>
		!! Add Other People Beneficiary Account :
		<%=LocalDate.now()%>
		!!
	</h1>
	<jsp:include page="user_home_menu.jsp" />

	<form action="addotherbenefacct" method="POST">
		<br />
		<div>
			<label>Beneficiary Full Name: </label> <input type="text" name="otherPeopleBenefFullName"
				required />
		</div><br />
		<div>
			<label>Beneficiary Account No: </label> <input type="number" name="otherPeopleBenefAcctNo"
				required />
		</div><br />
		<div>
			<button>Add</button>
		</div>
	</form>
</body>
</html>