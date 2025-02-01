<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Computed Result</title>
</head>
<body>
<h1>Computed Result</h1>
<b> Result is <% int res = (int) request.getAttribute("res");
out.println(res); %></b>

</body>
</html>