import java.io.*;

class Factorial
{
   public static void main(String args[])
   {
	int i,f=1;
	int n=Integer.parseInt(args[0]);
	for(i=1;i<=n;i++)
	{
	   f=f*i;
	}
	System.out.println("Factorial-"+f);
   }
}