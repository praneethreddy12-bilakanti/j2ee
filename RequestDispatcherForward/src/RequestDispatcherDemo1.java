

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDispatcherDemo1 extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	System.out.println("hello i am secound servlt");
	out.println("<html>");
	out.println("<body bgcolor='red'>");
	out.println("praneeth");

	out.println("<h1 color='red'>i am from the secound servlet</h1>");
	out.println("</body>");
	out.println("</html>");

	out.close();
	
	}

}
