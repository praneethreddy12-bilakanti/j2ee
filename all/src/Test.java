

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int x,y,sum;
	response.setContentType("text/html");
	PrintWriter pw=response.getWriter();
	pw.println("praneeth");
	//x=Integer.parseInt(request.getParameter("fno"));
	//pw.println(x);
 //y=Integer.parseInt(request.getParameter("sno"));
 String s1=request.getParameter("fno");
	 String s2=request.getParameter("sno");

//sum =x+y;
	//pw.println("sum is"+sum);
	Cookie c=new Cookie(s1,s2);
	response.addCookie(c);
pw.println(	request.getCookies());
}

}
