

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 String user=request.getParameter("user");
	String password = request.getParameter("pwd");
	PrintWriter out=response.getWriter();
	if(user.equals("praneeth")&& password.equals("java"))
			{
		response.sendRedirect("Sucess.html");
		
	out.println("success");
	}
	
	else
	{
		response.sendRedirect("Failure.html");
	}

	}
}
