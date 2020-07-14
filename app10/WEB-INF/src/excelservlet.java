

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class excelservlet
 */
@WebServlet("/excelservlet")
public class excelservlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.setContentType("application/vnd.ms-excel");
	PrintWriter pw=response.getWriter();
	
	
	
	pw.println("<table><tr><th>Id</th><th>name</th><th>salary</th></tr><tr><td>1</td><td>pranu</td><td>20000</td></tr><tr><td>2</td><td>chandu</td><td>20000</td></tr></table>");

	pw.close();
	}
}