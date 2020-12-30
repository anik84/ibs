<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<nav>
	<ul>
		<c:choose>
			<c:when test="${userName != null }">

				<c:if test="${role=='user' && custStatus=='active' }">
					<li><a href="/user/userHome">Home</a></li>
					<li><a href="/user/accountOperations">Accounts</a></li>
					<li><a href="/user/benefOperations">Beneficiaries</a></li>
				</c:if>
				<c:if test="${custStatus=='new' }">
					<li><a href="/user/resetPassword">Reset Password</a></li>
				</c:if>
				<c:if test="${role=='rep' }">
					<li><a href="/rep/repHome">Home</a></li>
					<li><a href="/rep/getNewAccountRegistrationReq">New Account Approval</a></li>
					<li><a href="/rep/getNewServiceProviderRegistrationReq">New Svc. Pvdr.
							Approval</a></li>
					<li><a href="/rep/monthlyStmt">Monthly Statement</a></li>
					<li><a href="/rep/periodicStmt">Periodic Statement</a></li>
					<li><a href="/rep/annualStmt">Annual Statement</a></li>
					<li><a href="/rep/depositAccount">Fund Deposit</a></li>
				</c:if>
				<c:if test="${role=='executive' }">
					<li><a href="/executive/executiveHome">Home</a></li>
					<li><a href="/executive/getNewUserRegistrationReq">New Registration Requests</a></li>
				</c:if>
				<c:if test="${role=='SvcPvdr' }">
					<li><a href="/svcPvdr/svcPvdrHome">Home</a></li>
					<li><a href="/svcPvdr/getAccountTransactions">Get Account Transactions</a></li>
				</c:if>
				<li><a href="/logout"> Logout </a></li>
			</c:when>
			<%-- <c:otherwise>

				<li><a href="/user/register">User Registration</a></li>
				<li><a href="/svcpvdr/register">Svc. Pvdr. Registration</a></li>
			</c:otherwise> --%>
		</c:choose>

	</ul>
</nav>