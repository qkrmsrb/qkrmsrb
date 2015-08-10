<%@page import="six.member.dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<title>JSP/Servlet Example</title>
	
		<link rel="stylesheet" type="text/css" href="./css/bootstrap.css">
	
	</head>
	
	<body>
		<!-- 메뉴 시작  -->
		<!-- <nav class="navbar navbar-inverse">
		  <div class="container-fluid">
		    <div class="navbar-header">
		      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-2">
		        <span class="sr-only">Toggle navigation</span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		      </button>
		      <a class="navbar-brand" href="../index.jsp">회원관리</a>
		    </div>
		
		    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-2">
		      <ul class="nav navbar-nav">
		        <li class="active"><a href="register.jsp">회원가입 <span class="sr-only">(current)</span></a></li>
		        <li><a href="list.jsp">회원 리스트 </a></li>
		        <li><a href="login.jsp">로그인</a></li>
		        
		      </ul>
		    </div>
		  </div>
		</nav> -->
		<%@include file = "header.jsp" %>
		
		<!-- 본문 시작  -->
		<form class="form-horizontal" action="delete.six">
		  <fieldset>
		    <legend>회원 상세 정보 </legend>
		    <% Member m = (Member)request.getAttribute("Member"); %>
		    <div class="form-group">
		      <label for="id" class="col-lg-2 control-label">아이디 : <%= m.getId() %></label>
		      <!-- <div class="col-lg-10">
		        test
		      </div> -->
		    </div>
		    
		    <div class="form-group">
		      <label for="name" class="col-lg-2 control-label">이름 : <%= m.getName()%></label>
		      <!-- <div class="col-lg-10">
		        홍길동 
		      </div> -->
		    </div>
		    <div class="form-group">
		      <label for="age" class="col-lg-2 control-label">나이 : <%= m.getAge() %></label>
		      <!-- <div class="col-lg-10">
		        20
		      </div> -->
		    </div>
		    <div class="form-group">
		      <label class="col-lg-2 control-label">성별 : <%= m.getGender() %></label>
		      <!-- <div class="col-lg-10">
		        <div class="radio">
		          남자 
		        </div>
		      </div> -->
		      </div>
		      <div class="form-group">
		      <label for="addr" class="col-lg-2 control-label">주소 : <%= m.getAddr() %></label>
		      	<!-- 서울시 구로구 고척동 동양미래대학교  -->
		    </div>
		    
		    <div class="form-group">
		      <div class="col-lg-10 col-lg-offset-2">
                <input type="hidden" name="id" value="<%= m.getId() %>">
		        <button type="submit" class="btn btn-primary">삭제</button>
		      </div>
		    </div>
		  </fieldset>
		</form>
	</body>
</html>