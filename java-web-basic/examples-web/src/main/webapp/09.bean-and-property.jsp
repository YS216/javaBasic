<%@ page import="com.exampleweb.dto.Person" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Bean And Property</title>
</head>
<body>

	<% Person person = new Person(); %>
	<jsp:useBean id="person2" class="com.exampleweb.dto.Person" />
	
	<%
	person.setNo(1);
	person.setName("John Doe");
	person.setEmail("johndo@example.com");
	person.setPhone("010-1234-5678");
	%>
	<jsp:setProperty property="no" name="person2" value="2"/>
	<jsp:setProperty property="name" name="person2" value="Jane Doe"/>
	<jsp:setProperty property="email" name="person2" value="jaindoh@examle.com"/>
	<jsp:setProperty property="phone" name="person2" value="010-5678-1234"/>
	
	[<%= person.getNo() %>]
	[<%= person.getName() %>]
	[<%= person.getEmail() %>]
	[<%= person.getPhone() %>]
	<hr>
	[<jsp:getProperty property="no" name="person2"/>]
	[<jsp:getProperty property="name" name="person2"/>]
	[<jsp:getProperty property="phone" name="person2"/>]
	[<jsp:getProperty property="email" name="person2"/>]
	

</body>
</html>