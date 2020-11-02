<%@page import="java.time.LocalDate"%>
<html>
<head>
<title>ibs accounts executive home page</title>
</head>
<body>
	<h1>
		!! IBS Accounts Executive Home Page :
		<%=LocalDate.now()%>
		!!
	</h1>

	<table>
		<tr>
			<td><strong>First Name: </strong></td>
			<td><em>${IBSAccountsExecutive.firstName}</em></td>
		</tr>
		<br\>
		<tr>
			<td><strong>Last Name: </strong></td>
			<td><em>${IBSAccountsExecutive.lastName}</em></td>
		</tr>
		<br\>
		<tr>
			<td><strong>Email ID: </strong></td>
			<td><em>${IBSAccountsExecutive.emailId}</em></td>
		</tr>
		<br\>
		<tr>
			<td><strong>Residential Address: </strong></td>
			<td><em>${IBSAccountsExecutive.address}</em></td>
		</tr>
		<br\>
		<tr>
			<td><strong>Date of Birth: </strong></td>
			<td><em>${IBSAccountsExecutive.dob}</em></td>
		</tr>
		<br\>
		<tr>
			<td><strong>Phone Number: </strong></td>
			<td><em>${IBSAccountsExecutive.phoneNo}</em></td>
		</tr>
		<br\>
		<br\>
	</table>

	<form action="approve" method="POST">
		<div>
			<button>Approve</button>
			&nbsp;&nbsp;
			<button>Reject</button>
		</div>
	</form>
	
	<!-- 
	<form action="reject" method="POST">
		<div>
			<button>Reject</button>
		</div>
	</form>   -->
</body>
</html>