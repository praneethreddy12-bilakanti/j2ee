
	import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileInutStream {

	public static void main(String[] args)throws IOException
		{
		File f =new File("F:\\programes\\pr1.txt");
		//InputStreamReader isr =new InputStreamReader(f);
		
		FileWriter fr =new FileWriter(f);
		//BufferedWriter b=new BufferedWriter(fr);
		//String s="praneeth kumar reddy";
		/*
		while((s=b.readLine())!=null)
		{
			
		System.out.println(s);	
		}
*/
		fr.write("praneeth kumar reddy");
		fr.close();
		//f.close();
		//f.clone();
		
		}
	}






