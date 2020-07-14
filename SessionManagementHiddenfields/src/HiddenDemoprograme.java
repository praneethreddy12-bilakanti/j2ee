

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HiddenDemoprograme extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String nameis=request.getParameter("name");
	String add=request.getParameter("add");
out.println("<center>");
out.println("your name is:"+nameis+"<br/>");
out.println("your addr is:"+add+"<br/>");
out.println("</center");
	
	}

}
