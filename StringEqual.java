//String match Exception

import java.io.*;
class NoMatchException extends Exception
{
	NoMatchException()
	{
		System.out.println("Exception Occurs");
	}
}

class StringEqual
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			System.out.println("Enter String ");
			String nm=br.readLine();
		
			if(!nm.equals("MSBTE"))
				throw new  NoMatchException();
			else
				System.out.println("Thank you..");
		}
		catch(NoMatchException e)		
		{
			System.out.println("String is not Equals");
		}
	}
}