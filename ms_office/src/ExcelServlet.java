

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ExcelServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	out.println("<table><tr><th>Id</th><th>name</th><th>salary</th></tr><tr><td>1</td><td>pranu</td><td>20000</td></tr><tr><td>2</td><td>chandu</td><td>20000</td></tr></table>");
out.close();
	
	}

}
