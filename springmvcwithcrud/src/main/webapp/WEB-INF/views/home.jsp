<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
<h1>Hi <% String name = (String) request.getAttribute("name");
int id = (int) request.getAttribute("id");
out.println(" "+name+", your id is "+id); %></h1>
</body>
</html>