<%@ page language="java" import="java.sql.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
<jsp:useBean id="st" class="config.Student" ></jsp:useBean>
<jsp:setProperty property="*" name="st"/>

<%!
Connection con=null;
PreparedStatement pst=null;


%>
<%
try
{
String first=request.getParameter("first_name");
String last=request.getParameter("last_name");
String username=request.getParameter("username");
	String password=request.getParameter("password");
	String address=request.getParameter("address");
	String contact=request.getParameter("contact");
	//int x=Integer.parseInt(Contact);
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");	
System.out.println("connection established");
out.println("connection established"+con);
pst=con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
pst.setString(1,first);
pst.setString(2,last);
pst.setString(3,username);
pst.setString(4,password);
pst.setString(5,address);

pst.setString(6,contact);
pst.setInt(7,0);

//out.println("values");
int y=pst.executeUpdate();
System.out.println("updated"+y);
con.commit();
out.println("<h1 style='color:red'>registation sucessfully</h1>");
}
catch(Exception e)
{
	e.printStackTrace();
	
}

%>
</body>
</html>