import javax.servlet.*;
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class HelloWorld extends HttpServlet {
	
   
public  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	out.println("<html>");
	out.println("<head>");
	out.println("<title>hello world</title>");
	out.println("</head>");
	out.println("<body>");
	out.println("<h1>praneeth kumar reddy</h1>");
	out.println("</body>");
	out.println("</html>");
	
		
	}

}
