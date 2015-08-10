<%@page import="six.member.dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <% Member login = (Member)session.getAttribute("loginInfo"); %>
  <nav class="navbar navbar-inverse">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-2">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="./index.jsp">회원관리</a>
        </div>
    
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-2">
          <ul class="nav navbar-nav">
            <% if(login != null) { %>
            <li class="active"><a href="list.six">회원 리스트 </a></li>
            <% } else { %>
            <li><a href="registerForm.six">회원가입 <span class="sr-only">(current)</span></a></li>
            <li><a href="loginForm.six">로그인</a></li>
            <% } %>
          </ul>
        </div>
      </div>
    </nav>
</body>
</html>