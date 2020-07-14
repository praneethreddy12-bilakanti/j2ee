

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class RequestInfo extends HttpServlet {
	
    	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();

		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>rie</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h3>RIE</h3>");
	
		pw.println("method"+request.getMethod());
		pw.println("</br>");
		pw.println("request uri"+request.getRequestURL());
		pw.println("</br>");
		pw.println("protocol"+request.getProtocol());
		pw.println("</br>");
		pw.println("pathinfo"+request.getPathInfo());
		pw.println("</br>");
		pw.println("remote address"+request.getRemoteAddr());
		pw.println("</br>");
		pw.println("contentlenght"+request.getContentLength());
		
		pw.println("</body>");
		pw.println("</html>");
		
		
	
    	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
