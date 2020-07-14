<%@page errorPage="error.jsp"%>
<%
out.println(10/0);
%>
<%
response.sendRedirect("www.google.com");
%>
