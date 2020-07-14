<%@ page language="java" import="java.sql.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="blue">
<%!
Connection con=null;
Statement st=null;
ResultSet rs=null;
int x=0;
PreparedStatement pst=null;
String userName=null;
%>

<form action="adminverification.jsp">
userfirstname<input type="text" name="mail"/>
<input type="submit" value="submit">
</form>

<% 
String user = request.getParameter("username");
String pass = request.getParameter("password");
if(user.equals("praneeth")&&pass.equals("java"))
		{
		
			out.println("<h1>valid user<br/>");
			out.println("<h1> welcome</h1>");
			try
			{

				Class.forName("oracle.jdbc.driver.OracleDriver");
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");	
			System.out.println("connection established");
			//out.println("connection established"+con);
 st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
			rs=st.executeQuery("select *From student");
			pst=con.prepareStatement("update student set status=? where username=?");

			// out.println("<html>");
			//out.println("FIRSTNAMELASTNAME+''+USERNAME+''+PASSWORD+''+ADDRESS+''+CONTACTNO");
			out.println("<table  border='1'>");
		       
						 while(rs.next())
							 
		        {
						out.println("<tr>");
			out.println("<td>"+rs.getString(1)+"</td");
			out.println("<br/>");
			out.println("<td>"+rs.getString(2)+"</td");
			out.println("<br/>");

			out.println("<td>"+rs.getString(3)+"</td");
			out.println("<br/>");

			out.println("<td>"+rs.getString(4)+"</td");		
			out.println("<br/>");

			out.println("<td>"+rs.getString(5)+"</td");
			out.println("<br/>");

			out.println("<td>"+rs.getString(6)+"</td");
			out.println("<br/>");
			out.println("<td>"+rs.getString(7)+"</td");
			out.println("<br/>");
			out.println("</tr>");
				//x=rs.getInt(7);
		        }
		        
			    rs.close();
			}
					catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
else
{
out.println("admin is not valid");

}


%>
</body>
</html>