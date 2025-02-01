<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator</title>
</head>
<body>
	<h2>Calculator form</h2>

	<form action="processForm" method="post">
		<div class="form-group">
			<label for="num1">Num1:</label> <input type="text"
				class="form-control" id="num1" name="num1">
		</div>
		<div class="form-group">
			<label for="num2">Num2:</label> <input type="text"
				class="form-control" id="num2" name="num2">
		</div>
		<div class="form-group">
			<label for="op">Operator:</label> <input type="text"
				class="form-control" id="op" name="op">
		</div>
		<button type="submit" class="btn btn-default">Submit</button>
	</form>
</body>
</html>