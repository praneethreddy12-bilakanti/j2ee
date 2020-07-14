package configservletdemo;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ConfigServletDemo extends HttpServlet {
	 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		ServletConfig config=getServletConfig();
		pw.println("Servletname"+config.getServletName());
		String s1=config.getInitParameter("faculty");
		pw.print(s1+"</br>");
		java.util.Enumeration e=getInitParameterNames();
		pw.println("<h1>rocktar");
		while(e.hasMoreElements())
		{
			String s=(String)e.nextElement();
			String value=config.getInitParameter(s);
			pw.println("<br>"+value);
			
		}
		}
		
				
	}


