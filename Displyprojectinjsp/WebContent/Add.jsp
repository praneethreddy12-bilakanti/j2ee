<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./Add.jsp"method="post">
enter student number:<input type="number" name="sno"/><br/>
enter student sname:<input type="text" name="sname"/><br/>
enter student cname:<input type="text" name="cname"/><br/>
enter student add:<input type="text" name="address"/><br/>

<input type="submit" value="submit"/><br/>
</form>
<%@ page import="java.sql.*,javax.servlet.*,java.util.*" %>
<%
		
		
		sno=request.getParameter("sno");
		name=request.getParameter("sname");
        cname=request.getParameter("cname");
		address=request.getParameter("address");
		
%>
<%!
Connection con=null;
PreparedStatement st=null;
String name=null;
String cname=null;
String address=null;
String sno=null;
public void jspInit()
{
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("connection established");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		st=con.prepareStatement("insert into studentdemo(num,name,collegename,address) values(?,?,?,?)");
	System.out.println("inserted");
	st.setString(1,sno);
	st.setString(2, name);
	st.setString(3, cname);
	st.setString(2, address);
	con.commit();
		 con.commit();
			System.out.println("commited");
		}
		catch(Exception e){
			System.out.println("Catched"+e);
			e.printStackTrace();
		}
	}
		%>
		
	
</body>
</html>