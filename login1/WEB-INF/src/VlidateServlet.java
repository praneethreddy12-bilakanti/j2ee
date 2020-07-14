
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/VlidateServlet")
public class VlidateServlet extends HttpServlet {

public void service(HttpServletResponse res,HttpServletRequest req)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
String s1=req.getParameter("username");
String s2=req.getParameter("password");
if(s1.equals("praneeth")&& s2.equalsIgnoreCase("java"))
{
pw.println("<h1> valid</h1>");	
}
else
{
pw.print("<h1>invalid</h1>");
}
pw.close();

}
}
