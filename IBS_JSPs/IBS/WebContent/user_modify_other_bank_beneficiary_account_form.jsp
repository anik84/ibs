<%@page import="java.time.LocalDate"%>
<html>
<head>
<title>modify other people beneficiary account</title>
</head>
<body>
	<h1>
		!! Modify Other People Beneficiary Account :
		<%=LocalDate.now()%>
		!!
	</h1>
	<jsp:include page="user_home_menu.jsp" />

	<form action="modifyotherpeoplebenefacct" method="POST">
		<br />
		<div>
			<label>Existing Other People Beneficiary Account No: </label> <input
				type="number" name="existingOtherBenefAcctNo" required />
		</div>
		<br />
		<div>
			<label>Other People Beneficiary Account No to: </label> <input
				type="number" name="modifyOtherBenefAcctNoTo" />
		</div>
		<br />
		<div>
			<div>
				<label>Beneficiary Full Name To: </label> <input type="text"
					name="otherPeopleBenefFullNameTo" />
			</div>
			<br />
			<button>Update</button>
		</div>
	</form>
</body>
</html>