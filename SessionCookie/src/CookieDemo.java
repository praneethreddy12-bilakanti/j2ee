

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
		 try{  
			  
			    response.setContentType("text/html");  
			    PrintWriter out = response.getWriter();  
			          
			    String n=request.getParameter("userName");  
			    out.print("Welcome "+n);  
			  
			    Cookie ck=new Cookie("userName",n);//creating cookie object  
			    response.addCookie(ck);//adding cookie in the response  
			    response.sendRedirect("./test2");
			 // RequestDispatcher rd=request.getRequestDispatcher("SecondServlet");
			 // rd.forward(request, response);
			    //creating submit button  
			    //out.print("<form action='./test2'method='post'>");  
			    //out.print("<input type='submit' value='go'>");  
			    //out.print("</form>");  
			          
			    out.close();  
			  
			        }catch(Exception e){System.out.println(e);}  
			  }  
}
