

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieDemo
 */
public class CookieDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	out.println("<html><tittle>cookie creation</title></head>");
	String name=request.getParameter("name");
	String value=request.getParameter("value");
	Cookie ck=new Cookie(name,value);
	response.addCookie(ck);
RequestDispatcher rd=request.getRequestDispatcher("index.html");
out.println("<h1> cookie is created");
	
	rd.include(request, response);}

}
