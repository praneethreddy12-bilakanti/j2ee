

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
	res.setContentType("text/html");
   PrintWriter pw=res.getWriter();
   pw.println("<html>");
   pw.println("<head>");
   pw.println("</head>");
   pw.println("<body");
   pw.println("<h1>praneeth kumar rdddy</h1>");
  
   pw.println("<h1>hello world</h1>");
   pw.println("</body>");
   pw.println("</html>");
		
		
		
		
		
    }

}
