

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDispatcherDemo extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out=response.getWriter();
System.out.println("this is the response");
RequestDispatcher rd=request.getRequestDispatcher("./test2");
rd.forward(request, response);
	out.println("hello i am the first servlet");
	System.out.println("first servlet");
	out.close();
	
	
	
	
	
	
	
	}

}
