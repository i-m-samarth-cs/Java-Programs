import java.io.*;

public class FileEx
{
	public static void main(String args[])throws IOException
	{
		File file=new File("p1.txt");
		
		FileInputStream fis=new FileInputStream(file);
		
		//read file usinng read();
		
		int i=0;
		
		while((i=fis.read())!=-1)
		{
			System.out.println((char)i);
		}
		System.out.println("\n\n");
		fis.close();

		//read file using read(byte[] b)
		
		fis=new FileInputStream(file);
		byte[] b=new byte[256];
	
		while((i=fis.read(b))!=-1)
		{
			System.out.print(new String(b));
		}
		fis.close();
	}
}