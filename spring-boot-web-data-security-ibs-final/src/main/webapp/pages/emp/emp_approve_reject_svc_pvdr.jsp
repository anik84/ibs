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
	href="/css/emp_approve_reject_svc_pvdr.css">
</head>

<body>
	<h1>Common Bank of India</h1>
	<h2>Bank Representative Home.</h2>
	<!--  <ul>
		<li><a href="emp_bank_rep_home.html">Home</a></li>
		<li><a href="emp_Login_form.html">Logout</a></li>
	</ul>
	<ul class="acctsMenue">
		<li class="acctsSubMenue"><a
			href="emp_approve_reject_new_acct.html">New Account Approval</a></li>
		<li class="acctsSubMenue"><a
			href="emp_approve_reject_svc_pvdr.html">New Svc. Pvdr. Approval</a></li>
		<li class="acctsSubMenue"><a href="emp_monthly_statement.html">Monthly
				Statement</a></li>
		<li class="acctsSubMenue"><a href="emp_periodic_statement.html">Periodic
				Statement</a></li>
		<li class="acctsSubMenue"><a href="emp_annual_statement.html">Annual
				Statement</a></li>
		<li class="acctsSubMenue"><a href="emp_fund_deposit_entry.html">Fund
				Deposit Entry</a></li>
	</ul>-->
	<jsp:include page="/rep/mainHeader" />
	<h2>Approve or Reject New Service Provider Request.</h2>
	<table>
		<tr>
		   
			<th>Service Provider Name</th>
			<th>Account Number</th>
			<th>Service Provider Email ID</th>
			<th>Service Provider Phone Number</th>
			<th>Approve/Reject</th>
		</tr>
		<c:forEach var="c" items="${serviceDetails }">
			<c:if test="${c.svcPvdrStatus=='new' }">
		         <tr>
					<td>${c.userName }</td>
					<td>${c.accountNumber }</td>
					<td>${c.svcPvdrEmail }</td>
					<td>${c.svcPvdrPhoneNo }</td>
					<td><a href="/rep/approve?uid=${c.userId}">Approve</a>
						<span> | </span> <a href="/rep/reject?uid=${c.userId}">Reject</a>
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