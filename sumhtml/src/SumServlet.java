

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
	int x,y,sum;
	x=Integer.parseInt(request.getParameter("t1"));
	y=Integer.parseInt(request.getParameter("t2"));
	sum=x+y;
	out.println("<h1 >sum is :<h1>");

	out.println(sum);
	out.close();
	}
	}