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
		        <li class="active"><a href="#">로그인</a></li>
		        
		      </ul>
		    </div>
		  </div>
		</nav> -->
        <%@include file = "header.jsp" %>
		
		
		<!-- 본문 시작  -->
		<form class="form-horizontal" action="login.six">
	  <fieldset>
	    <legend>로그인 </legend>
	    <div class="form-group">
	      <label for="id" class="col-lg-2 control-label">아이디 : </label>
	      <div class="col-lg-10">
	        <input type="text" class="form-control" id="id" name="id" placeholder="아이디를 입력하세요.">
	      </div>
	    </div>
	    <div class="form-group">
	      <label for="pwd" class="col-lg-2 control-label">비밀번호 : </label>
	      <div class="col-lg-10">
	        <input type="password" class="form-control" id="pwd" name="pwd" placeholder="비밀번호를 입력하세요.">
	      </div>
	    </div>
	    <div class="form-group">
	      <div class="col-lg-10 col-lg-offset-2">
	        <button type="reset" class="btn btn-default">취소</button>
	        <button type="submit" class="btn btn-primary">로그인</button>
	      </div>
	    </div>
	  </fieldset>
	</form>
	</body>
</html>