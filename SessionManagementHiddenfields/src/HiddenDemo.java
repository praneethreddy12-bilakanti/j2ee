

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HiddenDemo extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
PrintWriter out=response.getWriter();
String name1=request.getParameter("name");
String add=request.getParameter("add");
out.println("<form action=\"./s2\" method='post'>");
out.println("<input type='hidden' name='name' value='"+name1+"'>");
out.println("<input type='hidden' name='add' value='"+add+"'>");
out.println("<input type='submit' value='send'>");
out.println("</form>");
	
	}

}
