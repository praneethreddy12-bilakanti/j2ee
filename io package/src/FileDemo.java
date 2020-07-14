import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public class FileDemo {


public static void main(String[] args) throws IOException
{
int count=0;
File f= new File("F:\\programes","pr.txt"); 
System.out.println(f.isFile());
System.out.println(f.isDirectory());
System.out.println(f.exists());

System.out.println(f.getParentFile());
System.out.println(f.getPath());
System.out.println(f.getName());
System.out.println(f.listFiles());
 String[] s =f.list();
 /*
  * for( String s1:s)
  
 {
	 System.out.println(s1);
	count++;
 }
*/
System.out.println(f.canRead());
System.out.println(f.canWrite());
System.out.println(f.toString());
System.out.println(f.lastModified());
System.out.println(f.getAbsolutePath());
System.out.println(f.setReadable(false));
System.out.println(f.getClass());
System.out.println(f.pathSeparator);
System.out.println(f.toURI());
System.out.println(f.toURL());
System.out.println(f.mkdir());




}
}