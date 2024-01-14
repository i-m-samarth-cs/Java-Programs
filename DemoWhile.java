import java.util.*;
class DemoSumofdigit
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n,rem,num=0;
		int sum=0;
		System.out.println("Enter the number");
		n=s.nextInt();

		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("Sum of digit:"+num);
	}
}