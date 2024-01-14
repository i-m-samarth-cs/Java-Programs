	//Practical 24 with multiple try block

class Exception2
{
	public static void main(String args[])
	{
		int a,b,div;

		try	//Outer try
		{
			try	//Inner try
			{
				a=Integer.parseInt(args[0]);
				b=Integer.parseInt(args[1]);
				div=a/b;
				System.out.println("Division is " +div);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Cannot Divide by Zero");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Insufficient arguments");
		}
	}
}