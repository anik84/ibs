<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, 
                   initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>IBS</title>
<link rel="stylesheet" type="text/css"
	href="/css/emp_aprove_reject_new_req.css">
</head>

<body>
	<h1>Common Bank of India</h1>
	<h2>Request Approval and Rejection</h2>
	<jsp:include page="/executive/mainHeader" />
	<h2>New Requests.</h2>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email ID</th>
			<th>Address</th>
			<th>Date of Birth</th>
			<th>Phone Number</th>
			<th>Approve/Reject</th>
		</tr>
		<c:forEach var="c" items="${customerDetails }">
			<c:if test="${c.isReqApproved=='new' }">
				<tr>
					<td>${c.custFirstName }</td>
					<td>${c.custLastName }</td>
					<td>${c.custEmail }</td>
					<td>${c.custAddress }</td>
					<td>${c.custdob }</td>
					<td>${c.custPhoneNo }</td>
					<td><a href="/executive/approve?uid=${c.userId }">Approve</a>
						<span> | </span> <a href="/executive/reject?uid=${c.userId }">Reject</a>
					</td>
				</tr>
			</c:if>
		</c:forEach>
	</table>
	<footer>
		<p>&copy;National Bank</p>
	</footer>
</body>

</html>