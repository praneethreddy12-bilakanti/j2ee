<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
  out.println("<b>Using getParameter(String) method</b><br>");
  String str1 = request.getParameter("t1");
  String str2 = request.getParameter("t2");
  out.println("User Name: " + str1 + " and Password: " + str2);
 
  out.println("<br><br> <b>Using getParameterNames()method</b>");
  java.util.Enumeration e = request.getParameterNames();
  while(e.hasMoreElements())
  {
    String fieldName = (String) e.nextElement();
    String fieldValue = request.getParameter(fieldName);
    out.println("<br> HTML Field Name: " + fieldName + " Value entered: " + fieldValue);
  }
%>
  <br> <br> <b> Using other methods: </b> <br>
 
  User-Agent: <%=request.getHeader("User-Agent") %> <br>  
  Query String: <%=request.getQueryString() %> <br>  
  Client address: <%=request.getRemoteAddr() %> <br>  
  URI: <%=request.getRequestURI() %> <br>  
  Protocol used</strong> <%=request.getProtocol() %> <br>  
 

</body>
</html>