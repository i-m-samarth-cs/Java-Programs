	//Practical 24 Multiple catch block
class Exception3
{
	public static void main(String args[])
	{
		int a=0,b=0,res;
		try
		{
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
		
			res=a/b;
			System.out.println("Division is " +res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Insufficient arguments");
		}

		catch(NumberFormatException e)
		{
			System.out.println("Invalid Arguments");
		}
		res=a+b;
		System.out.println("Addition is "+res);
	}
}