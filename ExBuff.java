import java.io.*;

class Exbuff
{
	public static void main(String args[])throws IOException
	{
		String nm;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your name");
		nm=br.readLine();
		
		System.out.println("Hello "+nm);
	}
}