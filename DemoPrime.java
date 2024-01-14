/*import java.util.*;
class DemoPrime
{
	public static void main(String args[])
	{
		int num,flag=0;
		System.out.println("Enter any number");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();

		for(int i=2; i<=num/2; i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("number is not prime");
		else
			System.out.println("Number is  prime");
	}
}*/

import java.util.*;
class DemoPrime
{
	public static void main(String arg[])
	{
		int num,i=2;
		int flag=0;
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		while(i<=num/2)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
			++i;
		}
		if(flag==1)
			System.out.println("Number is Not Prime");
		else
			System.out.println("number is Prime");
	}
}