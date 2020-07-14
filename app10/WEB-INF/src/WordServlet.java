

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WordServlet
 */
@WebServlet("/WordServlet")
public class WordServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.setContentType("application/msword");
	PrintWriter pw=response.getWriter();
	
	
	
	pw.println("<table><tr><th>Id</th><th>name</th><th>salary</th></tr><tr><td>1</td><td>praneethrddy</td><td>20000</td></tr><tr><td>2</td><td>chandu</td><td>20000</td></tr></table>");

	pw.close();
	}
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		 service(request,response);
}
}
