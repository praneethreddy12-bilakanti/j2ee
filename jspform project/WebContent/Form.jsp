<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="com.jspform.Simple" %>
<jsp:useBean id="pr" class="com.jspform.Simple">
<jsp:setProperty property="username" name="pr" />
<jsp:setProperty property="password" name="pr" />
</jsp:useBean>
<jsp:getProperty property="username" name="pr"/>
<jsp:getProperty property="password" name="pr"/>

</body>
</html>