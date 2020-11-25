<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, 
                   initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>IBS</title>
    <link rel="stylesheet" type="text/css"
	href="/css/user_periodic_statement.css">
</head>

<body>
    <h1>Common Bank of India</h1>
    <h2>Accounts</h2>
    <ul>
        <li><a href="user_home.html">Home</a></li>
        <li><a href="user_accounts.html">Accounts</a></li>
        <li><a href="user_beneficiary.html">Beneficiary</a></li>
        <li><a href="index.html">Logout</a></li>
    </ul>
    <ul class="acctsMenue">
        <li class="acctsSubMenue"><a href="user_open_account.html">Open Account</a></li>
        <li class="acctsSubMenue"><a href="user_balance_check.html">Balance Check</a></li>
        <li class="acctsSubMenue"><a href="user_mini_statement.html">Mini Statement</a></li>
        <li class="acctsSubMenue"><a href="user_monthly_statement.html">Monthly Statement</a></li>
        <li class="acctsSubMenue"><a href="user_periodic_statement.html">Periodic Statement</a></li>
        <li class="acctsSubMenue"><a href="user_annual_statement.html">Annual Statement</a></li>
        <li class="acctsSubMenue"><a href="user_transfer_fund.html">Transfer Fund</a></li>
        <li class="acctsSubMenue"><a href="user_pay_utility_bill.html">Pay Utility Bill</a></li>
    </ul>
    <h2 id="welcomeText">Periodic Statement.</h2>
    <form>
        <div>
            <label for="acctNo">Enter Account Number: </label>
            <input type="text" name="acctNo" placeholder="Enter Account Number" required /> </div>
        <div>
            <label for="fromDate">From Date: </label>
            <input type="date" name="fromDate" required /> </div>
        <div>
            <label for="toDate">To Date: </label>
            <input type="date" name="toDate" required /> </div>
        <div>
            <button>Generate</button>
        </div>
    </form>
    <table>
        <tr>
            <th>Account Number</th>
            <th>Transaction Amount</th>
            <th>Transaction Date</th>
            <th>Transaction Type</th>
        </tr>
        <tr>
            <td>enter variable for jsp</td>
            <td>enter variable for jsp</td>
            <td>check not null to display</td>
            <td>check not null to display</td>
        </tr>
    </table>
    <footer>
        <p>&copy;National Bank</p>
    </footer>
</body>

</html>