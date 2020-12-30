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
	href="/css/user_save_benef_mofication.css">
</head>

<body>
	<h1>Common Bank of India</h1>
	<h2>Beneficiary</h2>
	<jsp:include page="/user/mainHeader" />
	<jsp:include page="/user/benefHeader" />
	<h2 id="welcomeText">Modify Beneficiary.</h2>
	<form:form action="/user/saveAcctForModification" method="POST"
		modelAttribute="saveBenef">
		<div>
			<form:label path="benefId">Beneficiary ID: </form:label>
			<form:input type="text" path="benefId" value="${benefId }" readonly="true"/>
		</div>
		<div>
			<form:label path="benefAcctNo">Account Number: </form:label>
			<form:input type="text" path="benefAcctNo" value="${benefAcctNo }" />
		</div>
		<div>
			<form:label path="benefName">Beneficiary Name: </form:label>
			<form:input type="text" path="benefName" value="${benefName }"/>
		</div>

		<div>
			<button>Save</button>
		</div>
	</form:form>
	<footer>
		<p>&copy;National Bank</p>
	</footer>
</body>

</html>