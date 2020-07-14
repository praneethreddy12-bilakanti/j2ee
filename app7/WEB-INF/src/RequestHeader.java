

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestHeader
 */
public class RequestHeader extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter pw=response.getWriter();
	Enumeration e=request.getHeaderNames();
while(e.hasMoreElements())
{
	String name=(String)e.nextElement();
	String value=request.getHeader(name);
	pw.println(name+ "="+value);
	System.out.println("praneeth");
}
}
	
	
	}


