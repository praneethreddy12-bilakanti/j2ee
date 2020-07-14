

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String pid=request.getParameter("pid");
	
	String pname=request.getParameter("pname");
	String qunty=request.getParameter("qunty");
	ServletContext ctx=getServletContext();
	ctx.setAttribute("qunty", qunty);
	out.println("product id is:"+"\t"+ pid);
	out.println("<br/>");
	out.println("product name is:"+"\t"+pname);
	out.println("<br>");
	
	//out.println("product quntity is:"+qunty);
	RequestDispatcher rd=request.getRequestDispatcher("/s3");
	rd.include(request, response);
	out.close();
	}

}
