

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieDemoServletDemo
 */
public class CookieDemoServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><tittle>cookie creation</title></head>");

	Cookie[] ck=request.getCookies();
	if(ck==null)
	{
		out.println("<h1>cookie is not there");	
			
	}
	else
	{
		
		out.println("cookie");
		out.println("<table border='1' width='400'>");
		out.println("<tr><th>name</th><th>value</th>");
		for(int i=0;i<ck.length;i++)
		{
			String name=ck[i].getName();
			String value=ck[i].getValue();
		
		out.println("<tr><td>"+name+"</td><td> "+value+"</td>");
		}
		
	}
	}

}
