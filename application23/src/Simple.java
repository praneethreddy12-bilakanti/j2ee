

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Simple extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String password=request.getParameter("password");
	if(password.equals("java"))
	{
RequestDispatcher rd=request.getRequestDispatcher("go");
rd.forward(request, response);
	}else
	{
		out.println("sorry password is not correct");
		RequestDispatcher rd=request.getRequestDispatcher("index.html");
		rd.include(request, response);
	}
	
	
	
	
	
	
	}
}
