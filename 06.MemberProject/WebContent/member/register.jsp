<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
	<head>
		<title>JSP/Servlet Example</title>
	
		<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/bootstrap.css">
	    <script type="text/javascript" src="<%= request.getContextPath() %>/js/member.js"></script>
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
		        <li class="active"><a href="#">회원가입 <span class="sr-only">(current)</span></a></li>
		        <li><a href="list.jsp">회원 리스트 </a></li>
		        <li><a href="login.jsp">로그인</a></li>
		        
		      </ul>
		    </div>
		  </div>
		</nav> -->
		<%@include file = "header.jsp" %>
		
		<!-- 본문 시작  -->
		<form class="form-horizontal" action="register.six" name="registerForm" onsubmit="return registerCheck()">
	  <fieldset>
	    <legend>회원가입 </legend>
	    
	    <div class="form-group">
	      <label for="id" class="col-lg-2 control-label">아이디 : </label>
	      <div class="col-lg-10">
	        <input type="text" class="form-control" id="id" name="id" placeholder="아이디를 입력하세요.">
	        <button type="button" class="btn btn-primary" onclick="checkId()">중복확인 </button>
            <span id="idcheck"></span>
	      </div>
	    </div>
	    
	    <div class="form-group">
	      <label for="pwd" class="col-lg-2 control-label">비밀번호 : </label>
	      <div class="col-lg-10">
	        <input type="password" class="form-control" id="pwd" name="pwd" placeholder="비밀번호를 입력하세요.">
	      </div>
	    </div>
	    <div class="form-group">
	      <label for="name" class="col-lg-2 control-label">이름 : </label>
	      <div class="col-lg-10">
	        <input type="text" class="form-control" id="name" name="name" placeholder="이름을 입력하세요.">
	      </div>
	    </div>
	    <div class="form-group">
	      <label for="age" class="col-lg-2 control-label">나이 : </label>
	      <div class="col-lg-10">
	        <input type="number" class="form-control" id="age" name="age" value="20" placeholder="나이를 입력하세요.">
	      </div>
	    </div>
	    <div class="form-group">
	      <label class="col-lg-2 control-label">성별 : </label>
	      <div class="col-lg-10">
	        <div class="radio">
	          <label>
	            <input type="radio" name="gender" id="gender" value="남자" checked> 남자 
	          </label>
	          <label>
	            <input type="radio" name="gender" id="gender" value="여자"> 여자 
	          </label>
	        </div>
	      </div>
	      </div>
	      <div class="form-group">
	      <label for="addr" class="col-lg-2 control-label">주소 : </label>
	      <div class="col-lg-10">
	        <input type="text" class="form-control" id="addr" name="addr" placeholder="주소를 입력하세요.">
	      </div>
	    </div>
	    
	    <div class="form-group">
	      <div class="col-lg-10 col-lg-offset-2">
	        <button type="reset" class="btn btn-default">취소</button>
	        <button type="submit" class="btn btn-primary">가입</button>
	      </div>
	    </div>
	  </fieldset>
	</form>
	</body>
</html>