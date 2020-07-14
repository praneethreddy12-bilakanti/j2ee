

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDispatcherIncludeDemo extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("before calling include method");
		RequestDispatcher rd = request.getRequestDispatcher("./test1");
		rd.include(request, response);
		
		out.println("i am from first servlet");
		System.out.println("first servet");
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
