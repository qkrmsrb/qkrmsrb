<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
    
<!DOCTYPE html>

<html>
<head>
	<title>JSP/Servlet Example</title>

	<link rel="stylesheet" type="text/css" href="./css/bootstrap.css">

</head>

<body>
<div class="jumbotron">
  <h1>Error!</h1>
  <p> Oops!</p>
  <p><a class="btn btn-primary btn-lg" onclick="history.go(-1)">이전 페이지로 </a></p>
</div>

<div class="alert alert-dismissible alert-danger">
  <button type="button" class="close" data-dismiss="alert">×</button>
  <%= request.getAttribute("errorMsg") %>
</div>
</body>
</html>