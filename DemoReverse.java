import java.util.*;
class DemoReverse
{
	public static void main(String args[])
	{
		int num,no=0,rev=0;

		Scanner s=new Scanner(System.in);		
		System.out.println("Enter the number");
		num=s.nextInt();

		while(num!=0)
		{
			no=num%10;			
			rev=(rev*10)+no;
			num=num/10;
			
		}
		System.out.println("Reverse number is "+rev); 
	}
}