<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, 
                   initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>IBS Home</title>
<link rel="stylesheet" type="text/css"
	href="/css/user_registration_form.css">
</head>

<body>
					
	<h1>Common Bank of India</h1>
	<h2>New User Registration</h2>
	<ul>
		<li><a href="index.html">User Login</a></li>
	</ul>
	<form:form action="/user" method="POST">
	            <div class="form-control-group">
					<form:errors path="*"></form:errors>
				</div>
				<div class="form-control-group">
				<form:label path="firstName" class="form-control-label">First Name: </form:label>
					<form:input path="firstName" class="form-control" type="text"/>
				</div>
				<div class="form-control-group">
				<form:label path="lastName" class="form-control-label">Last Name: </form:label>
					<form:input path="lastName" class="form-control" type="text"/>
				</div>
				<div class="form-control-group">
				<form:label path="emailId" class="form-control-label">Email Id: </form:label>
					<form:input path="emailId" class="form-control" type="text"/>
				</div>
                <div class="form-control-group">
				<form:label path="address" class="form-control-label">Residential Address:</form:label>
					<form:input path="address" class="form-control" type="text"/>
				</div>
				<div class="form-control-group">
				<form:label path="dob" class="form-control-label">Date Of Birth:</form:label>
					<form:input path="dob" class="form-control" type="dob"/>
				</div>
				<div class="form-control-group">
				<form:label path="phoneNo" class="form-control-label">Phone Number: </form:label>
					<form:input path="phoneNo" class="form-control" type="number"/>
				</div>
			<div>
			<button>Register</button>
			</div>
	</form:form>
	<footer>
		<p>&copy;National Bank</p>
	</footer>
	
	<!-- 
	<form:form action="/userValidation" method="POST"
		modelAttribute="user">
		<div class="form-control-group">
			<form:label path="firstName" class="form-control-label">First Name: </form:label>
			<form:input path="firstName" class="form-control" type="text" />
		</div>
		<div class="form-control-group">
			<form:label path="lastName" class="form-control-label">Last Name: </form:label>
			<form:input path="lastName" class="form-control" type="text" />
		</div>
	</form:form>
	 -->
	 
	 
	 <%-- <form:form action="/login" method="POST">
		<c:if test="${param.error != null}">
					Invalid Credentials! Access Denied!
				</c:if>
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
		<div>
			<form:label path="userName">User Name: </form:label>
			<form:input path="userName" type="text" />
		</div>
		<div>
			<form:label path="password">Password: </form:label>
			<form:input path="password" type="password" />
		</div>
		<div>
			<button>Sign In</button>
		</div>
	</form:form> --%>
	 
	 
	 <div class="form-control-group">
			<form:label path="custdob">Date Of Birth:</form:label>
			<form:input path="custdob" type="date" />
		</div>
	
	
</body>

</html>