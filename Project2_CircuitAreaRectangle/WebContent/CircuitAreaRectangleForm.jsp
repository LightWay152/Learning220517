<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Circuit Area Rectangle Form</title>
</head>
<body>
	Input length, width to calculate circuit, area of rectangle:
	<form action="CircuitAreaRectangleServlet.php" method="post">
		Length of Rectangle:<input name="length"/><br>
		Width of Rectangle :<input name="width"/><br>
		<button>Calculate</button>
	</form>
</body>
</html>