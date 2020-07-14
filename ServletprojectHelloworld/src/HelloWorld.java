	

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
PrintWriter out=response.getWriter();
out.println("<h1>praneeth");
Enumeration e=request.getHeaderNames();
while(e.hasMoreElements())
{
	
	String name=(String)e.nextElement();
//out.println(name);
}
out.print(request.getContentLength());
out.print(request.getMethod());

}
		
		
	

}
