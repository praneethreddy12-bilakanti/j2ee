<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
String name=null;
%>
<font   color="red">
<h1>
<%
name=request.getParameter("uname");
out.println("welcome"+"\t"+name);
java.util.Date d=new java.util.Date();
%>
</h1>
<h1>
today date is
<%="praneeth"+"\t"+d


%>
</font>
</h1>
</body>
</html>