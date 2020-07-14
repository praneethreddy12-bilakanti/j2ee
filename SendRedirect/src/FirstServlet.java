

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FirstServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<h1>hello i am first servlet");
		//response.sendRedirect("./SecoundServlet");
		RequestDispatcher rd=request.getRequestDispatcher("/SecoundServlet");
		rd.include(request, response);
		//response.setStatus(302);
		//response.sendError(8);

RequestDispatcher rd2=request.getRequestDispatcher(getServletInfo());
System.out.println(rd2);		
pw.close();
			System.out.println("first servlet");
			
	System.out.println("server at" + request.getContextPath());
	//System.out.println(request.getAttribute());
	
	System.out.println(request.getLocalName());
	System.out.println(request.getAuthType());
	System.out.println(request.getCharacterEncoding());
	System.out.println(request.getContentLength());
	System.out.println("pp");
	//System.out.println(request.getDateHeader(null));
	}

}