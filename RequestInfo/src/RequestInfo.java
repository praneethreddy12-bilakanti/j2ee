

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestInfo
 */
@WebServlet("/RequestInfo")
public class RequestInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RequestInfo() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
 	response.setContentType("TEXT/HTML");
 	PrintWriter pw=response.getWriter();
 	pw.println("method" + request.getMethod());
 	pw.println("requestURL" + request.getRequestURI());
 	pw.println("PROTOCOL" + request.getProtocol());
 	pw.println("PATHINFO" + request.getPathInfo());
 	pw.println("remote address" + request.getRemoteAddr());
 	pw.println("method" + request.getLocalName()  );
 	
 	
 	
	
	
	
	}

}
