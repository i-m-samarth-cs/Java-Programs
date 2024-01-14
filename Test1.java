import java.io.ByteArrayInputStream;

class Test1
{
	public static void main(String args[])
	{
		String msg="Handling data in Byte Format";

		ByteArrayInputStream bs=new ByteArrayInputStream(msg.getBytes());
	
		int ch;
		
		while((ch=bs.read()) !=-1)
		{
			System.out.print((char)ch);
		}
	}
}