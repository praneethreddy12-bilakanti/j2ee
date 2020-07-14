

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		  try{  
		  
		    response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		    String n=request.getParameter("userName");  
		   out.print("Welcome "+n);  
		    Cookie ck[]=request.getCookies(); 
		    out.println("this is from secound servlet");
		    for(Cookie c:ck)
		    {
		    out.print("Hello "+ck[0].getValue());  
		    }
		    out.close();  
		  
		         }catch(Exception e){System.out.println(e);}  
		    }  
		      
		  }
