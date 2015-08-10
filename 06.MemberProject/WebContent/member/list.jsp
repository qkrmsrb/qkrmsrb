<%@page import="java.util.List"%>
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
		        <li><a href="register.jsp">회원가입 <span class="sr-only">(current)</span></a></li>
		        <li class="active"><a href="#">회원 리스트 </a></li>
		        <li><a href="login.jsp">로그인</a></li>
		        
		      </ul>
		    </div>
		  </div>
		</nav> -->
		<%@include file = "header.jsp" %>
		
		<!-- 본문 시작  -->
		<form class="form-horizontal">
	  <fieldset>
	    <legend>회원리스트 </legend>
	    <table class="table table-striped table-hover ">
		  <thead>
            <tr>
		      <th>#</th>
		      <th>아이디</th>
		      <th>이름 </th>
		      <th>성별</th>
		      <th>가입일</th>
		      <th>삭제</th>
		    </tr>
		  </thead>
		  <tbody>
		  	<!-- 리스트를 출력한 후, 아이디를 클릭하는 경우에 detail.jsp로 링크 -->
            <% 
              List<Member> list = (List<Member>)request.getAttribute("list"); 
              for(int i=0; i < list.size(); i++){
                Member m = list.get(i);
            %>
		    <tr>
		      <td><%= i+1 %></td>
		      <td>
                <% if(login.getId().equals(m.getId())) { %>
                <%= m.getId() %>
                <% } else { %>
                <a href="detail.six?id=<%= m.getId() %>"><%= m.getId() %></a>
                <% } %>
              </td>
		      <td><%= m.getName() %></td>
		      <td><%= m.getGender() %></td>
		      <td><%= m.getRegdate() %></td>
		      <td>
                <% if(login.getId().equals(m.getId())) { %>
                
                <%} else { %>
                <a href="delete.six?id=<%= m.getId() %>">삭제</a> 
                <%} %>
              </td>
		    </tr>
            <%} %>
		    <!-- <tr>
		      <td>2</td>
		      <td>Column content</td>
		      <td>Column content</td>
		      <td>Column content</td>
		      <td>Column content</td>
		      <td>삭제</td>
		    </tr>
		    <tr class="info">
		      <td>3</td>
		      <td>Column content</td>
		      <td>Column content</td>
		      <td>Column content</td>
		      <td>Column content</td>
		      <td>삭제</td>
		    </tr>
		    <tr class="success">
		      <td>4</td>
		      <td>Column content</td>
		      <td>Column content</td>
		      <td>Column content</td>
		      <td>Column content</td>
		      <td>삭제</td>
		    </tr>
		    <tr class="danger">
		      <td>5</td>
		      <td>Column content</td>
		      <td>Column content</td>
		      <td>Column content</td>
		      <td>Column content</td>
		      <td>삭제</td>
		    </tr>
		    <tr class="warning">
		      <td>6</td>
		      <td>Column content</td>
		      <td>Column content</td>
		      <td>Column content</td>
		      <td>Column content</td>
		      <td>삭제</td>
		    </tr>
		    <tr class="active">
		      <td>7</td>
		      <td>Column content</td>
		      <td>Column content</td>
		      <td>Column content</td>
		      <td>Column content</td>
		      <td>삭제</td>
		    </tr> -->
		  </tbody>
		</table> 
	  </fieldset>
	</form>
	</body>
</html>