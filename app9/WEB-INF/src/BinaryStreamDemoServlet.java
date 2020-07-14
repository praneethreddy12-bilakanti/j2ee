

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BinaryStreamDemoServlet extends HttpServlet {

public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
		
	}

	
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
response.setContentType("image/JPEG");
ServletOutputStream sos=response.getOutputStream();
String path=getServletContext().getRealPath("C:\\Users\\praneeth reddy\\Pictures\\Camera Roll\\WIN_20160818_094428");
File f=new File(path);
FileInputStream fis=new FileInputStream(f);
byte[] b=new byte[(int)f.length()];
fis.read(b);
sos.write(b);
sos.close();
fis.close();
	
	}



}
