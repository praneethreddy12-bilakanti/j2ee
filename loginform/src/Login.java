

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
	
	PrintWriter out=response.getWriter();
	String user=request.getParameter("user");
	
	String password=request.getParameter("pwd");
	if(user.equals("praneeth") && password.equalsIgnoreCase("java"))
	{
	out.println("valid");	
	}
	else
	{
	out.print("in valid");
	
	}
	out.close();
System.out.println("completed");
}
}
