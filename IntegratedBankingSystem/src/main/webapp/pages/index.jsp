<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, 
                   initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>IBS Home</title>
    <link rel="stylesheet" type="text/css" href="/css/index.css">
</head>

<body>
    <h1>Common Bank of India</h1>
    <h2>Bank Home</h2>
    <ul>
        <li><a href="emp_Login_form.html">Bank Internal</a></li>
    </ul>
    <form action="userLogin" method="post">
        <div >
            <label for="loginId">Login ID:</label>
            <input type="text" id="loginId" name="loginId" placeholder="Enter User ID" required> </div>
        <div>
            <label for="pwd" class="label">Password:</label>
            <input type="password" id="pwd" name="pwd" placeholder="Enter Password" required> </div>
        <input id="action" name="action" type="hidden" value="validate">
        <div >

            <button>Sign In</button>
        </div>
        <div class="formInput"> <a href="user_registration_form.html">New User</a> <a href="password_reset_form.html">Change Password</a> </div>
    </form>
    <footer>
        <p>&copy;National Bank</p>
    </footer>
    
    <a href="user_home.html">User Home</a>
</body>

</html>