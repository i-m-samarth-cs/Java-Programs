//Extra

import java.io.*;
class NegativeAge extends Exception
{
	public NegativeAge()
	{
		System.out.println("Exception Occurs");
	}
}

class CheckAge
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		try
		{
			System.out.println("enter your name");
			String name=br.readLine();
			System.out.println("Enter Age");
			int age=Integer.parseInt(br.readLine());

			if(age<0)
				throw new NegativeAge();	//construtor get called
			else
				System.out.println("Thank you..."+name);
		}
		catch(NegativeAge e)		//Obj for user def exp 
		{
			System.out.println("Age is negative :"+e);
		}
	}
}