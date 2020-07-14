<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.sql.*,javax.servlet.*" %>
<%!
Connection con=null;
Statement st=null;
String name=null;
String password=null;
String pwd=null;
String username=null;
public void jspInit()
{
	
	try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("connection established");
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	st=con.createStatement();
	
		
	}
	catch(Exception e){
		System.out.println("Catched"+e);
	}
}
	%>
	<%
	ResultSet res=st.executeQuery("select username,password from registerform");
	while(res.next())
	{
	 name=res.getString(1);
	 pwd= res.getString(2);
	}
	username=request.getParameter("username");
	 password=request.getParameter("password");
	
	if(name.equals(username)&&pwd.equals(password))
	{
	RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
	rd.forward(request, response);
	
	}
	else
	{
	

	RequestDispatcher rd=request.getRequestDispatcher("failure.jsp");
rd.forward(request, response);
}
	
	
	%>
	
</body>
</html>