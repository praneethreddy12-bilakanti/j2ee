<%@ page language="java" import="java.sql.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!
Connection con=null;
PreparedStatement ps1,ps2=null;
String name=null;
String pwd=null;
int status =0;
%>
<%
try
{

	Class.forName("oracle.jdbc.driver.OracleDriver");
	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");	
System.out.println("connection established");
//out.println("connection established"+con);
 // ps1=con.prepareStatement("select count(*)from student where username=? and password=?");
  ps2 = con.prepareStatement("select * from student");


ResultSet rs = ps2.executeQuery();
out.println("<table>");
while(rs.next())
{
name=rs.getString(3);
pwd=rs.getString(4);	
status=rs.getInt(7);
}



//write jdbc code for authentication
String user = request.getParameter("username");
String pass = request.getParameter("password");
		if(status==1)
		{
		if(user.equals(name)&&pass.equals(pwd))
		{
		
			out.println("<h1>valid user<br/>");
			out.println("<h1> welcome</h1>");
		
		}
		else
		{
			out.println("sorry pls try again...!");
			RequestDispatcher rd=request.getRequestDispatcher("loginfail.jsp");
			rd.forward(request, response);		
		}
}

else
{
	out.println("admin not confirmed");
}

}
//set form data as param value
catch(Exception e)
{
	e.printStackTrace();
}
%>
</body>
</html>