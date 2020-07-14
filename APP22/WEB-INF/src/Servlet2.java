

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
	
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String pid=req.getParameter("pid");
		String pname=req.getParameter("pname");
		String qunty=req.getParameter("qunty");
		ServletContext ctx=getServletContext();
		ctx.setAttribute("quntity",qunty);
		ctx.setAttribute("product id","pid");
	pw.println("product id is"+pid);
	pw.print("product name is"+pname);
	RequestDispatcher rq=req.getRequestDispatcher("/s3");
	rq.include(req, res);
	

		
		
	}

}
