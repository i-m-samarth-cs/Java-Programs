	//Practical 23

class Exception1
{
	public static void main(String args[])
	{
		int a=0,b=0,res;

		try
		{
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			res=a/b;
			System.out.println("Division is "+res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("cannot divide by zero");
		}
		res=a+b;
		System.out.println("addition is "+res);
	}
}
