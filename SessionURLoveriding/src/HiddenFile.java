

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HiddenFile
 */
//@WebServlet("/HiddenFile")
public class HiddenFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String name = request.getParameter("name");
	String addr = request.getParameter("addr");
	String id = request.getParameter("id");
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	out.println("<form action=\"./HiddenFile1\" method=get");
	out.println("<input type=hidden name=name value='"+name+"'>");
	out.println("<input type=hidden name=addr value='"+addr+"'>");
	out.println("<input type=hidden name=id value='"+id+"'>");
    out.println("<input type=submit value=sendfiles>");
	out.println("</form>");
	out.close();
	
	}

}
