import javax.servlet.*;
import javax.servlet.GenericServlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Gs extends GenericServlet {

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException
{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>hello i am the generic servlet</h1>");
	
	System.out.println("this is service method");
		
		
		
	}

}
