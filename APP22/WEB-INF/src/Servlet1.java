

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	response.setContentType("text/html");
	PrintWriter pw=response.getWriter();
		RequestDispatcher rd=request.getRequestDispatcher("/s2");
		rd.forward(request, response);
		
		
		
	}

}
