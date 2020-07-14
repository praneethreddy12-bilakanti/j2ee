import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileStreamDemo {
	public static void main(String[] args)throws IOException
	{
		String S;
		System.out.println("enter string");
	//BufferedReader b =new BufferedReader(new InputStreamReader(System.in));
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(isr);
		
		S=b.readLine();
		System.out.println(S);
	
	}
}
