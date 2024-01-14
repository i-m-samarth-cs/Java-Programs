import java.io.ByteArrayOutputStream;
import java.io.*;
class OutputTest1
{
	public static void main(String args[])throws IOException
	{
		String s1="Handling data ";
		String s2="in Byte Format";

		ByteArrayOutputStream bs=new ByteArrayOutputStream();
	
		
		bs.write(s1.getBytes());
		bs.write(s2.getBytes());
		System.out.print(bs.toString());
		
	}
}