

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.NumberFormatException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/ValidateServlet")
public class ValidateServlet extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	
	response.setContentType("text/html");
	PrintWriter pw=response.getWriter();
	String s1=request.getParameter("username");
	String s2=request.getParameter("password");
	if(s1.equals("praneeth")&& s2.equalsIgnoreCase("java"))
	{
	pw.println("<h1> valid</h1>");	
	}
	else
	{
	pw.print("<h1>invalid</h1>");
	}
	pw.close();
	
	
	}

}
