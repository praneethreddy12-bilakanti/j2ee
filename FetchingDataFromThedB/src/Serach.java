

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Serach extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//String rollno=request.getParameter("roll");
		//int roll=Integer.valueOf("rollno");
		int roll=Integer.parseInt(request.getParameter("roll"));
		//int roll=(int)rollno;
		try
		{	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			
		System.out.println("connection is created"+ con);
		out.println(con);
		PreparedStatement ps=con.prepareStatement("select *from reg where id=?");
		ps.setInt(1, roll);
	
		out.println("<table width=50% border=1>");		
		out.println("<caption>Result is:</caption>");
				
		ResultSet rs=ps.executeQuery();
		ResultSetMetaData rsmt=rs.getMetaData();
		int total=rsmt.getColumnCount();
		out.println("<tr>");
		for(int i=1;i<=total;i++)
		{
			out.println("<th>" + rsmt.getColumnName(i)+ "</th>");
		}
		out.println("</tr>");
		while(rs.next())
		{
		out.println( "<tr><td>" + rs.getInt(1)+"</td><td>" + rs.getString(2)+"</td><tr>");
		}
		out.println("</table>");
		ps.close();
		con.close();
		}
		

		catch(Exception e)	
		{
		e.printStackTrace();
		System.out.println(e);
		}
		finally
		{
			out.close();
		
		}
		}

	}
