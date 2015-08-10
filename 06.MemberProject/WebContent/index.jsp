<%@page import="six.member.dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<title>회원관리 시스템 </title>
		<link rel="stylesheet" type="text/css" href="./css/bootstrap.css">
	</head>
	<% Member login = (Member)session.getAttribute("loginInfo");  %>
	<body>
		<div class="jumbotron">
		  <h1>회원관리 시스템 </h1><br>
		  <p> MVC Model2, DBCP, JDBC</p>
		  <p> HTML5, CSS3, JavaScript, AJAX, BootStrap</p>
		  
      
		  <h2> 한국데이터베이스진흥원 </h2><br>
		  <% if(login != null) { %>
            <p><a class="btn btn-primary btn-lg" href="list.six">회원리스트</a></p>
          <% } else {%>
            <p><a class="btn btn-primary btn-lg" href="registerForm.six">회원가입</a></p>
          <% } %>
		</div>
		<% if(login != null) { %>
		<!-- 로그인 성공시! -->
		<div class="alert alert-dismissible alert-info">
		  <button type="button" class="close" data-dismiss="alert">×</button>
		  <strong><%= login.getId() %></strong>님 환영합니다. <a href="logout.six" class="btn btn-info">로그아웃</a>
		</div>
	   <% } else { %>
	
		<!-- 로그인 실패시! -->
		<div class="alert alert-dismissible alert-danger">
		  <button type="button" class="close" data-dismiss="alert">×</button>
		  로그인하세요. <a href="loginForm.six" class="btn btn-danger">로그인</a>
		</div>
		<%} %>
	</body>
</html>