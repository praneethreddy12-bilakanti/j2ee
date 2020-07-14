

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BinaryStreamDemo extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	response.setContentType("image/jpeg");
	ServletOutputStream sos=response.getOutputStream();
	File file = new File("F:\\praneeth\\photos\\praneeth1211.jpg");
//	String path=getServletContext().getRealPath("F:\\\\praneeth\\\\photos\\\\praneeth1211.jpg");
	System.out.println("image uploaded");
	//File file=new File(path);
	FileInputStream fis= new FileInputStream(file);
	System.out.println("image ready to binary format");
	byte[] bytes=new byte[(int)file.length()];
	fis.read(bytes);
	sos.write(bytes);
sos.flush();
sos.close();
fis.close();
	
	
	}

}
