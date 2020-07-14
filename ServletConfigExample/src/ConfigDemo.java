

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ConfigDemo extends HttpServlet {
	
	 protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	 response.setContentType("text/html");
	 PrintWriter out=response.getWriter();
	 
	 ServletConfig config=getServletConfig();
	 out.println("servlet name:"+ config.getServletName() +"<br/>");
	 String s1=config.getInitParameter("mobile");
	 out.println("mobile"+ s1+"<br/>");
	 
	 out.println("hello");
	 System.out.println("running");
	java.util.Enumeration e=getInitParameterNames(); 
	out.println("<h1> param values......");
	while(e.hasMoreElements())
	{
		String name=(String)e.nextElement();
		String value=config.getInitParameter(name);
		out.println("<br/>"  + name +":" + value);

	}
	System.out.println(request.getAttribute(s1));
	System.out.println(request.getAuthType());
	System.out.println(request.getCharacterEncoding());
	System.out.println(request.getContentLength());
	System.out.println(request.getContentLengthLong());
	System.out.println(request.getContentType());
	out.close();
	 
	 
	 }

	

}
