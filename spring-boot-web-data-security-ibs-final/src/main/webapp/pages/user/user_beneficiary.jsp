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
<link rel="stylesheet" type="text/css" href="/css/user_beneficiary.css">
</head>

<body>
	<h1>Common Bank of India</h1>
	<h2>Beneficiary</h2>
	<jsp:include page="/user/mainHeader" />
	<jsp:include page="/user/benefHeader" />
	
	<c:choose>
		<c:when test="${msg != null }">
			<div>
				<h2>${msg }</h2>
			</div>
		</c:when>
		<c:otherwise>
			<h2 id="welcomeText">Beneficiary Home.</h2>
		</c:otherwise>
	</c:choose>
	
	<footer>
		<p>&copy;National Bank</p>
	</footer>
</body>

</html>