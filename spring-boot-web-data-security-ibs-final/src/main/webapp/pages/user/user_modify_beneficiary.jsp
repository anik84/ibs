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
	href="/css/user_modify_beneficiary.css">
</head>

<body>
	<h1>Common Bank of India</h1>
	<h2>Beneficiary</h2>
	<jsp:include page="/user/mainHeader" />
	<jsp:include page="/user/benefHeader" />
	<h2 id="welcomeText">Modify Beneficiary.</h2>
	<form:form action="/user/selectAcctForModification" method="POST" modelAttribute="selectBenef">
		<div>
			<form:label path="benefModel">Select Beneficiary Account:</form:label>
			<form:select path="benefModel">
				<form:options items="${benefModel }" itemLabel="benefAcctNo"
					itemValue="benefAcctNo"/>
			</form:select>
		</div>
		<div>
			<button>Select</button>
		</div>
	</form:form>
	<footer>
		<p>&copy;National Bank</p>
	</footer>

	<!-- <a href="user_save_benef_mofication.html">Temp Save Benef
		Modification</a> -->
</body>

</html>