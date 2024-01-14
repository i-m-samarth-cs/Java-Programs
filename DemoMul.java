import java.util.*;
class DemoMul
{
	public static void main(String args[])
	{	
		int i,num=1;
		System.out.println("Enter the number to display its table");
		
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		int no=num;
		for(i=1;i<=10;i++)
		{
			num=no*i;
			System.out.println(+no+ " * " +i+ " = "+num);
		}
	}
}