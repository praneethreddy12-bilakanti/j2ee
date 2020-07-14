

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DataBaseDemo
 */
public class DataBaseDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	
		System.out.println("connection is created"+ con);
		out.println(con);
		PreparedStatement ps=con.prepareStatement("insert into reg values(?,?)");
		ps.setString(2, name);
		ps.setString(1, id);
		out.println("<br/>");
 out.println(ps);
		int i=ps.executeUpdate();
		if(i>0)
		{
			out.println("<h1>ur successfully registered");
	
		}

		}
		catch(Exception e)	
		{
		e.printStackTrace();
		System.out.println(e);
		}
		out.close();
		}
}
