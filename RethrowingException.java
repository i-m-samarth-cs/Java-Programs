class Test
{
	static void divide()
	{
		int x,y,z;
		
		try
		{
			x=5;
			y=0;
			z=x/y;
			System.out.println(x +" / "+y+ " = " +z);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception caught in divide()");
			System.out.println("Cannot divide by zero in Integer Division");
		
			throw e;	//Re-Throwing the exception
		}

	}
}

public class RethrowingException
{
	public static void main(String args[])
	{
		System.out.println("Start of main()");
		try
		{
			Test.divide();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Caught in main");
			System.out.println(e);
		}
	}
}
