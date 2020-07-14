<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>declaration</h2>
<%!
int x=20;
%>
<h2>scriplet</h2>
<%
out.println("hello world");
%>

<%out.println(x); %>

<h2>expression</h2>
<%=x %>
<% java.util.Date d=new Date(); %>
<%=d%>
</body>
</html>