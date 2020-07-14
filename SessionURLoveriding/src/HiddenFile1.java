

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HiddenFile1
 */
//@WebServlet("/HiddenFile1")
public class HiddenFile1 extends HttpServlet {
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
	out.println("<center>");
	out.println("your name is:" + name + "<br/>");
	out.println("ur address:" + addr + "</br>");
	out.println("ur id: " + id + "<br/>");
	out.println("</center>");
	out.close();
	}

}
