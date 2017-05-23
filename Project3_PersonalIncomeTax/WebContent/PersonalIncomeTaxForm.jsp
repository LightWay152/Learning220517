<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Personal Income Tax Form</title>
</head>
<body>
	Please input salary, bonus (Example: 18500 -> 18,500,000 VND)
	<form action="PersonalIncomeTaxServlet.php" method="post">
		Salary:<input name="salary">(,000.00 VND)<br>
		Bonus:<input name="bonus">(,000.00 VND)<br>
		<button>Calculate</button>
	</form>
</body>
</html>