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
Statement st=null;
ResultSet rs=null;
int x=0;
PreparedStatement pst=null;
String first_name=null;
String name=null;
%>
<%
first_name= request.getParameter("mail");
try
{

	Class.forName("oracle.jdbc.driver.OracleDriver");
	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");	
System.out.println("connection established");
//out.println("connection established"+con);
//st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
//rs=st.executeQuery("select *From student");
pst=con.prepareStatement("update student set status=? where first_name=?");

int x=1;
pst.setInt(1,x);
pst.setString(2,first_name);
pst.executeUpdate();
out.println("<h1 ><font color='red'>status updated</font></h1>");
con.commit();


}
catch(Exception e)
{
	e.printStackTrace();
}





%>
<%@include file="index.jsp"%>


</body>
</html>