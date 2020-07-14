

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLifeCycle
 */
public class ServletLifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public ServletLifeCycle()
	{	
		System.out.println("Am from default constructor");
	}

	public void init(ServletConfig config)
	{
		System.out.println("Am from Init method...!");
	}

	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{	
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("I am from doGet method");
		ServletConfig c=getServletConfig();
		pw.println("servlet config "+c);
		pw.close();
		System.out.println();
	pw.println(	res.getHeaderNames());
	
	}	

	public void destroy()
	{
		System.out.println("Am from Destroy methods");
	}
	}
