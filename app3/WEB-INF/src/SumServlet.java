

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class SumServlet extends HttpServlet {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("inside doget");
	try
	{
 int x,y,sum;
 x=10;y=30;
 
		sum=x+y;
	PrintWriter pw=response.getWriter();
	pw.println("<html>");
	pw.println("<body>");
	pw.println("<html>");
	pw.print("<center><h2><br><br>");
	pw.println("result is" + sum);
	pw.println("<h2></center>");
	pw.println("</body></html>");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	System.out.println("inside do post method");
	try
	{
		doGet(request, response);
	
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		System.out.println("inside service method");
	try
	{
		super.service(request, response);
	}
	catch(Exception e)
	{
		System.out.println(e);
		}
	
	}

}
